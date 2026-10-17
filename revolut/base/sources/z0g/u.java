package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f318459c;
    public TravelExperiencesAdditionalInformationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ u(b bVar, Object obj2, int i) {
        this.f318457a = i;
        this.f318458b = bVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f318457a) {
            case 0:
                this.f318459c = baseScreen;
                break;
            default:
                this.f318459c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f318457a) {
            case 0:
                vc.s.h(this.f318459c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesAdditionalInformationScreenContract$InputData.class);
                return new v(this.f318458b, (f) this.e, this.d);
            default:
                vc.s.h(this.f318459c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesAdditionalInformationScreenContract$InputData.class);
                return new v(this.f318458b, (j) this.e, this.d);
        }
    }
}
