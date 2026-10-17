package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements xki.c, u9f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInAssetSelectionFlowContract$InputData f193173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f193174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f193175c = this;
    public final e4m.e d = e4m.b.b(new kw5.e(this, 11));

    public h(k kVar, TransferInAssetSelectionFlowContract$InputData transferInAssetSelectionFlowContract$InputData) {
        this.f193174b = kVar;
        this.f193173a = transferInAssetSelectionFlowContract$InputData;
    }

    @Override // u9f.a
    public final x b() {
        return new x(this.f193174b, this.f193175c, 1);
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
