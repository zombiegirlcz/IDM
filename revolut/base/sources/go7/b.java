package go7;

import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MtaReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MtaReviewScreen mtaReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = mtaReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.u
            com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreen r1 = r9.v
            switch(r0) {
                case 0: goto L88;
                default: goto L7;
            }
        L7:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r10)
            java.lang.Object r10 = r1.Y
            java.lang.Object r10 = r10.getValue()
            go7.h r10 = (go7.h) r10
            r0 = r10
            go7.s r0 = (go7.s) r0
            jki.i r10 = r0.t2()
            go7.f r10 = (go7.f) r10
            kl7.a1 r10 = r10.f145091a
            kl7.a1 r1 = kl7.a1.VEHICLE_REPLACE
            r8 = 0
            if (r10 == r1) goto L2f
            kl7.a1 r1 = kl7.a1.VEHICLE_ADD
            if (r10 == r1) goto L2f
            kl7.a1 r1 = kl7.a1.VEHICLE_SUBSTITUTE
            if (r10 != r1) goto L2d
            goto L2f
        L2d:
            r2 = r0
            goto L6a
        L2f:
            jki.i r10 = r0.t2()
            go7.f r10 = (go7.f) r10
            com.revolut.feature.insurance_car.impl.data.model.InsurableCar r10 = r10.f145092b
            if (r10 == 0) goto L3c
            java.lang.String r10 = r10.f75227b
            goto L3d
        L3c:
            r10 = r8
        L3d:
            if (r10 != 0) goto L2d
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_add_reg_number_title
            r2 = 14
            r10.<init>(r1, r8, r8, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_add_reg_number_description
            r1.<init>(r3, r8, r8, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_mta_add_reg_number_action
            r3.<init>(r4, r8, r8, r2)
            nii.y0 r10 = vl7.a.f(r10, r1, r3, r8)
            kotlinx.coroutines.flow.Flow r1 = r0.X1(r10)
            go7.q r4 = new go7.q
            r4.<init>(r0, r8)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            goto L85
        L6a:
            g9i.s r0 = new g9i.s
            r6 = 1
            r7 = 28
            r1 = 1
            java.lang.Class<vl7.a> r3 = vl7.a.class
            java.lang.String r4 = "genericErrorHandler"
            java.lang.String r5 = "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = r0
            r0 = r2
            ge7.f r1 = new ge7.f
            r2 = 20
            r1.<init>(r0, r8, r2)
            r0.l2(r1, r10)
        L85:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L88:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r10)
            android.app.Activity r10 = r1.m2()
            r10.onBackPressed()
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: go7.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
