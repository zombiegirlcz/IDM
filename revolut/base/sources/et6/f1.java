package et6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f129224a;

    public f1(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f129224a = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dj0.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et6.e1
            if (r0 == 0) goto L13
            r0 = r6
            et6.e1 r0 = (et6.e1) r0
            int r1 = r0.f129218x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129218x = r1
            goto L18
        L13:
            et6.e1 r0 = new et6.e1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129218x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dj0.d r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.f129224a
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f129218x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            do3.n r6 = (do3.n) r6
            com.revolut.feature.address.models.Address r6 = r6.k
            r0 = 0
            if (r6 == 0) goto L58
            java.lang.String r6 = r6.getCountry()
            if (r6 == 0) goto L58
            wi0.b r6 = com.bumptech.glide.d.c(r6)
            goto L59
        L58:
            r6 = r0
        L59:
            xi0.b r1 = r5.f115083b
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r2 = xi0.b.f306272g
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L81
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.f297776t
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r6 == 0) goto L81
            r0 = 4611487094431846949(0x3fff4b1465e89225, double:1.95583)
            xi0.b r6 = xi0.b.f306278p
            dj0.d r5 = pyd.c.K(r5, r0, r6)
            return r5
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.f1.a(dj0.d, gim.c):java.lang.Object");
    }
}
