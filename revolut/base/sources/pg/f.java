package pg;

import java.sql.Date;
import java.sql.Timestamp;
import pg.a;
import pg.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f235788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f235789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f235790c;
    public static final a.C1307a d;
    public static final b.a e;
    public static final c f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f235788a = z;
        if (z) {
            f235789b = new e(Date.class, 0);
            f235790c = new e(Timestamp.class, 1);
            d = a.f235781b;
            e = b.f235783b;
            f = d.f235785b;
            return;
        }
        f235789b = null;
        f235790c = null;
        d = null;
        e = null;
        f = null;
    }
}
