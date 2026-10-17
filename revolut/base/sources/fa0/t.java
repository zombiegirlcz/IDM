package fa0;

import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f133158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StoriesScreen f133159c;
    public final na0.d d;

    public /* synthetic */ t(k kVar, na0.d dVar, int i) {
        this.f133157a = i;
        this.d = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f133157a) {
            case 0:
                this.f133158b = viewController;
                break;
            default:
                this.f133158b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f133157a) {
            case 0:
                vc.s.h(this.f133158b, ViewController.class);
                vc.s.h(this.f133159c, StoriesScreen.class);
                return new u((j) this.d, this.f133159c, 0);
            default:
                vc.s.h(this.f133158b, ViewController.class);
                vc.s.h(this.f133159c, StoriesScreen.class);
                return new u((h) this.d, this.f133159c, 1);
        }
    }
}
