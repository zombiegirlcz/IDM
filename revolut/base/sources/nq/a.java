package nq;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f218279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f218280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218281c;
    public final Integer d;

    public a(w scanType, Map map, String str, Integer num) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        this.f218279a = scanType;
        this.f218280b = map;
        this.f218281c = str;
        this.d = num;
    }

    public static a a(a aVar, String str, Integer num) {
        w scanType = aVar.f218279a;
        Map map = aVar.f218280b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        return new a(scanType, map, str, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f218279a == aVar.f218279a && Intrinsics.f(this.f218280b, aVar.f218280b) && Intrinsics.f(this.f218281c, aVar.f218281c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f218279a.hashCode() * 31;
        Map map = this.f218280b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f218281c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
