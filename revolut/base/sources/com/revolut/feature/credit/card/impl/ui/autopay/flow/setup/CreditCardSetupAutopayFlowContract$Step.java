package com.revolut.feature.credit.card.impl.ui.autopay.flow.setup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "SelectPaymentMethod", "ConfirmAutoPay", "SetAmount", "SetDate", "DirectDebit", "Picker", "SetupBackupCard", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$ConfirmAutoPay;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$DirectDebit;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$Picker;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$SelectPaymentMethod;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$SetAmount;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$SetDate;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$SetupBackupCard;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardSetupAutopayFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$ConfirmAutoPay;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmAutoPay implements CreditCardSetupAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmAutoPay f69081a = new ConfirmAutoPay();

        @NotNull
        public static final Parcelable.Creator<ConfirmAutoPay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmAutoPay.f69081a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmAutoPay[i];
            }
        }

        private ConfirmAutoPay() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$DirectDebit;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DirectDebit implements CreditCardSetupAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DirectDebit f69082a = new DirectDebit();

        @NotNull
        public static final Parcelable.Creator<DirectDebit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DirectDebit.f69082a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebit[i];
            }
        }

        private DirectDebit() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$Picker;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Picker implements CreditCardSetupAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Picker f69083a = new Picker();

        @NotNull
        public static final Parcelable.Creator<Picker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Picker.f69083a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Picker[i];
            }
        }

        private Picker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements CreditCardSetupAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f69084a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f69084a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$SelectPaymentMethod;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectPaymentMethod implements CreditCardSetupAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectPaymentMethod f69085a = new SelectPaymentMethod();

        @NotNull
        public static final Parcelable.Creator<SelectPaymentMethod> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectPaymentMethod.f69085a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPaymentMethod[i];
            }
        }

        private SelectPaymentMethod() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$SetAmount;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SetAmount implements CreditCardSetupAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetAmount f69086a = new SetAmount();

        @NotNull
        public static final Parcelable.Creator<SetAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SetAmount.f69086a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetAmount[i];
            }
        }

        private SetAmount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$SetDate;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SetDate implements CreditCardSetupAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetDate f69087a = new SetDate();

        @NotNull
        public static final Parcelable.Creator<SetDate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SetDate.f69087a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetDate[i];
            }
        }

        private SetDate() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step$SetupBackupCard;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/setup/CreditCardSetupAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SetupBackupCard implements CreditCardSetupAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetupBackupCard f69088a = new SetupBackupCard();

        @NotNull
        public static final Parcelable.Creator<SetupBackupCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SetupBackupCard.f69088a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetupBackupCard[i];
            }
        }

        private SetupBackupCard() {
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
}
