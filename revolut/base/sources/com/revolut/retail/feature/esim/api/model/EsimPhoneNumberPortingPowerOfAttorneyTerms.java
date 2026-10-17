package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingPowerOfAttorneyTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingPowerOfAttorneyTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingPowerOfAttorneyTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimHyperText f100379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f100380b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberPortingPowerOfAttorneyTerms(parcel.readInt() == 0 ? null : EsimHyperText.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EsimHyperText.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingPowerOfAttorneyTerms[i];
        }
    }

    public EsimPhoneNumberPortingPowerOfAttorneyTerms(EsimHyperText esimHyperText, EsimHyperText esimHyperText2) {
        this.f100379a = esimHyperText;
        this.f100380b = esimHyperText2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingPowerOfAttorneyTerms)) {
            return false;
        }
        EsimPhoneNumberPortingPowerOfAttorneyTerms esimPhoneNumberPortingPowerOfAttorneyTerms = (EsimPhoneNumberPortingPowerOfAttorneyTerms) obj2;
        return Intrinsics.f(this.f100379a, esimPhoneNumberPortingPowerOfAttorneyTerms.f100379a) && Intrinsics.f(this.f100380b, esimPhoneNumberPortingPowerOfAttorneyTerms.f100380b);
    }

    public final int hashCode() {
        EsimHyperText esimHyperText = this.f100379a;
        int iHashCode = (esimHyperText == null ? 0 : esimHyperText.hashCode()) * 31;
        EsimHyperText esimHyperText2 = this.f100380b;
        return iHashCode + (esimHyperText2 != null ? esimHyperText2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        EsimHyperText esimHyperText = this.f100379a;
        if (esimHyperText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText.writeToParcel(dest, i);
        }
        EsimHyperText esimHyperText2 = this.f100380b;
        if (esimHyperText2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText2.writeToParcel(dest, i);
        }
    }
}
