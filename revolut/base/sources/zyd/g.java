package zyd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f326437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f326438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f326439c;
    public final xi0.b d;

    public g(Data currencies, boolean z, xi0.b bVar, xi0.b bVar2) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f326437a = currencies;
        this.f326438b = z;
        this.f326439c = bVar;
        this.d = bVar2;
    }

    public static g a(g gVar, Data currencies, boolean z, xi0.b bVar, xi0.b bVar2, int i) {
        if ((i & 1) != 0) {
            currencies = gVar.f326437a;
        }
        if ((i & 2) != 0) {
            z = gVar.f326438b;
        }
        if ((i & 4) != 0) {
            bVar = gVar.f326439c;
        }
        if ((i & 8) != 0) {
            bVar2 = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        return new g(currencies, z, bVar, bVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f326437a, gVar.f326437a) && this.f326438b == gVar.f326438b && Intrinsics.f(this.f326439c, gVar.f326439c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f326437a.hashCode() * 31, 31, this.f326438b);
        xi0.b bVar = this.f326439c;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        xi0.b bVar2 = this.d;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
