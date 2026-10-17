package com.revolut.feature_travel_hotels_models.property.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/cancellation/AmountAndPercentagePenalties;", "Lcom/revolut/feature_travel_hotels_models/property/cancellation/CancelPenalties;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AmountAndPercentagePenalties extends CancelPenalties implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AmountAndPercentagePenalties> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f98078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f98079b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmountAndPercentagePenalties(parcel.readDouble(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AmountAndPercentagePenalties[i];
        }
    }

    public AmountAndPercentagePenalties(double d, d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f98078a = amount;
        this.f98079b = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AmountAndPercentagePenalties)) {
            return false;
        }
        AmountAndPercentagePenalties amountAndPercentagePenalties = (AmountAndPercentagePenalties) obj2;
        return Intrinsics.f(this.f98078a, amountAndPercentagePenalties.f98078a) && Double.compare(this.f98079b, amountAndPercentagePenalties.f98079b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f98079b) + (this.f98078a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98078a);
        dest.writeDouble(this.f98079b);
    }
}
