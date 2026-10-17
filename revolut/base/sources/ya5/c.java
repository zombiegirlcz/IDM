package ya5;

import aw0.n6;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PostTerminationPlanManualRepaymentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PostTerminationPlanManualRepaymentController postTerminationPlanManualRepaymentController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = postTerminationPlanManualRepaymentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.u
            com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentController r1 = r10.v
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r11)
            ya5.l r11 = r1.k3()
            r11.B2()
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L16:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r11)
            ya5.l r4 = r1.k3()
            cli.y r11 = r4.u
            java.lang.Object r0 = r11.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            ya5.f r0 = (ya5.f) r0
            com.revolut.data.model.Data r0 = r0.f311933a
            java.lang.Object r0 = r0.getContent()
            ya5.e r0 = (ya5.e) r0
            r1 = 0
            if (r0 == 0) goto L39
            com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails r0 = r0.f311931a
            goto L3a
        L39:
            r0 = r1
        L3a:
            if (r0 == 0) goto L56
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            dj0.d r0 = r0.f70654c
            xi0.b r0 = r0.f115083b
            if (r0 != 0) goto L48
            goto L56
        L48:
            java.lang.Object r11 = r11.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            ya5.f r11 = (ya5.f) r11
            java.lang.String r11 = r11.f311934b
            if (r11 != 0) goto L58
        L56:
            r11 = r1
            goto L66
        L58:
            dj0.d r2 = new dj0.d
            w80.b r3 = r4.f311943p
            java.lang.String r5 = r0.f306286a
            long r5 = r3.b(r11, r5)
            r2.<init>(r5, r0)
            r11 = r2
        L66:
            if (r11 != 0) goto L69
            goto L82
        L69:
            xlb.o r2 = new xlb.o
            r8 = 0
            r9 = 27
            r3 = 1
            java.lang.Class<ya5.l> r5 = ya5.l.class
            java.lang.String r6 = "handleError"
            java.lang.String r7 = "handleError(Ljava/lang/Throwable;)Z"
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            y20.a1 r0 = new y20.a1
            r3 = 15
            r0.<init>(r4, r11, r1, r3)
            r4.n2(r0, r2)
        L82:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ya5.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
