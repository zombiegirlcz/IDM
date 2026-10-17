package tb6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CharityDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CharityDetailsScreen charityDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = charityDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r10)
            com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen r10 = r9.v
            tb6.r r10 = r10.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c r10 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) r10
            r10.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r0.f53228a
            int r2 = r1.hashCode()
            switch(r2) {
                case -2109146580: goto L58;
                case -1854378493: goto L4b;
                case -920799040: goto L38;
                case -518022768: goto L2f;
                case 1437667026: goto L26;
                default: goto L25;
            }
        L25:
            goto L60
        L26:
            java.lang.String r2 = "item_id_create_recurring"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L96
            goto L60
        L2f:
            java.lang.String r2 = "item_id_spare_change"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L54
            goto L60
        L38:
            java.lang.String r2 = "item_id_donate_with_rev_points"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L41
            goto L60
        L41:
            com.revolut.kompot.navigable.vc.modal.a r10 = r10.I
            com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreenContract$Step$DonateWithRevPointsBottomSheet r0 = com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreenContract$Step.DonateWithRevPointsBottomSheet.f72064a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r10, r0, r1)
            goto L99
        L4b:
            java.lang.String r2 = "item_id_create_spare_change"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L54
            goto L60
        L54:
            r10.J2()
            goto L99
        L58:
            java.lang.String r2 = "item_id_recurring_payment"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L96
        L60:
            java.lang.Object r0 = r0.u
            boolean r1 = r0 instanceof tof.a3
            if (r1 == 0) goto L7b
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            ua6.a r2 = r10.f72075x
            tof.a3 r0 = (tof.a3) r0
            k71.i r0 = ofm.q.P(r0)
            com.revolut.retail.core.navigation.FeatureCommand r0 = r2.a(r0)
            r1.<init>(r0)
            r10.C1(r1)
            goto L99
        L7b:
            boolean r1 = r0 instanceof com.revolut.feature.rev_points.models.RevPointsTransaction
            if (r1 == 0) goto L99
            r3 = r0
            com.revolut.feature.rev_points.models.RevPointsTransaction r3 = (com.revolut.feature.rev_points.models.RevPointsTransaction) r3
            com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination r0 = new com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination
            com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination$StartType$OpenRevPointsTransactionDetails r2 = new com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination$StartType$OpenRevPointsTransactionDetails
            r7 = 1
            r8 = 14
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.<init>(r2)
            r10.C1(r0)
            goto L99
        L96:
            r10.I2()
        L99:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb6.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
