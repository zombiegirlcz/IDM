package com.revolut.feature.cash_topup.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import b7l.b;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/api/models/BarcodeDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BarcodeDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BarcodeDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f65585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f65586c;
    public final d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f65588h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f65589j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BarcodeDetails(parcel.readString(), (DateTime) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()), parcel.readString(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BarcodeDetails[i];
        }
    }

    public BarcodeDetails(String id10, DateTime expiresAt, d amount, d fee2, String barcodeType, String barcodeValue, String str, b processor, String helpLink, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(barcodeType, "barcodeType");
        Intrinsics.checkNotNullParameter(barcodeValue, "barcodeValue");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(helpLink, "helpLink");
        this.f65584a = id10;
        this.f65585b = expiresAt;
        this.f65586c = amount;
        this.d = fee2;
        this.e = barcodeType;
        this.f = barcodeValue;
        this.f65587g = str;
        this.f65588h = processor;
        this.i = helpLink;
        this.f65589j = dateTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BarcodeDetails)) {
            return false;
        }
        BarcodeDetails barcodeDetails = (BarcodeDetails) obj2;
        return Intrinsics.f(this.f65584a, barcodeDetails.f65584a) && Intrinsics.f(this.f65585b, barcodeDetails.f65585b) && Intrinsics.f(this.f65586c, barcodeDetails.f65586c) && Intrinsics.f(this.d, barcodeDetails.d) && Intrinsics.f(this.e, barcodeDetails.e) && Intrinsics.f(this.f, barcodeDetails.f) && Intrinsics.f(this.f65587g, barcodeDetails.f65587g) && this.f65588h == barcodeDetails.f65588h && Intrinsics.f(this.i, barcodeDetails.i) && Intrinsics.f(this.f65589j, barcodeDetails.f65589j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(v7.c(v7.c(m72.b.f(this.f65585b, this.f65584a.hashCode() * 31, 31), 31, this.f65586c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f65587g;
        int iC2 = p.a.c((this.f65588h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.i);
        DateTime dateTime = this.f65589j;
        return iC2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65584a);
        dest.writeSerializable(this.f65585b);
        dest.writeSerializable(this.f65586c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f65587g);
        dest.writeString(this.f65588h.name());
        dest.writeString(this.i);
        dest.writeSerializable(this.f65589j);
    }
}
