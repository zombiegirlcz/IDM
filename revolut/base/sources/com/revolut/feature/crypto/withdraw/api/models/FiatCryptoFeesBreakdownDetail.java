package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/FiatCryptoFeesBreakdownDetail;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FiatCryptoFeesBreakdownDetail implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatCryptoFeesBreakdownDetail> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71111c;
    public final FiatCryptoMoney d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatCryptoFeesBreakdownDetail(parcel.readString(), parcel.readString(), parcel.readString(), FiatCryptoMoney.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FiatCryptoFeesBreakdownDetail[i];
        }
    }

    public FiatCryptoFeesBreakdownDetail(String title, String description, String shortDescription, FiatCryptoMoney amount, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f71109a = title;
        this.f71110b = description;
        this.f71111c = shortDescription;
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
        if (!(obj2 instanceof FiatCryptoFeesBreakdownDetail)) {
            return false;
        }
        FiatCryptoFeesBreakdownDetail fiatCryptoFeesBreakdownDetail = (FiatCryptoFeesBreakdownDetail) obj2;
        return Intrinsics.f(this.f71109a, fiatCryptoFeesBreakdownDetail.f71109a) && Intrinsics.f(this.f71110b, fiatCryptoFeesBreakdownDetail.f71110b) && Intrinsics.f(this.f71111c, fiatCryptoFeesBreakdownDetail.f71111c) && Intrinsics.f(this.d, fiatCryptoFeesBreakdownDetail.d) && Intrinsics.f(this.e, fiatCryptoFeesBreakdownDetail.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f71109a.hashCode() * 31, 31, this.f71110b), 31, this.f71111c)) * 31;
        d dVar = this.e;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71109a);
        dest.writeString(this.f71110b);
        dest.writeString(this.f71111c);
        this.d.writeToParcel(dest, i);
        dest.writeSerializable(this.e);
    }
}
