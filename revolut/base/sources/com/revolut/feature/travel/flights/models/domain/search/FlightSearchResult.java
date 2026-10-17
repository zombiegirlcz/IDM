package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/FlightSearchResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightSearchResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightSearchResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlightSearchContext f93587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f93588c;
    public final String d;
    public final FlightSearchFilterOptions e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            FlightSearchContext flightSearchContextCreateFromParcel = parcel.readInt() == 0 ? null : FlightSearchContext.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FlightSearchResultItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new FlightSearchResult(string, flightSearchContextCreateFromParcel, arrayList, parcel.readString(), FlightSearchFilterOptions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightSearchResult[i];
        }
    }

    public FlightSearchResult(String str, FlightSearchContext flightSearchContext, ArrayList items, String searchToken, FlightSearchFilterOptions filterOptions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchToken, "searchToken");
        Intrinsics.checkNotNullParameter(filterOptions, "filterOptions");
        this.f93586a = str;
        this.f93587b = flightSearchContext;
        this.f93588c = items;
        this.d = searchToken;
        this.e = filterOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightSearchResult)) {
            return false;
        }
        FlightSearchResult flightSearchResult = (FlightSearchResult) obj2;
        return Intrinsics.f(this.f93586a, flightSearchResult.f93586a) && Intrinsics.f(this.f93587b, flightSearchResult.f93587b) && this.f93588c.equals(flightSearchResult.f93588c) && Intrinsics.f(this.d, flightSearchResult.d) && Intrinsics.f(this.e, flightSearchResult.e);
    }

    public final int hashCode() {
        String str = this.f93586a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FlightSearchContext flightSearchContext = this.f93587b;
        return this.e.hashCode() + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f93588c, (iHashCode + (flightSearchContext != null ? flightSearchContext.hashCode() : 0)) * 31, 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93586a);
        FlightSearchContext flightSearchContext = this.f93587b;
        if (flightSearchContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flightSearchContext.writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.f93588c, dest);
        while (itY.hasNext()) {
            ((FlightSearchResultItem) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d);
        this.e.writeToParcel(dest, i);
    }
}
