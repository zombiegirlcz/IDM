package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f318390c;
    public TravelExperiencesSearchScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ j0(b bVar, Object obj2, int i) {
        this.f318388a = i;
        this.f318389b = bVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f318388a) {
            case 0:
                this.f318390c = baseScreen;
                break;
            default:
                this.f318390c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f318388a) {
            case 0:
                vc.s.h(this.f318390c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesSearchScreenContract$InputData.class);
                return new l0(this.f318389b, (f) this.e, this.d);
            default:
                vc.s.h(this.f318390c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesSearchScreenContract$InputData.class);
                return new l0(this.f318389b, (j) this.e, this.d);
        }
    }
}
