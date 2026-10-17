package qsh;

import com.revolut.feature.widgets.impl.ui.screen.catalgoue.WidgetsCatalogueScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f248852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WidgetsCatalogueScreenContract$InputData f248853c;
    public final Object d;

    public /* synthetic */ e(Object obj2, int i) {
        this.f248851a = i;
        this.d = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f248851a) {
            case 0:
                this.f248852b = baseScreen;
                break;
            default:
                this.f248852b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f248851a) {
            case 0:
                s.h(this.f248852b, BaseScreen.class);
                s.h(this.f248853c, WidgetsCatalogueScreenContract$InputData.class);
                return new f((b) this.d, this.f248853c, 0);
            default:
                s.h(this.f248852b, BaseScreen.class);
                s.h(this.f248853c, WidgetsCatalogueScreenContract$InputData.class);
                return new f((ush.b) this.d, this.f248853c, 1);
        }
    }
}
