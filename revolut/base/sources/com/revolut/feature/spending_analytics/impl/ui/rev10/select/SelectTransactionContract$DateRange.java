package com.revolut.feature.spending_analytics.impl.ui.rev10.select;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$DateRange", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectTransactionContract$DateRange implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectTransactionContract$DateRange> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f87880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f87881b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectTransactionContract$DateRange((ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectTransactionContract$DateRange[i];
        }
    }

    public SelectTransactionContract$DateRange(ZonedDateTime startDate, ZonedDateTime endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f87880a = startDate;
        this.f87881b = endDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectTransactionContract$DateRange)) {
            return false;
        }
        SelectTransactionContract$DateRange selectTransactionContract$DateRange = (SelectTransactionContract$DateRange) obj2;
        return Intrinsics.f(this.f87880a, selectTransactionContract$DateRange.f87880a) && Intrinsics.f(this.f87881b, selectTransactionContract$DateRange.f87881b);
    }

    public final int hashCode() {
        return this.f87881b.hashCode() + (this.f87880a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f87880a);
        dest.writeSerializable(this.f87881b);
    }
}
