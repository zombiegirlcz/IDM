package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253636b;

    public t(String id10, String description) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f253635a = id10;
        this.f253636b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f253635a, tVar.f253635a) && Intrinsics.f(this.f253636b, tVar.f253636b);
    }

    public final int hashCode() {
        return this.f253636b.hashCode() + (this.f253635a.hashCode() * 31);
    }
}
