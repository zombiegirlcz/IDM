package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/FuturePriceChange;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FuturePriceChange implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturePriceChange> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f75223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f75224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f75225c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturePriceChange((d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FuturePriceChange[i];
        }
    }

    public FuturePriceChange(d oldPrice, d newPrice, LocalDate nextPaymentDate) {
        Intrinsics.checkNotNullParameter(oldPrice, "oldPrice");
        Intrinsics.checkNotNullParameter(newPrice, "newPrice");
        Intrinsics.checkNotNullParameter(nextPaymentDate, "nextPaymentDate");
        this.f75223a = oldPrice;
        this.f75224b = newPrice;
        this.f75225c = nextPaymentDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FuturePriceChange)) {
            return false;
        }
        FuturePriceChange futurePriceChange = (FuturePriceChange) obj2;
        return Intrinsics.f(this.f75223a, futurePriceChange.f75223a) && Intrinsics.f(this.f75224b, futurePriceChange.f75224b) && Intrinsics.f(this.f75225c, futurePriceChange.f75225c);
    }

    public final int hashCode() {
        return this.f75225c.hashCode() + v7.c(this.f75223a.hashCode() * 31, 31, this.f75224b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f75223a);
        dest.writeSerializable(this.f75224b);
        dest.writeSerializable(this.f75225c);
    }
}
