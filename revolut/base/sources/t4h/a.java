package t4h;

import com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vqk.c f267995c;
    public final StartNavigation d;
    public final String e;

    public a(String symbolOrRef, String str, vqk.c cVar, StartNavigation.InsightsFlow insightsFlow, String str2) {
        Intrinsics.checkNotNullParameter(symbolOrRef, "symbolOrRef");
        this.f267993a = symbolOrRef;
        this.f267994b = str;
        this.f267995c = cVar;
        this.d = insightsFlow;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f267993a, aVar.f267993a) && Intrinsics.f(this.f267994b, aVar.f267994b) && this.f267995c == aVar.f267995c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f267993a.hashCode() * 31;
        String str = this.f267994b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        vqk.c cVar = this.f267995c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        StartNavigation startNavigation = this.d;
        int iHashCode4 = (iHashCode3 + (startNavigation == null ? 0 : startNavigation.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
