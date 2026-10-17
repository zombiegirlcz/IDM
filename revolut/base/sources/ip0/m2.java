package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f165302a;

    public m2(ResourceImage icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f165302a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m2) && this.f165302a.equals(((m2) obj2).f165302a);
    }

    public final int hashCode() {
        return this.f165302a.hashCode() * 31;
    }
}
