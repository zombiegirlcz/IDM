package he0;

import com.google.gson.JsonSyntaxException;
import kg.l0;
import kotlin.jvm.internal.Intrinsics;
import mg.c1;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151504a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f151505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f151506c;

    public c(l0 l0Var, Object obj2) {
        this.f151505b = l0Var;
        this.f151506c = obj2;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        switch (this.f151504a) {
            case 0:
                Object objC = ((l0) this.f151505b).c(aVar);
                return objC == null ? this.f151506c : objC;
            default:
                Class cls = (Class) this.f151505b;
                Object objC2 = ((c1) this.f151506c).f205059c.c(aVar);
                if (objC2 == null || cls.isInstance(objC2)) {
                    return objC2;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objC2.getClass().getName() + "; at path " + aVar.m());
        }
    }

    @Override // kg.l0
    public final void d(qg.c out, Object obj2) {
        switch (this.f151504a) {
            case 0:
                Intrinsics.checkNotNullParameter(out, "out");
                ((l0) this.f151505b).d(out, obj2);
                break;
            default:
                ((c1) this.f151506c).f205059c.d(out, obj2);
                break;
        }
    }

    public c(c1 c1Var, Class cls) {
        this.f151506c = c1Var;
        this.f151505b = cls;
    }
}
