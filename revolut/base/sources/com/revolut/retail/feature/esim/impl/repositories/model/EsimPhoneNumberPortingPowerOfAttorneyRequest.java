package com.revolut.retail.feature.esim.impl.repositories.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/repositories/model/EsimPhoneNumberPortingPowerOfAttorneyRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingPowerOfAttorneyRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingPowerOfAttorneyRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingDonorDetailsRequest f100592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingPreferredScheduleRequest f100593b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberPortingPowerOfAttorneyRequest(EsimPhoneNumberPortingDonorDetailsRequest.CREATOR.createFromParcel(parcel), EsimPhoneNumberPortingPreferredScheduleRequest.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingPowerOfAttorneyRequest[i];
        }
    }

    public EsimPhoneNumberPortingPowerOfAttorneyRequest(EsimPhoneNumberPortingDonorDetailsRequest donorDetails, EsimPhoneNumberPortingPreferredScheduleRequest preferredSchedule) {
        Intrinsics.checkNotNullParameter(donorDetails, "donorDetails");
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        this.f100592a = donorDetails;
        this.f100593b = preferredSchedule;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingPowerOfAttorneyRequest)) {
            return false;
        }
        EsimPhoneNumberPortingPowerOfAttorneyRequest esimPhoneNumberPortingPowerOfAttorneyRequest = (EsimPhoneNumberPortingPowerOfAttorneyRequest) obj2;
        return Intrinsics.f(this.f100592a, esimPhoneNumberPortingPowerOfAttorneyRequest.f100592a) && Intrinsics.f(this.f100593b, esimPhoneNumberPortingPowerOfAttorneyRequest.f100593b);
    }

    public final int hashCode() {
        return this.f100593b.hashCode() + (this.f100592a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f100592a.writeToParcel(dest, i);
        this.f100593b.writeToParcel(dest, i);
    }
}
