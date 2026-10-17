package uzc;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ozc.s0;
import ozc.t;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f284662b;

    public /* synthetic */ h(k kVar, int i) {
        this.f284661a = i;
        this.f284662b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f284661a) {
            case 0:
                InputChecklistDelegate.Model selection = (InputChecklistDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(selection, "selection");
                k kVar = this.f284662b;
                ozc.d dVar = kVar.f284665j;
                Object obj3 = selection.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.selfserve.sow.api.models.IncomeDestination");
                gzc.k incomeDestination = (gzc.k) obj3;
                t tVar = (t) dVar;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(incomeDestination, "incomeDestination");
                return w.A0(((s0) tVar.f231329b).E0(), incomeDestination).e(((qri.b) kVar.k).m());
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((qri.b) this.f284662b.k).m();
        }
    }
}
