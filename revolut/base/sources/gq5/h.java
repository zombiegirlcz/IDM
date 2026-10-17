package gq5;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f145575b;

    public h(List items, f fVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145574a = items;
        this.f145575b = fVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f145574a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f145574a, hVar.f145574a) && Intrinsics.f(this.f145575b, hVar.f145575b);
    }

    public final int hashCode() {
        int iHashCode = this.f145574a.hashCode() * 31;
        f fVar = this.f145575b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
