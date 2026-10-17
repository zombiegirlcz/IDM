package vp7;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements jki.p {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r13) {
        /*
            r12 = this;
            vp7.i r13 = (vp7.i) r13
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.util.ArrayList r13 = r13.f291116a
            boolean r0 = r13.isEmpty()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
        L12:
            r0 = r3
            goto L48
        L14:
            java.util.Iterator r0 = r13.iterator()
        L18:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L12
            java.lang.Object r4 = r0.next()
            vp7.b r4 = (vp7.b) r4
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.time.LocalDate r5 = r4.f291113a
            if (r5 != 0) goto L32
        L30:
            r8 = r1
            goto L44
        L32:
            com.revolut.feature.insurance_car.impl.data.model.Answer$ClaimType r6 = r4.f291114b
            if (r6 != 0) goto L37
            goto L30
        L37:
            java.lang.Boolean r7 = r4.f291115c
            if (r7 == 0) goto L30
            java.lang.Boolean r4 = r4.d
            if (r4 == 0) goto L30
            com.revolut.feature.insurance_car.impl.data.model.Survey$Claims$Details r8 = new com.revolut.feature.insurance_car.impl.data.model.Survey$Claims$Details
            r8.<init>(r5, r6, r7, r4)
        L44:
            if (r8 == 0) goto L47
            goto L18
        L47:
            r0 = r2
        L48:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r13.iterator()
            r6 = r2
        L52:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L98
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L94
            vp7.b r7 = (vp7.b) r7
            int r9 = r13.size()
            r10 = 2
            if (r9 >= r10) goto L6b
        L69:
            r9 = r1
            goto L7c
        L6b:
            if (r6 != 0) goto L74
            int r9 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_question_claim_details_first_claim
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L7c
        L74:
            if (r6 != r3) goto L69
            int r9 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_question_claim_details_second_claim
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L7c:
            if (r9 == 0) goto L8a
            int r9 = r9.intValue()
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r11 = 14
            r10.<init>(r9, r1, r1, r11)
            goto L8b
        L8a:
            r10 = r1
        L8b:
            aim.e r6 = vp7.a.a(r7, r10, r6, r2)
            zhm.a0.x(r6, r4)
            r6 = r8
            goto L52
        L94:
            zhm.v.s()
            throw r1
        L98:
            vp7.l r13 = new vp7.l
            r13.<init>(r4, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vp7.s.a(jki.i):jki.m");
    }
}
