package n36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f211887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f211888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d26.f f211889c;

    public /* synthetic */ i(int i, d dVar, g gVar, d26.f fVar) {
        if (7 != (i & 7)) {
            j1.f(a.f211876a.getDescriptor(), i, 7);
            throw null;
        }
        this.f211887a = dVar;
        this.f211888b = gVar;
        this.f211889c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f211887a, iVar.f211887a) && Intrinsics.f(this.f211888b, iVar.f211888b) && Intrinsics.f(this.f211889c, iVar.f211889c);
    }

    public final int hashCode() {
        int iHashCode = this.f211887a.f211881a.hashCode() * 31;
        g gVar = this.f211888b;
        return this.f211889c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    public i(d ceFiAsset, g gVar, d26.f deFiAsset) {
        Intrinsics.checkNotNullParameter(ceFiAsset, "ceFiAsset");
        Intrinsics.checkNotNullParameter(deFiAsset, "deFiAsset");
        this.f211887a = ceFiAsset;
        this.f211888b = gVar;
        this.f211889c = deFiAsset;
    }
}
