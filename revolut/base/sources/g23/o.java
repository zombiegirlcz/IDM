package g23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends yji.n implements j23.m {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OrderNewCardTabControllerContract$InputData f139820l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l0 f139821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k23.f f139822n;
    public final k23.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f73.b f139823p;

    public o(OrderNewCardTabControllerContract$InputData inputData, l0 itemBuilder, k23.f sharedDataSource, k23.b cardDesignsProvider, f73.b revolutCardNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemBuilder, "itemBuilder");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        Intrinsics.checkNotNullParameter(cardDesignsProvider, "cardDesignsProvider");
        Intrinsics.checkNotNullParameter(revolutCardNavigationCommandFactory, "revolutCardNavigationCommandFactory");
        this.f139820l = inputData;
        this.f139821m = itemBuilder;
        this.f139822n = sharedDataSource;
        this.o = cardDesignsProvider;
        this.f139823p = revolutCardNavigationCommandFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j23.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof g23.n
            if (r5 == 0) goto L13
            r5 = r7
            g23.n r5 = (g23.n) r5
            int r0 = r5.f139818w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f139818w = r0
            goto L1a
        L13:
            g23.n r5 = new g23.n
            gim.c r7 = (gim.c) r7
            r5.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f139818w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r7)
            goto L62
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = "NEW_CRYPTO_PHYSICAL_CARD_LIST_ID"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData r1 = r4.f139820l
            f73.b r3 = r4.f139823p
            if (r7 == 0) goto L49
            xfa.b r6 = xfa.b.CARDS_TAB_FULL_SCREEN
            com.revolut.retail.core.navigation.NaviCommand r7 = r1.d
            ufm.b r6 = r3.d(r6, r7)
            goto L59
        L49:
            java.lang.String r7 = "NEW_CRYPTO_VIRTUAL_CARD_LIST_ID"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L71
            xfa.b r6 = xfa.b.CARDS_TAB_FULL_SCREEN
            com.revolut.retail.core.navigation.NaviCommand r7 = r1.d
            ufm.b r6 = r3.e(r6, r7)
        L59:
            r5.f139818w = r2
            java.lang.Object r7 = nim.a.b(r6, r5)
            if (r7 != r0) goto L62
            return r0
        L62:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r7)
            r4.A2(r5)
            j23.f r5 = j23.f.f170665a
            return r5
        L71:
            j23.g r5 = j23.g.f170666a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.o.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
