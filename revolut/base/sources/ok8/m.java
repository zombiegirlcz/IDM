package ok8;

import com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage;
import com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlowContract$State;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends oki.h implements b {

    @NotNull
    public static final e Companion = new e();
    public final kk8.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kk8.e f225945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.i f225946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qki.d f225947r;

    public m(kk8.k interactor, kk8.e confettiInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(confettiInteractor, "confettiInteractor");
        this.o = interactor;
        this.f225945p = confettiInteractor;
        this.f225946q = d8l.d.a(this, new oa4.c(this, 22));
        this.f225947r = hx7.e.b(this, new JuniorProgressionFlowContract$State(JuniorProgressionPromptStage.Initial.INSTANCE, 0, r0.g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ok8.g
            if (r0 == 0) goto L13
            r0 = r7
            ok8.g r0 = (ok8.g) r0
            int r1 = r0.f225937w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225937w = r1
            goto L18
        L13:
            ok8.g r0 = new ok8.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f225937w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            r0.f225937w = r3
            kk8.k r7 = r6.o
            gk8.d r7 = r7.f184515a
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            gk8.c r3 = new gk8.c
            r4 = 0
            r5 = 0
            r3.<init>(r7, r4, r5)
            java.lang.Object r7 = skm.e0.J(r2, r3, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            lk8.f r7 = (lk8.f) r7
            boolean r0 = r7 instanceof lk8.d
            if (r0 == 0) goto L55
            lk8.d r7 = (lk8.d) r7
            lk8.c r7 = r7.f196304a
            return r7
        L55:
            boolean r7 = r7 instanceof lk8.e
            if (r7 == 0) goto L61
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Progression prompt shouldn't be shown when progression is unavailable"
            r7.<init>(r0)
            throw r7
        L61:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ok8.m.I2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (K2(r7, r0) == r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (K2(r7, r0) == r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        if (K2(r7, r0) != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        if (pu7.a.B(r6.k, "PROGRESSION_PLAN_POLLING_TASK_ID", new ok8.l(r6, r7, null), r0) == r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b5, code lost:
    
        if (K2(r7, r0) != r1) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce A[PHI: r8
      0x00ce: PHI (r8v19 java.lang.Object) = (r8v18 java.lang.Object), (r8v1 java.lang.Object) binds: [B:50:0x00ca, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage r7, gim.c r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ok8.m.J2(com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
    
        if (J2(r9, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ok8.k
            if (r0 == 0) goto L13
            r0 = r10
            ok8.k r0 = (ok8.k) r0
            int r1 = r0.f225942x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225942x = r1
            goto L18
        L13:
            ok8.k r0 = new ok8.k
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f225942x
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L38
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            yhm.o.b(r10)
            goto Lb3
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage r9 = r0.u
            yhm.o.b(r10)
            goto L9e
        L3e:
            yhm.o.b(r10)
            boolean r10 = r9 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.Completed
            kk8.k r2 = r8.o
            if (r10 == 0) goto L67
            r0.u = r9
            r0.f225942x = r6
            gk8.d r10 = r2.f184515a
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            gk8.b r5 = new gk8.b
            r5.<init>(r10, r7, r3)
            java.lang.Object r10 = skm.e0.J(r2, r5, r0)
            if (r10 != r1) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L5f:
            if (r10 != r1) goto L62
            goto L64
        L62:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L64:
            if (r10 != r1) goto L9e
            goto Lb2
        L67:
            boolean r10 = r9 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.Initial
            if (r10 != 0) goto L7e
            boolean r10 = r9 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.FeaturesReloading
            if (r10 != 0) goto L7e
            boolean r10 = r9 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.PlanCheck
            if (r10 != 0) goto L7e
            boolean r10 = r9 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.PreCompletion
            if (r10 == 0) goto L78
            goto L7e
        L78:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L7e:
            r0.u = r9
            r0.f225942x = r5
            gk8.d r10 = r2.f184515a
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            gii.b r5 = new gii.b
            r5.<init>(r10, r9, r7, r4)
            java.lang.Object r10 = skm.e0.J(r2, r5, r0)
            if (r10 != r1) goto L94
            goto L96
        L94:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L96:
            if (r10 != r1) goto L99
            goto L9b
        L99:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L9b:
            if (r10 != r1) goto L9e
            goto Lb2
        L9e:
            ok8.d r10 = new ok8.d
            r10.<init>(r9, r3)
            qki.d r2 = r8.f225947r
            r8.H2(r2, r10)
            r0.u = r7
            r0.f225942x = r4
            java.lang.Object r9 = r8.J2(r9, r0)
            if (r9 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ok8.m.K2(com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new i(this, null, 0), new c(this, 0));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f225947r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f225946q;
    }
}
