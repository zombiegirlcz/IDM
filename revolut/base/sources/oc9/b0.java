package oc9;

import com.revolut.data.model.Data;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsConfiguration;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends oki.h implements x {
    public final pre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mre.c f224133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o99.a f224134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final QesTermsScreenContract$InputData f224135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f224136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f224137t;

    public b0(pre.c termsInteractor, mre.c termsNavigationFactory, o99.a eSignatureInteractor, QesTermsScreenContract$InputData inputData, m qesTermsHelper, e0 stateMapper) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(eSignatureInteractor, "eSignatureInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qesTermsHelper, "qesTermsHelper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = termsInteractor;
        this.f224133p = termsNavigationFactory;
        this.f224134q = eSignatureInteractor;
        this.f224135r = inputData;
        this.f224136s = qesTermsHelper;
        Data data = new Data(null, null, true, 3, null);
        QesTermsConfiguration qesTermsConfiguration = inputData.f78549a;
        QesTermsConfiguration qesTermsConfiguration2 = inputData.f78549a;
        this.f224137t = mra.d.b(this, new v(data, qesTermsConfiguration.f78158h.isEmpty() ? zi0.c.P(f0.f322471a, false, null, 3) : new Data(null, null, true, 3, null), qesTermsConfiguration2.i.isEmpty() ? zi0.c.P(f0.f322471a, false, null, 3) : new Data(null, null, true, 3, null), qesTermsConfiguration2.f78159j, new Data(null, null, true, 3, null), h0.f322473a), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(oc9.b0 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof oc9.z
            if (r0 == 0) goto L13
            r0 = r7
            oc9.z r0 = (oc9.z) r0
            int r1 = r0.f224168y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224168y = r1
            goto L18
        L13:
            oc9.z r0 = new oc9.z
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f224166w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224168y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r2 = r0.v
            java.util.Iterator r4 = r0.u
            yhm.o.b(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            cli.y r7 = r6.f224137t
            java.lang.Object r7 = r7.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            oc9.v r7 = (oc9.v) r7
            com.revolut.data.model.Data r7 = r7.f224160c
            java.lang.Object r7 = zi0.c.I(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = 0
            r4 = r7
        L50:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L71
            java.lang.Object r7 = r4.next()
            com.revolut.feature.terms.api.model.Terms r7 = (com.revolut.feature.terms.api.model.Terms) r7
            pre.c r5 = r6.o
            java.lang.String r7 = r7.f90355a
            pfm.r r7 = pre.c.b(r5, r7)
            r0.u = r4
            r0.v = r2
            r0.f224168y = r3
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L50
            return r1
        L71:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oc9.b0.I2(oc9.b0, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J2() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc9.b0.J2():void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f224137t;
    }
}
