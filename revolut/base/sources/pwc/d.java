package pwc;

import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WealthProtectionLimitChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = wealthProtectionLimitChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.u
            r1 = 26
            r2 = 0
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen r3 = r11.v
            switch(r0) {
                case 0: goto La2;
                case 1: goto L84;
                default: goto La;
            }
        La:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r12)
            pwc.p r12 = r3.e3()
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a r12 = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) r12
            com.revolut.kompot.navigable.vc.modal.a r0 = r12.E
            cli.y r3 = r12.D
            java.lang.Object r4 = r3.f22677a
            vkm.j2 r4 = (vkm.j2) r4
            java.lang.Object r4 = r4.getValue()
            pwc.g r4 = (pwc.g) r4
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState$Visible r4 = r4.f240400a
            java.lang.Object r3 = r3.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            pwc.g r3 = (pwc.g) r3
            dj0.d r3 = r3.f240401b
            boolean r5 = r4 instanceof com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible.Enabled
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r6 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            if (r5 == 0) goto L4d
            kotlin.jvm.internal.Intrinsics.h(r3)
            long r7 = r3.f115082a
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L4d
            xi0.b r12 = r3.f115083b
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$Step$LimitSetToZero r1 = new com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$Step$LimitSetToZero
            r1.<init>(r12)
            oki.h.v2(r0, r1, r6)
            goto L81
        L4d:
            if (r5 == 0) goto L67
            kotlin.jvm.internal.Intrinsics.h(r3)
            long r7 = r3.f115082a
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState$Visible$Enabled r4 = (com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible.Enabled) r4
            dj0.d r4 = r4.f85448c
            long r9 = r4.f115082a
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L67
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$Step$LimitExceedingAmount r12 = new com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$Step$LimitExceedingAmount
            r12.<init>(r4, r3)
            oki.h.v2(r0, r12, r6)
            goto L81
        L67:
            boolean r0 = r12.I2()
            if (r0 != 0) goto L73
            pwc.i r0 = pwc.i.f240407a
            r12.C2(r0)
            goto L81
        L73:
            pwb.p r0 = new pwb.p
            r3 = 1
            r0.<init>(r12, r2, r3)
            yi5.b r2 = new yi5.b
            r2.<init>(r1)
            r12.l2(r0, r2)
        L81:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L84:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r12)
            pwc.p r12 = r3.e3()
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a r12 = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) r12
            r12.getClass()
            pwc.d0 r0 = new pwc.d0
            r0.<init>(r12, r2)
            yi5.b r2 = new yi5.b
            r2.<init>(r1)
            r12.l2(r0, r2)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        La2:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r12)
            pwc.p r12 = r3.e3()
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a r12 = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) r12
            r12.B2()
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pwc.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
