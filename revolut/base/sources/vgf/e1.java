package vgf;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transaction_list.impl.R$string;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import com.revolut.feature.transactions.api.navigation.SimpleTransactionsDestination;
import kotlin.jvm.internal.Intrinsics;
import tof.hb;
import tof.i7;
import tof.t2;
import tof.va;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9e.c f289088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3a.a f289089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionsScreenContract$InputData f289090c;
    public final a d;
    public final g48.r0 e;
    public final ugc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f7d.d f289091g;

    public e1(c9e.c subscriptionNavigationProvider, b3a.a chatTransferNavigationProvider, TransactionsScreenContract$InputData inputData, a helpDestinationProvider, g48.r0 jointAccountInteractor, ugc.a investTransactionsNavigationProvider, f7d.d inboundTransferLocatorApi) {
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(helpDestinationProvider, "helpDestinationProvider");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(investTransactionsNavigationProvider, "investTransactionsNavigationProvider");
        Intrinsics.checkNotNullParameter(inboundTransferLocatorApi, "inboundTransferLocatorApi");
        this.f289088a = subscriptionNavigationProvider;
        this.f289089b = chatTransferNavigationProvider;
        this.f289090c = inputData;
        this.d = helpDestinationProvider;
        this.e = jointAccountInteractor;
        this.f = investTransactionsNavigationProvider;
        this.f289091g = inboundTransferLocatorApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qua.p r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vgf.c1
            if (r0 == 0) goto L13
            r0 = r6
            vgf.c1 r0 = (vgf.c1) r0
            int r1 = r0.f289076w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289076w = r1
            goto L18
        L13:
            vgf.c1 r0 = new vgf.c1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289076w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            c9e.c r6 = r4.f289088a
            efm.d0 r5 = c9e.c.a(r6, r5)
            r0.f289076w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vgf.e1.a(qua.p, gim.c):java.lang.Object");
    }

    public final SimpleTransactionsDestination b(t2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_spare_change_section_spare_change, null, null, 14);
        CompositeClause compositeClause = data.f273054c;
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new hb(data.f273052a), new va(data.f273053b)};
        cVar.getClass();
        return new SimpleTransactionsDestination(textLocalisedClause, compositeClause, i7.c.a(i7VarArr), this.f289090c.f91926b, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r12 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(tof.a3 r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vgf.e1.c(tof.a3, gim.c):java.lang.Object");
    }
}
