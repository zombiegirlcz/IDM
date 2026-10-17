package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetsPriceUpdateScreenContract$InputData f193139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193141c;

    public a(k kVar, j jVar, AssetsPriceUpdateScreenContract$InputData assetsPriceUpdateScreenContract$InputData) {
        this.f193139a = assetsPriceUpdateScreenContract$InputData;
        int i = 19;
        this.f193140b = e4m.b.b(new kr9.m(kVar, this, 1, i));
        this.f193141c = e4m.b.b(new kr9.m(kVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
