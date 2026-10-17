package pwc;

import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthProtectionFeatureState.Visible f240400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f240401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f240402c;
    public final boolean d;
    public final boolean e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uib.a f240403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f240404h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f240405j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f240406l;

    public g(WealthProtectionFeatureState.Visible featureState, dj0.d dVar, boolean z, boolean z3, boolean z4, h flowType, uib.a aVar, Data data, boolean z6, Boolean bool, List streetModeWifiSuggestion, boolean z11) {
        Intrinsics.checkNotNullParameter(featureState, "featureState");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(streetModeWifiSuggestion, "streetModeWifiSuggestion");
        this.f240400a = featureState;
        this.f240401b = dVar;
        this.f240402c = z;
        this.d = z3;
        this.e = z4;
        this.f = flowType;
        this.f240403g = aVar;
        this.f240404h = data;
        this.i = z6;
        this.f240405j = bool;
        this.k = streetModeWifiSuggestion;
        this.f240406l = z11;
    }

    public static g a(g gVar, dj0.d dVar, boolean z, boolean z3, h hVar, uib.a aVar, Data data, boolean z4, Boolean bool, List list, boolean z6, int i) {
        WealthProtectionFeatureState.Visible featureState = gVar.f240400a;
        if ((i & 2) != 0) {
            dVar = gVar.f240401b;
        }
        dj0.d dVar2 = dVar;
        boolean z11 = (i & 4) != 0 ? gVar.f240402c : z;
        boolean z12 = (i & 8) != 0 ? gVar.d : z3;
        boolean z29 = (i & 16) != 0 ? gVar.e : true;
        h flowType = (i & 32) != 0 ? gVar.f : hVar;
        uib.a aVar2 = (i & 64) != 0 ? gVar.f240403g : aVar;
        Data data2 = (i & 128) != 0 ? gVar.f240404h : data;
        boolean z31 = (i & 256) != 0 ? gVar.i : z4;
        Boolean bool2 = (i & 512) != 0 ? gVar.f240405j : bool;
        List streetModeWifiSuggestion = (i & 1024) != 0 ? gVar.k : list;
        boolean z41 = (i & 2048) != 0 ? gVar.f240406l : z6;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(featureState, "featureState");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(streetModeWifiSuggestion, "streetModeWifiSuggestion");
        return new g(featureState, dVar2, z11, z12, z29, flowType, aVar2, data2, z31, bool2, streetModeWifiSuggestion, z41);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f240400a, gVar.f240400a) && Intrinsics.f(this.f240401b, gVar.f240401b) && this.f240402c == gVar.f240402c && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && Intrinsics.f(this.f240403g, gVar.f240403g) && Intrinsics.f(this.f240404h, gVar.f240404h) && this.i == gVar.i && Intrinsics.f(this.f240405j, gVar.f240405j) && Intrinsics.f(this.k, gVar.k) && this.f240406l == gVar.f240406l;
    }

    public final int hashCode() {
        int iHashCode = this.f240400a.hashCode() * 31;
        dj0.d dVar = this.f240401b;
        int iHashCode2 = (this.f.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f240402c), 31, this.d), 31, this.e)) * 31;
        uib.a aVar = this.f240403g;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Data data = this.f240404h;
        int iC = j6.a.c((iHashCode3 + (data == null ? 0 : data.hashCode())) * 31, 31, this.i);
        Boolean bool = this.f240405j;
        return Boolean.hashCode(this.f240406l) + p.a.d((iC + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.k);
    }
}
