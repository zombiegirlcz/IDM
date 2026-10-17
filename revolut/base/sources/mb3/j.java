package mb3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpAmountScreenContract$InputData.CreateBarcodeData f204069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f204070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f204071c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f204072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f204073h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f204074j;

    public j(p pVar, BaseScreen baseScreen, CashTopUpAmountScreenContract$InputData.CreateBarcodeData createBarcodeData) {
        this.f204070b = pVar;
        this.f204069a = createBarcodeData;
        this.f204071c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 23;
        this.d = e4m.b.b(new lzk.b(pVar, this, 2, i));
        this.e = e4m.b.b(new lzk.b(pVar, this, 1, i));
        this.f = e4m.b.b(new lzk.b(pVar, this, 0, i));
        this.f204072g = e4m.b.b(new lzk.b(pVar, this, 4, i));
        this.f204073h = e4m.b.b(new lzk.b(pVar, this, 6, i));
        this.i = e4m.b.b(new lzk.b(pVar, this, 5, i));
        this.f204074j = e4m.b.b(new lzk.b(pVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
