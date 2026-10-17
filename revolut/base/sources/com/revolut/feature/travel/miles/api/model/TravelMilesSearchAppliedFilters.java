package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchAppliedFilters;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesSearchAppliedFilters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesSearchAppliedFilters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f94125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f94126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelMilesNumberRangeFilter f94127c;
    public final TravelMilesMoneyRangeFilter d;
    public final Set e;
    public final Set f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = o.a(parcel, linkedHashSet, iA2, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = o.a(parcel, linkedHashSet2, iA3, 1);
            }
            TravelMilesNumberRangeFilter travelMilesNumberRangeFilterCreateFromParcel = parcel.readInt() == 0 ? null : TravelMilesNumberRangeFilter.CREATOR.createFromParcel(parcel);
            TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilterCreateFromParcel = parcel.readInt() != 0 ? TravelMilesMoneyRangeFilter.CREATOR.createFromParcel(parcel) : null;
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
            int iA4 = 0;
            while (iA4 != i3) {
                iA4 = o.a(parcel, linkedHashSet3, iA4, 1);
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet(i5);
            while (iA != i5) {
                iA = o.a(parcel, linkedHashSet4, iA, 1);
            }
            return new TravelMilesSearchAppliedFilters(linkedHashSet, linkedHashSet2, travelMilesNumberRangeFilterCreateFromParcel, travelMilesMoneyRangeFilterCreateFromParcel, linkedHashSet3, linkedHashSet4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesSearchAppliedFilters[i];
        }
    }

    public TravelMilesSearchAppliedFilters() {
        this(0);
    }

    public static TravelMilesSearchAppliedFilters a(TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, TravelMilesNumberRangeFilter travelMilesNumberRangeFilter, TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter, Set set, Set set2, int i) {
        Set set3 = linkedHashSet;
        if ((i & 1) != 0) {
            set3 = travelMilesSearchAppliedFilters.f94125a;
        }
        Set numberOfStops = set3;
        Set set4 = linkedHashSet2;
        if ((i & 2) != 0) {
            set4 = travelMilesSearchAppliedFilters.f94126b;
        }
        Set cabin = set4;
        if ((i & 4) != 0) {
            travelMilesNumberRangeFilter = travelMilesSearchAppliedFilters.f94127c;
        }
        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter2 = travelMilesNumberRangeFilter;
        if ((i & 8) != 0) {
            travelMilesMoneyRangeFilter = travelMilesSearchAppliedFilters.d;
        }
        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter2 = travelMilesMoneyRangeFilter;
        if ((i & 16) != 0) {
            set = travelMilesSearchAppliedFilters.e;
        }
        Set airlines = set;
        if ((i & 32) != 0) {
            set2 = travelMilesSearchAppliedFilters.f;
        }
        Set milesProgrammes = set2;
        travelMilesSearchAppliedFilters.getClass();
        Intrinsics.checkNotNullParameter(numberOfStops, "numberOfStops");
        Intrinsics.checkNotNullParameter(cabin, "cabin");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(milesProgrammes, "milesProgrammes");
        return new TravelMilesSearchAppliedFilters(numberOfStops, cabin, travelMilesNumberRangeFilter2, travelMilesMoneyRangeFilter2, airlines, milesProgrammes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesSearchAppliedFilters)) {
            return false;
        }
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = (TravelMilesSearchAppliedFilters) obj2;
        return Intrinsics.f(this.f94125a, travelMilesSearchAppliedFilters.f94125a) && Intrinsics.f(this.f94126b, travelMilesSearchAppliedFilters.f94126b) && Intrinsics.f(this.f94127c, travelMilesSearchAppliedFilters.f94127c) && Intrinsics.f(this.d, travelMilesSearchAppliedFilters.d) && Intrinsics.f(this.e, travelMilesSearchAppliedFilters.e) && Intrinsics.f(this.f, travelMilesSearchAppliedFilters.f);
    }

    public final int hashCode() {
        int iF = p.a.f(this.f94125a.hashCode() * 31, 31, this.f94126b);
        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = this.f94127c;
        int iHashCode = (iF + (travelMilesNumberRangeFilter == null ? 0 : travelMilesNumberRangeFilter.hashCode())) * 31;
        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = this.d;
        return this.f.hashCode() + p.a.f((iHashCode + (travelMilesMoneyRangeFilter != null ? travelMilesMoneyRangeFilter.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f94125a, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        Iterator itV2 = n.v(this.f94126b, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = this.f94127c;
        if (travelMilesNumberRangeFilter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelMilesNumberRangeFilter.writeToParcel(dest, i);
        }
        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = this.d;
        if (travelMilesMoneyRangeFilter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelMilesMoneyRangeFilter.writeToParcel(dest, i);
        }
        Iterator itV3 = n.v(this.e, dest);
        while (itV3.hasNext()) {
            dest.writeString((String) itV3.next());
        }
        Iterator itV4 = n.v(this.f, dest);
        while (itV4.hasNext()) {
            dest.writeString((String) itV4.next());
        }
    }

    public TravelMilesSearchAppliedFilters(Set numberOfStops, Set cabin, TravelMilesNumberRangeFilter travelMilesNumberRangeFilter, TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter, Set airlines, Set milesProgrammes) {
        Intrinsics.checkNotNullParameter(numberOfStops, "numberOfStops");
        Intrinsics.checkNotNullParameter(cabin, "cabin");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(milesProgrammes, "milesProgrammes");
        this.f94125a = numberOfStops;
        this.f94126b = cabin;
        this.f94127c = travelMilesNumberRangeFilter;
        this.d = travelMilesMoneyRangeFilter;
        this.e = airlines;
        this.f = milesProgrammes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TravelMilesSearchAppliedFilters(int i) {
        h0 h0Var = h0.f322473a;
        this(h0Var, h0Var, null, null, h0Var, h0Var);
    }
}
