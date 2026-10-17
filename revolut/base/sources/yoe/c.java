package yoe;

import ang.f;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements cne.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f315669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ape.c f315670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f315671c;

    public c(f userInteractor, ape.c stampDutyRepository, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stampDutyRepository, "stampDutyRepository");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f315669a = userInteractor;
        this.f315670b = stampDutyRepository;
        this.f315671c = jointAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof yoe.a
            if (r0 == 0) goto L13
            r0 = r7
            yoe.a r0 = (yoe.a) r0
            int r1 = r0.f315667x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315667x = r1
            goto L18
        L13:
            yoe.a r0 = new yoe.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315667x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount r6 = r0.u
            yhm.o.b(r7)
            goto L4d
        L38:
            yhm.o.b(r7)
            ang.f r7 = r5.f315669a
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r0.u = r6
            r0.f315667x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4d
            goto L7b
        L4d:
            do3.n r7 = (do3.n) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            wi0.a r2 = wi0.b.Companion
            r2.getClass()
            wi0.b r2 = wi0.b.T0
            boolean r7 = te0.w.S(r7, r2)
            if (r7 != 0) goto L62
            dne.b r6 = dne.b.f116290a
            return r6
        L62:
            r7 = 0
            r0.u = r7
            r0.f315667x = r3
            ape.c r2 = r5.f315670b
            r2.getClass()
            ape.a r3 = new ape.a
            r3.<init>(r6, r2, r7)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r3, r0)
            if (r6 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yoe.c.a(com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount, gim.c):java.lang.Object");
    }
}
