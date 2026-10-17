package nfj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f214996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214997c;
    public final String d;
    public final String e;

    public n() {
        this(null, null, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f214995a, nVar.f214995a) && Intrinsics.f(this.f214996b, nVar.f214996b) && Intrinsics.f(this.f214997c, nVar.f214997c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f214995a.hashCode() * 31, 31, this.f214996b);
        String str = this.f214997c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(List list, String str, int i) {
        zhm.f0 f0Var = zhm.f0.f322471a;
        this(null, null, (i & 16) != 0 ? null : str, f0Var, (i & 2) != 0 ? f0Var : list);
    }

    public n(String str, String str2, String str3, List mobilePlanIds, List deviceAssociatedEsimProfileIds) {
        Intrinsics.checkNotNullParameter(mobilePlanIds, "mobilePlanIds");
        Intrinsics.checkNotNullParameter(deviceAssociatedEsimProfileIds, "deviceAssociatedEsimProfileIds");
        this.f214995a = mobilePlanIds;
        this.f214996b = deviceAssociatedEsimProfileIds;
        this.f214997c = str;
        this.d = str2;
        this.e = str3;
    }
}
