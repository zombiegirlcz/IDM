package rp0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f256201b;

    public v(String id10, Image image) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f256200a = id10;
        this.f256201b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f256200a, vVar.f256200a) && Intrinsics.f(this.f256201b, vVar.f256201b);
    }

    public final int hashCode() {
        return this.f256201b.hashCode() + (this.f256200a.hashCode() * 31);
    }
}
