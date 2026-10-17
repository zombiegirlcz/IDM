package ho3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154219b;

    public a(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f154218a = id10;
        this.f154219b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f154218a, aVar.f154218a) && Intrinsics.f(this.f154219b, aVar.f154219b);
    }

    public final int hashCode() {
        return this.f154219b.hashCode() + (this.f154218a.hashCode() * 31);
    }
}
