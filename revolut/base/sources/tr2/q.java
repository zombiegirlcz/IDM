package tr2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectPaymentToBlockScreenContract$InputData f273683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f273684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f273685c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f273686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f273687h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f273688j;
    public final e4m.e k;

    public q(m mVar, i iVar, BaseScreen baseScreen, SelectPaymentToBlockScreenContract$InputData selectPaymentToBlockScreenContract$InputData) {
        this.f273685c = mVar;
        this.f273683a = selectPaymentToBlockScreenContract$InputData;
        this.f273684b = baseScreen;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 11;
        this.e = e4m.b.b(new tg5.h(mVar, this, 2, i));
        this.f = e4m.b.b(new tg5.h(mVar, this, 1, i));
        this.f273686g = e4m.b.b(new tg5.h(mVar, this, 0, i));
        this.f273687h = e4m.b.b(new tg5.h(mVar, this, 4, i));
        this.i = e4m.b.b(new tg5.h(mVar, this, 6, i));
        this.f273688j = e4m.b.b(new tg5.h(mVar, this, 5, i));
        this.k = e4m.b.b(new tg5.h(mVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f273686g.get());
    }
}
