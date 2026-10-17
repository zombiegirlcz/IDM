package nsf;

import com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.AdditionalInfoDisclosureScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f218836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f218837c;
    public AdditionalInfoDisclosureScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ m(b bVar, Object obj2, int i) {
        this.f218835a = i;
        this.f218836b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f218835a) {
            case 0:
                this.f218837c = viewController;
                break;
            default:
                this.f218837c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f218835a) {
            case 0:
                vc.s.h(this.f218837c, ViewController.class);
                vc.s.h(this.d, AdditionalInfoDisclosureScreenContract$InputData.class);
                return new n(this.f218836b, (f) this.e, this.d);
            default:
                vc.s.h(this.f218837c, ViewController.class);
                vc.s.h(this.d, AdditionalInfoDisclosureScreenContract$InputData.class);
                return new n(this.f218836b, (d) this.e, this.d);
        }
    }
}
