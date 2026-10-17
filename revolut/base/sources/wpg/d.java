package wpg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddMoneyScreenContract$InputData f299244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f299245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f299246c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f299247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f299248h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f299249j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f299250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f299251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f299252n;

    public d(l lVar, BaseScreen baseScreen, AddMoneyScreenContract$InputData addMoneyScreenContract$InputData) {
        this.f299245b = lVar;
        this.f299244a = addMoneyScreenContract$InputData;
        this.f299246c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 5;
        this.d = e4m.b.b(new whc.t(lVar, this, 2, i));
        this.e = e4m.b.b(new whc.t(lVar, this, 1, i));
        this.f = e4m.b.b(new whc.t(lVar, this, 0, i));
        this.f299247g = e4m.b.b(new whc.t(lVar, this, 4, i));
        this.f299248h = e4m.b.b(new whc.t(lVar, this, 3, i));
        this.i = e4m.b.b(new whc.t(lVar, this, 6, i));
        this.f299249j = e4m.b.b(new whc.t(lVar, this, 7, i));
        this.k = e4m.b.b(new whc.t(lVar, this, 8, i));
        this.f299250l = e4m.b.b(new whc.t(lVar, this, 9, i));
        this.f299251m = e4m.b.b(new whc.t(lVar, this, 10, i));
        this.f299252n = e4m.b.b(new whc.t(lVar, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f299248h.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
