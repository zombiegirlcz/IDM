package xpi;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import au0.j4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import efm.d0;
import efm.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends fsi.c implements g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final fsi.b f307972m = new fsi.b("NAVBAR_WITH_TOOLBAR_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f307973h;
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NavBarWithToolbar f307974j;
    public final ihm.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f307975l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f configuration, Activity activity) {
        super(f307972m);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f307973h = configuration;
        this.i = activity;
        this.k = j6.a.h("create(...)");
        this.f307975l = v0.a.d("create(...)");
    }

    @Override // fsi.a
    public final void I() {
        final NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.i.findViewById(this.f307973h.f307977a);
        if (navBarWithToolbar != null) {
            navBarWithToolbar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xpi.a
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f307970a.k.onNext(Integer.valueOf(navBarWithToolbar.getTotalScrollRange()));
                }
            });
            this.f307974j = navBarWithToolbar;
        }
    }

    public final void N(j4 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        if (navBarWithToolbar.f59409p.m()) {
            NavBarWithToolbar navBarWithToolbar2 = this.f307974j;
            if (navBarWithToolbar2 == null) {
                Intrinsics.r("navBarWithToolbarView");
                throw null;
            }
            e0m.e.a(navBarWithToolbar2);
        }
        NavBarWithToolbar navBarWithToolbar3 = this.f307974j;
        if (navBarWithToolbar3 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar3.clearFocus();
        NavBarWithToolbar navBarWithToolbar4 = this.f307974j;
        if (navBarWithToolbar4 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar4.m0(animation);
        NavBarWithToolbar navBarWithToolbar5 = this.f307974j;
        if (navBarWithToolbar5 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar5.i0();
        this.f307975l.onNext(Boolean.FALSE);
    }

    public final ufm.b O() {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        ufm.b bVarM = d0.m(Boolean.valueOf(navBarWithToolbar.f59421x0));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final r Q() {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            return navBarWithToolbar.f59410q;
        }
        Intrinsics.r("navBarWithToolbarView");
        throw null;
    }

    public final ihm.f R() {
        return this.f307975l;
    }

    public final void V(j4 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar.K0(animation);
        NavBarWithToolbar navBarWithToolbar2 = this.f307974j;
        if (navBarWithToolbar2 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar2.E0();
        View currentFocus = this.i.getCurrentFocus();
        if (currentFocus != null) {
            kli.c.d(currentFocus, 0L);
        }
        this.f307975l.onNext(Boolean.TRUE);
    }

    public final void W(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setActions(actions);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void X(boolean z) {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setDescriptionClickable(z);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void Y(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setDescriptionText(text);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void Z(boolean z) {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setDescriptionVisible(z);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void a0(Image image) {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setEndIconImage(image);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final r b() {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            return navBarWithToolbar.o.f57403b;
        }
        Intrinsics.r("navBarWithToolbarView");
        throw null;
    }

    public final void b0(Image image) {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setEndIconBadgeImage(image);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void c0(j0 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setHeaderTitleMode(mode);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void d0(List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setMenuItems(menuItems);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void e0(Integer num) {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setNavigationButtonIcon(num);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void f0(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setSecondDescriptionText(text);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void l0(boolean z) {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setSecondDescriptionVisible(z);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void n0(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setTitle(text, null);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void p0(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setToolbarTitle(title);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    public final void setVisible(boolean z) {
        NavBarWithToolbar navBarWithToolbar = this.f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setVisible(z);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }
}
