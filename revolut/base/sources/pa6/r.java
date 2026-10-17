package pa6;

import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f234424c;
    public SpareChangeContract$InputData d;
    public final Object e;

    public /* synthetic */ r(m mVar, Object obj2, int i) {
        this.f234422a = i;
        this.f234423b = mVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f234422a) {
            case 0:
                this.f234424c = viewController;
                break;
            default:
                this.f234424c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f234422a) {
            case 0:
                vc.s.h(this.f234424c, ViewController.class);
                vc.s.h(this.d, SpareChangeContract$InputData.class);
                return new s(this.f234423b, (n) this.e, this.d);
            default:
                vc.s.h(this.f234424c, ViewController.class);
                vc.s.h(this.d, SpareChangeContract$InputData.class);
                return new s(this.f234423b, (b) this.e, this.d);
        }
    }
}
