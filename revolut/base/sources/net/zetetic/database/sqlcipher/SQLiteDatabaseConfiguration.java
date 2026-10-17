package net.zetetic.database.sqlcipher;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteDatabaseConfiguration {
    public static final Pattern i = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f214731c;
    public int d;
    public Locale e;
    public byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SQLiteDatabaseHook f214732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f214733h;

    public SQLiteDatabaseConfiguration(String str, int i2) {
        this(str, i2, null, null);
    }

    public final void a(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        }
        if (!this.f214729a.equals(sQLiteDatabaseConfiguration.f214729a)) {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.f214731c = sQLiteDatabaseConfiguration.f214731c;
        this.d = sQLiteDatabaseConfiguration.d;
        this.e = sQLiteDatabaseConfiguration.e;
        this.f = sQLiteDatabaseConfiguration.f;
        this.f214732g = sQLiteDatabaseConfiguration.f214732g;
        ArrayList arrayList = this.f214733h;
        arrayList.clear();
        arrayList.addAll(sQLiteDatabaseConfiguration.f214733h);
    }

    public SQLiteDatabaseConfiguration(String str, int i2, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.f214733h = new ArrayList();
        if (str == null) {
            throw new IllegalArgumentException("path must not be null.");
        }
        this.f214729a = str;
        int iIndexOf = str.indexOf(63);
        str = iIndexOf >= 0 ? (String) str.subSequence(0, iIndexOf) : str;
        this.f214730b = str.indexOf(64) != -1 ? i.matcher(str).replaceAll("XX@YY") : str;
        this.f214731c = i2;
        this.f = bArr;
        this.f214732g = sQLiteDatabaseHook;
        this.d = 25;
        this.e = Locale.getDefault();
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f214733h = new ArrayList();
        if (sQLiteDatabaseConfiguration != null) {
            this.f214729a = sQLiteDatabaseConfiguration.f214729a;
            this.f214730b = sQLiteDatabaseConfiguration.f214730b;
            a(sQLiteDatabaseConfiguration);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }
}
