package xjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements vil.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final akl.c f306551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f306552b;

    public b(akl.c appConsentRepository, l80.e dateProvider, d appConsentStatusInteractor) {
        Intrinsics.checkNotNullParameter(appConsentRepository, "appConsentRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(appConsentStatusInteractor, "appConsentStatusInteractor");
        this.f306551a = appConsentRepository;
        this.f306552b = appConsentStatusInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xjl.a
            if (r0 == 0) goto L13
            r0 = r6
            xjl.a r0 = (xjl.a) r0
            int r1 = r0.f306550w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306550w = r1
            goto L18
        L13:
            xjl.a r0 = new xjl.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f306550w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L28
            goto L49
        L28:
            r6 = move-exception
            goto L4d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            akl.c r6 = r5.f306551a     // Catch: java.lang.Exception -> L28
            r0.f306550w = r3     // Catch: java.lang.Exception -> L28
            skm.p0 r2 = skm.p0.f264001a     // Catch: java.lang.Exception -> L28
            elm.f r2 = elm.f.f127540b     // Catch: java.lang.Exception -> L28
            akl.b r3 = new akl.b     // Catch: java.lang.Exception -> L28
            r3.<init>(r6, r4)     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = skm.e0.J(r2, r3, r0)     // Catch: java.lang.Exception -> L28
            if (r6 != r1) goto L49
            return r1
        L49:
            com.revolut.sso.api.models.ConsentChallenge$App r6 = (com.revolut.sso.api.models.ConsentChallenge.App) r6     // Catch: java.lang.Exception -> L28
            r4 = r6
            goto L68
        L4d:
            boolean r0 = r6 instanceof retrofit2.HttpException
            if (r0 == 0) goto L5d
            r0 = r6
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            int r0 = r0.code()
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto L5d
            r6 = r4
        L5d:
            if (r6 == 0) goto L68
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r6, r0)
        L68:
            vil.d r6 = vil.d.f289612a
            if (r4 != 0) goto L6d
            goto L96
        L6d:
            xjl.d r0 = r5.f306552b
            ne0.j r0 = r0.f306553a
            java.lang.String r1 = "challenge_in_progress"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r4.f105894a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 == 0) goto L84
            vil.a r6 = vil.a.f289610a
            goto L96
        L84:
            long r0 = r4.f105895b
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L96
            vil.c r6 = new vil.c
            r6.<init>(r4)
        L96:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xjl.b.a(gim.c):java.lang.Object");
    }
}
