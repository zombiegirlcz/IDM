package mg;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public final class z extends b0 {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Method e;
    public final /* synthetic */ kg.l0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kg.l0 f205134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f205135h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, Field field, boolean z, Method method, kg.l0 l0Var, kg.l0 l0Var2, boolean z3, boolean z4) {
        super(str, field);
        this.d = z;
        this.e = method;
        this.f = l0Var;
        this.f205134g = l0Var2;
        this.f205135h = z3;
        this.i = z4;
    }

    @Override // mg.b0
    public final void a(qg.a aVar, Object obj2) throws IllegalAccessException {
        Object objC = this.f205134g.c(aVar);
        if (objC == null && this.f205135h) {
            return;
        }
        boolean z = this.d;
        Field field = this.f205052b;
        if (z) {
            f0.b(obj2, field);
        } else if (this.i) {
            throw new JsonIOException(j6.a.q("Cannot set value of 'static final' ", og.c.d(field, false)));
        }
        field.set(obj2, objC);
    }

    @Override // mg.b0
    public final void b(qg.c cVar, Object obj2) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.d;
        Field field = this.f205052b;
        Method method = this.e;
        if (z) {
            if (method == null) {
                f0.b(obj2, field);
            } else {
                f0.b(obj2, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj2, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(p.a.p("Accessor ", og.c.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj2);
        }
        if (objInvoke == obj2) {
            return;
        }
        cVar.k(this.f205051a);
        this.f.d(cVar, objInvoke);
    }
}
