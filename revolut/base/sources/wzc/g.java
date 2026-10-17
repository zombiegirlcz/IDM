package wzc;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import gzc.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ozc.s0;
import ozc.t;
import te0.w;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f301408b;

    public /* synthetic */ g(j jVar, int i) {
        this.f301407a = i;
        this.f301408b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f301407a) {
            case 0:
                InputChecklistDelegate.Model selection = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(selection, "selection");
                Object obj3 = selection.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.feature.selfserve.sow.api.models.EvidenceDocument>");
                List documentGroup = (List) obj3;
                j jVar = this.f301408b;
                ozc.d dVar = jVar.f301411j;
                t tVar = (t) dVar;
                efm.b bVarB3 = tVar.B3((n) tVar.r3().c(), documentGroup);
                t tVar2 = (t) dVar;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(documentGroup, "documentGroup");
                s0 s0Var = (s0) tVar2.f231329b;
                pfm.t tVarA0 = w.A0(s0Var.K0(), documentGroup);
                te0.e eVarO0 = s0Var.O0();
                od0.i.Companion.getClass();
                pfm.a aVarE = tVarA0.e(w.z0(eVarO0, od0.i.f224256b)).e(w.z0(s0Var.C0(), r0.g()));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                pfm.a aVarE2 = bVarB3.e(aVarE.e(((qri.b) jVar.k).m()));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return mo3.a.u(o70.a.g(aVarE2), jVar.f301413m, true);
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((qri.b) this.f301408b.k).m();
        }
    }
}
