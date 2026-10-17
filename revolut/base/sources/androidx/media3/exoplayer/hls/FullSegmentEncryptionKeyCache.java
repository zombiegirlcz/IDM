package androidx.media3.exoplayer.hls;

import android.net.Uri;
import com.google.common.base.Preconditions;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
final class FullSegmentEncryptionKeyCache {
    private final LinkedHashMap<Uri, byte[]> backingMap;

    public FullSegmentEncryptionKeyCache(final int i) {
        this.backingMap = new LinkedHashMap<Uri, byte[]>(i + 1, 1.0f, false) { // from class: androidx.media3.exoplayer.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i;
            }
        };
    }

    public byte[] get(Uri uri2) {
        if (uri2 == null) {
            return null;
        }
        return this.backingMap.get(uri2);
    }

    public byte[] put(Uri uri2, byte[] bArr) {
        return this.backingMap.put((Uri) Preconditions.checkNotNull(uri2), (byte[]) Preconditions.checkNotNull(bArr));
    }

    public byte[] remove(Uri uri2) {
        return this.backingMap.remove(Preconditions.checkNotNull(uri2));
    }
}
