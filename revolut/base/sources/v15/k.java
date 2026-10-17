package v15;

import al4.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f285238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f285239b;

    public k(n creditCardInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f285238a = creditCardInteractor;
        this.f285239b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v15.i
            if (r0 == 0) goto L13
            r0 = r7
            v15.i r0 = (v15.i) r0
            int r1 = r0.f285237w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f285237w = r1
            goto L18
        L13:
            v15.i r0 = new v15.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f285237w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L66
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            w4l.j r7 = w4l.j.f294644c
            al4.n r2 = r5.f285238a
            om4.x2 r2 = (om4.x2) r2
            akg.n r6 = r2.h(r6, r7)
            ang.f r7 = r5.f285239b
            r2 = 0
            efm.r r7 = r7.k(r2)
            v15.j r2 = v15.j.f
            efm.r r7 = nim.a.w(r7, r2)
            vkm.d r7 = rd0.e.b(r7)
            t38.e r6 = zh9.u0.m(r6, r7)
            uyh.s r7 = new uyh.s
            r2 = 21
            r7.<init>(r2)
            r2 = 0
            jhi.b r6 = mo3.a.g(r6, r2, r7, r3)
            r0.f285237w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r6 = r7.f186385a
            com.revolut.feature.credit.card.models.CreditCard r6 = (com.revolut.feature.credit.card.models.CreditCard) r6
            java.lang.Object r7 = r7.f186386b
            wi0.b r7 = (wi0.b) r7
            xw4.a r0 = r6.i
            int r1 = r6.f69799m
            dj0.d r2 = r6.f69795g
            java.lang.String r6 = r6.f69793b
            int[] r4 = v15.h.f285236a
            int r0 = r0.ordinal()
            r0 = r4[r0]
            if (r0 != r3) goto Lab
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.O
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r0 == 0) goto L91
            r0 = 6
            goto L93
        L91:
            r0 = 8
        L93:
            if (r1 >= r0) goto L9b
            v15.d r0 = new v15.d
            r0.<init>(r2, r6, r7)
            return r0
        L9b:
            r0 = 30
            if (r1 >= r0) goto La5
            v15.f r0 = new v15.f
            r0.<init>(r2, r6, r7)
            return r0
        La5:
            v15.c r0 = new v15.c
            r0.<init>(r6, r2, r1, r7)
            return r0
        Lab:
            v15.e r6 = v15.e.f285232a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v15.k.a(java.lang.String, gim.c):java.lang.Object");
    }
}
