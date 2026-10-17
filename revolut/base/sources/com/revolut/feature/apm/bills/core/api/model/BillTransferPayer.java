package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillTransferPayer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillTransferPayer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillTransferPayer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillTransferPayerType f61342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61343c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillTransferPayer(parcel.readString(), parcel.readInt() == 0 ? null : BillTransferPayerType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillTransferPayer[i];
        }
    }

    public BillTransferPayer(String str, BillTransferPayerType billTransferPayerType, String str2) {
        this.f61341a = str;
        this.f61342b = billTransferPayerType;
        this.f61343c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillTransferPayer)) {
            return false;
        }
        BillTransferPayer billTransferPayer = (BillTransferPayer) obj2;
        return Intrinsics.f(this.f61341a, billTransferPayer.f61341a) && this.f61342b == billTransferPayer.f61342b && Intrinsics.f(this.f61343c, billTransferPayer.f61343c);
    }

    public final int hashCode() {
        String str = this.f61341a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BillTransferPayerType billTransferPayerType = this.f61342b;
        int iHashCode2 = (iHashCode + (billTransferPayerType == null ? 0 : billTransferPayerType.hashCode())) * 31;
        String str2 = this.f61343c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61341a);
        BillTransferPayerType billTransferPayerType = this.f61342b;
        if (billTransferPayerType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billTransferPayerType.writeToParcel(dest, i);
        }
        dest.writeString(this.f61343c);
    }
}
