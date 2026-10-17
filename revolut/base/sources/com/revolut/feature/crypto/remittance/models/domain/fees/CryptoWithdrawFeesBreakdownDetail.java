package com.revolut.feature.crypto.remittance.models.domain.fees;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/models/domain/fees/CryptoWithdrawFeesBreakdownDetail;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawFeesBreakdownDetail implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawFeesBreakdownDetail> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70992c;
    public final d d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWithdrawFeesBreakdownDetail(parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawFeesBreakdownDetail[i];
        }
    }

    public CryptoWithdrawFeesBreakdownDetail(String title, String description, String shortDescription, d amount, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f70990a = title;
        this.f70991b = description;
        this.f70992c = shortDescription;
        this.d = amount;
        this.e = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawFeesBreakdownDetail)) {
            return false;
        }
        CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) obj2;
        return Intrinsics.f(this.f70990a, cryptoWithdrawFeesBreakdownDetail.f70990a) && Intrinsics.f(this.f70991b, cryptoWithdrawFeesBreakdownDetail.f70991b) && Intrinsics.f(this.f70992c, cryptoWithdrawFeesBreakdownDetail.f70992c) && Intrinsics.f(this.d, cryptoWithdrawFeesBreakdownDetail.d) && Intrinsics.f(this.e, cryptoWithdrawFeesBreakdownDetail.e);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.c(this.f70990a.hashCode() * 31, 31, this.f70991b), 31, this.f70992c), 31, this.d);
        d dVar = this.e;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70990a);
        dest.writeString(this.f70991b);
        dest.writeString(this.f70992c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
