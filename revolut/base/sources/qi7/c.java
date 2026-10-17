package qi7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f246662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f246663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f246664c;

    public c(ej0.b basePrice, float f, float f4) {
        Intrinsics.checkNotNullParameter(basePrice, "basePrice");
        this.f246662a = basePrice;
        this.f246663b = f;
        this.f246664c = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f246662a, cVar.f246662a) && Float.compare(this.f246663b, cVar.f246663b) == 0 && Float.compare(this.f246664c, cVar.f246664c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f246664c) + m72.b.b(this.f246663b, this.f246662a.hashCode() * 31, 31);
    }
}
