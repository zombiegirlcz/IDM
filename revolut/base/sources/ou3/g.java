package ou3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f229789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f229790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f229791c;
    public final i d;

    public g(k header, s tile, p stepsSection, i iVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(tile, "tile");
        Intrinsics.checkNotNullParameter(stepsSection, "stepsSection");
        this.f229789a = header;
        this.f229790b = tile;
        this.f229791c = stepsSection;
        this.d = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f229789a, gVar.f229789a) && Intrinsics.f(this.f229790b, gVar.f229790b) && Intrinsics.f(this.f229791c, gVar.f229791c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f229791c.hashCode() + ((this.f229790b.hashCode() + (this.f229789a.hashCode() * 31)) * 31)) * 31;
        i iVar = this.d;
        return iHashCode + (iVar == null ? 0 : iVar.f229794a.hashCode());
    }
}
