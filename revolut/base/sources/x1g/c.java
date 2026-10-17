package x1g;

import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelExperiencesCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelExperiencesCheckoutScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.u
            com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreen r1 = r8.v
            switch(r0) {
                case 0: goto L96;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r9)
            x1g.m r9 = r1.R2()
            r2 = r9
            x1g.c0 r2 = (x1g.c0) r2
            cli.y r9 = r2.I
            java.lang.Object r0 = r9.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r0 = r0.getValue()
            x1g.i r0 = (x1g.i) r0
            od0.i r0 = r0.o
            java.lang.Object r0 = r0.f224257a
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            if (r0 == 0) goto L61
            java.lang.Object r0 = r0.getContent()
            m1c.r0 r0 = (m1c.r0) r0
            if (r0 == 0) goto L59
            boolean r1 = qk.d.l(r0)
            if (r1 == 0) goto L61
            m1c.u r9 = r0.f201448b
            m1c.s r9 = (m1c.s) r9
            k0c.a r0 = r2.C
            com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData r1 = new com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData
            java.util.ArrayList r9 = r9.f201451a
            r1.<init>(r9)
            r0.getClass()
            com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlow r9 = k0c.a.a(r1)
            x1g.q r0 = new x1g.q
            r1 = 2
            r0.<init>(r2, r1)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_IMMEDIATE r1 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a
            r2.f2(r9, r1, r0)
            goto L93
        L59:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Payment is clickable, but RevPoints opt-in info is not loaded"
            r9.<init>(r0)
            throw r9
        L61:
            java.lang.Object r0 = r9.getValue()
            x1g.i r0 = (x1g.i) r0
            boolean r0 = x1g.p.b(r0)
            if (r0 == 0) goto L86
            wma.e r0 = new wma.e
            r6 = 0
            r7 = 6
            r1 = 1
            java.lang.Class<x1g.c0> r3 = x1g.c0.class
            java.lang.String r4 = "handleBookingError"
            java.lang.String r5 = "handleBookingError(Ljava/lang/Throwable;)Z"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            x1g.s r9 = new x1g.s
            r1 = 0
            r3 = 0
            r9.<init>(r3, r1, r2)
            r2.l2(r9, r0)
            goto L93
        L86:
            java.lang.Object r9 = r9.getValue()
            x1g.i r9 = (x1g.i) r9
            dj0.d r9 = x1g.p.a(r9)
            r2.K2(r9)
        L93:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L96:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r9)
            android.app.Activity r9 = r1.m2()
            r9.onBackPressed()
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x1g.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
