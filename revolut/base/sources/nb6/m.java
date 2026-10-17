package nb6;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlowContract$Page;
import efm.r;
import gc6.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.h1;
import n8i.q0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.overview.b f214001b;

    public /* synthetic */ m(com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar, int i) {
        this.f214000a = i;
        this.f214001b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f214000a) {
            case 0:
                h1 eligibility = (h1) obj2;
                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                if (eligibility.f201377c) {
                    return nim.a.w(this.f214001b.f72020p.c(false), new q0(12));
                }
                od0.i.Companion.getClass();
                r rVarJust = r.just(new Data(od0.i.f224256b, null, false, 6, null));
                Intrinsics.h(rVarJust);
                return rVarJust;
            default:
                gc6.j outputData = (gc6.j) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof j.a;
                com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar = this.f214001b;
                if (z) {
                    String id10 = CharitiesOverviewFlowContract$Page.Charities.f72018a.getF94249a();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    bVar.H2(bVar.f72024t, new mll.h(id10, 22));
                } else {
                    if (!(outputData instanceof gc6.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C2(new g(((gc6.k) outputData).f142357a));
                }
                return Unit.f186387a;
        }
    }
}
