package zkk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f323067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323068c;
    public final String d;
    public final List e;

    public i(String planId, hha.d dVar, String str, String str2, List options) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f323066a = planId;
        this.f323067b = dVar;
        this.f323068c = str;
        this.d = str2;
        this.e = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f323066a, iVar.f323066a) && Intrinsics.f(this.f323067b, iVar.f323067b) && Intrinsics.f(this.f323068c, iVar.f323068c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f323066a.hashCode() * 31;
        hha.d dVar = this.f323067b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f323068c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
