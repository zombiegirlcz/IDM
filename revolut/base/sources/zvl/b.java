package zvl;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f325716a;

    public b(LayeredImage prettyIcon) {
        Intrinsics.checkNotNullParameter(prettyIcon, "prettyIcon");
        this.f325716a = prettyIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f325716a.equals(((b) obj2).f325716a);
    }

    public final int hashCode() {
        return this.f325716a.hashCode();
    }
}
