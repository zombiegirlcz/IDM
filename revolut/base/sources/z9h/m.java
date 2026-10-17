package z9h;

import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f320479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f320480c;
    public CompositeAddMoneyScreenContract$Input d;
    public final Object e;

    public /* synthetic */ m(d dVar, Object obj2, int i) {
        this.f320478a = i;
        this.f320479b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f320478a) {
            case 0:
                this.f320480c = viewController;
                break;
            default:
                this.f320480c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f320478a) {
            case 0:
                s.h(this.f320480c, ViewController.class);
                s.h(this.d, CompositeAddMoneyScreenContract$Input.class);
                return new o(this.f320479b, (b) this.e, new vsb.a(), this.f320480c, this.d);
            default:
                s.h(this.f320480c, ViewController.class);
                s.h(this.d, CompositeAddMoneyScreenContract$Input.class);
                return new o(this.f320479b, (a) this.e, new vsb.a(), this.f320480c, this.d);
        }
    }
}
