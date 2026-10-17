package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f318297c;
    public TravelExperiencesDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ a0(b bVar, Object obj2, int i) {
        this.f318295a = i;
        this.f318296b = bVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f318295a) {
            case 0:
                this.f318297c = baseScreen;
                break;
            default:
                this.f318297c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f318295a) {
            case 0:
                vc.s.h(this.f318297c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesDetailsScreenContract$InputData.class);
                return new b0(this.f318296b, (f) this.e, this.f318297c, this.d);
            default:
                vc.s.h(this.f318297c, BaseScreen.class);
                vc.s.h(this.d, TravelExperiencesDetailsScreenContract$InputData.class);
                return new c0(this.f318296b, (j) this.e, this.f318297c, this.d);
        }
    }
}
