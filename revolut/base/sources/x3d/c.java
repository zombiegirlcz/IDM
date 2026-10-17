package x3d;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f302725a;

    public c(ResourceImage icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f302725a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f302725a.equals(((c) obj2).f302725a);
    }

    public final int hashCode() {
        return this.f302725a.hashCode();
    }
}
