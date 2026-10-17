package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ak0 extends com.fasterxml.jackson.core.m {
    public final yj0 d;
    public final Image e;

    /* JADX WARN: Multi-variable type inference failed */
    public ak0() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    @Override // com.fasterxml.jackson.core.m
    public final yj0 b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ak0)) {
            return false;
        }
        ak0 ak0Var = (ak0) obj2;
        return this.d == ak0Var.d && Intrinsics.f(this.e, ak0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        Image image = this.e;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(yj0 gravity, Image image) {
        super(R$attr.internal_textAppearanceBody3, 0, 2);
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.d = gravity;
        this.e = image;
    }

    public /* synthetic */ ak0(yj0 yj0Var, CdnImage cdnImage, int i) {
        this((i & 1) != 0 ? yj0.CENTER_HORIZONTAL : yj0Var, (i & 2) != 0 ? null : cdnImage);
    }
}
