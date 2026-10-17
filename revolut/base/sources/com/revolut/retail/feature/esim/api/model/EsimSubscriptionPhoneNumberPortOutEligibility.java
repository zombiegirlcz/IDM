package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionPhoneNumberPortOutEligibility;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionPhoneNumberPortOutEligibility implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionPhoneNumberPortOutEligibility> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumberPacPortOutEligibility f100482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumberStacPortOutEligibility f100483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumberPortOutOptIn f100484c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionPhoneNumberPortOutEligibility(parcel.readInt() == 0 ? null : EsimSubscriptionPhoneNumberPacPortOutEligibility.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimSubscriptionPhoneNumberStacPortOutEligibility.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EsimSubscriptionPhoneNumberPortOutOptIn.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionPhoneNumberPortOutEligibility[i];
        }
    }

    public EsimSubscriptionPhoneNumberPortOutEligibility(EsimSubscriptionPhoneNumberPacPortOutEligibility esimSubscriptionPhoneNumberPacPortOutEligibility, EsimSubscriptionPhoneNumberStacPortOutEligibility esimSubscriptionPhoneNumberStacPortOutEligibility, EsimSubscriptionPhoneNumberPortOutOptIn esimSubscriptionPhoneNumberPortOutOptIn) {
        this.f100482a = esimSubscriptionPhoneNumberPacPortOutEligibility;
        this.f100483b = esimSubscriptionPhoneNumberStacPortOutEligibility;
        this.f100484c = esimSubscriptionPhoneNumberPortOutOptIn;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionPhoneNumberPortOutEligibility)) {
            return false;
        }
        EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility = (EsimSubscriptionPhoneNumberPortOutEligibility) obj2;
        return Intrinsics.f(this.f100482a, esimSubscriptionPhoneNumberPortOutEligibility.f100482a) && Intrinsics.f(this.f100483b, esimSubscriptionPhoneNumberPortOutEligibility.f100483b) && Intrinsics.f(this.f100484c, esimSubscriptionPhoneNumberPortOutEligibility.f100484c);
    }

    public final int hashCode() {
        EsimSubscriptionPhoneNumberPacPortOutEligibility esimSubscriptionPhoneNumberPacPortOutEligibility = this.f100482a;
        int iHashCode = (esimSubscriptionPhoneNumberPacPortOutEligibility == null ? 0 : Boolean.hashCode(esimSubscriptionPhoneNumberPacPortOutEligibility.f100481a)) * 31;
        EsimSubscriptionPhoneNumberStacPortOutEligibility esimSubscriptionPhoneNumberStacPortOutEligibility = this.f100483b;
        int iHashCode2 = (iHashCode + (esimSubscriptionPhoneNumberStacPortOutEligibility == null ? 0 : Boolean.hashCode(esimSubscriptionPhoneNumberStacPortOutEligibility.f100494a))) * 31;
        EsimSubscriptionPhoneNumberPortOutOptIn esimSubscriptionPhoneNumberPortOutOptIn = this.f100484c;
        return iHashCode2 + (esimSubscriptionPhoneNumberPortOutOptIn != null ? esimSubscriptionPhoneNumberPortOutOptIn.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        EsimSubscriptionPhoneNumberPacPortOutEligibility esimSubscriptionPhoneNumberPacPortOutEligibility = this.f100482a;
        if (esimSubscriptionPhoneNumberPacPortOutEligibility == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionPhoneNumberPacPortOutEligibility.writeToParcel(dest, i);
        }
        EsimSubscriptionPhoneNumberStacPortOutEligibility esimSubscriptionPhoneNumberStacPortOutEligibility = this.f100483b;
        if (esimSubscriptionPhoneNumberStacPortOutEligibility == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionPhoneNumberStacPortOutEligibility.writeToParcel(dest, i);
        }
        EsimSubscriptionPhoneNumberPortOutOptIn esimSubscriptionPhoneNumberPortOutOptIn = this.f100484c;
        if (esimSubscriptionPhoneNumberPortOutOptIn == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionPhoneNumberPortOutOptIn.writeToParcel(dest, i);
        }
    }
}
