package pgb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f235851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f235852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f235853c;
    public final List d;

    public s() {
        this(null, null, null, 15);
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f235851a == sVar.f235851a && Intrinsics.f(this.f235852b, sVar.f235852b) && Intrinsics.f(this.f235853c, sVar.f235853c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f235851a) * 31;
        r rVar = this.f235852b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        aw0.i iVar = this.f235853c;
        return this.d.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }

    public s(r rVar, aw0.e eVar, List items, int i) {
        boolean z = (i & 1) == 0;
        rVar = (i & 2) != 0 ? null : rVar;
        eVar = (i & 4) != 0 ? null : eVar;
        items = (i & 8) != 0 ? f0.f322471a : items;
        Intrinsics.checkNotNullParameter(items, "items");
        this.f235851a = z;
        this.f235852b = rVar;
        this.f235853c = eVar;
        this.d = items;
    }
}
