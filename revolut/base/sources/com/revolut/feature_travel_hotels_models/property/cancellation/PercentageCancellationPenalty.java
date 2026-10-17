package com.revolut.feature_travel_hotels_models.property.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/cancellation/PercentageCancellationPenalty;", "Lcom/revolut/feature_travel_hotels_models/property/cancellation/CancelPenalties;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PercentageCancellationPenalty extends CancelPenalties implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PercentageCancellationPenalty> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f98084a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PercentageCancellationPenalty(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PercentageCancellationPenalty[i];
        }
    }

    public PercentageCancellationPenalty(double d) {
        this.f98084a = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PercentageCancellationPenalty) && Double.compare(this.f98084a, ((PercentageCancellationPenalty) obj2).f98084a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f98084a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f98084a);
    }
}
