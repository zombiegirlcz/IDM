package cg9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f23876b;

    public i(List items, g gVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23875a = items;
        this.f23876b = gVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f23875a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f23875a, iVar.f23875a) && Intrinsics.f(this.f23876b, iVar.f23876b);
    }

    public final int hashCode() {
        int iHashCode = this.f23875a.hashCode() * 31;
        g gVar = this.f23876b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
