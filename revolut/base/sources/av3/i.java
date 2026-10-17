package av3;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f9907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f9908c;
    public final io3.e d;

    public i(String institutionName, io3.d pocket, xi0.b currency, io3.e eVar) {
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f9906a = institutionName;
        this.f9907b = pocket;
        this.f9908c = currency;
        this.d = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f9906a, iVar.f9906a) && Intrinsics.f(this.f9907b, iVar.f9907b) && Intrinsics.f(this.f9908c, iVar.f9908c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iJ = l.j(this.f9908c, l.g(this.f9907b, this.f9906a.hashCode() * 31, 31), 31);
        io3.e eVar = this.d;
        return iJ + (eVar == null ? 0 : eVar.hashCode());
    }
}
