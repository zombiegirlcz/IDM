package lk6;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f196254c;
    public final Map d;
    public final Map e;

    public m(String consentId, String thirdPartyTitle, Boolean bool, aim.f fVar, Map map) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
        this.f196252a = consentId;
        this.f196253b = thirdPartyTitle;
        this.f196254c = bool;
        this.d = fVar;
        this.e = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f196252a, mVar.f196252a) && Intrinsics.f(this.f196253b, mVar.f196253b) && Intrinsics.f(this.f196254c, mVar.f196254c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f196252a.hashCode() * 31, 31, this.f196253b);
        Boolean bool = this.f196254c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Map map = this.d;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.e;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }
}
