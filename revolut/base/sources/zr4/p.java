package zr4;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f324575a;

    public p(ResourceImage naviIcon) {
        Intrinsics.checkNotNullParameter(naviIcon, "naviIcon");
        this.f324575a = naviIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f324575a.equals(((p) obj2).f324575a);
    }

    public final int hashCode() {
        return this.f324575a.hashCode();
    }
}
