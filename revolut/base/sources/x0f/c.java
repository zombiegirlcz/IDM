package x0f;

import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreen;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ExternalCardDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ExternalCardDetailsScreen externalCardDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = externalCardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        r4.C2(new x0f.l(r4.o.f91099a));
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.u
            ip0.x10 r0 = (ip0.x10) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r4)
            com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreen r4 = r3.v
            x0f.p r4 = r4.d()
            com.revolut.core.ui_kit.views.ActionsView$Item r0 = r0.f167082b
            java.lang.String r0 = r0.f58316a
            x0f.y r4 = (x0f.y) r4
            r4.getClass()
            java.lang.String r1 = "actionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r0.hashCode()
            r2 = -1103712537(0xffffffffbe36aee7, float:-0.17840157)
            if (r1 == r2) goto L4f
            r2 = -1055123566(0xffffffffc11c1792, float:-9.755754)
            if (r1 == r2) goto L3a
            r2 = 840098015(0x3212e0df, float:8.549448E-9)
            if (r1 == r2) goto L31
            goto L66
        L31:
            java.lang.String r1 = "CARDHOLDER_VERIFICATION_VERIFY_ACTION_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L66
        L3a:
            java.lang.String r1 = "CARDHOLDER_VERIFICATION_PROVIDE_INFO_ACTION_ID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L66
        L42:
            x0f.l r0 = new x0f.l
            com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData r1 = r4.o
            java.lang.String r1 = r1.f91099a
            r0.<init>(r1)
            r4.C2(r0)
            goto L66
        L4f:
            java.lang.String r1 = "ITEM_SWITCH_PROFILE_BUTTON"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L58
            goto L66
        L58:
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig$Settings r1 = com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig.Settings.f81342g
            r0.<init>(r1)
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = zh9.u0.b(r0)
            r4.C1(r0)
        L66:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x0f.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
