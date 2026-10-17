package ub9;

import ang.f;
import fwj.p;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o0j.o;
import zhm.f0;
import zlg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements cpg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f278788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f278789b;

    public b(f userInteractor, p userOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        this.f278788a = userInteractor;
        this.f278789b = userOnboardingInteractor;
    }

    @Override // cpg.a
    public final Object a(Continuation continuation) {
        return "";
    }

    @Override // cpg.a
    public final Object b(Continuation continuation) {
        return new n(1, f0.f322471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cpg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ub9.a
            if (r0 == 0) goto L13
            r0 = r6
            ub9.a r0 = (ub9.a) r0
            int r1 = r0.f278787w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278787w = r1
            goto L18
        L13:
            ub9.a r0 = new ub9.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278787w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ang.f r6 = r4.f278788a
            pfm.z r5 = r6.m(r5)
            r0.f278787w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ub9.b.c(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // cpg.a
    public final Object d(String str, i iVar) throws Throwable {
        Object objH = this.f278789b.h(new o(str), iVar);
        return objH == fim.a.COROUTINE_SUSPENDED ? objH : Unit.f186387a;
    }
}
