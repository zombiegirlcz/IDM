package kp7;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MotorPlanSelectorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MotorPlanSelectorScreen motorPlanSelectorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = motorPlanSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.u
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreen r8 = r7.v
            kp7.n r8 = r8.T2()
            java.lang.String r0 = r0.f52613a
            com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e r8 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) r8
            j60.a r1 = r8.f75616s
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            int r2 = r0.hashCode()
            r3 = -1500526532(0xffffffffa68fc83c, float:-9.976892E-16)
            r4 = 3
            r5 = 0
            r6 = 0
            if (r2 == r3) goto L5d
            r3 = -524259170(0xffffffffe0c0709e, float:-1.1093406E20)
            if (r2 == r3) goto L43
            r3 = 1832165584(0x6d34a0d0, float:3.493857E27)
            if (r2 == r3) goto L31
            goto L65
        L31:
            java.lang.String r2 = "REMINDER_SECONDARY_BUTTON_ID"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3a
            goto L65
        L3a:
            j60.a.v(r1, r5, r6, r4)
            com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a$b r0 = com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a.b.f75612a
            r8.v2(r0)
            goto L6c
        L43:
            java.lang.String r2 = "REMINDER_PRIMARY_BUTTON_ID"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            goto L65
        L4c:
            j60.a.v(r1, r5, r6, r4)
            kp7.p r0 = new kp7.p
            r0.<init>(r8, r5)
            com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.d r1 = new com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.d
            r1.<init>(r8, r6)
            r8.l2(r1, r0)
            goto L6c
        L5d:
            java.lang.String r8 = "CANCEL_RENEWAL_DISMISS_ID"
            boolean r8 = r0.equals(r8)
            if (r8 != 0) goto L69
        L65:
            j60.a.v(r1, r5, r6, r4)
            goto L6c
        L69:
            j60.a.v(r1, r5, r6, r4)
        L6c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kp7.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
