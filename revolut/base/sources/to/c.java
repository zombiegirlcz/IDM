package to;

import ecm.f1;
import ecm.g1;
import ecm.j;
import ecm.m1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ecm.c f272476a = ecm.c.a("client_id");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ecm.c f272477b = ecm.c.a("client_version");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ecm.c f272478c = ecm.c.a("device_id");
    public static final ecm.c d = ecm.c.a("platform");
    public static final ecm.c e = ecm.c.a("signature");
    public static final ecm.c f = ecm.c.a("timestamp");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g1 f272479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g1 f272480h;
    public static final g1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g1 f272481j;
    public static final g1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g1 f272482l;

    public static final class a {
        private a() {
        }
    }

    static {
        f1 f1Var = m1.d;
        f272479g = new g1("X-Client-Id", f1Var);
        f272480h = new g1("X-Client-Version", f1Var);
        i = new g1("X-Device-Id", f1Var);
        f272481j = new g1("X-Platform", f1Var);
        k = new g1("X-Signature", f1Var);
        f272482l = new g1("X-Timestamp", f1Var);
    }
}
