package lg6;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f195073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f195075c;
    public final ve6.a d;

    public a(d money, String str, Boolean bool, ve6.a aVar) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f195073a = money;
        this.f195074b = str;
        this.f195075c = bool;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f195073a, aVar.f195073a) && Intrinsics.f(this.f195074b, aVar.f195074b) && Intrinsics.f(this.f195075c, aVar.f195075c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f195073a.hashCode() * 31;
        String str = this.f195074b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f195075c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ve6.a aVar = this.d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
