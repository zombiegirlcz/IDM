package com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/screens/stats_filters/ScreenerStatsFiltersControllerContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerStatsFiltersControllerContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenerStatsFiltersControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f96275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerStatsGroup f96276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96277c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f fVarValueOf = f.valueOf(parcel.readString());
            ScreenerStatsGroup screenerStatsGroup = (ScreenerStatsGroup) parcel.readParcelable(ScreenerStatsFiltersControllerContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ScreenerStatsFiltersControllerContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ScreenerStatsFiltersControllerContract$InputData(fVarValueOf, screenerStatsGroup, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerStatsFiltersControllerContract$InputData[i];
        }
    }

    public ScreenerStatsFiltersControllerContract$InputData(f instrumentGroup, ScreenerStatsGroup statsGroup, List selectedFilters) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(statsGroup, "statsGroup");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f96275a = instrumentGroup;
        this.f96276b = statsGroup;
        this.f96277c = selectedFilters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerStatsFiltersControllerContract$InputData)) {
            return false;
        }
        ScreenerStatsFiltersControllerContract$InputData screenerStatsFiltersControllerContract$InputData = (ScreenerStatsFiltersControllerContract$InputData) obj2;
        return this.f96275a == screenerStatsFiltersControllerContract$InputData.f96275a && Intrinsics.f(this.f96276b, screenerStatsFiltersControllerContract$InputData.f96276b) && Intrinsics.f(this.f96277c, screenerStatsFiltersControllerContract$InputData.f96277c);
    }

    public final int hashCode() {
        return this.f96277c.hashCode() + ((this.f96276b.hashCode() + (this.f96275a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96275a.name());
        dest.writeParcelable(this.f96276b, i);
        Iterator itV = p.a.v(this.f96277c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
