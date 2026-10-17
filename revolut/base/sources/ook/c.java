package ook;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f227141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227142c;

    public c(String str, List list, String str2) {
        this.f227140a = str;
        this.f227141b = list;
        this.f227142c = str2;
    }

    public final String a() {
        List list = this.f227141b;
        StringBuilder sbM = v0.a.m("waitlist_entries_", this.f227140a, "_", list != null ? d0.k0(list, null, null, null, 0, new o0(8), 31) : null, "_");
        sbM.append(this.f227142c);
        return sbM.toString();
    }

    public final String b() {
        List list = this.f227141b;
        StringBuilder sbM = v0.a.m("waitlist_entries_storage_", this.f227140a, "_", list != null ? d0.k0(list, null, null, null, 0, new o0(7), 31) : null, "_");
        sbM.append(this.f227142c);
        return sbM.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f227140a, cVar.f227140a) && Intrinsics.f(this.f227141b, cVar.f227141b) && Intrinsics.f(this.f227142c, cVar.f227142c);
    }

    public final int hashCode() {
        String str = this.f227140a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f227141b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f227142c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
