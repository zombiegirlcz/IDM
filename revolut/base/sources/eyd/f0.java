package eyd;

import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f130742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f130743c;
    public AllCategoriesScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ f0(b0 b0Var, Object obj2, int i) {
        this.f130741a = i;
        this.f130742b = b0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f130741a) {
            case 0:
                this.f130743c = viewController;
                break;
            default:
                this.f130743c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f130741a) {
            case 0:
                vc.s.h(this.f130743c, ViewController.class);
                vc.s.h(this.d, AllCategoriesScreenContract$InputData.class);
                return new g0(this.f130742b, (l) this.e, this.d);
            default:
                vc.s.h(this.f130743c, ViewController.class);
                vc.s.h(this.d, AllCategoriesScreenContract$InputData.class);
                return new g0(this.f130742b, (p) this.e, this.d);
        }
    }
}
