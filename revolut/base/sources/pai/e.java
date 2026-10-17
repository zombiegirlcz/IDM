package pai;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f234561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f234562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vai.c f234563c;
    public final gte.a d;

    public e(ang.f userInteractor, sf0.h serverErrorParser, vai.c cooldownTimer, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(cooldownTimer, "cooldownTimer");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f234561a = userInteractor;
        this.f234562b = serverErrorParser;
        this.f234563c = cooldownTimer;
        this.d = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof pai.c
            if (r0 == 0) goto L13
            r0 = r12
            pai.c r0 = (pai.c) r0
            int r1 = r0.f234559w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f234559w = r1
            goto L18
        L13:
            pai.c r0 = new pai.c
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234559w
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r12)
            goto L63
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r12)
            zlg.a r12 = zlg.a.V3
            com.revolut.feature_retail_user_declarations.UserDeclarationsApi$Toggles$EmailVerificationOtpUi r2 = com.revolut.feature_retail_user_declarations.UserDeclarationsApi$Toggles.EmailVerificationOtpUi.f97478c
            gte.a r4 = r10.d
            jte.d r4 = (jte.d) r4
            boolean r2 = r4.c(r2)
            if (r2 == 0) goto L43
            r7 = r12
            goto L44
        L43:
            r7 = r8
        L44:
            r0.f234559w = r3
            ang.f r12 = r10.f234561a
            gng.a r12 = r12.f7769a
            r5 = r12
            hng.q r5 = (hng.q) r5
            r5.getClass()
            gsh.w r4 = new gsh.w
            r9 = 27
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r11, r4, r0)
            if (r12 != r1) goto L63
            return r1
        L63:
            zlg.f r12 = (zlg.f) r12
            boolean r11 = r12 instanceof zlg.e
            if (r11 == 0) goto L7e
            vai.c r11 = r10.f234563c
            vkm.j2 r11 = r11.f287301a
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.getClass()
            r11.g(r8, r0)
        L7e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pai.e.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (nim.a.a(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pai.d
            if (r0 == 0) goto L13
            r0 = r8
            pai.d r0 = (pai.d) r0
            int r1 = r0.f234560w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f234560w = r1
            goto L18
        L13:
            pai.d r0 = new pai.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234560w
            ang.f r3 = r6.f234561a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            goto L88
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)     // Catch: retrofit2.HttpException -> L38
            goto L4a
        L38:
            r7 = move-exception
            goto L4d
        L3a:
            yhm.o.b(r8)
            pfm.a r7 = r3.n(r7)     // Catch: retrofit2.HttpException -> L38
            r0.f234560w = r5     // Catch: retrofit2.HttpException -> L38
            java.lang.Object r7 = nim.a.a(r7, r0)     // Catch: retrofit2.HttpException -> L38
            if (r7 != r1) goto L4a
            goto L87
        L4a:
            pai.i r7 = pai.i.f234566a     // Catch: retrofit2.HttpException -> L38
            return r7
        L4d:
            int r8 = r7.code()
            r2 = 400(0x190, float:5.6E-43)
            if (r8 != r2) goto L58
            pai.h r7 = pai.h.f234565a
            goto L8a
        L58:
            int r8 = r7.code()
            r2 = 422(0x1a6, float:5.91E-43)
            if (r8 != r2) goto L8b
            sf0.h r8 = r6.f234562b
            com.revolut.core.error.data.model.ServerError r8 = r8.c(r7)
            if (r8 == 0) goto L8b
            int r8 = r8.f51362a
            r2 = 1033(0x409, float:1.448E-42)
            if (r8 != r2) goto L8b
            pfm.h r7 = r3.i()
            dfm.c r8 = mfm.f.f205044g
            pfm.a r2 = new pfm.a
            r3 = 1
            r2.<init>(r7, r8, r3)
            java.lang.String r7 = "onErrorComplete(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f234560w = r4
            java.lang.Object r7 = nim.a.a(r2, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            pai.g r7 = pai.g.f234564a
        L8a:
            return r7
        L8b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pai.e.b(java.lang.String, gim.c):java.lang.Object");
    }
}
