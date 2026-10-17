package g2j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BalanceSelector$InputData f140082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1j.a f140083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewController f140084c;
    public final f d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f140085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f140086h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f140087j;

    public e(f fVar, ViewController viewController, BalanceSelector$InputData balanceSelector$InputData, i1j.a aVar) {
        this.d = fVar;
        this.f140082a = balanceSelector$InputData;
        this.f140083b = aVar;
        this.f140084c = viewController;
        int i = 6;
        this.e = e4m.b.b(new fta.e(fVar, this, 2, i));
        this.f = e4m.b.b(new fta.e(fVar, this, 1, i));
        this.f140085g = e4m.b.b(new fta.e(fVar, this, 0, i));
        this.f140086h = e4m.b.b(new fta.e(fVar, this, 3, i));
        this.i = e4m.b.b(new fta.e(fVar, this, 5, i));
        this.f140087j = e4m.b.b(new fta.e(fVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f140086h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f140085g.get());
    }
}
