package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f318343c;
    public TravelExperiencesHomeScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ d0(b bVar, Object obj2, int i) {
        this.f318341a = i;
        this.f318342b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f318341a) {
            case 0:
                this.f318343c = viewController;
                break;
            default:
                this.f318343c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f318341a) {
            case 0:
                vc.s.h(this.f318343c, ViewController.class);
                vc.s.h(this.d, TravelExperiencesHomeScreenContract$InputData.class);
                return new e0(this.f318342b, (q) this.e, this.d);
            default:
                vc.s.h(this.f318343c, ViewController.class);
                vc.s.h(this.d, TravelExperiencesHomeScreenContract$InputData.class);
                return new e0(this.f318342b, (j) this.e, this.d);
        }
    }
}
