package tkm;

import android.view.View;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.insurance_embedded.impl.data.model.l0;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$Step;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ParcelableDestination;
import gu7.m0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku8.l;
import ku8.m;
import ku8.n;
import ofm.q;
import skm.p0;
import ts6.s0;
import ts6.u0;
import ts6.x;
import tt7.i;
import tt7.k;
import tt7.o;
import tt7.r;
import tv7.h;
import tv7.j;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f271973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f271974c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f271972a = i;
        this.f271973b = obj2;
        this.f271974c = obj3;
    }

    private final Object a(Object obj2) {
        s0 s0Var = (s0) this.f271973b;
        u0 u0Var = (u0) this.f271974c;
        FreelancerAccountOnboardingState freelancerAccount = (FreelancerAccountOnboardingState) obj2;
        Intrinsics.checkNotNullParameter(freelancerAccount, "freelancerAccount");
        return com.revolut.feature.freelancer.common.models.a.d(freelancerAccount) ? q.L(p0.f264003c, new x(u0Var, s0Var, null)) : s0.l(s0Var, null, 3);
    }

    private final Object b(Object obj2) {
        ParcelableDestination parcelableDestination = (ParcelableDestination) this.f271973b;
        s0 s0Var = (s0) this.f271974c;
        Boolean isAvailable = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(isAvailable, "isAvailable");
        return isAvailable.booleanValue() ? parcelableDestination : new BridgeDestination(s0Var.h());
    }

    private final Object c(Object obj2) {
        r rVar = (r) this.f271973b;
        i iVar = (i) this.f271974c;
        Function0 getDefaultLoadingItems = (Function0) obj2;
        Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
        List list = (List) getDefaultLoadingItems.invoke();
        hha.d dVar = iVar.f274244b;
        return new o(list, k.b.f274249a, dVar != null ? fgk.a.a(rVar.e, dVar) : AnimatedBackgroundType.DEFAULT.f51471a);
    }

    private final Object d(Object obj2) {
        View view = (View) this.f271973b;
        View view2 = (View) this.f271974c;
        tu0.f fVar = (tu0.f) obj2;
        int i = fVar == null ? -1 : tu0.d.f274511a[fVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                knm.b.z(view, false, 100L, 12);
            } else if (i == 2) {
                knm.b.z(view2, false, 100L, 12);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                knm.b.z(view, true, 100L, 12);
                knm.b.z(view2, true, 100L, 12);
            }
        }
        return Unit.f186387a;
    }

    private final Object e(Object obj2) {
        Data layout;
        j jVar = (j) this.f271973b;
        Data data = (Data) this.f271974c;
        h hVar = (h) obj2;
        jVar.getClass();
        l0 l0Var = (l0) data.getContent();
        m0 m0Var = l0Var != null ? l0Var.d : null;
        if (m0Var != null) {
            layout = new Data(m0Var, data.getError(), data.getLoading());
        } else if (data.getLoading()) {
            layout = new Data(null, data.getError(), true, 1, null);
        } else {
            Throwable error = data.getError();
            if (error == null) {
                error = new IllegalStateException("Embedded insurance details layout contacts must not be null when not loading.");
            }
            layout = new Data(null, error, false, 5, null);
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new h(layout);
    }

    private final Object g(Object obj2) {
        com.revolut.feature.kyc.impl.flow.kyc_consolidated.c cVar = (com.revolut.feature.kyc.impl.flow.kyc_consolidated.c) this.f271973b;
        KycConsolidatedFlowContract$Step.RemoteDocs remoteDocs = (KycConsolidatedFlowContract$Step.RemoteDocs) this.f271974c;
        n output = (n) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof ku8.k) {
            cVar.l2(new com.revolut.feature.kyc.impl.flow.kyc_consolidated.a(cVar, remoteDocs, output, null), new yi5.b(26));
        } else if (!(output instanceof m)) {
            if (!Intrinsics.f(output, l.f189743a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.M2();
        }
        return Unit.f186387a;
    }

    private final Object h(Object obj2) {
        Pair pair = (Pair) this.f271973b;
        String str = (String) this.f271974c;
        Data baseCurrencyAndBalances = new Data(pair, null, false, 6, null);
        ((tvh.c) obj2).getClass();
        Intrinsics.checkNotNullParameter(baseCurrencyAndBalances, "baseCurrencyAndBalances");
        return new tvh.c(baseCurrencyAndBalances, str);
    }

    private final Object i(Object obj2) {
        tw0.l0 l0Var = (tw0.l0) this.f271973b;
        nsh.e eVar = (nsh.e) this.f271974c;
        ((Integer) obj2).getClass();
        l0Var.i(eVar);
        return Unit.f186387a;
    }

    private final Object j(Object obj2) {
        tw5.i iVar = (tw5.i) this.f271973b;
        String str = (String) this.f271974c;
        Unit it8 = (Unit) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return (cw5.f) iVar.f274929b.get(str);
    }

    private final Object k(Object obj2) {
        kwb.b bVar = (kwb.b) this.f271973b;
        UserVoucherDetails userVoucherDetails = (UserVoucherDetails) this.f271974c;
        twb.l lVar = (twb.l) obj2;
        VoucherProductGroupDetails voucherProductGroupDetails = bVar.f190326a;
        m1c.x xVar = bVar.f190327b;
        tvb.c termsRegion = bVar.d;
        Intrinsics.checkNotNullParameter(termsRegion, "termsRegion");
        return twb.l.a(lVar, new Data(new kwb.b(voucherProductGroupDetails, xVar, userVoucherDetails, termsRegion), null, false, 6, null), null, null, null, false, false, null, 254);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:285:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0312  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r77) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tkm.d.invoke(java.lang.Object):java.lang.Object");
    }
}
