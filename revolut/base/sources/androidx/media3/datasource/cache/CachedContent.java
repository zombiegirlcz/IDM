package androidx.media3.datasource.cache;

import androidx.media3.common.util.Log;
import com.google.common.base.Preconditions;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import p.a;

/* JADX INFO: loaded from: classes.dex */
final class CachedContent {
    private final TreeSet<SimpleCacheSpan> cachedSpans;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final int f7471id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    public static final class Range {
        public final long length;
        public final long position;

        public Range(long j2, long j3) {
            this.position = j2;
            this.length = j3;
        }

        public boolean contains(long j2, long j3) {
            long j5 = this.length;
            if (j5 == -1) {
                return j2 >= this.position;
            }
            if (j3 == -1) {
                return false;
            }
            long j16 = this.position;
            return j16 <= j2 && j2 + j3 <= j16 + j5;
        }

        public boolean intersects(long j2, long j3) {
            long j5 = this.position;
            if (j5 > j2) {
                return j3 == -1 || j2 + j3 > j5;
            }
            long j16 = this.length;
            return j16 == -1 || j5 + j16 > j2;
        }
    }

    public CachedContent(int i, String str) {
        this(i, str, DefaultContentMetadata.EMPTY);
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        this.metadata = this.metadata.copyWithMutationsApplied(contentMetadataMutations);
        return !r2.equals(r0);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && CachedContent.class == obj2.getClass()) {
            CachedContent cachedContent = (CachedContent) obj2;
            if (this.f7471id == cachedContent.f7471id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata)) {
                return true;
            }
        }
        return false;
    }

    public long getCachedBytesLength(long j2, long j3) {
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        SimpleCacheSpan span = getSpan(j2, j3);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j3);
        }
        long j5 = j2 + j3;
        long j16 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        long jMax = span.position + span.length;
        if (jMax < j16) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j22 = simpleCacheSpan.position;
                if (j22 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j22 + simpleCacheSpan.length);
                if (jMax >= j16) {
                    break;
                }
            }
        }
        return Math.min(jMax - j2, j3);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j2, long j3) {
        SimpleCacheSpan simpleCacheSpanCreateLookup = SimpleCacheSpan.createLookup(this.key, j2);
        SimpleCacheSpan simpleCacheSpanFloor = this.cachedSpans.floor(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanFloor != null && simpleCacheSpanFloor.position + simpleCacheSpanFloor.length > j2) {
            return simpleCacheSpanFloor;
        }
        SimpleCacheSpan simpleCacheSpanCeiling = this.cachedSpans.ceiling(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanCeiling != null) {
            long j5 = simpleCacheSpanCeiling.position - j2;
            j3 = j3 == -1 ? j5 : Math.min(j5, j3);
        }
        return SimpleCacheSpan.createHole(this.key, j2, j3);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return this.metadata.hashCode() + a.c(this.f7471id * 31, 31, this.key);
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isFullyLocked(long j2, long j3) {
        for (int i = 0; i < this.lockedRanges.size(); i++) {
            if (this.lockedRanges.get(i).contains(j2, j3)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean lockRange(long j2, long j3) {
        for (int i = 0; i < this.lockedRanges.size(); i++) {
            if (this.lockedRanges.get(i).intersects(j2, j3)) {
                return false;
            }
        }
        this.lockedRanges.add(new Range(j2, j3));
        return true;
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        File file = cacheSpan.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j2, boolean z) {
        long j3;
        Preconditions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        File file = (File) Preconditions.checkNotNull(simpleCacheSpan.file);
        if (z) {
            j3 = j2;
            File cacheFile = SimpleCacheSpan.getCacheFile((File) Preconditions.checkNotNull(file.getParentFile()), this.f7471id, simpleCacheSpan.position, j3);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.w("CachedContent", "Failed to rename " + file + " to " + cacheFile);
            }
        } else {
            j3 = j2;
        }
        SimpleCacheSpan simpleCacheSpanCopyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j3);
        this.cachedSpans.add(simpleCacheSpanCopyWithFileAndLastTouchTimestamp);
        return simpleCacheSpanCopyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j2) {
        for (int i = 0; i < this.lockedRanges.size(); i++) {
            if (this.lockedRanges.get(i).position == j2) {
                this.lockedRanges.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public CachedContent(int i, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f7471id = i;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
        this.lockedRanges = new ArrayList<>();
    }
}
