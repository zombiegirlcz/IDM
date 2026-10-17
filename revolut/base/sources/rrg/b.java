package rrg;

import java.util.List;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f256834b;

    public b(List images, int i) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f256833a = images;
        this.f256834b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f256833a, bVar.f256833a) && this.f256834b == bVar.f256834b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f256834b) + (this.f256833a.hashCode() * 31);
    }
}
