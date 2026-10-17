package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.reviews.TravelExperiencesReviewsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f318378c;
    public TravelExperiencesReviewsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ h0(b bVar, Object obj2, int i) {
        this.f318376a = i;
        this.f318377b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f318376a) {
            case 0:
                this.f318378c = viewController;
                break;
            default:
                this.f318378c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f318376a) {
            case 0:
                vc.s.h(this.f318378c, ViewController.class);
                vc.s.h(this.d, TravelExperiencesReviewsScreenContract$InputData.class);
                return new i0(this.f318377b, (f) this.e, this.f318378c, this.d);
            default:
                vc.s.h(this.f318378c, ViewController.class);
                vc.s.h(this.d, TravelExperiencesReviewsScreenContract$InputData.class);
                return new i0(this.f318377b, (j) this.e, this.f318378c, this.d);
        }
    }
}
