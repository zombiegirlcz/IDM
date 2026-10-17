package akf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f5833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n63.j f5834n;

    public f1(klf.h0 commonDataSource, klf.m1 juniorDataSource, n63.j revolutCardsNavigationFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(revolutCardsNavigationFactory, "revolutCardsNavigationFactory");
        this.f5832l = commonDataSource;
        this.f5833m = juniorDataSource;
        this.f5834n = revolutCardsNavigationFactory;
    }

    public final cmf.f Z2() {
        return new cmf.f(new t38.e(this.f5832l.h(new aik.d(17)), 24, new a35.d(this.f5833m.a(), 15), new c1(3, 4, f1.class, this, "buildReplaceCardAction", "buildReplaceCardAction(ZZ)Ljava/util/List;")), zhm.u.c(this), "ReplaceCard");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof akf.d1
            if (r4 == 0) goto L13
            r4 = r6
            akf.d1 r4 = (akf.d1) r4
            int r0 = r4.f5826w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f5826w = r0
            goto L1a
        L13:
            akf.d1 r4 = new akf.d1
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f5826w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            akf.u1 r6 = akf.v1.Companion
            akf.t1 r1 = akf.t1.REPLACE_CARD
            boolean r5 = a10.b.B(r6, r1, r5)
            if (r5 == 0) goto L4d
            akf.e1 r5 = new akf.e1
            r6 = 0
            r5.<init>(r3, r6)
            r4.f5826w = r2
            java.lang.Object r4 = r3.Y2(r4, r5)
            if (r4 != r0) goto L4e
            return r0
        L4d:
            r2 = 0
        L4e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.f1.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
