package iqi;

import android.app.Activity;
import android.view.View;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends fsi.c implements h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final fsi.b f167865l = new fsi.b("TWIN_VERTICAL_BUTTON_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f167866h;
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TwinVerticalButton f167867j;
    public final ihm.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g configuration, Activity activity) {
        super(f167865l);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f167866h = configuration;
        this.i = activity;
        this.k = j6.a.h("create(...)");
    }

    @Override // fsi.a
    public final void I() {
        View viewFindViewById = this.i.findViewById(this.f167866h.f167871a);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) viewFindViewById;
        this.f167867j = twinVerticalButton;
        if (twinVerticalButton != null) {
            twinVerticalButton.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 12));
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final ihm.f N() {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            return twinVerticalButton.m0();
        }
        Intrinsics.r("twinVerticalButton");
        throw null;
    }

    public final r O() {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            return twinVerticalButton.o0();
        }
        Intrinsics.r("twinVerticalButton");
        throw null;
    }

    public final r Q() {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            return twinVerticalButton.p0();
        }
        Intrinsics.r("twinVerticalButton");
        throw null;
    }

    public final void R(boolean z, boolean z3) {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setCollapsed(z, z3);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void V(boolean z) {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setCollapsible(z);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void W() {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setMainButtonVisible(true);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void X(boolean z) {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setFabEnabled(z);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void Y(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setFabImage(image);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void Z(boolean z) {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setMainButtonEnabled(z);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void a0(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setMainButtonText(text);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void b0(boolean z) {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setSecondaryButtonEnabled(true);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void c0(LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setSecondaryButtonStyle(style);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void d0(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setSecondaryButtonText(text);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void e0(boolean z) {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setSecondaryButtonVisible(z);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    public final void setVisible(boolean z) {
        TwinVerticalButton twinVerticalButton = this.f167867j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }
}
