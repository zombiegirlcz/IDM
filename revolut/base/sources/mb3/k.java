package mb3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpBarcodeFlowContract$InputData f204075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f204076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f204077c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f204078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f204079h;

    public k(p pVar, ViewController viewController, CashTopUpBarcodeFlowContract$InputData cashTopUpBarcodeFlowContract$InputData) {
        this.f204076b = pVar;
        this.f204075a = cashTopUpBarcodeFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.e = e4m.b.b(new lzk.b(pVar, this, 2, i));
        this.f = e4m.b.b(new lzk.b(pVar, this, 1, i));
        this.f204078g = e4m.b.b(new lzk.b(pVar, this, 0, i));
        this.f204079h = e4m.b.b(new lzk.b(pVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f204078g.get());
    }
}
