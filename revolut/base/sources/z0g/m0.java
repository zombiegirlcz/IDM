package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f318414c;
    public TravelExperiencesDatesSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ m0(b bVar, Object obj2, int i) {
        this.f318412a = i;
        this.f318413b = bVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f318412a) {
            case 0:
                this.f318414c = baseScreen;
                break;
            case 1:
                this.f318414c = baseScreen;
                break;
            default:
                this.f318414c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f318412a) {
            case 0:
                vc.s.h(this.f318414c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesDatesSelectionScreenContract$InputData.class);
                return new n0(this.f318413b, (q) this.e, this.d);
            case 1:
                vc.s.h(this.f318414c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesDatesSelectionScreenContract$InputData.class);
                return new n0(this.f318413b, (f) this.e, this.d);
            default:
                vc.s.h(this.f318414c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesDatesSelectionScreenContract$InputData.class);
                return new n0(this.f318413b, (j) this.e, this.d);
        }
    }
}
