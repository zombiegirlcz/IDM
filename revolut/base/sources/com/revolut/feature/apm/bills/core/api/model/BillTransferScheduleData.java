package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillTransferScheduleData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillTransferScheduleData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillTransferScheduleData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillTransferType f61346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61347c;
    public final d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61348g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillTransferScheduleData(parcel.readString(), BillTransferType.CREATOR.createFromParcel(parcel), parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillTransferScheduleData[i];
        }
    }

    public BillTransferScheduleData(String paymentMethod, BillTransferType type, String str, d amount, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f61345a = paymentMethod;
        this.f61346b = type;
        this.f61347c = str;
        this.d = amount;
        this.e = str2;
        this.f = str3;
        this.f61348g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillTransferScheduleData)) {
            return false;
        }
        BillTransferScheduleData billTransferScheduleData = (BillTransferScheduleData) obj2;
        return Intrinsics.f(this.f61345a, billTransferScheduleData.f61345a) && this.f61346b == billTransferScheduleData.f61346b && Intrinsics.f(this.f61347c, billTransferScheduleData.f61347c) && Intrinsics.f(this.d, billTransferScheduleData.d) && Intrinsics.f(this.e, billTransferScheduleData.e) && Intrinsics.f(this.f, billTransferScheduleData.f) && Intrinsics.f(this.f61348g, billTransferScheduleData.f61348g);
    }

    public final int hashCode() {
        int iHashCode = (this.f61346b.hashCode() + (this.f61345a.hashCode() * 31)) * 31;
        String str = this.f61347c;
        int iC = v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61348g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61345a);
        this.f61346b.writeToParcel(dest, i);
        dest.writeString(this.f61347c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f61348g);
    }
}
