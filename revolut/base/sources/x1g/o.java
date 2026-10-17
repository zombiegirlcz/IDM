package x1g;

import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302432a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f302433b;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            r4 = this;
            int r0 = r4.f302432a
            x1g.i r1 = r4.f302433b
            r2 = 0
            switch(r0) {
                case 0: goto L2b;
                default: goto L8;
            }
        L8:
            m1c.r0 r5 = (m1c.r0) r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.String r6 = "info"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            boolean r5 = qk.d.l(r5)
            if (r5 == 0) goto L26
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature.rev_points.api.R$string.rev_points_common_opt_in_accept_terms_button_title
            r7 = 14
            r5.<init>(r6, r2, r2, r7)
            goto L2a
        L26:
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = x1g.f0.a(r1)
        L2a:
            return r5
        L2b:
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$Pocket r5 = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.Pocket) r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.String r6 = "payment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            dj0.d r6 = x1g.p.a(r1)
            com.revolut.data.model.Data r7 = r1.f302425m
            java.lang.Object r7 = r7.getContent()
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote r7 = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote) r7
            if (r7 == 0) goto L4a
            dj0.d r7 = r7.f84400c
            goto L4b
        L4a:
            r7 = r2
        L4b:
            r0 = 0
            if (r7 == 0) goto L63
            xi0.b r1 = r7.f115083b
            dj0.d r3 = r5.i
            xi0.b r3 = r3.f115083b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 == 0) goto L63
            dj0.d r5 = r5.i
            int r5 = r5.compareTo(r7)
            if (r5 < 0) goto L86
            goto L77
        L63:
            dj0.d r7 = r5.f84381j
            xi0.b r7 = r7.f115083b
            xi0.b r1 = r6.f115083b
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r1)
            if (r7 == 0) goto L79
            dj0.d r5 = r5.f84381j
            int r5 = r5.compareTo(r6)
            if (r5 < 0) goto L86
        L77:
            r0 = 1
            goto L86
        L79:
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            java.lang.String r7 = "balanceInRequestedCurrency has not the same currency as price"
            java.lang.String r1 = "TravelExperiencesCheckoutScreen"
            rd0.d.a(r6, r1, r7, r2, r5)
        L86:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x1g.o.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o(f0 f0Var, i iVar) {
        this.f302433b = iVar;
    }
}
