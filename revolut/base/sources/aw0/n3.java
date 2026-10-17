package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f10432b;

    public n3(Clause label, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f10431a = label;
        this.f10432b = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.f10431a, n3Var.f10431a) && Intrinsics.f(this.f10432b, n3Var.f10432b);
    }

    public final int hashCode() {
        int iHashCode = this.f10431a.hashCode() * 31;
        Image image = this.f10432b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
