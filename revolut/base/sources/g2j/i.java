package g2j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyChooserInputData f140109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f140110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f140111c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public i(f fVar, ViewController viewController, CurrencyChooserInputData currencyChooserInputData) {
        this.f140109a = currencyChooserInputData;
        this.f140110b = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.f140111c = e4m.b.b(new fta.e(fVar, this, 1, i));
        this.d = e4m.b.b(new fta.e(fVar, this, 0, i));
        this.e = e4m.b.b(new fta.e(fVar, this, 3, i));
        this.f = e4m.b.b(new fta.e(fVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
