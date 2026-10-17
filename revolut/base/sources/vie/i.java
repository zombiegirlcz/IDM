package vie;

import ft3.q0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qie.f f289583a;

    public i(qie.f tabCreditVisibilityPreferences) {
        Intrinsics.checkNotNullParameter(tabCreditVisibilityPreferences, "tabCreditVisibilityPreferences");
        this.f289583a = tabCreditVisibilityPreferences;
    }

    public final boolean a() {
        Boolean bool = (Boolean) this.f289583a.f246700a.a(new tk0.b("CREDIT_TAB_VISIBILITY"));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Object b(q0 q0Var, gim.c cVar) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new qie.d(this.f289583a, q0Var, null), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object c(boolean z, gim.c cVar) {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new mt8.b(this.f289583a, z, null, 5), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
