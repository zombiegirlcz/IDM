package com.revolut.feature.apm.aani.impl.pending_actions;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/pending_actions/AaniMerchantPendingPayment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AaniMerchantPendingPayment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AaniMerchantPendingPayment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61125c;
    public final d d;
    public final long e;
    public final long f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AaniMerchantPendingPayment(parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AaniMerchantPendingPayment[i];
        }
    }

    public AaniMerchantPendingPayment(String id10, String merchantName, String str, d amount, long j2, long j3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f61123a = id10;
        this.f61124b = merchantName;
        this.f61125c = str;
        this.d = amount;
        this.e = j2;
        this.f = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AaniMerchantPendingPayment)) {
            return false;
        }
        AaniMerchantPendingPayment aaniMerchantPendingPayment = (AaniMerchantPendingPayment) obj2;
        return Intrinsics.f(this.f61123a, aaniMerchantPendingPayment.f61123a) && Intrinsics.f(this.f61124b, aaniMerchantPendingPayment.f61124b) && Intrinsics.f(this.f61125c, aaniMerchantPendingPayment.f61125c) && Intrinsics.f(this.d, aaniMerchantPendingPayment.d) && this.e == aaniMerchantPendingPayment.e && this.f == aaniMerchantPendingPayment.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f61123a.hashCode() * 31, 31, this.f61124b);
        String str = this.f61125c;
        return Long.hashCode(this.f) + a0.d.c(v7.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61123a);
        dest.writeString(this.f61124b);
        dest.writeString(this.f61125c);
        dest.writeSerializable(this.d);
        dest.writeLong(this.e);
        dest.writeLong(this.f);
    }
}
