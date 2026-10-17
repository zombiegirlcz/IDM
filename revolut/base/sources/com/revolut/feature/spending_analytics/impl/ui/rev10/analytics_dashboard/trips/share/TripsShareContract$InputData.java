package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import h30.l;
import ip0.v7;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/share/TripsShareContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TripsShareContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TripsShareContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f87639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f87641c;
    public final TripsMapBitmapConfig d;
    public final int e;
    public final Set f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iD = 0;
            int iD2 = 0;
            while (iD2 != i) {
                iD2 = v7.d(parcel, linkedHashSet, iD2, 1);
            }
            String string = parcel.readString();
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            TripsMapBitmapConfig tripsMapBitmapConfig = (TripsMapBitmapConfig) parcel.readParcelable(TripsShareContract$InputData.class.getClassLoader());
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            while (iD != i3) {
                iD = v7.d(parcel, linkedHashSet2, iD, 1);
            }
            return new TripsShareContract$InputData(linkedHashSet, string, zonedDateTime, tripsMapBitmapConfig, i2, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TripsShareContract$InputData[i];
        }
    }

    public TripsShareContract$InputData(Set visitedCountries, String userName, ZonedDateTime joinDate, TripsMapBitmapConfig bitmapConfig, int i, Set allCountryCodes) {
        Intrinsics.checkNotNullParameter(visitedCountries, "visitedCountries");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(joinDate, "joinDate");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(allCountryCodes, "allCountryCodes");
        this.f87639a = visitedCountries;
        this.f87640b = userName;
        this.f87641c = joinDate;
        this.d = bitmapConfig;
        this.e = i;
        this.f = allCountryCodes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TripsShareContract$InputData)) {
            return false;
        }
        TripsShareContract$InputData tripsShareContract$InputData = (TripsShareContract$InputData) obj2;
        return Intrinsics.f(this.f87639a, tripsShareContract$InputData.f87639a) && Intrinsics.f(this.f87640b, tripsShareContract$InputData.f87640b) && Intrinsics.f(this.f87641c, tripsShareContract$InputData.f87641c) && Intrinsics.f(this.d, tripsShareContract$InputData.d) && this.e == tripsShareContract$InputData.e && Intrinsics.f(this.f, tripsShareContract$InputData.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.b(this.e, (this.d.hashCode() + l.h(this.f87641c, p.a.c(this.f87639a.hashCode() * 31, 31, this.f87640b), 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f87639a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeString(this.f87640b);
        dest.writeSerializable(this.f87641c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e);
        Iterator itV2 = n.v(this.f, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
    }
}
