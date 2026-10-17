package s8h;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Destination;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$DisplayOptions;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements i0h.c {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2f.a f261021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.f f261022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sri.m f261023c;
    public final Lazy d;

    public m(y2f.a tradingTransactionsInteractor, oc.f transactionsDependenciesProvider, sri.m navigator) {
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsDependenciesProvider, "transactionsDependenciesProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f261021a = tradingTransactionsInteractor;
        this.f261022b = transactionsDependenciesProvider;
        this.f261023c = navigator;
        this.d = yhm.j.b(new s8f.h(2));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        List listK = zhm.v.k(Boolean.valueOf(Intrinsics.f(deeplink.e(1), "invest")), Boolean.valueOf(Intrinsics.f(deeplink.e(2), "transactions")));
        if (!(listK instanceof Collection) || !listK.isEmpty()) {
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                if (!((Boolean) it8.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final efm.d0 b(jf0.c cVar) {
        String strE = cVar.e(3);
        if (strE.length() > 0) {
            return c(strE);
        }
        InvestTransactionsFilter.INSTANCE.getClass();
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImpl = InvestTransactionsFilter.Companion.f105346b;
        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
        return efm.d0.m(new InvestTransactionsListContract$Destination(new InvestTransactionsListContract$InputData(investTransactionsFilterImpl, new InvestTransactionsListContract$DisplayOptions(new InvestTransactionsListContract$Disclaimers(true, true, true, true)))));
    }

    public final pfm.z c(String compoundId) {
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        sfm.b bVar = new sfm.b(new ufm.c(new j(compoundId, 0), 2), new s65.o(new i(this, 1), 15), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        ufm.p pVarT = m70.a.h(pd.b.r(bVar, new i(this, 2)), new ri4.o(this, 28), null, new s6d.r(23), 2).firstOrError().t(10000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        return ue0.e.F(pVarT, new BridgeDestination((NaviCommand) this.d.getValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s8h.l
            if (r0 == 0) goto L13
            r0 = r6
            s8h.l r0 = (s8h.l) r0
            int r1 = r0.f261019w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261019w = r1
            goto L1a
        L13:
            s8h.l r0 = new s8h.l
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261019w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            efm.d0 r5 = r4.b(r5)
            r0.f261019w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.kompot.common.ParcelableDestination r6 = (com.revolut.kompot.common.ParcelableDestination) r6
            q06.h r5 = new q06.h
            kotlin.jvm.internal.Intrinsics.h(r6)
            boolean r0 = r6 instanceof com.revolut.kompot.bridge.navigation.BridgeDestination
            r1 = 0
            if (r0 == 0) goto L4e
            goto L56
        L4e:
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f160141b
            r0.<init>(r2, r1)
            r1 = r0
        L56:
            r5.<init>(r6, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s8h.m.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(new ufm.i(b(deeplink), new s65.o(new g(z, this, 0), 12), 1), new s65.o(new i(this, 0), 13), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
