package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingInstruction f101264c;
    public final EsimCheckoutPortingSteps d;
    public final EsimPhoneNumberPortingDynamicForm e;
    public final EsimGiftRecipient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f101265g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = (EsimPhoneNumberPortingInstruction) parcel.readParcelable(EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.class.getClassLoader());
            return new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData((EsimCheckoutPortingSteps) parcel.readParcelable(EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.class.getClassLoader()), (EsimPhoneNumberPortingDynamicForm) parcel.readParcelable(EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.class.getClassLoader()), esimPhoneNumberPortingInstruction, c.valueOf(parcel.readString()), string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData(EsimCheckoutPortingSteps esimCheckoutPortingSteps, EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPortingDynamicForm dynamicForm, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction, c navigationIcon, String subscriptionId, String phoneNumber) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(dynamicForm, "dynamicForm");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f101262a = subscriptionId;
        this.f101263b = phoneNumber;
        this.f101264c = esimPhoneNumberPortingInstruction;
        this.d = esimCheckoutPortingSteps;
        this.e = dynamicForm;
        this.f = esimGiftRecipient;
        this.f101265g = navigationIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData = (EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101262a, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f101262a) && Intrinsics.f(this.f101263b, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f101263b) && Intrinsics.f(this.f101264c, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f101264c) && Intrinsics.f(this.d, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.e) && Intrinsics.f(this.f, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f) && this.f101265g == esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f101265g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f101262a.hashCode() * 31, 31, this.f101263b);
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f101264c;
        int iHashCode = (iC + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode())) * 31;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (esimCheckoutPortingSteps == null ? 0 : esimCheckoutPortingSteps.hashCode())) * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f;
        return this.f101265g.hashCode() + ((iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101262a);
        dest.writeString(this.f101263b);
        dest.writeParcelable(this.f101264c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f101265g.name());
    }
}
