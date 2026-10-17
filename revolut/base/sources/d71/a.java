package d71;

import com.revolut.domain.models.support.StateAfterReplacement;
import com.revolut.domain.models.support.TrackingChannel;
import com.revolut.domain.models.support.TroubleshootingCardDeliveryState;
import com.revolut.domain.models.support.TroubleshootingCardOwnerType;
import com.revolut.domain.models.support.TroubleshootingSource;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshootingSource f111736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TroubleshootingCardDeliveryState f111738c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b93.b f111739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Address f111740h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f111741j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TrackingChannel f111742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f111743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final StateAfterReplacement f111744n;
    public final TroubleshootingCardOwnerType o;

    public a(TroubleshootingSource source, String cardId, TroubleshootingCardDeliveryState deliveryState, String name, String brand, String lastFour, b93.b cardCode, Address deliveryAddress, String str, String str2, String str3, TrackingChannel trackingChannel, l lVar, StateAfterReplacement stateAfterReplacement, TroubleshootingCardOwnerType cardOwnerType) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(deliveryState, "deliveryState");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        Intrinsics.checkNotNullParameter(cardOwnerType, "cardOwnerType");
        this.f111736a = source;
        this.f111737b = cardId;
        this.f111738c = deliveryState;
        this.d = name;
        this.e = brand;
        this.f = lastFour;
        this.f111739g = cardCode;
        this.f111740h = deliveryAddress;
        this.i = str;
        this.f111741j = str2;
        this.k = str3;
        this.f111742l = trackingChannel;
        this.f111743m = lVar;
        this.f111744n = stateAfterReplacement;
        this.o = cardOwnerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f111736a == aVar.f111736a && Intrinsics.f(this.f111737b, aVar.f111737b) && this.f111738c == aVar.f111738c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f111739g, aVar.f111739g) && Intrinsics.f(this.f111740h, aVar.f111740h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f111741j, aVar.f111741j) && Intrinsics.f(this.k, aVar.k) && this.f111742l == aVar.f111742l && Intrinsics.f(this.f111743m, aVar.f111743m) && this.f111744n == aVar.f111744n && this.o == aVar.o;
    }

    public final int hashCode() {
        int iHashCode = (this.f111740h.hashCode() + ((this.f111739g.hashCode() + p.a.c(p.a.c(p.a.c((this.f111738c.hashCode() + p.a.c(this.f111736a.hashCode() * 31, 31, this.f111737b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111741j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TrackingChannel trackingChannel = this.f111742l;
        int iHashCode5 = (iHashCode4 + (trackingChannel == null ? 0 : trackingChannel.hashCode())) * 31;
        l lVar = this.f111743m;
        int iHashCode6 = (iHashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        StateAfterReplacement stateAfterReplacement = this.f111744n;
        return this.o.hashCode() + ((iHashCode6 + (stateAfterReplacement != null ? stateAfterReplacement.hashCode() : 0)) * 31);
    }
}
