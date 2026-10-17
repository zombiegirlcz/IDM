package d27;

import com.revolut.feature.freelancer.api.exception.FreelancerCurrencyException;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a f110753a;

    public k0(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar) {
        this.f110753a = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Set set = (Set) pair.f186385a;
        xi0.b bVar = (xi0.b) pair.f186386b;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar = this.f110753a;
        aVar.H2(aVar.E, new j0(0, set));
        xi0.b bVar2 = aVar.u.f74170a;
        if (!zhm.d0.T(set, bVar2)) {
            bVar2 = null;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        if (!set.contains(bVar)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        throw new FreelancerCurrencyException.PaymentLink();
    }
}
