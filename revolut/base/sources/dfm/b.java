package dfm;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f114548a;

    static {
        Object obj2;
        Class<?> cls;
        a aVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj2 = null;
        } catch (Throwable th10) {
            obj2 = th10;
            cls = null;
        }
        if (cls != null) {
            try {
                aVar = (a) cls.asSubclass(a.class).getConstructor(c.class).newInstance(a.f114546a);
            } catch (Throwable th11) {
                obj2 = th11;
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            f114548a = aVar;
        } else {
            f114548a = new a();
        }
        if (obj2 != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, b.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a() {
        f114548a.getClass();
    }

    public static void b() {
        f114548a.getClass();
    }

    public static void c() {
        f114548a.getClass();
    }
}
