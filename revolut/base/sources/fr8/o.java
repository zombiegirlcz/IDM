package fr8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f137427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f137428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f137429c;

    public o(List items, k kVar, m mVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f137427a = items;
        this.f137428b = kVar;
        this.f137429c = mVar;
    }

    @Override // jki.n
    public final List c() {
        return this.f137427a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f137427a, oVar.f137427a) && Intrinsics.f(this.f137428b, oVar.f137428b) && Intrinsics.f(this.f137429c, oVar.f137429c);
    }

    public final int hashCode() {
        int iHashCode = this.f137427a.hashCode() * 31;
        k kVar = this.f137428b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        m mVar = this.f137429c;
        return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }
}
