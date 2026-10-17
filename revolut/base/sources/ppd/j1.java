package ppd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class j1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f238447c;
    public TotalWealthContract$InputData d;
    public final Object e;

    public /* synthetic */ j1(n nVar, Object obj2, int i) {
        this.f238445a = i;
        this.f238446b = nVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f238445a) {
            case 0:
                this.f238447c = viewController;
                break;
            default:
                this.f238447c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f238445a) {
            case 0:
                vc.s.h(this.f238447c, ViewController.class);
                vc.s.h(this.d, TotalWealthContract$InputData.class);
                return new k1(this.f238446b, (u0) this.e, this.d);
            default:
                vc.s.h(this.f238447c, ViewController.class);
                vc.s.h(this.d, TotalWealthContract$InputData.class);
                return new k1(this.f238446b, (l) this.e, this.d);
        }
    }
}
