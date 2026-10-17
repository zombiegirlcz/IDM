package gdk;

import bdk.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bdk.f f143194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f143195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f143196c;
    public final sfk.a d;

    public g(bdk.f repository, j planRewardsRepository, fk3.a configurationInteractor, sfk.a pricingPlanChangeObservable) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(planRewardsRepository, "planRewardsRepository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        this.f143194a = repository;
        this.f143195b = planRewardsRepository;
        this.f143196c = configurationInteractor;
        this.d = pricingPlanChangeObservable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (fk3.a.a(r7.f143196c, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof gdk.e
            if (r0 == 0) goto L13
            r0 = r8
            gdk.e r0 = (gdk.e) r0
            int r1 = r0.f143192w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143192w = r1
            goto L18
        L13:
            gdk.e r0 = new gdk.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143192w
            bdk.f r3 = r7.f143194a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r8)
            goto L79
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            yhm.o.b(r8)
            goto L6e
        L3b:
            yhm.o.b(r8)
            goto L5d
        L3f:
            yhm.o.b(r8)
            r0.f143192w = r6
            r3.getClass()
            bdk.e r8 = new bdk.e
            r2 = 0
            r8.<init>(r3, r2, r6)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r2, r8, r0)
            if (r8 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L5a:
            if (r8 != r1) goto L5d
            goto L78
        L5d:
            r0.f143192w = r5
            x4l.c r8 = r3.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r3 = 0
            java.lang.Object r8 = r8.d(r2, r3, r0)
            if (r8 != r1) goto L6b
            r2 = r8
        L6b:
            if (r2 != r1) goto L6e
            goto L78
        L6e:
            r0.f143192w = r4
            fk3.a r8 = r7.f143196c
            java.lang.Object r8 = fk3.a.a(r8, r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gdk.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (fk3.a.a(r7.f143196c, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof gdk.f
            if (r0 == 0) goto L13
            r0 = r8
            gdk.f r0 = (gdk.f) r0
            int r1 = r0.f143193w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143193w = r1
            goto L18
        L13:
            gdk.f r0 = new gdk.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143193w
            bdk.f r3 = r7.f143194a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r8)
            goto L79
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            yhm.o.b(r8)
            goto L6e
        L3b:
            yhm.o.b(r8)
            goto L5d
        L3f:
            yhm.o.b(r8)
            r0.f143193w = r6
            r3.getClass()
            bdk.e r8 = new bdk.e
            r2 = 0
            r8.<init>(r3, r2, r5)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r2, r8, r0)
            if (r8 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L5a:
            if (r8 != r1) goto L5d
            goto L78
        L5d:
            r0.f143193w = r5
            x4l.c r8 = r3.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r3 = 0
            java.lang.Object r8 = r8.d(r2, r3, r0)
            if (r8 != r1) goto L6b
            r2 = r8
        L6b:
            if (r2 != r1) goto L6e
            goto L78
        L6e:
            r0.f143193w = r4
            fk3.a r8 = r7.f143196c
            java.lang.Object r8 = fk3.a.a(r8, r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gdk.g.b(gim.c):java.lang.Object");
    }
}
