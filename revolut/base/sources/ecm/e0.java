package ecm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f124795a = new a("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f124796b = new a("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f124797c = new a("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    public static List i(Class cls, Iterable iterable, ClassLoader classLoader, q1 q1Var) {
        ?? Load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                Class cls2 = (Class) it8.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th10) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th10), th10);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : Load) {
            switch (q1Var.f124863a) {
                case 4:
                    ((b1) obj2).getClass();
                    break;
                default:
                    ((w1) obj2).getClass();
                    break;
            }
            arrayList.add(obj2);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new d2(q1Var)));
        return Collections.unmodifiableList(arrayList);
    }

    public abstract d1 a();

    public abstract e0 b(Map map);

    public abstract e0 c();

    public abstract e0 d();

    public void e(int i) {
    }

    public void f(int i, long j2) {
    }

    public void g(long j2) {
    }

    public void h(long j2) {
    }

    public void j(int i) {
    }

    public void k(int i, long j2, long j3) {
    }

    public void l(long j2) {
    }

    public void m(long j2) {
    }

    public abstract e0 n(a2 a2Var);

    public abstract e0 o();

    public void p(g2 g2Var) {
    }
}
