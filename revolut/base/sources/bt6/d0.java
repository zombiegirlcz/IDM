package bt6;

import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f18324c;
    public TaxHubCreateProfileScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ d0(b bVar, Object obj2, int i) {
        this.f18322a = i;
        this.f18323b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f18322a) {
            case 0:
                this.f18324c = viewController;
                break;
            default:
                this.f18324c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f18322a) {
            case 0:
                vc.s.h(this.f18324c, ViewController.class);
                vc.s.h(this.d, TaxHubCreateProfileScreenContract$InputData.class);
                return new e0(this.f18323b, (u) this.e, this.d);
            default:
                vc.s.h(this.f18324c, ViewController.class);
                vc.s.h(this.d, TaxHubCreateProfileScreenContract$InputData.class);
                return new e0(this.f18323b, (q) this.e, this.d);
        }
    }
}
