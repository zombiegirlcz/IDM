package je9;

import aw0.b0;
import aw0.s;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import j87.m;
import kotlin.jvm.internal.Intrinsics;
import mx0.n8;
import org.jetbrains.annotations.NotNull;
import rp0.z1;
import yr0.u;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements com.revolut.core.ui_kit.views.pin.c {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f173241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f173242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z1 f173243c;

    public f(i tipAttempts) {
        Intrinsics.checkNotNullParameter(tipAttempts, "tipAttempts");
        this.f173241a = tipAttempts;
    }

    public final void a() {
        z1 z1Var = this.f173243c;
        if (z1Var != null) {
            u uVar = z1Var.f256233g;
            if (uVar != null) {
                uVar.dismiss();
            }
            z1Var.f256233g = null;
        }
        ifm.c cVar = this.f173242b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void b(n8 mode, PinCodeView.a biometricViewMode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(biometricViewMode, "biometricViewMode");
        if (mode == n8.SECURE && Intrinsics.f(biometricViewMode, PinCodeView.a.C0445a.f59611a)) {
            Integer num = (Integer) this.f173241a.f173247a.T2("TIP_CLOSE_ATTEMPTS_KEY", Integer.TYPE);
            if ((num != null ? num.intValue() : 0) < 3) {
                z1 z1Var = this.f173243c;
                if (z1Var != null) {
                    z1.b(z1Var, new ViewIdTarget(R$id.PinCodeView_keypad), new AppTipUIModel("TIP_POPUP_ID", null, new TextLocalisedClause(R$string.uikit_passcode_keypad_secured_title, null, null, 14), new TextLocalisedClause(R$string.uikit_passcode_keypad_secured_description, null, null, 14), new s(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_arrow_shuffle, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10)), null, null, null, 994), b0.CENTERED_ON_ANCHOR, null, 20);
                    return;
                }
                return;
            }
        }
        z1 z1Var2 = this.f173243c;
        if (z1Var2 != null) {
            u uVar = z1Var2.f256233g;
            if (uVar != null) {
                uVar.dismiss();
            }
            z1Var2.f256233g = null;
        }
    }

    public final void c(z1 z1Var) {
        ihm.f fVar;
        this.f173243c = z1Var;
        this.f173242b = (z1Var == null || (fVar = z1Var.f) == null) ? null : fVar.subscribe(new j6k.g(new m(this, 27), 29));
    }
}
