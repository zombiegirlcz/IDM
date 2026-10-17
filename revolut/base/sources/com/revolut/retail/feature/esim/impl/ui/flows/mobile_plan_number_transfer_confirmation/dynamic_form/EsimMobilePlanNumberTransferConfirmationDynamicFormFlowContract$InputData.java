package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingDynamicForm;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import hgj.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingInstruction f100732c;
    public final EsimCheckoutPortingSteps d;
    public final EsimPhoneNumberPortingDynamicForm e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimGiftRecipient f100733g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = (EsimPhoneNumberPortingInstruction) parcel.readParcelable(EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.class.getClassLoader());
            return new EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData((EsimCheckoutPortingSteps) parcel.readParcelable(EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.class.getClassLoader()), (EsimPhoneNumberPortingDynamicForm) parcel.readParcelable(EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.class.getClassLoader()), esimPhoneNumberPortingInstruction, c.valueOf(parcel.readString()), string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData[i];
        }
    }

    public EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData(EsimCheckoutPortingSteps esimCheckoutPortingSteps, EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPortingDynamicForm dynamicForm, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction, c navigationIcon, String subscriptionId, String phoneNumber) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(dynamicForm, "dynamicForm");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f100730a = subscriptionId;
        this.f100731b = phoneNumber;
        this.f100732c = esimPhoneNumberPortingInstruction;
        this.d = esimCheckoutPortingSteps;
        this.e = dynamicForm;
        this.f = navigationIcon;
        this.f100733g = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData)) {
            return false;
        }
        EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData = (EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100730a, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100730a) && Intrinsics.f(this.f100731b, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100731b) && Intrinsics.f(this.f100732c, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100732c) && Intrinsics.f(this.d, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.e) && this.f == esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f && Intrinsics.f(this.f100733g, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100733g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100730a.hashCode() * 31, 31, this.f100731b);
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f100732c;
        int iHashCode = (iC + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode())) * 31;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (esimCheckoutPortingSteps == null ? 0 : esimCheckoutPortingSteps.hashCode())) * 31)) * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f100733g;
        return iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100730a);
        dest.writeString(this.f100731b);
        dest.writeParcelable(this.f100732c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
        dest.writeParcelable(this.f100733g, i);
    }
}
