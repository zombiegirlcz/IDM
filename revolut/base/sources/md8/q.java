package md8;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends oki.h implements e {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f204515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kd8.x f204516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kd8.e f204517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kbb.c f204518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f204519t;
    public final gte.a u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f204520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f204521x;

    public q(cli.n mapper, d inputData, hj8.a juniorProfileInteractor, kd8.x juniorConsentRequestInteractor, kd8.e juniorConsentInteractor, kbb.c juniorConfigInteractor, a benefitsDialogModelProvider, gte.a featureToggleInteractor, j60.a bottomSheet) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentRequestInteractor, "juniorConsentRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(benefitsDialogModelProvider, "benefitsDialogModelProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.o = inputData;
        this.f204515p = juniorProfileInteractor;
        this.f204516q = juniorConsentRequestInteractor;
        this.f204517r = juniorConsentInteractor;
        this.f204518s = juniorConfigInteractor;
        this.f204519t = benefitsDialogModelProvider;
        this.u = featureToggleInteractor;
        this.v = bottomSheet;
        this.f204520w = new vii.b();
        this.f204521x = mra.d.b(this, new c(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(md8.q r39, gim.c r40) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: md8.q.I2(md8.q, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(md8.q r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof md8.p
            if (r0 == 0) goto L13
            r0 = r6
            md8.p r0 = (md8.p) r0
            int r1 = r0.f204514w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204514w = r1
            goto L18
        L13:
            md8.p r0 = new md8.p
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204514w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L42
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            md8.n r6 = new md8.n
            r2 = 2
            r6.<init>(r5, r4, r2)
            r0.f204514w = r3
            java.lang.Object r6 = r5.p2(r0, r6)
            if (r6 != r1) goto L42
            return r1
        L42:
            com.revolut.feature.junior_core.models.configuration.Links r6 = (com.revolut.feature.junior_core.models.configuration.Links) r6
            com.revolut.kompot.common.ExternalDestination$Browser r0 = new com.revolut.kompot.common.ExternalDestination$Browser
            java.lang.String r6 = r6.f76906a
            r0.<init>(r6, r4)
            r5.C1(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: md8.q.J2(md8.q, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(vkm.q.Q(this.f204520w, new li2.f(continuation, this, 27)), new md0.c(2)), null, null, new m75.i(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f204521x;
    }
}
