package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.TransferInPriceUpdateFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements xki.c, u9f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInPriceUpdateFlowContract$InputData f193179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f193180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f193181c = this;
    public final e4m.e d = e4m.b.b(new kw5.e(this, 12));

    public j(k kVar, TransferInPriceUpdateFlowContract$InputData transferInPriceUpdateFlowContract$InputData) {
        this.f193180b = kVar;
        this.f193179a = transferInPriceUpdateFlowContract$InputData;
    }

    @Override // u9f.a
    public final x b() {
        return new x(this.f193180b, this.f193181c, 0);
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
