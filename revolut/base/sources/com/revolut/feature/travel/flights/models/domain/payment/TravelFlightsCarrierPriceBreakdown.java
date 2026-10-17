package com.revolut.feature.travel.flights.models.domain.payment;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/payment/TravelFlightsCarrierPriceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsCarrierPriceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsCarrierPriceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f93552c;
    public final d d;
    public final Map e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string3 = parcel.readString();
                    int i3 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i3);
                    int iA = 0;
                    while (iA != i3) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsCarrierPriceBreakdownCharge.CREATOR, parcel, arrayList, iA, 1);
                    }
                    linkedHashMap2.put(string3, arrayList);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TravelFlightsCarrierPriceBreakdown(string, string2, dVar, dVar2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsCarrierPriceBreakdown[i];
        }
    }

    public TravelFlightsCarrierPriceBreakdown(String marketingCarrier, String str, d baseFare, d dVar, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(marketingCarrier, "marketingCarrier");
        Intrinsics.checkNotNullParameter(baseFare, "baseFare");
        this.f93550a = marketingCarrier;
        this.f93551b = str;
        this.f93552c = baseFare;
        this.d = dVar;
        this.e = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsCarrierPriceBreakdown)) {
            return false;
        }
        TravelFlightsCarrierPriceBreakdown travelFlightsCarrierPriceBreakdown = (TravelFlightsCarrierPriceBreakdown) obj2;
        return Intrinsics.f(this.f93550a, travelFlightsCarrierPriceBreakdown.f93550a) && Intrinsics.f(this.f93551b, travelFlightsCarrierPriceBreakdown.f93551b) && Intrinsics.f(this.f93552c, travelFlightsCarrierPriceBreakdown.f93552c) && Intrinsics.f(this.d, travelFlightsCarrierPriceBreakdown.d) && Intrinsics.f(this.e, travelFlightsCarrierPriceBreakdown.e);
    }

    public final int hashCode() {
        int iHashCode = this.f93550a.hashCode() * 31;
        String str = this.f93551b;
        int iC = v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f93552c);
        d dVar = this.d;
        int iHashCode2 = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Map map = this.e;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93550a);
        dest.writeString(this.f93551b);
        dest.writeSerializable(this.f93552c);
        dest.writeSerializable(this.d);
        Map map = this.e;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry = (Map.Entry) itV.next();
            dest.writeString((String) entry.getKey());
            Iterator itV2 = p.a.v((List) entry.getValue(), dest);
            while (itV2.hasNext()) {
                ((TravelFlightsCarrierPriceBreakdownCharge) itV2.next()).writeToParcel(dest, i);
            }
        }
    }
}
