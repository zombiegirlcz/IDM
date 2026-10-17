package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeDataDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeDataDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeDataDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeImplementation f80435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PixQrCodeAmount f80436c;
    public final PixQrCodeCreditor d;
    public final PixQrCodeBill e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f80437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f80438h;
    public final PixAuthorisationFrequency i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PixQrCodeRetryPolicy f80439j;
    public final PixQrCodeDebtor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f80440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f80441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PixQrCodeAmount f80442n;
    public final String o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrCodeDataDetails(parcel.readString(), parcel.readInt() == 0 ? null : PixQrCodeImplementation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PixQrCodeAmount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PixQrCodeCreditor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PixQrCodeBill.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PixAuthorisationFrequency.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PixQrCodeRetryPolicy.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PixQrCodeDebtor.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PixQrCodeAmount.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeDataDetails[i];
        }
    }

    public PixQrCodeDataDetails(String str, PixQrCodeImplementation pixQrCodeImplementation, PixQrCodeAmount pixQrCodeAmount, PixQrCodeCreditor pixQrCodeCreditor, PixQrCodeBill pixQrCodeBill, String str2, String str3, String str4, PixAuthorisationFrequency pixAuthorisationFrequency, PixQrCodeRetryPolicy pixQrCodeRetryPolicy, PixQrCodeDebtor pixQrCodeDebtor, String str5, String str6, PixQrCodeAmount pixQrCodeAmount2, String str7) {
        this.f80434a = str;
        this.f80435b = pixQrCodeImplementation;
        this.f80436c = pixQrCodeAmount;
        this.d = pixQrCodeCreditor;
        this.e = pixQrCodeBill;
        this.f = str2;
        this.f80437g = str3;
        this.f80438h = str4;
        this.i = pixAuthorisationFrequency;
        this.f80439j = pixQrCodeRetryPolicy;
        this.k = pixQrCodeDebtor;
        this.f80440l = str5;
        this.f80441m = str6;
        this.f80442n = pixQrCodeAmount2;
        this.o = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeDataDetails)) {
            return false;
        }
        PixQrCodeDataDetails pixQrCodeDataDetails = (PixQrCodeDataDetails) obj2;
        return Intrinsics.f(this.f80434a, pixQrCodeDataDetails.f80434a) && this.f80435b == pixQrCodeDataDetails.f80435b && Intrinsics.f(this.f80436c, pixQrCodeDataDetails.f80436c) && Intrinsics.f(this.d, pixQrCodeDataDetails.d) && Intrinsics.f(this.e, pixQrCodeDataDetails.e) && Intrinsics.f(this.f, pixQrCodeDataDetails.f) && Intrinsics.f(this.f80437g, pixQrCodeDataDetails.f80437g) && Intrinsics.f(this.f80438h, pixQrCodeDataDetails.f80438h) && this.i == pixQrCodeDataDetails.i && this.f80439j == pixQrCodeDataDetails.f80439j && Intrinsics.f(this.k, pixQrCodeDataDetails.k) && Intrinsics.f(this.f80440l, pixQrCodeDataDetails.f80440l) && Intrinsics.f(this.f80441m, pixQrCodeDataDetails.f80441m) && Intrinsics.f(this.f80442n, pixQrCodeDataDetails.f80442n) && Intrinsics.f(this.o, pixQrCodeDataDetails.o);
    }

    public final int hashCode() {
        String str = this.f80434a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PixQrCodeImplementation pixQrCodeImplementation = this.f80435b;
        int iHashCode2 = (iHashCode + (pixQrCodeImplementation == null ? 0 : pixQrCodeImplementation.hashCode())) * 31;
        PixQrCodeAmount pixQrCodeAmount = this.f80436c;
        int iHashCode3 = (iHashCode2 + (pixQrCodeAmount == null ? 0 : pixQrCodeAmount.hashCode())) * 31;
        PixQrCodeCreditor pixQrCodeCreditor = this.d;
        int iHashCode4 = (iHashCode3 + (pixQrCodeCreditor == null ? 0 : pixQrCodeCreditor.hashCode())) * 31;
        PixQrCodeBill pixQrCodeBill = this.e;
        int iHashCode5 = (iHashCode4 + (pixQrCodeBill == null ? 0 : pixQrCodeBill.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80437g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f80438h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PixAuthorisationFrequency pixAuthorisationFrequency = this.i;
        int iHashCode9 = (iHashCode8 + (pixAuthorisationFrequency == null ? 0 : pixAuthorisationFrequency.hashCode())) * 31;
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy = this.f80439j;
        int iHashCode10 = (iHashCode9 + (pixQrCodeRetryPolicy == null ? 0 : pixQrCodeRetryPolicy.hashCode())) * 31;
        PixQrCodeDebtor pixQrCodeDebtor = this.k;
        int iHashCode11 = (iHashCode10 + (pixQrCodeDebtor == null ? 0 : pixQrCodeDebtor.hashCode())) * 31;
        String str5 = this.f80440l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f80441m;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PixQrCodeAmount pixQrCodeAmount2 = this.f80442n;
        int iHashCode14 = (iHashCode13 + (pixQrCodeAmount2 == null ? 0 : pixQrCodeAmount2.hashCode())) * 31;
        String str7 = this.o;
        return iHashCode14 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80434a);
        PixQrCodeImplementation pixQrCodeImplementation = this.f80435b;
        if (pixQrCodeImplementation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeImplementation.writeToParcel(dest, i);
        }
        PixQrCodeAmount pixQrCodeAmount = this.f80436c;
        if (pixQrCodeAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeAmount.writeToParcel(dest, i);
        }
        PixQrCodeCreditor pixQrCodeCreditor = this.d;
        if (pixQrCodeCreditor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeCreditor.writeToParcel(dest, i);
        }
        PixQrCodeBill pixQrCodeBill = this.e;
        if (pixQrCodeBill == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeBill.writeToParcel(dest, i);
        }
        dest.writeString(this.f);
        dest.writeString(this.f80437g);
        dest.writeString(this.f80438h);
        PixAuthorisationFrequency pixAuthorisationFrequency = this.i;
        if (pixAuthorisationFrequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixAuthorisationFrequency.writeToParcel(dest, i);
        }
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy = this.f80439j;
        if (pixQrCodeRetryPolicy == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeRetryPolicy.writeToParcel(dest, i);
        }
        PixQrCodeDebtor pixQrCodeDebtor = this.k;
        if (pixQrCodeDebtor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeDebtor.writeToParcel(dest, i);
        }
        dest.writeString(this.f80440l);
        dest.writeString(this.f80441m);
        PixQrCodeAmount pixQrCodeAmount2 = this.f80442n;
        if (pixQrCodeAmount2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeAmount2.writeToParcel(dest, i);
        }
        dest.writeString(this.o);
    }
}
