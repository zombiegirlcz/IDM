package com.revolut.retail.feature.esim.impl.repositories.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/repositories/model/EsimPhoneNumberPortingDonorDetailsRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingDonorDetailsRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingDonorDetailsRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingServiceProvider f100580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingOwnerAccountTypeRequest f100581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingContractType f100582c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberPortingDonorDetailsRequest((EsimPhoneNumberPortingServiceProvider) parcel.readParcelable(EsimPhoneNumberPortingDonorDetailsRequest.class.getClassLoader()), parcel.readInt() == 0 ? null : EsimPhoneNumberPortingOwnerAccountTypeRequest.CREATOR.createFromParcel(parcel), (EsimPhoneNumberPortingContractType) parcel.readParcelable(EsimPhoneNumberPortingDonorDetailsRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingDonorDetailsRequest[i];
        }
    }

    public EsimPhoneNumberPortingDonorDetailsRequest(EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider, EsimPhoneNumberPortingOwnerAccountTypeRequest esimPhoneNumberPortingOwnerAccountTypeRequest, EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType) {
        this.f100580a = esimPhoneNumberPortingServiceProvider;
        this.f100581b = esimPhoneNumberPortingOwnerAccountTypeRequest;
        this.f100582c = esimPhoneNumberPortingContractType;
    }

    public static EsimPhoneNumberPortingDonorDetailsRequest a(EsimPhoneNumberPortingDonorDetailsRequest esimPhoneNumberPortingDonorDetailsRequest, EsimPhoneNumberPortingOwnerAccountTypeRequest esimPhoneNumberPortingOwnerAccountTypeRequest) {
        EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = esimPhoneNumberPortingDonorDetailsRequest.f100580a;
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = esimPhoneNumberPortingDonorDetailsRequest.f100582c;
        esimPhoneNumberPortingDonorDetailsRequest.getClass();
        return new EsimPhoneNumberPortingDonorDetailsRequest(esimPhoneNumberPortingServiceProvider, esimPhoneNumberPortingOwnerAccountTypeRequest, esimPhoneNumberPortingContractType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingDonorDetailsRequest)) {
            return false;
        }
        EsimPhoneNumberPortingDonorDetailsRequest esimPhoneNumberPortingDonorDetailsRequest = (EsimPhoneNumberPortingDonorDetailsRequest) obj2;
        return Intrinsics.f(this.f100580a, esimPhoneNumberPortingDonorDetailsRequest.f100580a) && Intrinsics.f(this.f100581b, esimPhoneNumberPortingDonorDetailsRequest.f100581b) && Intrinsics.f(this.f100582c, esimPhoneNumberPortingDonorDetailsRequest.f100582c);
    }

    public final int hashCode() {
        EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = this.f100580a;
        int iHashCode = (esimPhoneNumberPortingServiceProvider == null ? 0 : esimPhoneNumberPortingServiceProvider.hashCode()) * 31;
        EsimPhoneNumberPortingOwnerAccountTypeRequest esimPhoneNumberPortingOwnerAccountTypeRequest = this.f100581b;
        int iHashCode2 = (iHashCode + (esimPhoneNumberPortingOwnerAccountTypeRequest == null ? 0 : esimPhoneNumberPortingOwnerAccountTypeRequest.hashCode())) * 31;
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = this.f100582c;
        return iHashCode2 + (esimPhoneNumberPortingContractType != null ? esimPhoneNumberPortingContractType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f100580a, i);
        EsimPhoneNumberPortingOwnerAccountTypeRequest esimPhoneNumberPortingOwnerAccountTypeRequest = this.f100581b;
        if (esimPhoneNumberPortingOwnerAccountTypeRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingOwnerAccountTypeRequest.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f100582c, i);
    }
}
