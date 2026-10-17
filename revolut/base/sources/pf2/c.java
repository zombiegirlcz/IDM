package pf2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.p f235409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.l f235410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f235411c;

    public c(whf.p pVar, a12.l lVar, List list) {
        this.f235409a = pVar;
        this.f235410b = lVar;
        this.f235411c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f235409a, cVar.f235409a) && Intrinsics.f(this.f235410b, cVar.f235410b) && Intrinsics.f(this.f235411c, cVar.f235411c);
    }

    public final int hashCode() {
        whf.p pVar = this.f235409a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        a12.l lVar = this.f235410b;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        List list = this.f235411c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
