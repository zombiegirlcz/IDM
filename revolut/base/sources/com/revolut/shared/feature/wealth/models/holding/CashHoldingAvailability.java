package com.revolut.shared.feature.wealth.models.holding;

import android.os.Parcel;
import android.os.Parcelable;
import cfl.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/holding/CashHoldingAvailability;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashHoldingAvailability implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f105108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f105109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AllowedCashOperationsReason f105110c;

    @NotNull
    public static final Parcelable.Creator<CashHoldingAvailability> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashHoldingAvailability((kel.b) parcel.readSerializable(), c.valueOf(parcel.readString()), (AllowedCashOperationsReason) parcel.readParcelable(CashHoldingAvailability.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashHoldingAvailability[i];
        }
    }

    public CashHoldingAvailability(kel.b cashHolding, c allowedCashOperations, AllowedCashOperationsReason allowedCashOperationsReason) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
        this.f105108a = cashHolding;
        this.f105109b = allowedCashOperations;
        this.f105110c = allowedCashOperationsReason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashHoldingAvailability)) {
            return false;
        }
        CashHoldingAvailability cashHoldingAvailability = (CashHoldingAvailability) obj2;
        return Intrinsics.f(this.f105108a, cashHoldingAvailability.f105108a) && this.f105109b == cashHoldingAvailability.f105109b && Intrinsics.f(this.f105110c, cashHoldingAvailability.f105110c);
    }

    public final int hashCode() {
        int iHashCode = (this.f105109b.hashCode() + (this.f105108a.hashCode() * 31)) * 31;
        AllowedCashOperationsReason allowedCashOperationsReason = this.f105110c;
        return iHashCode + (allowedCashOperationsReason == null ? 0 : allowedCashOperationsReason.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105108a);
        dest.writeString(this.f105109b.name());
        dest.writeParcelable(this.f105110c, i);
    }
}
