package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t9 implements u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f166487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f166489c;

    public t9(LayeredImage image, float f) {
        int i = R$attr.uikit_colorTransparent;
        Intrinsics.checkNotNullParameter(image, "image");
        this.f166487a = image;
        this.f166488b = i;
        this.f166489c = f;
    }

    @Override // ip0.u9
    public final int a() {
        return this.f166488b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj2;
        return this.f166487a.equals(t9Var.f166487a) && this.f166488b == t9Var.f166488b && Float.compare(this.f166489c, t9Var.f166489c) == 0 && Float.compare(100.0f, 100.0f) == 0;
    }

    @Override // ip0.u9
    public final Image getImage() {
        return this.f166487a;
    }

    public final int hashCode() {
        return Float.hashCode(100.0f) + m72.b.b(this.f166489c, j6.a.b(this.f166488b, this.f166487a.hashCode() * 31, 31), 31);
    }
}
