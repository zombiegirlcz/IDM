package hrg;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import jki.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f154824a;

    public d(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f154824a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f154824a.equals(((d) obj2).f154824a);
    }

    public final int hashCode() {
        return this.f154824a.hashCode();
    }
}
