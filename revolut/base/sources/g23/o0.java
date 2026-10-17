package g23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 extends yji.n implements j23.m {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OrderNewCardTabControllerContract$InputData f139824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f73.b f139825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l0 f139826n;

    public o0(OrderNewCardTabControllerContract$InputData inputData, f73.b revolutCardNavigationCommandFactory, l0 itemBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardNavigationCommandFactory, "revolutCardNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(itemBuilder, "itemBuilder");
        this.f139824l = inputData;
        this.f139825m = revolutCardNavigationCommandFactory;
        this.f139826n = itemBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j23.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof g23.n0
            if (r4 == 0) goto L13
            r4 = r6
            g23.n0 r4 = (g23.n0) r4
            int r0 = r4.f139819w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f139819w = r0
            goto L1a
        L13:
            g23.n0 r4 = new g23.n0
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f139819w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "NEW_PAY_LATER_LIST_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 != 0) goto L3f
            j23.g r4 = j23.g.f170666a
            return r4
        L3f:
            xfa.b r5 = xfa.b.CARDS_TAB_FULL_SCREEN
            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData r6 = r3.f139824l
            com.revolut.retail.core.navigation.NaviCommand r6 = r6.d
            f73.b r1 = r3.f139825m
            ufm.b r5 = r1.g(r5, r6)
            r4.f139819w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L54
            return r0
        L54:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r4 = zh9.u0.b(r6)
            r3.A2(r4)
            j23.f r4 = j23.f.f170665a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.o0.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
