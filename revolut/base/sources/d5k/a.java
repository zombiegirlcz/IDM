package d5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111421a;

    public a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f111421a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f111421a, ((a) obj2).f111421a);
    }

    public final int hashCode() {
        return this.f111421a.hashCode();
    }
}
