package androidx.media3.datasource.cache;

import a0.d;
import androidx.media3.common.util.Util;
import com.google.common.base.Preconditions;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private SimpleCacheSpan(String str, long j2, long j3, long j5, File file) {
        super(str, j2, j3, j5, file);
    }

    public static SimpleCacheSpan createCacheEntry(File file, long j2, CachedContentIndex cachedContentIndex) {
        return createCacheEntry(file, j2, -9223372036854775807L, cachedContentIndex);
    }

    public static SimpleCacheSpan createHole(String str, long j2, long j3) {
        return new SimpleCacheSpan(str, j2, j3, -9223372036854775807L, null);
    }

    public static SimpleCacheSpan createLookup(String str, long j2) {
        return new SimpleCacheSpan(str, j2, -1L, -9223372036854775807L, null);
    }

    public static File getCacheFile(File file, int i, long j2, long j3) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i);
        sb6.append(".");
        sb6.append(j2);
        sb6.append(".");
        return new File(file, d.j(j3, ".v3.exo", sb6));
    }

    private static File upgradeFile(File file, CachedContentIndex cachedContentIndex) {
        String strUnescapeFileName;
        String name = file.getName();
        Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = Util.unescapeFileName((String) Preconditions.checkNotNull(matcher.group(1)));
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            strUnescapeFileName = matcher.matches() ? (String) Preconditions.checkNotNull(matcher.group(1)) : null;
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        File cacheFile = getCacheFile((File) Preconditions.checkNotNull(file.getParentFile()), cachedContentIndex.assignIdForKey(strUnescapeFileName), Long.parseLong((String) Preconditions.checkNotNull(matcher.group(2))), Long.parseLong((String) Preconditions.checkNotNull(matcher.group(3))));
        if (file.renameTo(cacheFile)) {
            return cacheFile;
        }
        return null;
    }

    public SimpleCacheSpan copyWithFileAndLastTouchTimestamp(File file, long j2) {
        Preconditions.checkState(this.isCached);
        return new SimpleCacheSpan(this.key, this.position, this.length, j2, file);
    }

    public static SimpleCacheSpan createCacheEntry(File file, long j2, long j3, CachedContentIndex cachedContentIndex) {
        String keyForId;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = upgradeFile(file, cachedContentIndex);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches() || (keyForId = cachedContentIndex.getKeyForId(Integer.parseInt((String) Preconditions.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        if (j2 == -1) {
            j2 = file2.length();
        }
        long j5 = j2;
        if (j5 == 0) {
            return null;
        }
        return new SimpleCacheSpan(keyForId, Long.parseLong((String) Preconditions.checkNotNull(matcher.group(2))), j5, j3 == -9223372036854775807L ? Long.parseLong((String) Preconditions.checkNotNull(matcher.group(3))) : j3, file2);
    }
}
