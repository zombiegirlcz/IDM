package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreenContract$ScreenConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsListScreenContract$ScreenConfig f193155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193157c;

    public b(k kVar, h hVar, InstrumentsListScreenContract$ScreenConfig instrumentsListScreenContract$ScreenConfig) {
        this.f193155a = instrumentsListScreenContract$ScreenConfig;
        this.f193156b = e4m.b.b(new kr9.m(kVar, this, 1, 20));
        this.f193157c = e4m.b.b(new kr9.m(kVar, this, 0, 20));
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
