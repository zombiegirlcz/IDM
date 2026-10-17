package qt8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements mt8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f249018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt8.a f249019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jvh.a f249020c;
    public final o d;
    public final pil.b e;

    public d(e kycRepository, mt8.a kycFeatureToggleProvider, jvh.a workflowInteractor, o documentScanRepository) {
        Intrinsics.checkNotNullParameter(kycRepository, "kycRepository");
        Intrinsics.checkNotNullParameter(kycFeatureToggleProvider, "kycFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(documentScanRepository, "documentScanRepository");
        this.f249018a = kycRepository;
        this.f249019b = kycFeatureToggleProvider;
        this.f249020c = workflowInteractor;
        this.d = documentScanRepository;
        this.e = new pil.b("BANKING", h0.f322473a);
    }

    public final Object d(gim.c cVar) {
        return q.x(mo3.a.g(e(false), null, new qsk.d(3), 1), cVar);
    }

    public final wkm.d e(boolean z) {
        vkm.d dVarC = ((l) this.f249018a).d.c(Unit.f186387a, z);
        return ((pt8.a) this.f249019b).a() ? q.Q(dVarC, new q7b.j((Continuation) null, this, 21)) : dVarC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(my8.a0 r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof qt8.c
            if (r0 == 0) goto L13
            r0 = r9
            qt8.c r0 = (qt8.c) r0
            int r1 = r0.f249017x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249017x = r1
            goto L18
        L13:
            qt8.c r0 = new qt8.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249017x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r9)
            goto L7e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            my8.a0 r8 = r0.u
            yhm.o.b(r9)
            goto L62
        L39:
            yhm.o.b(r9)
            qt8.o r9 = r7.d
            r9.getClass()
            java.lang.String r2 = "submitKycInput"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            qc0.e1 r2 = new qc0.e1
            r6 = 27
            r2.<init>(r8, r9, r3, r6)
            kotlin.coroutines.g r9 = kotlin.coroutines.g.f186406a
            pfm.h r9 = pd.b.n(r9, r2)
            pfm.r r9 = te0.w.g0(r9)
            r0.u = r8
            r0.f249017x = r5
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto L62
            goto L7d
        L62:
            boolean r8 = r8.a()
            if (r8 == 0) goto L81
            r0.u = r3
            r0.f249017x = r4
            qt8.e r8 = r7.f249018a
            qt8.l r8 = (qt8.l) r8
            x4l.c r8 = r8.d
            kotlin.Unit r9 = kotlin.Unit.f186387a
            java.lang.Object r8 = r8.d(r9, r5, r0)
            if (r8 != r1) goto L7b
            r9 = r8
        L7b:
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L81:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qt8.d.f(my8.a0, gim.c):java.lang.Object");
    }
}
