package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "MyNumbers", "AddNumber", "Checkout", "NumberTransferCreation", "NumberTransferConfirmation", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$AddNumber;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$MyNumbers;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$NumberTransferCreation;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanPhoneNumberPurchaseFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$AddNumber;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddNumber extends EsimMobilePlanPhoneNumberPurchaseFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddNumber f100817a = new AddNumber();

        @NotNull
        public static final Parcelable.Creator<AddNumber> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddNumber.f100817a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNumber[i];
            }
        }

        private AddNumber() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Checkout extends EsimMobilePlanPhoneNumberPurchaseFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Checkout f100818a = new Checkout();

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Checkout.f100818a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        private Checkout() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$MyNumbers;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MyNumbers extends EsimMobilePlanPhoneNumberPurchaseFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MyNumbers f100819a = new MyNumbers();

        @NotNull
        public static final Parcelable.Creator<MyNumbers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MyNumbers.f100819a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MyNumbers[i];
            }
        }

        private MyNumbers() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberTransferConfirmation extends EsimMobilePlanPhoneNumberPurchaseFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberTransferConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100822c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NumberTransferConfirmation(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(NumberTransferConfirmation.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(NumberTransferConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberTransferConfirmation[i];
            }
        }

        public NumberTransferConfirmation(String subscriptionId, String phoneNumber, EsimPhoneNumberPorting porting, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(porting, "porting");
            this.f100820a = subscriptionId;
            this.f100821b = phoneNumber;
            this.f100822c = porting;
            this.d = esimGiftRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NumberTransferConfirmation)) {
                return false;
            }
            NumberTransferConfirmation numberTransferConfirmation = (NumberTransferConfirmation) obj2;
            return Intrinsics.f(this.f100820a, numberTransferConfirmation.f100820a) && Intrinsics.f(this.f100821b, numberTransferConfirmation.f100821b) && Intrinsics.f(this.f100822c, numberTransferConfirmation.f100822c) && Intrinsics.f(this.d, numberTransferConfirmation.d);
        }

        public final int hashCode() {
            int iC = y.c(this.f100822c, p.a.c(this.f100820a.hashCode() * 31, 31, this.f100821b), 31);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100820a);
            dest.writeString(this.f100821b);
            dest.writeParcelable(this.f100822c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step$NumberTransferCreation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_phone_number_purchase/EsimMobilePlanPhoneNumberPurchaseFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberTransferCreation extends EsimMobilePlanPhoneNumberPurchaseFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberTransferCreation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberSelections f100824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100825c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                EsimPhoneNumberSelections esimPhoneNumberSelections = (EsimPhoneNumberSelections) parcel.readParcelable(NumberTransferCreation.class.getClassLoader());
                return new NumberTransferCreation((EsimGiftRecipient) parcel.readParcelable(NumberTransferCreation.class.getClassLoader()), (EsimPhoneNumberPorting) parcel.readParcelable(NumberTransferCreation.class.getClassLoader()), esimPhoneNumberSelections, string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberTransferCreation[i];
            }
        }

        public NumberTransferCreation(EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPorting porting, EsimPhoneNumberSelections phoneNumberSelections, String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
            Intrinsics.checkNotNullParameter(porting, "porting");
            this.f100823a = subscriptionId;
            this.f100824b = phoneNumberSelections;
            this.f100825c = porting;
            this.d = esimGiftRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NumberTransferCreation)) {
                return false;
            }
            NumberTransferCreation numberTransferCreation = (NumberTransferCreation) obj2;
            return Intrinsics.f(this.f100823a, numberTransferCreation.f100823a) && Intrinsics.f(this.f100824b, numberTransferCreation.f100824b) && Intrinsics.f(this.f100825c, numberTransferCreation.f100825c) && Intrinsics.f(this.d, numberTransferCreation.d);
        }

        public final int hashCode() {
            int iC = y.c(this.f100825c, (this.f100824b.hashCode() + (this.f100823a.hashCode() * 31)) * 31, 31);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100823a);
            dest.writeParcelable(this.f100824b, i);
            dest.writeParcelable(this.f100825c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    private EsimMobilePlanPhoneNumberPurchaseFlowContract$Step() {
    }
}
