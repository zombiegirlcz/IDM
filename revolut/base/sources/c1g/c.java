package c1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements y7a.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20474b;

    public c(String id10, String label) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f20473a = id10;
        this.f20474b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f20473a, cVar.f20473a) && Intrinsics.f(this.f20474b, cVar.f20474b);
    }

    public final int hashCode() {
        return this.f20474b.hashCode() + (this.f20473a.hashCode() * 31);
    }
}
