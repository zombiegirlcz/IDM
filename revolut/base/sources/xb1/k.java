package xb1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment.CardReaderPaymentScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderPaymentScreenContract$InputData f303939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f303940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f303941c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f303942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f303943h;
    public final e4m.e i;

    public k(p pVar, BaseScreen baseScreen, CardReaderPaymentScreenContract$InputData cardReaderPaymentScreenContract$InputData) {
        this.f303940b = pVar;
        this.f303939a = cardReaderPaymentScreenContract$InputData;
        this.f303941c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 28;
        this.d = e4m.b.b(new whc.t(pVar, this, 2, i));
        this.e = e4m.b.b(new whc.t(pVar, this, 1, i));
        this.f = e4m.b.b(new whc.t(pVar, this, 0, i));
        this.f303942g = e4m.b.b(new whc.t(pVar, this, 4, i));
        this.f303943h = e4m.b.b(new whc.t(pVar, this, 5, i));
        this.i = e4m.b.b(new whc.t(pVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.singleton((yji.d) this.f.get());
    }
}
