package tx0;

import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;

/* JADX INFO: loaded from: classes20.dex */
public final class d2 extends ix0.t1 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ au0.o f275102g;

    public /* synthetic */ d2(au0.o oVar, int i) {
        this.f = i;
        this.f275102g = oVar;
    }

    @Override // ix0.t1
    public final float a(float f) {
        switch (this.f) {
            case 0:
                NavBarLargeCentred.Companion companion = NavBarLargeCentred.INSTANCE;
                break;
            default:
                NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
                break;
        }
        return au0.o.n(f, 0.8f, true);
    }

    @Override // ix0.t1
    public final int b(int i) {
        int height;
        switch (this.f) {
            case 0:
                height = ((NavBarLargeCentred) this.f275102g).getHeight();
                break;
            default:
                height = ((NavBarWithToolbar) this.f275102g).getHeight();
                break;
        }
        return height + i;
    }

    @Override // ix0.t1
    public final int c() {
        switch (this.f) {
            case 0:
                return ((NavBarLargeCentred) this.f275102g).H.getMinimumHeight();
            default:
                return ((NavBarWithToolbar) this.f275102g).getNavBarLayout().getMinimumHeight();
        }
    }

    @Override // ix0.t1
    public final boolean d() {
        switch (this.f) {
            case 0:
                break;
            default:
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.f275102g;
                if (navBarWithToolbar.getNavBarWithToolbar_actionsView().getHeight() + navBarWithToolbar.getHeaderLayout().getHeight() + navBarWithToolbar.getMenuLayout().getHeight() + navBarWithToolbar.f59418w < navBarWithToolbar.getHeight()) {
                }
                break;
        }
        return false;
    }
}
