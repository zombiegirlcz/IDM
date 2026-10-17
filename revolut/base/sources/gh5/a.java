package gh5;

import aii.e;
import aii.g;
import aii.p;
import com.revolut.feature.crypto.locked.balance.api.CryptoLockedBalanceApi$Toggles$CryptoBalanceBreakdown;
import com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.CryptoBalanceBreakdownScreen;
import com.revolut.feature.crypto.locked.balance.impl.ui.excluded_locked_balances.ExcludedLockedBalancesScreen;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f143852a = h0.f322473a;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof fh5.a) {
            fh5.a aVar = (fh5.a) descriptor;
            return aVar.a(new CryptoBalanceBreakdownScreen(aVar.f135147a));
        }
        if (!(descriptor instanceof fh5.e)) {
            return null;
        }
        fh5.e eVar = (fh5.e) descriptor;
        return eVar.a(new ExcludedLockedBalancesScreen(eVar.f135150a));
    }

    @Override // nte.a
    public final List e() {
        return u.c(CryptoLockedBalanceApi$Toggles$CryptoBalanceBreakdown.f70866c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f143852a;
    }
}
