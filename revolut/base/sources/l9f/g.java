package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedAssetsListScreenContract$InputData f193169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193171c = e4m.b.b(new kyk.n(this, 2, 7));
    public final e4m.e d = e4m.b.b(new kyk.n(this, 1, 7));
    public final e4m.e e = e4m.b.b(new kyk.n(this, 0, 7));
    public final e4m.e f = e4m.b.b(new kyk.n(this, 4, 7));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f193172g = e4m.b.b(new kyk.n(this, 3, 7));

    public g(k kVar, i iVar, ViewController viewController, SelectedAssetsListScreenContract$InputData selectedAssetsListScreenContract$InputData) {
        this.f193169a = selectedAssetsListScreenContract$InputData;
        this.f193170b = e4m.b.b(e4m.c.a(viewController));
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
