package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPriceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPriceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPriceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberCheckoutFee f100401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberCheckoutFee f100402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberCheckoutFee f100403c;
    public final EsimPhoneNumberCheckoutUpdatedInvoice d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<EsimPhoneNumberCheckoutFee> creator = EsimPhoneNumberCheckoutFee.CREATOR;
            return new EsimPhoneNumberPriceBreakdown(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), creator.createFromParcel(parcel), EsimPhoneNumberCheckoutUpdatedInvoice.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPriceBreakdown[i];
        }
    }

    public EsimPhoneNumberPriceBreakdown(EsimPhoneNumberCheckoutFee phoneNumberFee, EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee, EsimPhoneNumberCheckoutFee paymentAmount, EsimPhoneNumberCheckoutUpdatedInvoice updatedInvoice) {
        Intrinsics.checkNotNullParameter(phoneNumberFee, "phoneNumberFee");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(updatedInvoice, "updatedInvoice");
        this.f100401a = phoneNumberFee;
        this.f100402b = esimPhoneNumberCheckoutFee;
        this.f100403c = paymentAmount;
        this.d = updatedInvoice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPriceBreakdown)) {
            return false;
        }
        EsimPhoneNumberPriceBreakdown esimPhoneNumberPriceBreakdown = (EsimPhoneNumberPriceBreakdown) obj2;
        return Intrinsics.f(this.f100401a, esimPhoneNumberPriceBreakdown.f100401a) && Intrinsics.f(this.f100402b, esimPhoneNumberPriceBreakdown.f100402b) && Intrinsics.f(this.f100403c, esimPhoneNumberPriceBreakdown.f100403c) && Intrinsics.f(this.d, esimPhoneNumberPriceBreakdown.d);
    }

    public final int hashCode() {
        int iHashCode = this.f100401a.hashCode() * 31;
        EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee = this.f100402b;
        return this.d.hashCode() + ((this.f100403c.hashCode() + ((iHashCode + (esimPhoneNumberCheckoutFee == null ? 0 : esimPhoneNumberCheckoutFee.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f100401a.writeToParcel(dest, i);
        EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee = this.f100402b;
        if (esimPhoneNumberCheckoutFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberCheckoutFee.writeToParcel(dest, i);
        }
        this.f100403c.writeToParcel(dest, i);
        this.d.writeToParcel(dest, i);
    }
}
