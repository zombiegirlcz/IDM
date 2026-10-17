package p02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231471b;

    public d(String id10, String contactName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(contactName, "contactName");
        this.f231470a = id10;
        this.f231471b = contactName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f231470a, dVar.f231470a) && Intrinsics.f(this.f231471b, dVar.f231471b);
    }

    public final int hashCode() {
        return this.f231471b.hashCode() + (this.f231470a.hashCode() * 31);
    }
}
