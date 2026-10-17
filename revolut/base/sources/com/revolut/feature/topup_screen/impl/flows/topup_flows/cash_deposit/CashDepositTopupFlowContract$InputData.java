package com.revolut.feature.topup_screen.impl.flows.topup_flows.cash_deposit;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup_flows/cash_deposit/CashDepositTopupFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashDepositTopupFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashDepositTopupFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f90994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90995b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashDepositTopupFlowContract$InputData((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashDepositTopupFlowContract$InputData[i];
        }
    }

    public CashDepositTopupFlowContract$InputData(d amount, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f90994a = amount;
        this.f90995b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashDepositTopupFlowContract$InputData)) {
            return false;
        }
        CashDepositTopupFlowContract$InputData cashDepositTopupFlowContract$InputData = (CashDepositTopupFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90994a, cashDepositTopupFlowContract$InputData.f90994a) && Intrinsics.f(this.f90995b, cashDepositTopupFlowContract$InputData.f90995b);
    }

    public final int hashCode() {
        int iHashCode = this.f90994a.hashCode() * 31;
        String str = this.f90995b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90994a);
        dest.writeString(this.f90995b);
    }
}
