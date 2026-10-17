package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s9 implements u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f166323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166324b;

    public s9(Image image) {
        int i = R$attr.uikit_colorTransparent;
        Intrinsics.checkNotNullParameter(image, "image");
        this.f166323a = image;
        this.f166324b = i;
    }

    @Override // ip0.u9
    public final int a() {
        return this.f166324b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj2;
        return this.f166323a.equals(s9Var.f166323a) && this.f166324b == s9Var.f166324b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // ip0.u9
    public final Image getImage() {
        return this.f166323a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166324b) + (this.f166323a.hashCode() * 31);
    }
}
