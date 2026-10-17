package k0a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f180010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f180011c;

    public d(List bottomAlignedItems, boolean z, List topAlignedItems) {
        Intrinsics.checkNotNullParameter(bottomAlignedItems, "bottomAlignedItems");
        Intrinsics.checkNotNullParameter(topAlignedItems, "topAlignedItems");
        this.f180009a = bottomAlignedItems;
        this.f180010b = topAlignedItems;
        this.f180011c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f180009a, dVar.f180009a) && Intrinsics.f(this.f180010b, dVar.f180010b) && this.f180011c == dVar.f180011c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180011c) + p.a.d(this.f180009a.hashCode() * 31, 31, this.f180010b);
    }
}
