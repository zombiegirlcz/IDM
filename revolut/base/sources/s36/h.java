package s36;

import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    private static final a Companion = new a();
    public static final BalancesInteractor$InputData e = new BalancesInteractor$InputData(k1j.d.RETAIL, null, t36.d.f267662a, h0.f322473a, null, null, null, null, 240);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rul.e f259431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2j.j f259432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv5.c f259433c;
    public final rea.m d;

    public h(rul.e assetsInteractor, m2j.j balancesInteractor, xv5.c baseCurrencyInteractor, rea.m pocketDetailsInteractor) {
        Intrinsics.checkNotNullParameter(assetsInteractor, "assetsInteractor");
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        this.f259431a = assetsInteractor;
        this.f259432b = balancesInteractor;
        this.f259433c = baseCurrencyInteractor;
        this.d = pocketDetailsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof s36.d
            if (r0 == 0) goto L13
            r0 = r8
            s36.d r0 = (s36.d) r0
            int r1 = r0.f259427x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259427x = r1
            goto L18
        L13:
            s36.d r0 = new s36.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259427x
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r8)
            goto L6e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            xi0.b r2 = r0.u
            yhm.o.b(r8)
            goto L5f
        L3c:
            yhm.o.b(r8)
            goto L4c
        L40:
            yhm.o.b(r8)
            r0.f259427x = r6
            java.lang.Object r8 = r7.e(r0)
            if (r8 != r1) goto L4c
            goto L6d
        L4c:
            r2 = r8
            xi0.b r2 = (xi0.b) r2
            r0.u = r2
            r0.f259427x = r5
            s36.c r8 = new s36.c
            r8.<init>(r7, r2, r3)
            java.lang.Object r8 = skm.e0.o(r8, r0)
            if (r8 != r1) goto L5f
            goto L6d
        L5f:
            com.revolut.feature.transfer.core.models.PocketSource r8 = (com.revolut.feature.transfer.core.models.PocketSource) r8
            if (r8 != 0) goto L78
            r0.u = r3
            r0.f259427x = r4
            java.io.Serializable r8 = r7.d(r2, r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            io3.d r8 = (io3.d) r8
            com.revolut.feature.transfer.core.models.PocketSource r0 = new com.revolut.feature.transfer.core.models.PocketSource
            com.revolut.core.model.account.AccountId$Personal r1 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r0.<init>(r8, r1, r3)
            return r0
        L78:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s36.h.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(t36.c r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof s36.e
            if (r0 == 0) goto L13
            r0 = r9
            s36.e r0 = (s36.e) r0
            int r1 = r0.f259428w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259428w = r1
            goto L18
        L13:
            s36.e r0 = new s36.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259428w
            com.revolut.core.model.account.AccountId$Personal r3 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            yhm.o.b(r9)
            goto L5f
        L39:
            yhm.o.b(r9)
            t36.a r8 = r8.f267660b
            if (r8 == 0) goto L6c
            dj0.d r9 = r8.f267657b
            dj0.d r2 = dj0.d.e
            boolean r9 = r9.f(r2)
            if (r9 == 0) goto L4b
            goto L4c
        L4b:
            r8 = r6
        L4c:
            if (r8 == 0) goto L6c
            rea.m r9 = r7.d
            java.lang.String r8 = r8.f267656a
            efm.d0 r8 = r9.h(r3, r8)
            r0.f259428w = r5
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L5f
            goto L74
        L5f:
            java.lang.String r8 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            io3.d r9 = (io3.d) r9
            com.revolut.feature.transfer.core.models.PocketSource r8 = new com.revolut.feature.transfer.core.models.PocketSource
            r8.<init>(r9, r3, r6)
            return r8
        L6c:
            r0.f259428w = r4
            java.lang.Object r8 = r7.b(r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s36.h.c(t36.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(xi0.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s36.f
            if (r0 == 0) goto L13
            r0 = r7
            s36.f r0 = (s36.f) r0
            int r1 = r0.f259429w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259429w = r1
            goto L18
        L13:
            s36.f r0 = new s36.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259429w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            io3.l r7 = io3.l.CURRENT
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            rea.m r4 = r5.d
            ufm.i r6 = r4.g(r2, r7, r6)
            r0.f259429w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            eda.e r7 = (eda.e) r7
            io3.d r6 = r7.f124961a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s36.h.d(xi0.b, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof s36.g
            if (r0 == 0) goto L13
            r0 = r5
            s36.g r0 = (s36.g) r0
            int r1 = r0.f259430w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259430w = r1
            goto L18
        L13:
            s36.g r0 = new s36.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259430w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            xv5.c r5 = r4.f259433c
            efm.r r5 = xv5.c.b(r5)
            vkm.d r5 = rd0.e.b(r5)
            r0.f259430w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s36.h.e(gim.c):java.lang.Object");
    }
}
