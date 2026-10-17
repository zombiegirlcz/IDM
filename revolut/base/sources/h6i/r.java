package h6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5i.d f149714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f149715b;

    public r(w5i.d quoteInteractor, q moveMoneyAdditionalExpensesModeProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAdditionalExpensesModeProvider, "moveMoneyAdditionalExpensesModeProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f149714a = quoteInteractor;
        this.f149715b = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s6i.c a(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r6, com.revolut.feature_move_money.api.model.AccountWrapper r7, com.revolut.feature_move_money.api.model.AccountWrapper r8) {
        /*
            r5 = this;
            j8l.a r0 = r8.f97224a
            java.lang.String r1 = "orderQuote"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "sourceBalance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "targetBalance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            com.revolut.shared.feature.market_data.models.domain.models.Charges r1 = r6.f104755g
            com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r2 = r1.f104732b
            java.util.List r2 = r2.f104723b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1e
            goto L42
        L1e:
            j8l.a r2 = r7.f97224a
            dj0.d r7 = r7.getBalance()
            xi0.b r7 = r7.f115083b
            dj0.d r3 = r8.getBalance()
            xi0.b r3 = r3.f115083b
            w5i.d r4 = r5.f149714a
            c8i.z r4 = (c8i.z) r4
            boolean r7 = r4.f(r2, r0, r7, r3)
            if (r7 != 0) goto L44
            com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration r7 = com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration.f79158c
            gte.a r2 = r5.f149715b
            jte.d r2 = (jte.d) r2
            boolean r7 = r2.c(r7)
            if (r7 != 0) goto L44
        L42:
            r6 = 0
            return r6
        L44:
            j8l.a r7 = j8l.a.CREDIT_CARD
            if (r0 != r7) goto L5d
            dj0.d r7 = r8.getBalance()
            xi0.b r7 = r7.f115083b
            xi0.a r8 = xi0.b.Companion
            r8.getClass()
            xi0.b r8 = xi0.b.F
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            s6i.c r8 = new s6i.c
            com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r0 = r1.f104732b
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = r0.f104722a
            dj0.d r0 = a.a.L(r0)
            s6i.d r6 = h6i.q.a(r6)
            if (r7 == 0) goto L71
            q6i.r$a r7 = q6i.r.a.f242633a
            goto L73
        L71:
            q6i.r$b r7 = q6i.r.b.f242634a
        L73:
            r8.<init>(r0, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.r.a(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper):s6i.c");
    }
}
