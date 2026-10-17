package d3c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f110990c;

    public a(String tile, String avatar, ArrayList galleryItems) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(galleryItems, "galleryItems");
        this.f110988a = tile;
        this.f110989b = avatar;
        this.f110990c = galleryItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f110988a, aVar.f110988a) && Intrinsics.f(this.f110989b, aVar.f110989b) && this.f110990c.equals(aVar.f110990c);
    }

    public final int hashCode() {
        return this.f110990c.hashCode() + p.a.c(this.f110988a.hashCode() * 31, 31, this.f110989b);
    }
}
