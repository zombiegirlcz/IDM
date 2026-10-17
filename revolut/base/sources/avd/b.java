package avd;

import akg.n;
import au6.e2;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;
import yud.g;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc5.a f10010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wvd.b f10011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f10012c;

    public b(hc5.a cryptoAccountInteractor, wvd.b autoStakingConsentRepository, g stakingInteractor) {
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(autoStakingConsentRepository, "autoStakingConsentRepository");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        this.f10010a = cryptoAccountInteractor;
        this.f10011b = autoStakingConsentRepository;
        this.f10012c = stakingInteractor;
    }

    public final n a() {
        return nim.a.v(this.f10010a.a(h.f294642c), new e2(10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r7.f10012c.f(r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof avd.a
            if (r0 == 0) goto L13
            r0 = r9
            avd.a r0 = (avd.a) r0
            int r1 = r0.f10009x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10009x = r1
            goto L18
        L13:
            avd.a r0 = new avd.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10009x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            goto L8d
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            boolean r8 = r0.u
            yhm.o.b(r9)
            goto L80
        L3b:
            boolean r8 = r0.u
            yhm.o.b(r9)
            goto L65
        L41:
            yhm.o.b(r9)
            r0.u = r8
            r0.f10009x = r5
            wvd.b r9 = r7.f10011b
            r9.getClass()
            mt8.b r2 = new mt8.b
            r5 = 0
            r6 = 12
            r2.<init>(r9, r8, r5, r6)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L60
            goto L62
        L60:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L62:
            if (r9 != r1) goto L65
            goto L8c
        L65:
            r0.u = r8
            r0.f10009x = r4
            hc5.a r9 = r7.f10010a
            kc5.b r9 = r9.f150853a
            x4l.c r9 = r9.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r4 = 0
            java.lang.Object r9 = r9.d(r2, r4, r0)
            if (r9 != r1) goto L79
            goto L7a
        L79:
            r9 = r2
        L7a:
            if (r9 != r1) goto L7d
            r2 = r9
        L7d:
            if (r2 != r1) goto L80
            goto L8c
        L80:
            r0.u = r8
            r0.f10009x = r3
            yud.g r8 = r7.f10012c
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L8d
        L8c:
            return r1
        L8d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: avd.b.b(boolean, gim.c):java.lang.Object");
    }
}
