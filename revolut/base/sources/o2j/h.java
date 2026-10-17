package o2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221632b;

    public h(String id10, String displayName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f221631a = id10;
        this.f221632b = displayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f221631a, hVar.f221631a) && Intrinsics.f(this.f221632b, hVar.f221632b);
    }

    public final int hashCode() {
        return this.f221632b.hashCode() + (this.f221631a.hashCode() * 31);
    }
}
