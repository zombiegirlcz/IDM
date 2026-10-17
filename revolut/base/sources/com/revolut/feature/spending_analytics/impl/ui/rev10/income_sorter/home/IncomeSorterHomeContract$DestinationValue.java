package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/home/IncomeSorterHomeContract$DestinationValue", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterHomeContract$DestinationValue implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterHomeContract$DestinationValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorterDestinationInfo f87825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f87826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncomeSorterDestinationId f87827c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncomeSorterHomeContract$DestinationValue((IncomeSorterDestinationInfo) parcel.readParcelable(IncomeSorterHomeContract$DestinationValue.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterHomeContract$DestinationValue[i];
        }
    }

    public IncomeSorterHomeContract$DestinationValue(IncomeSorterDestinationInfo destinationInfo, d value) {
        Intrinsics.checkNotNullParameter(destinationInfo, "destinationInfo");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87825a = destinationInfo;
        this.f87826b = value;
        this.f87827c = destinationInfo.getId();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorterHomeContract$DestinationValue)) {
            return false;
        }
        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = (IncomeSorterHomeContract$DestinationValue) obj2;
        return Intrinsics.f(this.f87825a, incomeSorterHomeContract$DestinationValue.f87825a) && Intrinsics.f(this.f87826b, incomeSorterHomeContract$DestinationValue.f87826b);
    }

    public final int hashCode() {
        return this.f87826b.hashCode() + (this.f87825a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87825a, i);
        dest.writeSerializable(this.f87826b);
    }
}
