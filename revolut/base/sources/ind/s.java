package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String id10) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f162825b = id10;
    }

    @Override // ind.x
    public final String a() {
        return this.f162825b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f162825b, ((s) obj2).f162825b);
    }

    public final int hashCode() {
        return this.f162825b.hashCode();
    }
}
