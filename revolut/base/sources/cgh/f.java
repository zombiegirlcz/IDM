package cgh;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f23973c;
    public final String d;

    public f(String name, String role, Image image, String description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f23971a = name;
        this.f23972b = role;
        this.f23973c = image;
        this.d = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f23971a, fVar.f23971a) && Intrinsics.f(this.f23972b, fVar.f23972b) && Intrinsics.f(this.f23973c, fVar.f23973c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a10.b.c(this.f23973c, p.a.c(this.f23971a.hashCode() * 31, 31, this.f23972b), 31);
    }
}
