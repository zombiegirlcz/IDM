package u82;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t82.a f278079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f278080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f278081c;

    public d(t82.a aVar, e extraData, int i) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f278079a = aVar;
        this.f278080b = extraData;
        this.f278081c = i;
    }

    public static d a(d dVar, t82.a aVar, e extraData, int i, int i2) {
        if ((i2 & 1) != 0) {
            aVar = dVar.f278079a;
        }
        if ((i2 & 2) != 0) {
            extraData = dVar.f278080b;
        }
        if ((i2 & 4) != 0) {
            i = dVar.f278081c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new d(aVar, extraData, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f278079a, dVar.f278079a) && Intrinsics.f(this.f278080b, dVar.f278080b) && this.f278081c == dVar.f278081c;
    }

    public final int hashCode() {
        t82.a aVar = this.f278079a;
        return Integer.hashCode(this.f278081c) + ((this.f278080b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31);
    }
}
