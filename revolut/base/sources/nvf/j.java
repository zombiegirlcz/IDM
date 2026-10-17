package nvf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219588b;

    public j(String id10, String selectedValue) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
        this.f219587a = id10;
        this.f219588b = selectedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f219587a, jVar.f219587a) && Intrinsics.f(this.f219588b, jVar.f219588b);
    }

    public final int hashCode() {
        return this.f219588b.hashCode() + (this.f219587a.hashCode() * 31);
    }
}
