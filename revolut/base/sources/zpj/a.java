package zpj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f324316c;
    public final String d;

    public a(Integer num, String type, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f324314a = type;
        this.f324315b = str;
        this.f324316c = num;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f324314a, aVar.f324314a) && Intrinsics.f(this.f324315b, aVar.f324315b) && Intrinsics.f(this.f324316c, aVar.f324316c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f324314a.hashCode() * 31;
        String str = this.f324315b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f324316c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
