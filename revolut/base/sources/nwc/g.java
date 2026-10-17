package nwc;

import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthProtectionFeaturesState f219820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f219821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uib.a f219822c;
    public final Data d;

    public g(WealthProtectionFeaturesState wealthProtectionFeaturesState, Data streetModeEnabled, uib.a aVar, Data data) {
        Intrinsics.checkNotNullParameter(wealthProtectionFeaturesState, "wealthProtectionFeaturesState");
        Intrinsics.checkNotNullParameter(streetModeEnabled, "streetModeEnabled");
        this.f219820a = wealthProtectionFeaturesState;
        this.f219821b = streetModeEnabled;
        this.f219822c = aVar;
        this.d = data;
    }

    public static g a(g gVar, WealthProtectionFeaturesState wealthProtectionFeaturesState, Data streetModeEnabled, uib.a aVar, Data data, int i) {
        if ((i & 1) != 0) {
            wealthProtectionFeaturesState = gVar.f219820a;
        }
        if ((i & 2) != 0) {
            streetModeEnabled = gVar.f219821b;
        }
        if ((i & 4) != 0) {
            aVar = gVar.f219822c;
        }
        if ((i & 8) != 0) {
            data = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(wealthProtectionFeaturesState, "wealthProtectionFeaturesState");
        Intrinsics.checkNotNullParameter(streetModeEnabled, "streetModeEnabled");
        return new g(wealthProtectionFeaturesState, streetModeEnabled, aVar, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f219820a, gVar.f219820a) && Intrinsics.f(this.f219821b, gVar.f219821b) && Intrinsics.f(this.f219822c, gVar.f219822c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f219821b, this.f219820a.hashCode() * 31, 31);
        uib.a aVar = this.f219822c;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Data data = this.d;
        return iHashCode + (data != null ? data.hashCode() : 0);
    }
}
