package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeDecodeData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCodeDecodeData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCodeDecodeData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeImplementation f80446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80447c;
    public final PixQrCodeAmount d;
    public final PixQrCodeCreditor e;
    public final PixQrCodeWithdrawal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PixQrCodeChange f80448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PixQrCodeBill f80449h;
    public final PixQrCodeReferences i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f80450j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f80451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PixAuthorisationFrequency f80452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PixQrCodeRetryPolicy f80453n;
    public final PixQrCodeDebtor o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f80454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f80455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PixQrCodeAmount f80456r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PixQrCodeDataDetails f80457s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PixQrCodeDataDetails f80458t;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PixQrCodeImplementation pixQrCodeImplementation;
            PixQrCodeDebtor pixQrCodeDebtorCreateFromParcel;
            PixQrCodeDebtor pixQrCodeDebtor;
            PixQrCodeAmount pixQrCodeAmountCreateFromParcel;
            PixQrCodeAmount pixQrCodeAmount;
            PixQrCodeDataDetails pixQrCodeDataDetailsCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            PixQrCodeImplementation pixQrCodeImplementationCreateFromParcel = parcel.readInt() == 0 ? null : PixQrCodeImplementation.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            PixQrCodeAmount pixQrCodeAmountCreateFromParcel2 = parcel.readInt() == 0 ? null : PixQrCodeAmount.CREATOR.createFromParcel(parcel);
            PixQrCodeCreditor pixQrCodeCreditorCreateFromParcel = parcel.readInt() == 0 ? null : PixQrCodeCreditor.CREATOR.createFromParcel(parcel);
            PixQrCodeWithdrawal pixQrCodeWithdrawalCreateFromParcel = parcel.readInt() == 0 ? null : PixQrCodeWithdrawal.CREATOR.createFromParcel(parcel);
            PixQrCodeChange pixQrCodeChangeCreateFromParcel = parcel.readInt() == 0 ? null : PixQrCodeChange.CREATOR.createFromParcel(parcel);
            PixQrCodeBill pixQrCodeBillCreateFromParcel = parcel.readInt() == 0 ? null : PixQrCodeBill.CREATOR.createFromParcel(parcel);
            PixQrCodeReferences pixQrCodeReferencesCreateFromParcel = parcel.readInt() == 0 ? null : PixQrCodeReferences.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            PixAuthorisationFrequency pixAuthorisationFrequencyCreateFromParcel = parcel.readInt() == 0 ? null : PixAuthorisationFrequency.CREATOR.createFromParcel(parcel);
            PixQrCodeRetryPolicy pixQrCodeRetryPolicyCreateFromParcel = parcel.readInt() == 0 ? null : PixQrCodeRetryPolicy.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                pixQrCodeImplementation = pixQrCodeImplementationCreateFromParcel;
                pixQrCodeDebtorCreateFromParcel = null;
            } else {
                pixQrCodeImplementation = pixQrCodeImplementationCreateFromParcel;
                pixQrCodeDebtorCreateFromParcel = PixQrCodeDebtor.CREATOR.createFromParcel(parcel);
            }
            PixQrCodeDebtor pixQrCodeDebtor2 = pixQrCodeDebtorCreateFromParcel;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                pixQrCodeDebtor = pixQrCodeDebtor2;
                pixQrCodeAmountCreateFromParcel = null;
            } else {
                pixQrCodeDebtor = pixQrCodeDebtor2;
                pixQrCodeAmountCreateFromParcel = PixQrCodeAmount.CREATOR.createFromParcel(parcel);
            }
            PixQrCodeAmount pixQrCodeAmount2 = pixQrCodeAmountCreateFromParcel;
            if (parcel.readInt() == 0) {
                pixQrCodeAmount = pixQrCodeAmount2;
                pixQrCodeDataDetailsCreateFromParcel = null;
            } else {
                pixQrCodeAmount = pixQrCodeAmount2;
                pixQrCodeDataDetailsCreateFromParcel = PixQrCodeDataDetails.CREATOR.createFromParcel(parcel);
            }
            return new PixQrCodeDecodeData(string, pixQrCodeImplementation, string2, pixQrCodeAmountCreateFromParcel2, pixQrCodeCreditorCreateFromParcel, pixQrCodeWithdrawalCreateFromParcel, pixQrCodeChangeCreateFromParcel, pixQrCodeBillCreateFromParcel, pixQrCodeReferencesCreateFromParcel, string3, string4, string5, pixAuthorisationFrequencyCreateFromParcel, pixQrCodeRetryPolicyCreateFromParcel, pixQrCodeDebtor, string6, string7, pixQrCodeAmount, pixQrCodeDataDetailsCreateFromParcel, parcel.readInt() == 0 ? null : PixQrCodeDataDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeDecodeData[i];
        }
    }

    public PixQrCodeDecodeData(String str, PixQrCodeImplementation pixQrCodeImplementation, String str2, PixQrCodeAmount pixQrCodeAmount, PixQrCodeCreditor pixQrCodeCreditor, PixQrCodeWithdrawal pixQrCodeWithdrawal, PixQrCodeChange pixQrCodeChange, PixQrCodeBill pixQrCodeBill, PixQrCodeReferences pixQrCodeReferences, String str3, String str4, String str5, PixAuthorisationFrequency pixAuthorisationFrequency, PixQrCodeRetryPolicy pixQrCodeRetryPolicy, PixQrCodeDebtor pixQrCodeDebtor, String str6, String str7, PixQrCodeAmount pixQrCodeAmount2, PixQrCodeDataDetails pixQrCodeDataDetails, PixQrCodeDataDetails pixQrCodeDataDetails2) {
        this.f80445a = str;
        this.f80446b = pixQrCodeImplementation;
        this.f80447c = str2;
        this.d = pixQrCodeAmount;
        this.e = pixQrCodeCreditor;
        this.f = pixQrCodeWithdrawal;
        this.f80448g = pixQrCodeChange;
        this.f80449h = pixQrCodeBill;
        this.i = pixQrCodeReferences;
        this.f80450j = str3;
        this.k = str4;
        this.f80451l = str5;
        this.f80452m = pixAuthorisationFrequency;
        this.f80453n = pixQrCodeRetryPolicy;
        this.o = pixQrCodeDebtor;
        this.f80454p = str6;
        this.f80455q = str7;
        this.f80456r = pixQrCodeAmount2;
        this.f80457s = pixQrCodeDataDetails;
        this.f80458t = pixQrCodeDataDetails2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrCodeDecodeData)) {
            return false;
        }
        PixQrCodeDecodeData pixQrCodeDecodeData = (PixQrCodeDecodeData) obj2;
        return Intrinsics.f(this.f80445a, pixQrCodeDecodeData.f80445a) && this.f80446b == pixQrCodeDecodeData.f80446b && Intrinsics.f(this.f80447c, pixQrCodeDecodeData.f80447c) && Intrinsics.f(this.d, pixQrCodeDecodeData.d) && Intrinsics.f(this.e, pixQrCodeDecodeData.e) && Intrinsics.f(this.f, pixQrCodeDecodeData.f) && Intrinsics.f(this.f80448g, pixQrCodeDecodeData.f80448g) && Intrinsics.f(this.f80449h, pixQrCodeDecodeData.f80449h) && Intrinsics.f(this.i, pixQrCodeDecodeData.i) && Intrinsics.f(this.f80450j, pixQrCodeDecodeData.f80450j) && Intrinsics.f(this.k, pixQrCodeDecodeData.k) && Intrinsics.f(this.f80451l, pixQrCodeDecodeData.f80451l) && this.f80452m == pixQrCodeDecodeData.f80452m && this.f80453n == pixQrCodeDecodeData.f80453n && Intrinsics.f(this.o, pixQrCodeDecodeData.o) && Intrinsics.f(this.f80454p, pixQrCodeDecodeData.f80454p) && Intrinsics.f(this.f80455q, pixQrCodeDecodeData.f80455q) && Intrinsics.f(this.f80456r, pixQrCodeDecodeData.f80456r) && Intrinsics.f(this.f80457s, pixQrCodeDecodeData.f80457s) && Intrinsics.f(this.f80458t, pixQrCodeDecodeData.f80458t);
    }

    public final int hashCode() {
        String str = this.f80445a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PixQrCodeImplementation pixQrCodeImplementation = this.f80446b;
        int iHashCode2 = (iHashCode + (pixQrCodeImplementation == null ? 0 : pixQrCodeImplementation.hashCode())) * 31;
        String str2 = this.f80447c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PixQrCodeAmount pixQrCodeAmount = this.d;
        int iHashCode4 = (iHashCode3 + (pixQrCodeAmount == null ? 0 : pixQrCodeAmount.hashCode())) * 31;
        PixQrCodeCreditor pixQrCodeCreditor = this.e;
        int iHashCode5 = (iHashCode4 + (pixQrCodeCreditor == null ? 0 : pixQrCodeCreditor.hashCode())) * 31;
        PixQrCodeWithdrawal pixQrCodeWithdrawal = this.f;
        int iHashCode6 = (iHashCode5 + (pixQrCodeWithdrawal == null ? 0 : pixQrCodeWithdrawal.hashCode())) * 31;
        PixQrCodeChange pixQrCodeChange = this.f80448g;
        int iHashCode7 = (iHashCode6 + (pixQrCodeChange == null ? 0 : pixQrCodeChange.hashCode())) * 31;
        PixQrCodeBill pixQrCodeBill = this.f80449h;
        int iHashCode8 = (iHashCode7 + (pixQrCodeBill == null ? 0 : pixQrCodeBill.hashCode())) * 31;
        PixQrCodeReferences pixQrCodeReferences = this.i;
        int iHashCode9 = (iHashCode8 + (pixQrCodeReferences == null ? 0 : pixQrCodeReferences.hashCode())) * 31;
        String str3 = this.f80450j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f80451l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PixAuthorisationFrequency pixAuthorisationFrequency = this.f80452m;
        int iHashCode13 = (iHashCode12 + (pixAuthorisationFrequency == null ? 0 : pixAuthorisationFrequency.hashCode())) * 31;
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy = this.f80453n;
        int iHashCode14 = (iHashCode13 + (pixQrCodeRetryPolicy == null ? 0 : pixQrCodeRetryPolicy.hashCode())) * 31;
        PixQrCodeDebtor pixQrCodeDebtor = this.o;
        int iHashCode15 = (iHashCode14 + (pixQrCodeDebtor == null ? 0 : pixQrCodeDebtor.hashCode())) * 31;
        String str6 = this.f80454p;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f80455q;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PixQrCodeAmount pixQrCodeAmount2 = this.f80456r;
        int iHashCode18 = (iHashCode17 + (pixQrCodeAmount2 == null ? 0 : pixQrCodeAmount2.hashCode())) * 31;
        PixQrCodeDataDetails pixQrCodeDataDetails = this.f80457s;
        int iHashCode19 = (iHashCode18 + (pixQrCodeDataDetails == null ? 0 : pixQrCodeDataDetails.hashCode())) * 31;
        PixQrCodeDataDetails pixQrCodeDataDetails2 = this.f80458t;
        return iHashCode19 + (pixQrCodeDataDetails2 != null ? pixQrCodeDataDetails2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80445a);
        PixQrCodeImplementation pixQrCodeImplementation = this.f80446b;
        if (pixQrCodeImplementation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeImplementation.writeToParcel(dest, i);
        }
        dest.writeString(this.f80447c);
        PixQrCodeAmount pixQrCodeAmount = this.d;
        if (pixQrCodeAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeAmount.writeToParcel(dest, i);
        }
        PixQrCodeCreditor pixQrCodeCreditor = this.e;
        if (pixQrCodeCreditor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeCreditor.writeToParcel(dest, i);
        }
        PixQrCodeWithdrawal pixQrCodeWithdrawal = this.f;
        if (pixQrCodeWithdrawal == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeWithdrawal.writeToParcel(dest, i);
        }
        PixQrCodeChange pixQrCodeChange = this.f80448g;
        if (pixQrCodeChange == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeChange.writeToParcel(dest, i);
        }
        PixQrCodeBill pixQrCodeBill = this.f80449h;
        if (pixQrCodeBill == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeBill.writeToParcel(dest, i);
        }
        PixQrCodeReferences pixQrCodeReferences = this.i;
        if (pixQrCodeReferences == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeReferences.writeToParcel(dest, i);
        }
        dest.writeString(this.f80450j);
        dest.writeString(this.k);
        dest.writeString(this.f80451l);
        PixAuthorisationFrequency pixAuthorisationFrequency = this.f80452m;
        if (pixAuthorisationFrequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixAuthorisationFrequency.writeToParcel(dest, i);
        }
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy = this.f80453n;
        if (pixQrCodeRetryPolicy == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeRetryPolicy.writeToParcel(dest, i);
        }
        PixQrCodeDebtor pixQrCodeDebtor = this.o;
        if (pixQrCodeDebtor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeDebtor.writeToParcel(dest, i);
        }
        dest.writeString(this.f80454p);
        dest.writeString(this.f80455q);
        PixQrCodeAmount pixQrCodeAmount2 = this.f80456r;
        if (pixQrCodeAmount2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeAmount2.writeToParcel(dest, i);
        }
        PixQrCodeDataDetails pixQrCodeDataDetails = this.f80457s;
        if (pixQrCodeDataDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeDataDetails.writeToParcel(dest, i);
        }
        PixQrCodeDataDetails pixQrCodeDataDetails2 = this.f80458t;
        if (pixQrCodeDataDetails2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pixQrCodeDataDetails2.writeToParcel(dest, i);
        }
    }
}
