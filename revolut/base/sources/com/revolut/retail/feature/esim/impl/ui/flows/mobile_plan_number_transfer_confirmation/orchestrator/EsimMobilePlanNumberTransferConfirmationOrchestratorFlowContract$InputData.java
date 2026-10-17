package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import hgj.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPorting f100747c;
    public final EsimGiftRecipient d;
    public final c e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.class.getClassLoader()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData[i];
        }
    }

    public EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData(String subscriptionId, String phoneNumber, EsimPhoneNumberPorting porting, EsimGiftRecipient esimGiftRecipient, c navigationIcon) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(porting, "porting");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f100745a = subscriptionId;
        this.f100746b = phoneNumber;
        this.f100747c = porting;
        this.d = esimGiftRecipient;
        this.e = navigationIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData)) {
            return false;
        }
        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = (EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a) && Intrinsics.f(this.f100746b, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b) && Intrinsics.f(this.f100747c, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100747c) && Intrinsics.f(this.d, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.d) && this.e == esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.e;
    }

    public final int hashCode() {
        int iC = y.c(this.f100747c, p.a.c(this.f100745a.hashCode() * 31, 31, this.f100746b), 31);
        EsimGiftRecipient esimGiftRecipient = this.d;
        return this.e.hashCode() + ((iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100745a);
        dest.writeString(this.f100746b);
        dest.writeParcelable(this.f100747c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
    }

    public /* synthetic */ EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData(String str, String str2, EsimPhoneNumberPorting esimPhoneNumberPorting, EsimGiftRecipient esimGiftRecipient) {
        this(str, str2, esimPhoneNumberPorting, esimGiftRecipient, c.DEFAULT);
    }
}
