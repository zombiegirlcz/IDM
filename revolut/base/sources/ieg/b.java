package ieg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oei.b f160710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f160711b;

    public b(oei.b category, List amenities) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        this.f160710a = category;
        this.f160711b = amenities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f160710a == bVar.f160710a && Intrinsics.f(this.f160711b, bVar.f160711b);
    }

    public final int hashCode() {
        return this.f160711b.hashCode() + (this.f160710a.hashCode() * 31);
    }
}
