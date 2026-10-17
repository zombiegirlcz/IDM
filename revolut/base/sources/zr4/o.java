package zr4;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f324574a;

    public o(ResourceImage naviIcon) {
        Intrinsics.checkNotNullParameter(naviIcon, "naviIcon");
        this.f324574a = naviIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f324574a.equals(((o) obj2).f324574a);
    }

    public final int hashCode() {
        return this.f324574a.hashCode();
    }
}
