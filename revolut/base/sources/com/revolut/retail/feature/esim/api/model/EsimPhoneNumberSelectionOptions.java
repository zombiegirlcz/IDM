package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberSelectionOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberSelectionOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberSelectionOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPorting f100404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimRandomPhoneNumberOption f100405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimFeaturedPhoneNumberOption f100406c;
    public final EsimPhoneNumberSelectionsFee d;
    public final EsimPhoneNumberSelectionsLimits e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberSelectionOptions(parcel.readInt() == 0 ? null : EsimPhoneNumberPorting.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimRandomPhoneNumberOption.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimFeaturedPhoneNumberOption.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimPhoneNumberSelectionsFee.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EsimPhoneNumberSelectionsLimits.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberSelectionOptions[i];
        }
    }

    public EsimPhoneNumberSelectionOptions(EsimPhoneNumberPorting esimPhoneNumberPorting, EsimRandomPhoneNumberOption esimRandomPhoneNumberOption, EsimFeaturedPhoneNumberOption esimFeaturedPhoneNumberOption, EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee, EsimPhoneNumberSelectionsLimits esimPhoneNumberSelectionsLimits) {
        this.f100404a = esimPhoneNumberPorting;
        this.f100405b = esimRandomPhoneNumberOption;
        this.f100406c = esimFeaturedPhoneNumberOption;
        this.d = esimPhoneNumberSelectionsFee;
        this.e = esimPhoneNumberSelectionsLimits;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberSelectionOptions)) {
            return false;
        }
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions = (EsimPhoneNumberSelectionOptions) obj2;
        return Intrinsics.f(this.f100404a, esimPhoneNumberSelectionOptions.f100404a) && Intrinsics.f(this.f100405b, esimPhoneNumberSelectionOptions.f100405b) && Intrinsics.f(this.f100406c, esimPhoneNumberSelectionOptions.f100406c) && Intrinsics.f(this.d, esimPhoneNumberSelectionOptions.d) && Intrinsics.f(this.e, esimPhoneNumberSelectionOptions.e);
    }

    public final int hashCode() {
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f100404a;
        int iHashCode = (esimPhoneNumberPorting == null ? 0 : esimPhoneNumberPorting.hashCode()) * 31;
        EsimRandomPhoneNumberOption esimRandomPhoneNumberOption = this.f100405b;
        int iHashCode2 = (iHashCode + (esimRandomPhoneNumberOption == null ? 0 : esimRandomPhoneNumberOption.hashCode())) * 31;
        EsimFeaturedPhoneNumberOption esimFeaturedPhoneNumberOption = this.f100406c;
        int iHashCode3 = (iHashCode2 + (esimFeaturedPhoneNumberOption == null ? 0 : esimFeaturedPhoneNumberOption.f100256a.hashCode())) * 31;
        EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee = this.d;
        int iHashCode4 = (iHashCode3 + (esimPhoneNumberSelectionsFee == null ? 0 : esimPhoneNumberSelectionsFee.hashCode())) * 31;
        EsimPhoneNumberSelectionsLimits esimPhoneNumberSelectionsLimits = this.e;
        return iHashCode4 + (esimPhoneNumberSelectionsLimits != null ? esimPhoneNumberSelectionsLimits.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f100404a;
        if (esimPhoneNumberPorting == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPorting.writeToParcel(dest, i);
        }
        EsimRandomPhoneNumberOption esimRandomPhoneNumberOption = this.f100405b;
        if (esimRandomPhoneNumberOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimRandomPhoneNumberOption.writeToParcel(dest, i);
        }
        EsimFeaturedPhoneNumberOption esimFeaturedPhoneNumberOption = this.f100406c;
        if (esimFeaturedPhoneNumberOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimFeaturedPhoneNumberOption.writeToParcel(dest, i);
        }
        EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee = this.d;
        if (esimPhoneNumberSelectionsFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberSelectionsFee.writeToParcel(dest, i);
        }
        EsimPhoneNumberSelectionsLimits esimPhoneNumberSelectionsLimits = this.e;
        if (esimPhoneNumberSelectionsLimits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberSelectionsLimits.writeToParcel(dest, i);
        }
    }
}
