package u9;

import d9.a1;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes16.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f278292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f278293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f278294c = false;

    public v(a1 a1Var) {
        this.f278292a = a1Var;
    }

    public final Object a(Object obj2) {
        if (this.f278293b == null) {
            t9.c cVar = ((i) this.f278292a).f278275b;
            try {
                Method method = cVar.f268916h;
                this.f278293b = method == null ? cVar.i.get(obj2) : method.invoke(obj2, null);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException("Problem accessing property '" + cVar.f268913b.f132807a + "': " + e2.getMessage(), e2);
            }
        }
        return this.f278293b;
    }
}
