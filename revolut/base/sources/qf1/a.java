package qf1;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f245212a;

    public a(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f245212a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f245212a, ((a) obj2).f245212a);
    }

    public final int hashCode() {
        return this.f245212a.hashCode();
    }
}
