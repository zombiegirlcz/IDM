package ne0;

import efm.r;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tfm.n4;

/* JADX INFO: loaded from: classes.dex */
public final class h extends fd0.d {
    public final /* synthetic */ gpk.c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gpk.c cVar) {
        super(10);
        this.f = cVar;
    }

    @Override // fd0.d
    public final Object a(Object obj2) {
        n4 n4VarE = w.f0((r) ((fif.c) this.f.f145463a).invoke(obj2)).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        return n4VarE;
    }

    @Override // fd0.d
    public final void b(Object obj2, Object obj3, Object obj4) {
        gpk.c cVar = this.f;
        synchronized (((HashMap) cVar.f145464b)) {
            ifm.c cVar2 = (ifm.c) ((HashMap) cVar.f145464b).remove(obj2);
            if (cVar2 != null) {
                cVar2.dispose();
                Unit unit = Unit.f186387a;
            }
        }
    }
}
