package t6k;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonContract$InputData;
import java.util.Set;
import t0b.l;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequestRejectWithReasonContract$InputData f268377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f268378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268379c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f268380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f268381h;

    public d(c cVar, BaseScreen baseScreen, MoneyRequestRejectWithReasonContract$InputData moneyRequestRejectWithReasonContract$InputData) {
        this.f268377a = moneyRequestRejectWithReasonContract$InputData;
        this.f268378b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 15;
        this.f268379c = e4m.b.b(new l(cVar, this, 1, i));
        this.d = e4m.b.b(new l(cVar, this, 0, i));
        this.e = e4m.b.b(new l(cVar, this, 3, i));
        this.f = e4m.b.b(new l(cVar, this, 2, i));
        this.f268380g = e4m.b.b(new l(cVar, this, 5, i));
        this.f268381h = e4m.b.b(new l(cVar, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.f.get());
    }
}
