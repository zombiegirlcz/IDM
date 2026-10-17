package ci7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class i implements t {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f24408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24410c;

    public /* synthetic */ i(int i, ej0.b bVar, float f, float f4) {
        if (7 != (i & 7)) {
            j1.f(g.f24407a.getDescriptor(), i, 7);
            throw null;
        }
        this.f24408a = bVar;
        this.f24409b = f;
        this.f24410c = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f24408a, iVar.f24408a) && Float.compare(this.f24409b, iVar.f24409b) == 0 && Float.compare(this.f24410c, iVar.f24410c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24410c) + m72.b.b(this.f24409b, this.f24408a.hashCode() * 31, 31);
    }

    public i(ej0.b basePrice, float f, float f4) {
        Intrinsics.checkNotNullParameter(basePrice, "basePrice");
        this.f24408a = basePrice;
        this.f24409b = f;
        this.f24410c = f4;
    }
}
