package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f167119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms0.h4 f167120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ms0.e4 f167121c;
    public final int d;

    public xb0(ResourceImage resourceImage, ms0.e4 buttonState, int i) {
        ms0.h4 buttonStyle = ms0.h4.SEMIACCENT;
        buttonState = (i & 4) != 0 ? ms0.e4.EnabledClickable : buttonState;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f167119a = resourceImage;
        this.f167120b = buttonStyle;
        this.f167121c = buttonState;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xb0)) {
            return false;
        }
        xb0 xb0Var = (xb0) obj2;
        return Intrinsics.f(this.f167119a, xb0Var.f167119a) && this.f167120b == xb0Var.f167120b && this.f167121c == xb0Var.f167121c && this.d == xb0Var.d;
    }

    public final int hashCode() {
        ResourceImage resourceImage = this.f167119a;
        return Integer.hashCode(this.d) + ((this.f167121c.hashCode() + ((this.f167120b.hashCode() + ((resourceImage == null ? 0 : resourceImage.hashCode()) * 31)) * 31)) * 31);
    }
}
