package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th10) {
            super(th10);
        }

        public CacheException(String str, Throwable th10) {
            super(str, th10);
        }
    }

    public interface Listener {
    }

    void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) throws CacheException;

    void commitFile(File file, long j2) throws CacheException;

    long getCachedBytes(String str, long j2, long j3);

    long getCachedLength(String str, long j2, long j3);

    ContentMetadata getContentMetadata(String str);

    Set<String> getKeys();

    void releaseHoleSpan(CacheSpan cacheSpan);

    void removeSpan(CacheSpan cacheSpan);

    File startFile(String str, long j2, long j3) throws CacheException;

    CacheSpan startReadWrite(String str, long j2, long j3) throws InterruptedException, CacheException;

    CacheSpan startReadWriteNonBlocking(String str, long j2, long j3) throws CacheException;
}
