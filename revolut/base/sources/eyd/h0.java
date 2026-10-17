package eyd;

import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f130756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f130757c;
    public AllProductsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ h0(b0 b0Var, Object obj2, int i) {
        this.f130755a = i;
        this.f130756b = b0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f130755a) {
            case 0:
                this.f130757c = viewController;
                break;
            default:
                this.f130757c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f130755a) {
            case 0:
                vc.s.h(this.f130757c, ViewController.class);
                vc.s.h(this.d, AllProductsScreenContract$InputData.class);
                return new i0(this.f130756b, (l) this.e, this.d);
            default:
                vc.s.h(this.f130757c, ViewController.class);
                vc.s.h(this.d, AllProductsScreenContract$InputData.class);
                return new i0(this.f130756b, (p) this.e, this.d);
        }
    }
}
