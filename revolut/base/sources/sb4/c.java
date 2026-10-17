package sb4;

import au.c0;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.h1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx3.a f261499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PluginFlowContract$Input f261500b;

    public c(hx3.a financialEvidenceInteractor, PluginFlowContract$Input inputData) {
        Intrinsics.checkNotNullParameter(financialEvidenceInteractor, "financialEvidenceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f261499a = financialEvidenceInteractor;
        this.f261500b = inputData;
    }

    public final Object a(gim.i iVar) throws Throwable {
        h1 h1VarC = c();
        j34.g gVar = ((hx3.g) this.f261499a).f156379a;
        gVar.getClass();
        c0 c0Var = new c0(gVar, h1VarC, true, null, 11);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, c0Var, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object b(gim.i iVar) throws Throwable {
        h1 h1VarC = c();
        j34.g gVar = ((hx3.g) this.f261499a).f156379a;
        gVar.getClass();
        j34.b bVar = new j34.b(gVar, h1VarC, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, bVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final h1 c() {
        return w0.F(this.f261500b.getF68490b());
    }
}
