package mg;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends kg.l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f205048c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f205049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f205050b;

    public b(kg.o oVar, kg.l0 l0Var, Class cls) {
        this.f205050b = new t(oVar, l0Var, cls);
        this.f205049a = cls;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.n()) {
            arrayList.add(this.f205050b.f205124c.c(aVar));
        }
        aVar.i();
        int size = arrayList.size();
        Class cls = this.f205049a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        if (obj2 == null) {
            cVar.m();
            return;
        }
        cVar.f();
        int length = Array.getLength(obj2);
        for (int i = 0; i < length; i++) {
            this.f205050b.d(cVar, Array.get(obj2, i));
        }
        cVar.i();
    }
}
