package com.revolut.retail.feature.api.analytics_cycle.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/api/analytics_cycle/models/AnalyticsSpendingPeriod$Interval", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsSpendingPeriod$Interval implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AnalyticsSpendingPeriod$Interval> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f99210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f99211b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsSpendingPeriod$Interval((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsSpendingPeriod$Interval[i];
        }
    }

    public AnalyticsSpendingPeriod$Interval(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f99210a = startDate;
        this.f99211b = endDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsSpendingPeriod$Interval)) {
            return false;
        }
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = (AnalyticsSpendingPeriod$Interval) obj2;
        return Intrinsics.f(this.f99210a, analyticsSpendingPeriod$Interval.f99210a) && Intrinsics.f(this.f99211b, analyticsSpendingPeriod$Interval.f99211b);
    }

    public final int hashCode() {
        return this.f99211b.hashCode() + (this.f99210a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99210a);
        dest.writeSerializable(this.f99211b);
    }
}
