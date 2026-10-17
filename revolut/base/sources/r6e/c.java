package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillAccountDetailScreenContract$InputData f251713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f251714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251715c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251717h;
    public final e4m.e i;

    public c(o oVar, BaseScreen baseScreen, BillAccountDetailScreenContract$InputData billAccountDetailScreenContract$InputData) {
        this.f251713a = billAccountDetailScreenContract$InputData;
        this.f251714b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 10;
        this.f251715c = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.d = e4m.b.b(new qy7.f(oVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 4, i));
        this.f251716g = e4m.b.b(new qy7.f(oVar, this, 3, i));
        this.f251717h = e4m.b.b(new qy7.f(oVar, this, 6, i));
        this.i = e4m.b.b(new qy7.f(oVar, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f251716g.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
