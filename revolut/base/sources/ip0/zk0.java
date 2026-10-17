package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zk0 implements al0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f167484a;

    public zk0(ResourceImage icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f167484a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof zk0) && this.f167484a.equals(((zk0) obj2).f167484a);
    }

    public final int hashCode() {
        return this.f167484a.hashCode();
    }
}
