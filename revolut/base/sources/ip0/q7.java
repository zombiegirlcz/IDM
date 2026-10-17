package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f165932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f165933b;

    public q7(Clause text, Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f165932a = image;
        this.f165933b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj2;
        return Intrinsics.f(this.f165932a, q7Var.f165932a) && Intrinsics.f(this.f165933b, q7Var.f165933b);
    }

    public final int hashCode() {
        return this.f165933b.hashCode() + (this.f165932a.hashCode() * 31);
    }
}
