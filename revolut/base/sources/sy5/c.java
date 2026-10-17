package sy5;

import au0.j4;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v60.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends fsi.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final fsi.b f266623l = new fsi.b("TRADING_SEARCH_MENU_VIEW_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rpi.c f266624h;
    public NavBarWithToolbar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f266625j;
    public final i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rpi.c keyboardView) {
        super(f266623l);
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        this.f266624h = keyboardView;
        this.f266625j = new i();
        this.k = new i();
    }

    public final void N() {
        ((rpi.b) this.f266624h).N(false);
        NavBarWithToolbar navBarWithToolbar = this.i;
        if (navBarWithToolbar == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
        NavBarWithToolbar navBarWithToolbar2 = this.i;
        if (navBarWithToolbar2 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        navBarWithToolbar2.H0(true);
        NavBarWithToolbar navBarWithToolbar3 = this.i;
        if (navBarWithToolbar3 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        navBarWithToolbar3.i0();
        this.f266625j.onNext(Boolean.FALSE);
    }
}
