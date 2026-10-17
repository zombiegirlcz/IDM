package fa0;

import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f133164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f133165c;
    public FormScreen d;
    public final na0.d e;

    public /* synthetic */ v(k kVar, na0.d dVar, int i) {
        this.f133163a = i;
        this.f133164b = kVar;
        this.e = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f133163a) {
            case 0:
                this.f133165c = viewController;
                break;
            default:
                this.f133165c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f133163a) {
            case 0:
                vc.s.h(this.f133165c, ViewController.class);
                vc.s.h(this.d, FormScreen.class);
                return new w(this.f133164b, (j) this.e, this.f133165c, this.d);
            default:
                vc.s.h(this.f133165c, ViewController.class);
                vc.s.h(this.d, FormScreen.class);
                return new w(this.f133164b, (h) this.e, this.f133165c, this.d);
        }
    }
}
