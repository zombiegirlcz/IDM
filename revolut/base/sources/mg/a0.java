package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends kg.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f205047a;

    public a0(d0 d0Var) {
        this.f205047a = d0Var;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        Object objE = e();
        Map map = this.f205047a.f205063a;
        try {
            aVar.f();
            while (aVar.n()) {
                b0 b0Var = (b0) map.get(aVar.u());
                if (b0Var == null) {
                    aVar.H();
                } else {
                    g(objE, aVar, b0Var);
                }
            }
            aVar.j();
            return f(objE);
        } catch (IllegalAccessException e) {
            te0.w wVar = og.c.f224953a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        if (obj2 == null) {
            cVar.m();
            return;
        }
        cVar.g();
        try {
            Iterator it8 = this.f205047a.f205064b.iterator();
            while (it8.hasNext()) {
                ((b0) it8.next()).b(cVar, obj2);
            }
            cVar.j();
        } catch (IllegalAccessException e) {
            te0.w wVar = og.c.f224953a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object e();

    public abstract Object f(Object obj2);

    public abstract void g(Object obj2, qg.a aVar, b0 b0Var);
}
