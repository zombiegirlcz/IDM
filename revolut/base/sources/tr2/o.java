package tr2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreenContract$Input;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockedPaymentsListScreenContract$Input f273674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f273675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f273676c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f273677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f273678h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f273679j;

    public o(m mVar, BaseScreen baseScreen, BlockedPaymentsListScreenContract$Input blockedPaymentsListScreenContract$Input) {
        this.f273674a = blockedPaymentsListScreenContract$Input;
        this.f273675b = baseScreen;
        this.f273676c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 10;
        this.d = e4m.b.b(new tg5.h(mVar, this, 2, i));
        this.e = e4m.b.b(new tg5.h(mVar, this, 1, i));
        this.f = e4m.b.b(new tg5.h(mVar, this, 0, i));
        this.f273677g = e4m.b.b(new tg5.h(mVar, this, 6, i));
        this.f273678h = e4m.b.b(new tg5.h(mVar, this, 5, i));
        this.i = e4m.b.b(new tg5.h(mVar, this, 4, i));
        this.f273679j = e4m.b.b(new tg5.h(mVar, this, 3, i));
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
