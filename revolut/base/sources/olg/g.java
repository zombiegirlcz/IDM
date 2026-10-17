package olg;

import com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams;
import eli.j;
import kotlin.jvm.internal.Intrinsics;
import plg.k;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements hlg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f226408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final slg.a f226409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f226410c;
    public final k d;

    public g(d3j.b beneficiaryInteractor, slg.a sendChecksRepository, j twoFaErrorHandler, k sendChecksBeneficiaryValidationErrorHandler) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(sendChecksRepository, "sendChecksRepository");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(sendChecksBeneficiaryValidationErrorHandler, "sendChecksBeneficiaryValidationErrorHandler");
        this.f226408a = beneficiaryInteractor;
        this.f226409b = sendChecksRepository;
        this.f226410c = twoFaErrorHandler;
        this.d = sendChecksBeneficiaryValidationErrorHandler;
    }

    public static n61.b b(SendChecksBeneficiaryParams sendChecksBeneficiaryParams) {
        String str = sendChecksBeneficiaryParams.f94584a;
        String str2 = sendChecksBeneficiaryParams.f94585b;
        String str3 = sendChecksBeneficiaryParams.f94586c;
        xi0.b.Companion.getClass();
        String str4 = xi0.b.i.f306286a;
        wi0.b.Companion.getClass();
        return new n61.b(str, str2, str3, str4, "US", r0.g(), sendChecksBeneficiaryParams.d, 59392);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof olg.d
            if (r0 == 0) goto L13
            r0 = r7
            olg.d r0 = (olg.d) r0
            int r1 = r0.f226404w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226404w = r1
            goto L18
        L13:
            olg.d r0 = new olg.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226404w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            n61.b r6 = b(r6)
            r7 = 0
            d3j.b r2 = r5.f226408a
            efm.r r6 = r2.f(r6, r7)
            ej9.s r7 = new ej9.s
            r2 = 12
            eli.j r4 = r5.f226410c
            r7.<init>(r4, r2)
            efm.r r6 = r6.compose(r7)
            java.lang.String r7 = "compose(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f226404w = r3
            java.lang.Object r7 = nim.a.c(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            java.lang.String r6 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: olg.g.a(com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof olg.e
            if (r0 == 0) goto L13
            r0 = r7
            olg.e r0 = (olg.e) r0
            int r1 = r0.f226406x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226406x = r1
            goto L18
        L13:
            olg.e r0 = new olg.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226406x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L7f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f226406x = r4
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 != r1) goto L46
            goto L7e
        L46:
            plg.o r7 = (plg.o) r7
            boolean r2 = r7 instanceof plg.l
            if (r2 == 0) goto L6c
            plg.l r7 = (plg.l) r7
            co3.a r0 = r7.f237390a
            com.revolut.feature.address.models.Address r7 = r7.f237391b
            if (r7 != 0) goto L56
            com.revolut.feature.address.models.Address r7 = r6.d
        L56:
            java.lang.String r1 = r6.f94584a
            java.lang.String r2 = r6.f94585b
            java.lang.String r6 = r6.f94586c
            java.lang.String r3 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams r3 = new com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams
            r3.<init>(r1, r2, r6, r7)
            jlg.a r6 = new jlg.a
            r6.<init>(r3, r0)
            return r6
        L6c:
            boolean r7 = r7 instanceof plg.m
            if (r7 == 0) goto L73
            jlg.b r6 = jlg.b.f175760a
            return r6
        L73:
            r7 = 0
            r0.u = r7
            r0.f226406x = r3
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L7f
        L7e:
            return r1
        L7f:
            f5j.a r7 = (f5j.a) r7
            jlg.c r6 = new jlg.c
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: olg.g.c(com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof olg.f
            if (r0 == 0) goto L13
            r0 = r7
            olg.f r0 = (olg.f) r0
            int r1 = r0.f226407w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226407w = r1
            goto L18
        L13:
            olg.f r0 = new olg.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226407w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L68
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            n61.b r6 = b(r6)
            r7 = 0
            d3j.b r2 = r5.f226408a
            ufm.n r6 = r2.k(r6, r7)
            okk.d r7 = new okk.d
            r2 = 9
            r7.<init>(r2)
            oid.y r2 = new oid.y
            r4 = 5
            r2.<init>(r7, r4)
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            ok7.c r6 = new ok7.c
            r2 = 3
            r6.<init>(r5, r2)
            ufm.i r6 = ue0.e.D(r7, r6)
            r0.f226407w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: olg.g.d(com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams, gim.c):java.lang.Object");
    }
}
