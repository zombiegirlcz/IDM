package o6f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6f.a f222576b;

    public c(List items, y6f.a aVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f222575a = items;
        this.f222576b = aVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f222575a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f222575a, cVar.f222575a) && Intrinsics.f(this.f222576b, cVar.f222576b);
    }

    public final int hashCode() {
        int iHashCode = this.f222575a.hashCode() * 31;
        y6f.a aVar = this.f222576b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
