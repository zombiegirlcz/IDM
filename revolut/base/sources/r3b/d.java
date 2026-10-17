package r3b;

import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements dtl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CfdTradingHomeScreen f251237a;

    public d(CfdTradingHomeScreen cfdTradingHomeScreen) {
        this.f251237a = cfdTradingHomeScreen;
    }

    @Override // dtl.d
    public final Flow B0() {
        return rd0.e.b(this.f251237a.W.f);
    }
}
