package net.zetetic.database.sqlcipher;

import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes14.dex */
public class SupportOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f214762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabaseHook f214763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f214764c;
    public final int d;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public final SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        int i = this.d;
        if (i == -1) {
            return new SupportHelper(configuration, this.f214762a, this.f214763b, this.f214764c);
        }
        return new SupportHelper(configuration, this.f214762a, this.f214763b, this.f214764c, i);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(bArr, sQLiteDatabaseHook, z, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.f214762a = bArr;
        this.f214763b = sQLiteDatabaseHook;
        this.f214764c = z;
        this.d = i;
    }
}
