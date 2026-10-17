package xcf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogContract$InputData;
import java.util.Set;
import whc.d;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalExchangeFeesDialogContract$InputData f304123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f304124b;

    public a(b bVar, TotalExchangeFeesDialogContract$InputData totalExchangeFeesDialogContract$InputData) {
        this.f304123a = totalExchangeFeesDialogContract$InputData;
        this.f304124b = e4m.b.b(new d(bVar, this, 18));
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
