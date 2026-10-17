package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f318471c;
    public TravelExperiencesCancellationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ y(b bVar, Object obj2, int i) {
        this.f318469a = i;
        this.f318470b = bVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f318469a) {
            case 0:
                this.f318471c = baseScreen;
                break;
            default:
                this.f318471c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f318469a) {
            case 0:
                vc.s.h(this.f318471c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesCancellationScreenContract$InputData.class);
                return new z(this.f318470b, (f) this.e, this.f318471c, this.d);
            default:
                vc.s.h(this.f318471c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesCancellationScreenContract$InputData.class);
                return new z(this.f318470b, (j) this.e, this.f318471c, this.d);
        }
    }
}
