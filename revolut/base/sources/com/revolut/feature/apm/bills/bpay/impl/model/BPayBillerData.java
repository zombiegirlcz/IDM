package com.revolut.feature.apm.bills.bpay.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/model/BPayBillerData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayBillerData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BPayBillerData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61211c;
    public final String d;
    public final boolean e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BPayBillerData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayBillerData[i];
        }
    }

    public BPayBillerData(String billerName, String billerCode, String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(billerName, "billerName");
        Intrinsics.checkNotNullParameter(billerCode, "billerCode");
        this.f61209a = billerName;
        this.f61210b = billerCode;
        this.f61211c = str;
        this.d = str2;
        this.e = z;
        this.f = str3;
    }

    public static BPayBillerData a(BPayBillerData bPayBillerData, String str, String str2, int i) {
        String billerName = bPayBillerData.f61209a;
        String billerCode = bPayBillerData.f61210b;
        String str3 = bPayBillerData.f61211c;
        if ((i & 8) != 0) {
            str = bPayBillerData.d;
        }
        String str4 = str;
        boolean z = bPayBillerData.e;
        if ((i & 32) != 0) {
            str2 = bPayBillerData.f;
        }
        bPayBillerData.getClass();
        Intrinsics.checkNotNullParameter(billerName, "billerName");
        Intrinsics.checkNotNullParameter(billerCode, "billerCode");
        return new BPayBillerData(billerName, billerCode, str3, str4, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayBillerData)) {
            return false;
        }
        BPayBillerData bPayBillerData = (BPayBillerData) obj2;
        return Intrinsics.f(this.f61209a, bPayBillerData.f61209a) && Intrinsics.f(this.f61210b, bPayBillerData.f61210b) && Intrinsics.f(this.f61211c, bPayBillerData.f61211c) && Intrinsics.f(this.d, bPayBillerData.d) && this.e == bPayBillerData.e && Intrinsics.f(this.f, bPayBillerData.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f61209a.hashCode() * 31, 31, this.f61210b);
        String str = this.f61211c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iC2 = j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61209a);
        dest.writeString(this.f61210b);
        dest.writeString(this.f61211c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
    }
}
