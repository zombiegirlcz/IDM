package h3j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f149156b;

    public h(List items, f fVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f149155a = items;
        this.f149156b = fVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f149155a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f149155a, hVar.f149155a) && Intrinsics.f(this.f149156b, hVar.f149156b);
    }

    public final int hashCode() {
        int iHashCode = this.f149155a.hashCode() * 31;
        f fVar = this.f149156b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
