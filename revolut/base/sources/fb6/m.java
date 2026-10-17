package fb6;

import ba6.j0;
import ba6.l0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.x;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133454a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f133455b;

    public /* synthetic */ m(int i) {
        this.f133455b = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f133454a) {
            case 0:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return ((x) pair.f186386b).f201472c.J() < ((j0) ((l0) pair.f186385a).f13951b.get(this.f133455b)).f13937b ? n.a(new TextLocalisedClause(R$string.donations_rev_points_donation_get_more_points, null, null, 14), true, b.f133444a) : n.a(new TextLocalisedClause(R$string.donations_rev_points_donation_donate, null, null, 14), true, a.f133443a);
            default:
                List observables = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(observables, "observables");
                if (!observables.isEmpty()) {
                    return nim.a.w(mif.a.l(d0.V0(observables, this.f133455b)), new vf0.p(18));
                }
                efm.r rVarJust = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
                Intrinsics.h(rVarJust);
                return rVarJust;
        }
    }

    public /* synthetic */ m(int i, n nVar) {
        this.f133455b = i;
    }
}
