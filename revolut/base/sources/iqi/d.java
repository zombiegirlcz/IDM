package iqi;

import android.app.Activity;
import android.os.Parcelable;
import android.view.View;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import efm.r;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ypi.i;
import ypi.k;
import ypi.l;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends fsi.c implements i {

    @NotNull
    public static final c Companion = new c();
    public static final fsi.b k = new fsi.b("TWIN_VERTICAL_BUTTON_BRIDGE_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f167868h;
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TwinVerticalButton f167869j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity) {
        super(k);
        g configuration = g.f167870b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f167868h = configuration;
        this.i = activity;
    }

    @Override // fsi.a
    public final void I() {
        View viewFindViewById = this.i.findViewById(this.f167868h.f167871a);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) viewFindViewById;
        this.f167869j = twinVerticalButton;
        if (twinVerticalButton != null) {
            twinVerticalButton.setSecondaryButtonVisible(false);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    @Override // ypi.i
    public final r a() {
        throw new NotImplementedError(null, 1, null);
    }

    @Override // ypi.i
    public final void d(boolean z) {
        throw new NotImplementedError(null, 1, null);
    }

    @Override // ypi.i
    public final r e() {
        TwinVerticalButton twinVerticalButton = this.f167869j;
        if (twinVerticalButton != null) {
            return twinVerticalButton.f59017j;
        }
        Intrinsics.r("twinVerticalButton");
        throw null;
    }

    @Override // ypi.i
    public final void f(Clause clause) {
        TwinVerticalButton twinVerticalButton = this.f167869j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setMainButtonText(clause);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    @Override // ypi.i
    public final void g() {
        throw new NotImplementedError(null, 1, null);
    }

    @Override // ypi.i
    public final r s() {
        TwinVerticalButton twinVerticalButton = this.f167869j;
        if (twinVerticalButton != null) {
            return twinVerticalButton.o0();
        }
        Intrinsics.r("twinVerticalButton");
        throw null;
    }

    @Override // ypi.i
    public final void setAnalyticsContext(Parcelable parcelable) {
        TwinVerticalButton twinVerticalButton = this.f167869j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setMainButtonAnalyticsContext(parcelable);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    @Override // ypi.i
    public final void setEnabled(boolean z) {
        TwinVerticalButton twinVerticalButton = this.f167869j;
        if (twinVerticalButton == null) {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
        twinVerticalButton.setMainButtonEnabled(z);
        TwinVerticalButton twinVerticalButton2 = this.f167869j;
        if (twinVerticalButton2 != null) {
            twinVerticalButton2.setFabEnabled(z);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    @Override // ypi.i
    public final void setVisible(boolean z) {
        TwinVerticalButton twinVerticalButton = this.f167869j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    @Override // ypi.i
    public final void t(k note) {
        Intrinsics.checkNotNullParameter(note, "note");
        if (note instanceof l) {
            TwinVerticalButton twinVerticalButton = this.f167869j;
            if (twinVerticalButton != null) {
                TwinVerticalButton.setDescription$default(twinVerticalButton, ((l) note).f315929a, null, null, 6, null);
                return;
            } else {
                Intrinsics.r("twinVerticalButton");
                throw null;
            }
        }
        if (!(note instanceof ypi.b)) {
            throw new NotImplementedError(null, 1, null);
        }
        TwinVerticalButton twinVerticalButton2 = this.f167869j;
        if (twinVerticalButton2 != null) {
            TwinVerticalButton.setDescription$default(twinVerticalButton2, null, null, null, 6, null);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }

    @Override // ypi.i
    public final void v(LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        TwinVerticalButton twinVerticalButton = this.f167869j;
        if (twinVerticalButton != null) {
            twinVerticalButton.setMainButtonStyle(style);
        } else {
            Intrinsics.r("twinVerticalButton");
            throw null;
        }
    }
}
