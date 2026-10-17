package c46;

import aw0.n6;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeFiExchangeSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(DeFiExchangeSummaryScreen deFiExchangeSummaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deFiExchangeSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            default:
                return new l(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryScreen r1 = r7.v
            switch(r0) {
                case 0: goto La7;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            c46.e r8 = r1.R2()
            r1 = r8
            com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a r1 = (com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) r1
            cli.y r8 = r1.A
            java.lang.Object r0 = r8.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            c46.c r0 = (c46.c) r0
            com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft r2 = r0.f21082a
            com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuote r0 = r2.f71766g
            if (r0 != 0) goto L2b
            boolean r3 = r2.f71767h
            if (r3 == 0) goto L2b
            goto La4
        L2b:
            com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiMoneyDetails r3 = r2.f71763a
            kyh.f r3 = r3.f71770c
            com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiMoneyDetails r4 = r2.f71764b
            kyh.f r4 = r4.f71770c
            if (r3 != 0) goto L36
            r3 = r4
        L36:
            if (r3 == 0) goto L39
            goto La4
        L39:
            if (r0 == 0) goto La4
            java.lang.String r3 = r0.k
            if (r3 != 0) goto L40
            goto La4
        L40:
            java.lang.Object r8 = r8.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            c46.c r8 = (c46.c) r8
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskAssessment r8 = r8.f21084c
            if (r8 != 0) goto L52
            com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails r8 = r2.e
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskAssessment r8 = r8.k
        L52:
            r4 = 0
            if (r8 == 0) goto L94
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskLevel r0 = r8.f71685a
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskLevel r5 = com.revolut.feature.defi.common.models.domain.DeFiAssetRiskLevel.WARNING
            if (r0 == r5) goto L64
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskLevel r5 = com.revolut.feature.defi.common.models.domain.DeFiAssetRiskLevel.MALICIOUS
            if (r0 != r5) goto L94
        L64:
            com.revolut.kompot.navigable.vc.modal.a r0 = r1.z
            java.util.ArrayList r8 = r8.f71686b
            java.util.Iterator r8 = r8.iterator()
        L6c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r8.next()
            r5 = r1
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType r5 = (com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType) r5
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType r6 = com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType.UNKNOWN
            if (r5 == r6) goto L6c
            r4 = r1
        L7e:
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType r4 = (com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType) r4
            if (r4 != 0) goto L84
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType r4 = com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType.UNKNOWN
        L84:
            com.revolut.feature.defi.common.models.domain.DeFiAssetRiskContent r8 = new com.revolut.feature.defi.common.models.domain.DeFiAssetRiskContent
            r8.<init>(r4)
            com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryContract$ModalStep$RiskConfirmation r1 = new com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryContract$ModalStep$RiskConfirmation
            r1.<init>(r8, r2, r3)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r8 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r0, r1, r8)
            goto La4
        L94:
            c34.d r0 = new c34.d
            r5 = 2
            r0.<init>(r1, r2, r3, r4, r5)
            yi5.b r8 = new yi5.b
            r2 = 26
            r8.<init>(r2)
            r1.l2(r0, r8)
        La4:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            c46.e r8 = r1.R2()
            com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a r8 = (com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) r8
            r8.B2()
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c46.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
