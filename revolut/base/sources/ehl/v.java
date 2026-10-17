package ehl;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f126294c;
    public final float d;
    public final jo3.b e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f126295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f126296h;

    public v(String symbol, String ref2, jo3.b amount, float f, jo3.b bVar, jo3.b bVar2, jo3.b bVar3, String side) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f126292a = symbol;
        this.f126293b = ref2;
        this.f126294c = amount;
        this.d = f;
        this.e = bVar;
        this.f = bVar2;
        this.f126295g = bVar3;
        this.f126296h = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f126292a, vVar.f126292a) && Intrinsics.f(this.f126293b, vVar.f126293b) && Intrinsics.f(this.f126294c, vVar.f126294c) && Float.compare(this.d, vVar.d) == 0 && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f126295g, vVar.f126295g) && Intrinsics.f(this.f126296h, vVar.f126296h);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.d, y.e(this.f126294c, p.a.c(this.f126292a.hashCode() * 31, 31, this.f126293b), 31), 31);
        jo3.b bVar = this.e;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.f;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.f126295g;
        return this.f126296h.hashCode() + ((iHashCode2 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31);
    }
}
