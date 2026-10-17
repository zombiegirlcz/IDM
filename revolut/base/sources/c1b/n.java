package c1b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20444b;

    public n(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f20443a = id10;
        this.f20444b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f20443a, nVar.f20443a) && Intrinsics.f(this.f20444b, nVar.f20444b);
    }

    public final int hashCode() {
        return this.f20444b.hashCode() + (this.f20443a.hashCode() * 31);
    }
}
