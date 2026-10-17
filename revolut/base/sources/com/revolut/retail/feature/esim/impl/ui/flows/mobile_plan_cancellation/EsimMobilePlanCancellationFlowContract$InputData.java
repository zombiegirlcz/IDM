package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanCancellationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanCancellationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType f100700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimGiftRecipient f100701c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanCancellationFlowContract$InputData(parcel.readString(), (EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) parcel.readParcelable(EsimMobilePlanCancellationFlowContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanCancellationFlowContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanCancellationFlowContract$InputData[i];
        }
    }

    public EsimMobilePlanCancellationFlowContract$InputData(String mobilePlanSubscriptionId, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType, EsimGiftRecipient esimGiftRecipient, String str) {
        Intrinsics.checkNotNullParameter(mobilePlanSubscriptionId, "mobilePlanSubscriptionId");
        Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
        this.f100699a = mobilePlanSubscriptionId;
        this.f100700b = cancellationType;
        this.f100701c = esimGiftRecipient;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanCancellationFlowContract$InputData)) {
            return false;
        }
        EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData = (EsimMobilePlanCancellationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100699a, esimMobilePlanCancellationFlowContract$InputData.f100699a) && Intrinsics.f(this.f100700b, esimMobilePlanCancellationFlowContract$InputData.f100700b) && Intrinsics.f(this.f100701c, esimMobilePlanCancellationFlowContract$InputData.f100701c) && Intrinsics.f(this.d, esimMobilePlanCancellationFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f100700b.hashCode() + (this.f100699a.hashCode() * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f100701c;
        int iHashCode2 = (iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100699a);
        dest.writeParcelable(this.f100700b, i);
        dest.writeParcelable(this.f100701c, i);
        dest.writeString(this.d);
    }
}
