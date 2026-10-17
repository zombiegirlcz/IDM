package skm;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f263977a;

    static {
        String property;
        i0 i0Var;
        int i = zkm.v.f323125a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            p0 p0Var = p0.f264001a;
            i0Var = zkm.o.f323119a;
            i0Var.getClass();
        } else {
            i0Var = kotlinx.coroutines.a.i;
        }
        f263977a = i0Var;
    }
}
