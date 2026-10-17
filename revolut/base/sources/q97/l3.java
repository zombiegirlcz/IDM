package q97;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class l3 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tzg.m f243732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(t97.c productCellProvider, tzg.m wealthAccountsInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f243732b = wealthAccountsInteractor;
        this.f243733c = t97.d.TRADING_TERMINAL;
    }

    @Override // r97.b
    public final Flow d() {
        return mo3.a.e(nim.a.v(tzg.m.c(this.f243732b, null, null, 3), new l1(14)), new ku1.f0(22), new q2(9));
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243733c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        od0.a aVar = od0.a.f224253a;
        return new o97.d(new ExternalDestination.Browser(od0.a.e() ? "https://invest.revolut.codes" : "https://invest.revolut.com", null));
    }
}
