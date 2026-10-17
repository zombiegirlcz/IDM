package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.Instant;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPriceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPriceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPriceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f100419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f100420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimMobilePlanPointsOptions f100421c;
    public final EsimPhoneNumberCheckoutFee d;
    public final EsimPhoneNumberCheckoutFee e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f100422g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            Period period = (Period) parcel.readSerializable();
            ArrayList arrayList = null;
            EsimMobilePlanPointsOptions esimMobilePlanPointsOptionsCreateFromParcel = parcel.readInt() == 0 ? null : EsimMobilePlanPointsOptions.CREATOR.createFromParcel(parcel);
            EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFeeCreateFromParcel = parcel.readInt() == 0 ? null : EsimPhoneNumberCheckoutFee.CREATOR.createFromParcel(parcel);
            EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFeeCreateFromParcel2 = parcel.readInt() == 0 ? null : EsimPhoneNumberCheckoutFee.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberCheckoutPhoneNumberFee.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new EsimPriceBreakdown(dVar, period, esimMobilePlanPointsOptionsCreateFromParcel, esimPhoneNumberCheckoutFeeCreateFromParcel, esimPhoneNumberCheckoutFeeCreateFromParcel2, arrayList, (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPriceBreakdown[i];
        }
    }

    public EsimPriceBreakdown(d price, Period period, EsimMobilePlanPointsOptions esimMobilePlanPointsOptions, EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee, EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee2, ArrayList arrayList, Instant instant) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f100419a = price;
        this.f100420b = period;
        this.f100421c = esimMobilePlanPointsOptions;
        this.d = esimPhoneNumberCheckoutFee;
        this.e = esimPhoneNumberCheckoutFee2;
        this.f = arrayList;
        this.f100422g = instant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPriceBreakdown)) {
            return false;
        }
        EsimPriceBreakdown esimPriceBreakdown = (EsimPriceBreakdown) obj2;
        return Intrinsics.f(this.f100419a, esimPriceBreakdown.f100419a) && Intrinsics.f(this.f100420b, esimPriceBreakdown.f100420b) && Intrinsics.f(this.f100421c, esimPriceBreakdown.f100421c) && Intrinsics.f(this.d, esimPriceBreakdown.d) && Intrinsics.f(this.e, esimPriceBreakdown.e) && Intrinsics.f(this.f, esimPriceBreakdown.f) && Intrinsics.f(this.f100422g, esimPriceBreakdown.f100422g);
    }

    public final int hashCode() {
        int iHashCode = this.f100419a.hashCode() * 31;
        Period period = this.f100420b;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        EsimMobilePlanPointsOptions esimMobilePlanPointsOptions = this.f100421c;
        int iHashCode3 = (iHashCode2 + (esimMobilePlanPointsOptions == null ? 0 : esimMobilePlanPointsOptions.hashCode())) * 31;
        EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee = this.d;
        int iHashCode4 = (iHashCode3 + (esimPhoneNumberCheckoutFee == null ? 0 : esimPhoneNumberCheckoutFee.hashCode())) * 31;
        EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee2 = this.e;
        int iHashCode5 = (iHashCode4 + (esimPhoneNumberCheckoutFee2 == null ? 0 : esimPhoneNumberCheckoutFee2.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Instant instant = this.f100422g;
        return iHashCode6 + (instant != null ? instant.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100419a);
        dest.writeSerializable(this.f100420b);
        EsimMobilePlanPointsOptions esimMobilePlanPointsOptions = this.f100421c;
        if (esimMobilePlanPointsOptions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMobilePlanPointsOptions.writeToParcel(dest, i);
        }
        EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee = this.d;
        if (esimPhoneNumberCheckoutFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberCheckoutFee.writeToParcel(dest, i);
        }
        EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee2 = this.e;
        if (esimPhoneNumberCheckoutFee2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberCheckoutFee2.writeToParcel(dest, i);
        }
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((EsimPhoneNumberCheckoutPhoneNumberFee) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeSerializable(this.f100422g);
    }
}
