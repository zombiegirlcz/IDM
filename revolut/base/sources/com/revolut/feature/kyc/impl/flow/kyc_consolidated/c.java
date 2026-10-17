package com.revolut.feature.kyc.impl.flow.kyc_consolidated;

import ang.f;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import ku8.p;
import mt8.d;
import my8.r;
import oki.h;
import q89.e;
import tp8.l;
import vkm.j2;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements tv8.b {
    public final KycConsolidatedFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pv8.b f77745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f77746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ot8.a f77747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f77748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fk3.a f77749t;
    public final e u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final qd0.b f77750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qki.d f77751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f77752y;

    public c(KycConsolidatedFlowContract$InputData inputData, pv8.b contentProvider, f userInteractor, ot8.a kycDocsInteractor, d kycInteractor, fk3.a configurationInteractor, e onboardingInteractor, gte.a featureToggleInteractor, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(kycDocsInteractor, "kycDocsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.o = inputData;
        this.f77745p = contentProvider;
        this.f77746q = userInteractor;
        this.f77747r = kycDocsInteractor;
        this.f77748s = kycInteractor;
        this.f77749t = configurationInteractor;
        this.u = onboardingInteractor;
        this.v = featureToggleInteractor;
        this.f77750w = languageProvider;
        this.f77751x = hx7.e.b(this, new KycConsolidatedFlowContract$State(0));
        this.f77752y = d8l.d.a(this, new l(this, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.kyc.impl.flow.kyc_consolidated.c r4, wi0.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof tv8.d
            if (r0 == 0) goto L13
            r0 = r6
            tv8.d r0 = (tv8.d) r0
            int r1 = r0.f274736x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274736x = r1
            goto L18
        L13:
            tv8.d r0 = new tv8.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274736x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wi0.b r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            fk3.a r6 = r4.f77749t
            ik3.c r6 = (ik3.c) r6
            efm.d0 r6 = r6.f()
            r0.u = r5
            r0.f274736x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.List r6 = (java.util.List) r6
            com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$InputData r4 = r4.o
            my8.r r4 = r4.f77722c
            kotlin.jvm.internal.Intrinsics.h(r6)
            boolean r4 = zi0.c.A(r4, r6, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.kyc.impl.flow.kyc_consolidated.c.I2(com.revolut.feature.kyc.impl.flow.kyc_consolidated.c, wi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable J2(com.revolut.feature.kyc.impl.flow.kyc_consolidated.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof tv8.e
            if (r0 == 0) goto L13
            r0 = r5
            tv8.e r0 = (tv8.e) r0
            int r1 = r0.f274737w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274737w = r1
            goto L18
        L13:
            tv8.e r0 = new tv8.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274737w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ang.f r4 = r4.f77746q
            r5 = 0
            efm.d0 r4 = r4.f(r5)
            r0.f274737w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            do3.n r5 = (do3.n) r5
            wi0.b r4 = do3.q.y(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.kyc.impl.flow.kyc_consolidated.c.J2(com.revolut.feature.kyc.impl.flow.kyc_consolidated.c, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable K2(com.revolut.feature.kyc.impl.flow.kyc_consolidated.c r4, wi0.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof tv8.f
            if (r0 == 0) goto L13
            r0 = r6
            tv8.f r0 = (tv8.f) r0
            int r1 = r0.f274738w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274738w = r1
            goto L18
        L13:
            tv8.f r0 = new tv8.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274738w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L6b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$InputData r6 = r4.o
            my8.r r6 = r6.f77722c
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            int[] r2 = cu8.z0.f108914a
            int r6 = r6.ordinal()
            r6 = r2[r6]
            switch(r6) {
                case 1: goto L76;
                case 2: goto L76;
                case 3: goto L76;
                case 4: goto L76;
                case 5: goto L76;
                case 6: goto L76;
                case 7: goto L76;
                case 8: goto L4c;
                case 9: goto L4c;
                case 10: goto L4c;
                case 11: goto L4c;
                case 12: goto L4c;
                default: goto L46;
            }
        L46:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L4c:
            mt8.d r4 = r4.f77748s
            r0.f274738w = r3
            qt8.d r4 = (qt8.d) r4
            qt8.e r4 = r4.f249018a
            qt8.l r4 = (qt8.l) r4
            r4.getClass()
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            qt8.i r6 = new qt8.i
            r2 = 0
            r3 = 0
            r6.<init>(r4, r2, r3)
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            zt8.a r6 = (zt8.a) r6
            od0.i r4 = r6.f325089a
            java.lang.Object r4 = r4.g()
            wi0.b r4 = (wi0.b) r4
            return r4
        L76:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.kyc.impl.flow.kyc_consolidated.c.K2(com.revolut.feature.kyc.impl.flow.kyc_consolidated.c, wi0.b, gim.c):java.io.Serializable");
    }

    public final ChooseDocumentScreenContract$InputData L2(KycConsolidatedFlowContract$Step.RemoteDocs remoteDocs) {
        p pVar = p.REMOTE_DOCS;
        KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData = this.o;
        r rVar = kycConsolidatedFlowContract$InputData.f77722c;
        qki.d dVar = this.f77751x;
        wi0.b bVar = ((KycConsolidatedFlowContract$State) ((j2) dVar.f22677a).getValue()).f77730a;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        wi0.b bVar2 = remoteDocs.f77733a;
        String str = kycConsolidatedFlowContract$InputData.f77728n;
        wi0.b bVar3 = kycConsolidatedFlowContract$InputData.f77723g;
        SelectedKycDocs.INSTANCE.getClass();
        return new ChooseDocumentScreenContract$InputData(pVar, rVar, bVar, bVar2, str, bVar3, SelectedKycDocs.d, ((KycConsolidatedFlowContract$State) ((j2) dVar.f22677a).getValue()).d, kycConsolidatedFlowContract$InputData.k, kycConsolidatedFlowContract$InputData.o, kycConsolidatedFlowContract$InputData.f77724h, remoteDocs.f77734b);
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new yi5.b(26));
    }

    public final void M2() {
        KycConsolidatedFlowContract$State kycConsolidatedFlowContract$State = (KycConsolidatedFlowContract$State) ((j2) this.f77751x.f22677a).getValue();
        wi0.b bVar = kycConsolidatedFlowContract$State.f77731b;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        wi0.b bVar2 = kycConsolidatedFlowContract$State.f77730a;
        if (bVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        h.u2(this, this.f77752y, new KycConsolidatedFlowContract$Step.SubmitCitizenship(bVar, bVar2, true), null, 6);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f77751x;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77752y;
    }
}
