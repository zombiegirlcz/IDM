package afj;

import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class b1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f4174c;
    public EsimCountryPickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ b1(b bVar, Object obj2, int i) {
        this.f4172a = i;
        this.f4173b = bVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f4172a) {
            case 0:
                this.f4174c = baseScreen;
                break;
            case 1:
                this.f4174c = baseScreen;
                break;
            case 2:
                this.f4174c = baseScreen;
                break;
            case 3:
                this.f4174c = baseScreen;
                break;
            case 4:
                this.f4174c = baseScreen;
                break;
            default:
                this.f4174c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f4172a) {
            case 0:
                vc.s.h(this.f4174c, BaseScreen.class);
                vc.s.h(this.d, EsimCountryPickerScreenContract$InputData.class);
                return new d1(this.f4173b, (j) this.e, this.f4174c, this.d);
            case 1:
                vc.s.h(this.f4174c, BaseScreen.class);
                vc.s.h(this.d, EsimCountryPickerScreenContract$InputData.class);
                return new d1(this.f4173b, (c) this.e, this.f4174c, this.d);
            case 2:
                vc.s.h(this.f4174c, BaseScreen.class);
                vc.s.h(this.d, EsimCountryPickerScreenContract$InputData.class);
                return new d1(this.f4173b, (q) this.e, this.f4174c, this.d);
            case 3:
                vc.s.h(this.f4174c, BaseScreen.class);
                vc.s.h(this.d, EsimCountryPickerScreenContract$InputData.class);
                return new d1(this.f4173b, (x0) this.e, this.f4174c, this.d);
            case 4:
                vc.s.h(this.f4174c, BaseScreen.class);
                vc.s.h(this.d, EsimCountryPickerScreenContract$InputData.class);
                return new d1(this.f4173b, (q0) this.e, this.f4174c, this.d);
            default:
                vc.s.h(this.f4174c, BaseScreen.class);
                vc.s.h(this.d, EsimCountryPickerScreenContract$InputData.class);
                return new d1(this.f4173b, (m) this.e, this.f4174c, this.d);
        }
    }
}
