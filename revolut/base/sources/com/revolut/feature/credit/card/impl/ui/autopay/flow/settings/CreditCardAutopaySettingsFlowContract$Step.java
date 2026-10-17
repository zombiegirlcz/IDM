package com.revolut.feature.credit.card.impl.ui.autopay.flow.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmation;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.g;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Settings", "Picker", "Setup", "Recreate", "SetupBackupCard", "DirectDebitAccountDetails", "SetAmount", "AmountConfirmation", "SetDate", "DirectDebit", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$AmountConfirmation;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$DirectDebit;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$DirectDebitAccountDetails;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$Picker;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$Recreate;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$SetAmount;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$SetDate;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$Settings;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$Setup;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$SetupBackupCard;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardAutopaySettingsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$AmountConfirmation;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountConfirmation implements CreditCardAutopaySettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AmountConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardAutopayConfirmation f69049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditScheduledAmountType f69050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RepaymentSource f69051c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountConfirmation((CreditCardAutopayConfirmation) parcel.readParcelable(AmountConfirmation.class.getClassLoader()), (CreditScheduledAmountType) parcel.readParcelable(AmountConfirmation.class.getClassLoader()), (RepaymentSource) parcel.readParcelable(AmountConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountConfirmation[i];
            }
        }

        public AmountConfirmation(CreditCardAutopayConfirmation confirmation, CreditScheduledAmountType amountType, RepaymentSource repaymentSource) {
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            Intrinsics.checkNotNullParameter(amountType, "amountType");
            this.f69049a = confirmation;
            this.f69050b = amountType;
            this.f69051c = repaymentSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AmountConfirmation)) {
                return false;
            }
            AmountConfirmation amountConfirmation = (AmountConfirmation) obj2;
            return Intrinsics.f(this.f69049a, amountConfirmation.f69049a) && Intrinsics.f(this.f69050b, amountConfirmation.f69050b) && Intrinsics.f(this.f69051c, amountConfirmation.f69051c);
        }

        public final int hashCode() {
            int iHashCode = (this.f69050b.hashCode() + (this.f69049a.hashCode() * 31)) * 31;
            RepaymentSource repaymentSource = this.f69051c;
            return iHashCode + (repaymentSource == null ? 0 : repaymentSource.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69049a, i);
            dest.writeParcelable(this.f69050b, i);
            dest.writeParcelable(this.f69051c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$DirectDebit;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DirectDebit implements CreditCardAutopaySettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DirectDebit f69052a = new DirectDebit();

        @NotNull
        public static final Parcelable.Creator<DirectDebit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DirectDebit.f69052a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$DirectDebitAccountDetails;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDebitAccountDetails implements CreditCardAutopaySettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DirectDebitAccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDirectDebitMandate f69053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f69054b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDebitAccountDetails((CreditCardDirectDebitMandate) parcel.readParcelable(DirectDebitAccountDetails.class.getClassLoader()), (Image) parcel.readParcelable(DirectDebitAccountDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebitAccountDetails[i];
            }
        }

        public DirectDebitAccountDetails(CreditCardDirectDebitMandate mandate, Image accountImage) {
            Intrinsics.checkNotNullParameter(mandate, "mandate");
            Intrinsics.checkNotNullParameter(accountImage, "accountImage");
            this.f69053a = mandate;
            this.f69054b = accountImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirectDebitAccountDetails)) {
                return false;
            }
            DirectDebitAccountDetails directDebitAccountDetails = (DirectDebitAccountDetails) obj2;
            return Intrinsics.f(this.f69053a, directDebitAccountDetails.f69053a) && Intrinsics.f(this.f69054b, directDebitAccountDetails.f69054b);
        }

        public final int hashCode() {
            return this.f69054b.hashCode() + (this.f69053a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69053a, i);
            dest.writeParcelable(this.f69054b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$Picker;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Picker implements CreditCardAutopaySettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Picker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69055a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Picker(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Picker[i];
            }
        }

        public Picker(String str) {
            this.f69055a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Picker) && Intrinsics.f(this.f69055a, ((Picker) obj2).f69055a);
        }

        public final int hashCode() {
            String str = this.f69055a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69055a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$Recreate;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Recreate implements CreditCardAutopaySettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Recreate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69056a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recreate(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Recreate[i];
            }
        }

        public Recreate(String paymentId) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            this.f69056a = paymentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Recreate) && Intrinsics.f(this.f69056a, ((Recreate) obj2).f69056a);
        }

        public final int hashCode() {
            return this.f69056a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69056a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$SetAmount;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetAmount implements CreditCardAutopaySettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SetAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f69057a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetAmount((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetAmount[i];
            }
        }

        public SetAmount(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f69057a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetAmount) && Intrinsics.f(this.f69057a, ((SetAmount) obj2).f69057a);
        }

        public final int hashCode() {
            return this.f69057a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69057a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$SetDate;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SetDate implements CreditCardAutopaySettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetDate f69058a = new SetDate();

        @NotNull
        public static final Parcelable.Creator<SetDate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SetDate.f69058a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$Settings;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings implements CreditCardAutopaySettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f69059a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f69059a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$Setup;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Setup implements CreditCardAutopaySettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Setup f69060a = new Setup();

        @NotNull
        public static final Parcelable.Creator<Setup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Setup.f69060a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Setup[i];
            }
        }

        private Setup() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step$SetupBackupCard;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupBackupCard implements CreditCardAutopaySettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SetupBackupCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f69061a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupBackupCard((g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetupBackupCard[i];
            }
        }

        public SetupBackupCard(g externalCard) {
            Intrinsics.checkNotNullParameter(externalCard, "externalCard");
            this.f69061a = externalCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetupBackupCard) && Intrinsics.f(this.f69061a, ((SetupBackupCard) obj2).f69061a);
        }

        public final int hashCode() {
            return this.f69061a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69061a);
        }
    }
}
