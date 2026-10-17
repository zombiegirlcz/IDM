package qsa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f248775b;

    public l(List items, h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f248774a = items;
        this.f248775b = hVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f248774a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f248774a, lVar.f248774a) && Intrinsics.f(this.f248775b, lVar.f248775b);
    }

    public final int hashCode() {
        int iHashCode = this.f248774a.hashCode() * 31;
        h hVar = this.f248775b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
