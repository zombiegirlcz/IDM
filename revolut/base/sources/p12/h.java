package p12;

import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f231675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f231676c;
    public QrDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ h(d dVar, Object obj2, int i) {
        this.f231674a = i;
        this.f231675b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f231674a) {
            case 0:
                this.f231676c = viewController;
                break;
            default:
                this.f231676c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f231674a) {
            case 0:
                vc.s.h(this.f231676c, ViewController.class);
                vc.s.h(this.d, QrDetailsScreenContract$InputData.class);
                return new i(this.f231675b, (e) this.e, this.f231676c, this.d);
            default:
                vc.s.h(this.f231676c, ViewController.class);
                vc.s.h(this.d, QrDetailsScreenContract$InputData.class);
                return new i(this.f231675b, (f) this.e, this.f231676c, this.d);
        }
    }
}
