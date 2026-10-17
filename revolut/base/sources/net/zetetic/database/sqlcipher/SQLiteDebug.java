package net.zetetic.database.sqlcipher;

import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteDebug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f214734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f214735b;

    public static class DbStats {
        public DbStats(String str, long j2, long j3, int i, int i2, int i3, int i5) {
        }
    }

    public static class PagerStats {
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    static {
        Logger.b().a("SQLiteLog", 2);
        f214734a = Logger.b().a("SQLiteStatements", 2);
        f214735b = Logger.b().a("SQLiteTime", 2);
    }

    private static native void nativeGetPagerStats(PagerStats pagerStats);
}
