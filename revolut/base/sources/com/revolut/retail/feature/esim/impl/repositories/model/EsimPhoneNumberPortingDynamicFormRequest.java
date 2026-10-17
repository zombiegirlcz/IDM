package com.revolut.retail.feature.esim.impl.repositories.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/repositories/model/EsimPhoneNumberPortingDynamicFormRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingDynamicFormRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingDynamicFormRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingDonorDetailsRequest f100583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingPreferredScheduleRequest f100584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f100585c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            EsimPhoneNumberPortingDonorDetailsRequest esimPhoneNumberPortingDonorDetailsRequestCreateFromParcel = parcel.readInt() == 0 ? null : EsimPhoneNumberPortingDonorDetailsRequest.CREATOR.createFromParcel(parcel);
            EsimPhoneNumberPortingPreferredScheduleRequest esimPhoneNumberPortingPreferredScheduleRequestCreateFromParcel = parcel.readInt() == 0 ? null : EsimPhoneNumberPortingPreferredScheduleRequest.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingAttributeRequest.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new EsimPhoneNumberPortingDynamicFormRequest(esimPhoneNumberPortingDonorDetailsRequestCreateFromParcel, esimPhoneNumberPortingPreferredScheduleRequestCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingDynamicFormRequest[i];
        }
    }

    public EsimPhoneNumberPortingDynamicFormRequest(EsimPhoneNumberPortingDonorDetailsRequest esimPhoneNumberPortingDonorDetailsRequest, EsimPhoneNumberPortingPreferredScheduleRequest esimPhoneNumberPortingPreferredScheduleRequest, List list) {
        this.f100583a = esimPhoneNumberPortingDonorDetailsRequest;
        this.f100584b = esimPhoneNumberPortingPreferredScheduleRequest;
        this.f100585c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingDynamicFormRequest)) {
            return false;
        }
        EsimPhoneNumberPortingDynamicFormRequest esimPhoneNumberPortingDynamicFormRequest = (EsimPhoneNumberPortingDynamicFormRequest) obj2;
        return Intrinsics.f(this.f100583a, esimPhoneNumberPortingDynamicFormRequest.f100583a) && Intrinsics.f(this.f100584b, esimPhoneNumberPortingDynamicFormRequest.f100584b) && Intrinsics.f(this.f100585c, esimPhoneNumberPortingDynamicFormRequest.f100585c);
    }

    public final int hashCode() {
        EsimPhoneNumberPortingDonorDetailsRequest esimPhoneNumberPortingDonorDetailsRequest = this.f100583a;
        int iHashCode = (esimPhoneNumberPortingDonorDetailsRequest == null ? 0 : esimPhoneNumberPortingDonorDetailsRequest.hashCode()) * 31;
        EsimPhoneNumberPortingPreferredScheduleRequest esimPhoneNumberPortingPreferredScheduleRequest = this.f100584b;
        int iHashCode2 = (iHashCode + (esimPhoneNumberPortingPreferredScheduleRequest == null ? 0 : esimPhoneNumberPortingPreferredScheduleRequest.hashCode())) * 31;
        List list = this.f100585c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        EsimPhoneNumberPortingDonorDetailsRequest esimPhoneNumberPortingDonorDetailsRequest = this.f100583a;
        if (esimPhoneNumberPortingDonorDetailsRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingDonorDetailsRequest.writeToParcel(dest, i);
        }
        EsimPhoneNumberPortingPreferredScheduleRequest esimPhoneNumberPortingPreferredScheduleRequest = this.f100584b;
        if (esimPhoneNumberPortingPreferredScheduleRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingPreferredScheduleRequest.writeToParcel(dest, i);
        }
        List list = this.f100585c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((EsimPhoneNumberPortingAttributeRequest) itQ.next()).writeToParcel(dest, i);
        }
    }
}
