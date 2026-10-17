package zga;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wga.j f322092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f322094c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f322095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f322096h;

    public c(wga.j slot, String currentPlanId, String str, String str2, String str3, List list, String str4) {
        List listO0;
        Intrinsics.checkNotNullParameter(slot, "slot");
        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
        this.f322092a = slot;
        this.f322093b = currentPlanId;
        this.f322094c = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.f322095g = str4;
        String strName = slot.name();
        String strK0 = (list == null || (listO0 = d0.O0(list)) == null) ? null : d0.k0(listO0, "_", null, null, 0, null, 62);
        StringBuilder sbT = p.a.t(strName, "_", currentPlanId, "_", str);
        j6.a.D(sbT, "_", str2, "_", str3);
        this.f322096h = j6.a.w(sbT, "_", strK0, "_", str4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f322092a == cVar.f322092a && Intrinsics.f(this.f322093b, cVar.f322093b) && Intrinsics.f(this.f322094c, cVar.f322094c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f322095g, cVar.f322095g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f322092a.hashCode() * 31, 31, this.f322093b);
        String str = this.f322094c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f322095g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
