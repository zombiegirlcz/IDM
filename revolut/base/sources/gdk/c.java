package gdk;

import bdk.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bdk.c f143189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f143190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f143191c;

    public c(bdk.c repository, j planRewardsRepository, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(planRewardsRepository, "planRewardsRepository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f143189a = repository;
        this.f143190b = planRewardsRepository;
        this.f143191c = configurationInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (fk3.a.a(r5.f143191c, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gdk.b
            if (r0 == 0) goto L13
            r0 = r6
            gdk.b r0 = (gdk.b) r0
            int r1 = r0.f143188w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143188w = r1
            goto L18
        L13:
            gdk.b r0 = new gdk.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143188w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L56
        L36:
            yhm.o.b(r6)
            r0.f143188w = r4
            bdk.c r6 = r5.f143189a
            r6.getClass()
            bdk.b r2 = new bdk.b
            r4 = 0
            r2.<init>(r6, r4, r3)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)
            if (r6 != r1) goto L51
            goto L53
        L51:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L53:
            if (r6 != r1) goto L56
            goto L60
        L56:
            r0.f143188w = r3
            fk3.a r6 = r5.f143191c
            java.lang.Object r6 = fk3.a.a(r6, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gdk.c.a(gim.c):java.lang.Object");
    }
}
