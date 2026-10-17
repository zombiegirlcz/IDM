package bs9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f18084a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f18084a = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cs9.a a(bs9.o r14) {
        /*
            r13 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            cs9.b r0 = r14.f18119g
            com.revolut.data.model.Data r1 = r14.f18121j
            boolean r2 = r14.f18118c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L15
            boolean r2 = r14.d
            if (r2 == 0) goto L15
            r7 = r4
            goto L16
        L15:
            r7 = r3
        L16:
            cs9.a r5 = new cs9.a
            com.revolut.feature.payments.groups.api.models.PaymentGroup r2 = r14.f18116a
            boolean r6 = r2.f79288g
            java.lang.String r8 = "<this>"
            if (r6 == 0) goto L5a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r8)
            java.util.List r2 = r2.d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L4b
            java.lang.Object r10 = r2.next()
            r11 = r10
            oq9.o r11 = (oq9.o) r11
            boolean r12 = r11 instanceof oq9.l
            if (r12 == 0) goto L30
            oq9.l r11 = (oq9.l) r11
            boolean r11 = r11.f227840h
            if (r11 == 0) goto L30
            r9.add(r10)
            goto L30
        L4b:
            int r2 = r9.size()
            if (r2 <= r4) goto L5a
            java.lang.Object r2 = r1.getContent()
            st9.a r9 = st9.a.SUPPORTED
            if (r2 != r9) goto L5a
            r3 = r4
        L5a:
            mx0.b4 r9 = r0.a()
            com.revolut.feature.payments.social.api.SocialPaymentsApi$Toggles$SocialProductCatalogueMigration r0 = com.revolut.feature.payments.social.api.SocialPaymentsApi$Toggles.SocialProductCatalogueMigration.f79714c
            gte.a r2 = r13.f18084a
            jte.d r2 = (jte.d) r2
            boolean r0 = r2.c(r0)
            if (r0 == 0) goto L88
            if (r7 != 0) goto L88
            boolean r14 = r14.e
            if (r14 == 0) goto L88
            java.lang.Object r14 = r1.getContent()
            st9.a r14 = (st9.a) r14
            if (r14 == 0) goto L88
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r8)
            st9.a r0 = st9.a.SUPPORTED
            if (r14 == r0) goto L83
            st9.a r0 = st9.a.TEXT_NOT_SUPPORTED
            if (r14 != r0) goto L88
        L83:
            cs9.c r14 = cs9.c.f108458a
        L85:
            r10 = r14
            r8 = r3
            goto L8b
        L88:
            cs9.d r14 = cs9.d.f108459a
            goto L85
        L8b:
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bs9.a.a(bs9.o):cs9.a");
    }
}
