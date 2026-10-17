package fkc;

import ekc.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f135745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dc7.a f135746b;

    public a(d tile, dc7.a aVar) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f135745a = tile;
        this.f135746b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f135745a.equals(aVar.f135745a) && this.f135746b.equals(aVar.f135746b);
    }

    public final int hashCode() {
        return this.f135746b.hashCode() + (this.f135745a.hashCode() * 31);
    }
}
