package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String id10) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f162821b = id10;
    }

    @Override // ind.x
    public final String a() {
        return this.f162821b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f162821b, ((p) obj2).f162821b);
    }

    public final int hashCode() {
        return this.f162821b.hashCode();
    }
}
