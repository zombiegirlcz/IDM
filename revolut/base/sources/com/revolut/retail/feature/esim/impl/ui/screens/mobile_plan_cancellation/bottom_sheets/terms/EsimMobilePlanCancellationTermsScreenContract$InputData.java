package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionWithdrawalConfirmation;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanCancellationTermsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanCancellationTermsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType f101133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f101134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f101135c;
    public final EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo d;
    public final EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo e;
    public final EsimGiftRecipient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimSubscriptionWithdrawalConfirmation f101136g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanCancellationTermsScreenContract$InputData((EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) parcel.readParcelable(EsimMobilePlanCancellationTermsScreenContract$InputData.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo.CREATOR.createFromParcel(parcel), (EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo) parcel.readParcelable(EsimMobilePlanCancellationTermsScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanCancellationTermsScreenContract$InputData.class.getClassLoader()), (EsimSubscriptionWithdrawalConfirmation) parcel.readParcelable(EsimMobilePlanCancellationTermsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanCancellationTermsScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanCancellationTermsScreenContract$InputData(EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType, d totalRefund, Double d, EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo dataConsumptionInfo, EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo cancellationTimeInfo, EsimGiftRecipient esimGiftRecipient, EsimSubscriptionWithdrawalConfirmation esimSubscriptionWithdrawalConfirmation) {
        Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
        Intrinsics.checkNotNullParameter(totalRefund, "totalRefund");
        Intrinsics.checkNotNullParameter(dataConsumptionInfo, "dataConsumptionInfo");
        Intrinsics.checkNotNullParameter(cancellationTimeInfo, "cancellationTimeInfo");
        this.f101133a = cancellationType;
        this.f101134b = totalRefund;
        this.f101135c = d;
        this.d = dataConsumptionInfo;
        this.e = cancellationTimeInfo;
        this.f = esimGiftRecipient;
        this.f101136g = esimSubscriptionWithdrawalConfirmation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanCancellationTermsScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanCancellationTermsScreenContract$InputData esimMobilePlanCancellationTermsScreenContract$InputData = (EsimMobilePlanCancellationTermsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101133a, esimMobilePlanCancellationTermsScreenContract$InputData.f101133a) && Intrinsics.f(this.f101134b, esimMobilePlanCancellationTermsScreenContract$InputData.f101134b) && Intrinsics.f(this.f101135c, esimMobilePlanCancellationTermsScreenContract$InputData.f101135c) && Intrinsics.f(this.d, esimMobilePlanCancellationTermsScreenContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanCancellationTermsScreenContract$InputData.e) && Intrinsics.f(this.f, esimMobilePlanCancellationTermsScreenContract$InputData.f) && Intrinsics.f(this.f101136g, esimMobilePlanCancellationTermsScreenContract$InputData.f101136g);
    }

    public final int hashCode() {
        int iC = v7.c(this.f101133a.hashCode() * 31, 31, this.f101134b);
        Double d = this.f101135c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iC + (d == null ? 0 : d.hashCode())) * 31)) * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f;
        int iHashCode2 = (iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
        EsimSubscriptionWithdrawalConfirmation esimSubscriptionWithdrawalConfirmation = this.f101136g;
        return iHashCode2 + (esimSubscriptionWithdrawalConfirmation != null ? esimSubscriptionWithdrawalConfirmation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101133a, i);
        dest.writeSerializable(this.f101134b);
        Double d = this.f101135c;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        this.d.writeToParcel(dest, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f101136g, i);
    }
}
