package qsh;

import com.revolut.feature.widgets.impl.ui.screen.customisation.WidgetCarouselScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f248846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WidgetCarouselScreenContract$InputData f248847c;
    public final Object d;

    public /* synthetic */ c(Object obj2, int i) {
        this.f248845a = i;
        this.d = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f248845a) {
            case 0:
                this.f248846b = baseScreen;
                break;
            default:
                this.f248846b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f248845a) {
            case 0:
                s.h(this.f248846b, BaseScreen.class);
                s.h(this.f248847c, WidgetCarouselScreenContract$InputData.class);
                return new d((b) this.d, this.f248847c, 0);
            default:
                s.h(this.f248846b, BaseScreen.class);
                s.h(this.f248847c, WidgetCarouselScreenContract$InputData.class);
                return new d((ush.b) this.d, this.f248847c, 1);
        }
    }
}
