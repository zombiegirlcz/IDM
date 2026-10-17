package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ek0 extends com.fasterxml.jackson.core.m {
    public final yj0 d;
    public final Image e;

    public ek0() {
        this(0);
    }

    @Override // com.fasterxml.jackson.core.m
    public final yj0 b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ek0)) {
            return false;
        }
        ek0 ek0Var = (ek0) obj2;
        return this.d == ek0Var.d && Intrinsics.f(this.e, ek0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        Image image = this.e;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    public /* synthetic */ ek0(int i) {
        this(yj0.CENTER_HORIZONTAL, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(yj0 gravity, ResourceImage resourceImage) {
        super(R$attr.internal_textAppearanceFcaDisclaimerEmphasised, 0, 2);
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.d = gravity;
        this.e = resourceImage;
    }
}
