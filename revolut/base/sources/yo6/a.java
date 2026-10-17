package yo6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315606a;

    public a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f315606a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f315606a, ((a) obj2).f315606a);
    }

    public final int hashCode() {
        return this.f315606a.hashCode();
    }
}
