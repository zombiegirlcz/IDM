package npg;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f218207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f218208b;

    public b(s vault, Image icon) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f218207a = vault;
        this.f218208b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f218207a, bVar.f218207a) && Intrinsics.f(this.f218208b, bVar.f218208b);
    }

    public final int hashCode() {
        return this.f218208b.hashCode() + (this.f218207a.hashCode() * 31);
    }
}
