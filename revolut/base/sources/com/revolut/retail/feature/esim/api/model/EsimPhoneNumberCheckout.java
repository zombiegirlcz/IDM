package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberCheckout;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberCheckout implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberCheckout> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimTerms f100319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100320c;
    public final EsimPhoneNumberPriceBreakdown d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberCheckout(parcel.readString(), EsimTerms.CREATOR.createFromParcel(parcel), parcel.readString(), EsimPhoneNumberPriceBreakdown.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberCheckout[i];
        }
    }

    public EsimPhoneNumberCheckout(String str, EsimTerms terms, String str2, EsimPhoneNumberPriceBreakdown priceBreakdown) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        this.f100318a = str;
        this.f100319b = terms;
        this.f100320c = str2;
        this.d = priceBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberCheckout)) {
            return false;
        }
        EsimPhoneNumberCheckout esimPhoneNumberCheckout = (EsimPhoneNumberCheckout) obj2;
        return Intrinsics.f(this.f100318a, esimPhoneNumberCheckout.f100318a) && Intrinsics.f(this.f100319b, esimPhoneNumberCheckout.f100319b) && Intrinsics.f(this.f100320c, esimPhoneNumberCheckout.f100320c) && Intrinsics.f(this.d, esimPhoneNumberCheckout.d);
    }

    public final int hashCode() {
        String str = this.f100318a;
        int iHashCode = (this.f100319b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f100320c;
        return this.d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100318a);
        this.f100319b.writeToParcel(dest, i);
        dest.writeString(this.f100320c);
        this.d.writeToParcel(dest, i);
    }
}
