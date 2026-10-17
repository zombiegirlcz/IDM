package ci4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24373b;

    public h(String id10, String text) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f24372a = id10;
        this.f24373b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f24372a, hVar.f24372a) && Intrinsics.f(this.f24373b, hVar.f24373b);
    }

    public final int hashCode() {
        return this.f24373b.hashCode() + (this.f24372a.hashCode() * 31);
    }
}
