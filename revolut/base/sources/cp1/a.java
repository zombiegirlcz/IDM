package cp1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import xo1.g;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f107768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107770c;
    public final Map d;

    public a(g paymentMethod, String billerId, String billerName, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(billerId, "billerId");
        Intrinsics.checkNotNullParameter(billerName, "billerName");
        this.f107768a = paymentMethod;
        this.f107769b = billerId;
        this.f107770c = billerName;
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f107768a == aVar.f107768a && Intrinsics.f(this.f107769b, aVar.f107769b) && Intrinsics.f(this.f107770c, aVar.f107770c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f107768a.hashCode() * 31, 31, this.f107769b), 31, this.f107770c);
        Map map = this.d;
        return iC + (map == null ? 0 : map.hashCode());
    }
}
