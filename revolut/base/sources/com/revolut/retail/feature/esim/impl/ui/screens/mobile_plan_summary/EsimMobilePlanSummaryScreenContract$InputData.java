package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_summary/EsimMobilePlanSummaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanSummaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanSummaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimDataPlan f101404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimGiftRecipient f101405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimMobilePlanSummaryScreenContract$ContractStatementData f101406c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanSummaryScreenContract$InputData((EsimDataPlan) parcel.readParcelable(EsimMobilePlanSummaryScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanSummaryScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : EsimMobilePlanSummaryScreenContract$ContractStatementData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanSummaryScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanSummaryScreenContract$InputData(EsimDataPlan mobilePlan, EsimGiftRecipient esimGiftRecipient, EsimMobilePlanSummaryScreenContract$ContractStatementData esimMobilePlanSummaryScreenContract$ContractStatementData) {
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        this.f101404a = mobilePlan;
        this.f101405b = esimGiftRecipient;
        this.f101406c = esimMobilePlanSummaryScreenContract$ContractStatementData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanSummaryScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanSummaryScreenContract$InputData esimMobilePlanSummaryScreenContract$InputData = (EsimMobilePlanSummaryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101404a, esimMobilePlanSummaryScreenContract$InputData.f101404a) && Intrinsics.f(this.f101405b, esimMobilePlanSummaryScreenContract$InputData.f101405b) && Intrinsics.f(this.f101406c, esimMobilePlanSummaryScreenContract$InputData.f101406c);
    }

    public final int hashCode() {
        int iHashCode = this.f101404a.hashCode() * 31;
        EsimGiftRecipient esimGiftRecipient = this.f101405b;
        int iHashCode2 = (iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
        EsimMobilePlanSummaryScreenContract$ContractStatementData esimMobilePlanSummaryScreenContract$ContractStatementData = this.f101406c;
        return iHashCode2 + (esimMobilePlanSummaryScreenContract$ContractStatementData != null ? esimMobilePlanSummaryScreenContract$ContractStatementData.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101404a, i);
        dest.writeParcelable(this.f101405b, i);
        EsimMobilePlanSummaryScreenContract$ContractStatementData esimMobilePlanSummaryScreenContract$ContractStatementData = this.f101406c;
        if (esimMobilePlanSummaryScreenContract$ContractStatementData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMobilePlanSummaryScreenContract$ContractStatementData.writeToParcel(dest, i);
        }
    }
}
