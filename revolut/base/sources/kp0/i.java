package kp0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f188016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f188017b;

    public i(Image image, MutableStateFlow mutableStateFlow) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f188016a = image;
        this.f188017b = mutableStateFlow;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f188016a.equals(((i) obj2).f188016a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f188016a.hashCode() * 31);
    }
}
