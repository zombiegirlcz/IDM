package mzj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f210778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210779c;

    public d(String limitId, List list, String str) {
        Intrinsics.checkNotNullParameter(limitId, "limitId");
        this.f210777a = limitId;
        this.f210778b = list;
        this.f210779c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f210777a, dVar.f210777a) && Intrinsics.f(this.f210778b, dVar.f210778b) && Intrinsics.f(this.f210779c, dVar.f210779c);
    }

    public final int hashCode() {
        int iHashCode = this.f210777a.hashCode() * 31;
        List list = this.f210778b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f210779c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
