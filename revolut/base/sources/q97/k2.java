package q97;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class k2 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f243724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f243725c;
    public final t97.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(t97.c productCellProvider, wsg.b walletInteractor, kbb.c accountDetailsInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        this.f243724b = walletInteractor;
        this.f243725c = accountDetailsInteractor;
        this.d = t97.d.TOP_UP_REGULAR_BANK_TRANSFER;
    }

    @Override // r97.b
    public final Flow d() {
        return new vkm.v1(new prl.k(this, null, 26));
    }

    @Override // r97.b
    public final p97.b f() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof q97.j2
            if (r0 == 0) goto L13
            r0 = r15
            q97.j2 r0 = (q97.j2) r0
            int r1 = r0.f243716w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243716w = r1
            goto L1a
        L13:
            q97.j2 r0 = new q97.j2
            gim.c r15 = (gim.c) r15
            r0.<init>(r14, r15)
        L1a:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243716w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r15)
            goto L45
        L29:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L31:
            yhm.o.b(r15)
            wsg.b r15 = r14.f243724b
            w4l.h r2 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r15 = r15.e(r2)
            r0.f243716w = r3
            java.io.Serializable r15 = yh5.b.o(r15, r0)
            if (r15 != r1) goto L45
            return r1
        L45:
            r1 = r15
            io3.d r1 = (io3.d) r1
            o97.d r15 = new o97.d
            com.revolut.feature.pockets.api.navigation.PocketDetailsDestination r13 = new com.revolut.feature.pockets.api.navigation.PocketDetailsDestination
            com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData r0 = new com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData
            r11 = 0
            r12 = 4080(0xff0, float:5.717E-42)
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.<init>(r0)
            r15.<init>(r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.k2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
