package in8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f162681b;

    public a(String id10, b state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f162680a = id10;
        this.f162681b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f162680a, aVar.f162680a) && this.f162681b == aVar.f162681b;
    }

    public final int hashCode() {
        return this.f162681b.hashCode() + (this.f162680a.hashCode() * 31);
    }
}
