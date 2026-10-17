package androidx.media3.datasource.cache;

import a5.a;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes15.dex */
public final class CacheWriter {
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;
    private final byte[] temporaryBuffer;

    public interface ProgressListener {
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, byte[] bArr, ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        ((a) cacheDataSource.getCacheKeyFactory()).getClass();
        this.cacheKey = CacheKeyFactory.lambda$static$0(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    private void onNewBytesCached(long j2) {
        this.bytesCached += j2;
    }

    private void onRequestEndPosition(long j2) {
        if (this.endPosition == j2) {
            return;
        }
        this.endPosition = j2;
    }

    private long readBlockToCache(long j2, long j3) throws Exception {
        long jOpen;
        boolean z = true;
        boolean z3 = j2 + j3 == this.endPosition || j3 == -1;
        if (j3 != -1) {
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j2).setLength(j3).build());
            } catch (Exception unused) {
                DataSourceUtil.closeQuietly(this.dataSource);
                z = false;
                jOpen = -1;
            }
        } else {
            z = false;
            jOpen = -1;
        }
        if (!z) {
            throwIfCanceled();
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j2).setLength(-1L).build());
            } catch (Exception e) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e;
            }
        }
        if (z3 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j2);
            } catch (Exception e2) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e2;
            }
        }
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            throwIfCanceled();
            CacheDataSource cacheDataSource = this.dataSource;
            byte[] bArr = this.temporaryBuffer;
            i = cacheDataSource.read(bArr, 0, bArr.length);
            if (i != -1) {
                onNewBytesCached(i);
                i2 += i;
            }
        }
        if (z3) {
            onRequestEndPosition(j2 + ((long) i2));
        }
        this.dataSource.close();
        return i2;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.isCanceled) {
            throw new InterruptedIOException();
        }
    }

    public void cache() throws IOException {
        throwIfCanceled();
        Cache cache = this.cache;
        String str = this.cacheKey;
        DataSpec dataSpec = this.dataSpec;
        this.bytesCached = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.dataSpec;
        long j2 = dataSpec2.length;
        if (j2 != -1) {
            this.endPosition = dataSpec2.position + j2;
        } else {
            long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(this.cacheKey));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.endPosition = contentLength;
        }
        while (true) {
            long j3 = this.endPosition;
            if (j3 != -1 && this.nextPosition >= j3) {
                return;
            }
            throwIfCanceled();
            long j5 = this.endPosition;
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j5 == -1 ? Long.MAX_VALUE : j5 - this.nextPosition);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j16 = -cachedLength;
                if (j16 == Long.MAX_VALUE) {
                    j16 = -1;
                }
                long j22 = this.nextPosition;
                this.nextPosition = j22 + readBlockToCache(j22, j16);
            }
        }
    }
}
