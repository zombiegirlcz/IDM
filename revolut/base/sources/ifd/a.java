package ifd;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f161000a;

    public a(ResourceImage icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f161000a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f161000a.equals(((a) obj2).f161000a);
    }

    public final int hashCode() {
        return this.f161000a.hashCode();
    }
}
