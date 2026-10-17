package f2k;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements d2k.k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3k.d f131844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3j.b f131845b;

    public e(g3k.d remittanceInteractor, d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(remittanceInteractor, "remittanceInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.f131844a = remittanceInteractor;
        this.f131845b = beneficiaryInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(wi0.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof f2k.c
            if (r0 == 0) goto L13
            r0 = r8
            f2k.c r0 = (f2k.c) r0
            int r1 = r0.f131843x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131843x = r1
            goto L18
        L13:
            f2k.c r0 = new f2k.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f131843x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            wi0.b r7 = r0.u
            yhm.o.b(r8)
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            g3k.d r8 = r6.f131844a
            efm.r r8 = g3k.d.c(r8)
            ewh.y r2 = new ewh.y
            r5 = 24
            r2.<init>(r5)
            efm.r r8 = m70.a.g(r8, r3, r2, r4)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f131843x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L65:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r8.next()
            r1 = r0
            z1k.m r1 = (z1k.m) r1
            wi0.b r1 = r1.f318876a
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L65
            r3 = r0
        L7b:
            z1k.m r3 = (z1k.m) r3
            if (r3 == 0) goto L82
            xi0.b r7 = r3.d
            return r7
        L82:
            xi0.a r7 = xi0.b.Companion
            r7.getClass()
            xi0.b r7 = xi0.b.f306271c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f2k.e.a(wi0.b, gim.c):java.io.Serializable");
    }

    @Override // d2k.k
    public final Flow h() {
        return rd0.e.b(nim.a.w(kli.a.h(nim.a.w(g3k.d.c(this.f131844a), new f0d.k(19)), nim.a.w(w2j.a.b(this.f131845b), new f0d.k(18))), new f0d.k(this, 17)));
    }
}
