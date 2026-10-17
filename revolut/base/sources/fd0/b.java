package fd0;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f133850a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f133851b;

    public final void a() {
        synchronized (this.f133850a) {
            this.f133851b = null;
            this.f133850a.clear();
            Unit unit = Unit.f186387a;
        }
    }

    public abstract Object b(c cVar, Object obj2);

    public final Object c(c key, Object obj2) {
        Object objB;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f133850a) {
            try {
                if (!Intrinsics.f(this.f133851b, obj2)) {
                    this.f133851b = obj2;
                    this.f133850a.clear();
                }
                a aVar = (a) this.f133850a.get(key.a());
                if (aVar == null || !key.equals(aVar.a())) {
                    Object objB2 = b(key, this.f133851b);
                    this.f133850a.put(key.a(), new a(key, objB2));
                    objB = objB2;
                } else {
                    objB = aVar.b();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return objB;
    }
}
