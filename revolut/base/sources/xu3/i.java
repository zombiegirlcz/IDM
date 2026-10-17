package xu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308907a;

    public i(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f308907a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f308907a, ((i) obj2).f308907a);
    }

    public final int hashCode() {
        return this.f308907a.hashCode();
    }
}
