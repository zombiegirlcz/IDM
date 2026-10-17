package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberOfSharesScreenContract$InputData f193166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193168c = e4m.b.b(new kyk.n(this, 2, 6));
    public final e4m.e d = e4m.b.b(new kyk.n(this, 1, 6));
    public final e4m.e e = e4m.b.b(new kyk.n(this, 0, 6));
    public final e4m.e f = e4m.b.b(new kyk.n(this, 3, 6));

    public f(k kVar, h hVar, ViewController viewController, NumberOfSharesScreenContract$InputData numberOfSharesScreenContract$InputData) {
        this.f193166a = numberOfSharesScreenContract$InputData;
        this.f193167b = e4m.b.b(e4m.c.a(viewController));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
