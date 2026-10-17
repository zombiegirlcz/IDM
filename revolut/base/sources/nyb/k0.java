package nyb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eub.a f220805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.i f220806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f220807c;

    public k0(eub.a revPointsAvailabilityInteractor, eub.i revPointsOptInInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f220805a = revPointsAvailabilityInteractor;
        this.f220806b = revPointsOptInInteractor;
        this.f220807c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nyb.j0
            if (r0 == 0) goto L13
            r0 = r6
            nyb.j0 r0 = (nyb.j0) r0
            int r1 = r0.f220803x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220803x = r1
            goto L18
        L13:
            nyb.j0 r0 = new nyb.j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220803x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            eub.i r6 = r4.f220806b
            efm.d0 r6 = eub.i.b(r6)
            r0.u = r5
            r0.f220803x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            m1c.r0 r6 = (m1c.r0) r6
            m1c.x0 r6 = r6.f201447a
            m1c.x0 r0 = m1c.x0.OPTED_IN
            r1 = 0
            if (r6 != r0) goto L50
            r6 = r3
            goto L51
        L50:
            r6 = r1
        L51:
            boolean r0 = r5 instanceof com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext.HomeTab
            if (r0 == 0) goto L57
            r3 = r6
            goto L6e
        L57:
            boolean r0 = r5 instanceof com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext.CreditCardTab
            if (r0 == 0) goto L66
            com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardChallengesWidget r5 = com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardChallengesWidget.f68680c
            gte.a r6 = r4.f220807c
            jte.d r6 = (jte.d) r6
            boolean r3 = r6.c(r5)
            goto L6e
        L66:
            boolean r5 = r5 instanceof com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext.LifestyleTab
            if (r5 == 0) goto L73
            if (r6 == 0) goto L6d
            goto L6e
        L6d:
            r3 = r1
        L6e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L73:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nyb.k0.a(com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext, gim.c):java.lang.Object");
    }
}
