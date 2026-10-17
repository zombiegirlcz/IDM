package com.revolut.feature.credit.card.impl.ui.repay.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PaymentOptions", "RevolutAccount", "RevolutAccountWithRevPointsRedeem", "Spei", "Boleto", "Pse", "StatementFinancing", "NothingToRepay", "Error", "AutopayPrompt", "AutopaySettings", "CreateAutopay", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$AutopayPrompt;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$AutopaySettings;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$Boleto;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$CreateAutopay;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$Error;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$NothingToRepay;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$PaymentOptions;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$Pse;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$RevolutAccount;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$RevolutAccountWithRevPointsRedeem;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$Spei;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$StatementFinancing;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardRepayFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$AutopayPrompt;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutopayPrompt extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutopayPrompt f69573a = new AutopayPrompt();

        @NotNull
        public static final Parcelable.Creator<AutopayPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutopayPrompt.f69573a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutopayPrompt[i];
            }
        }

        private AutopayPrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$AutopaySettings;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutopaySettings extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutopaySettings f69574a = new AutopaySettings();

        @NotNull
        public static final Parcelable.Creator<AutopaySettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutopaySettings.f69574a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutopaySettings[i];
            }
        }

        private AutopaySettings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$Boleto;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Boleto extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Boleto f69575a = new Boleto();

        @NotNull
        public static final Parcelable.Creator<Boleto> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Boleto.f69575a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Boleto[i];
            }
        }

        private Boleto() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$CreateAutopay;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateAutopay extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateAutopay f69576a = new CreateAutopay();

        @NotNull
        public static final Parcelable.Creator<CreateAutopay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateAutopay.f69576a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateAutopay[i];
            }
        }

        private CreateAutopay() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$Error;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Error extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f69577a = new Error();

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f69577a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        private Error() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$NothingToRepay;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NothingToRepay extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NothingToRepay f69578a = new NothingToRepay();

        @NotNull
        public static final Parcelable.Creator<NothingToRepay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NothingToRepay.f69578a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NothingToRepay[i];
            }
        }

        private NothingToRepay() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$PaymentOptions;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentOptions extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentOptions f69579a = new PaymentOptions();

        @NotNull
        public static final Parcelable.Creator<PaymentOptions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentOptions.f69579a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentOptions[i];
            }
        }

        private PaymentOptions() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$Pse;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pse extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pse f69580a = new Pse();

        @NotNull
        public static final Parcelable.Creator<Pse> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pse.f69580a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pse[i];
            }
        }

        private Pse() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$RevolutAccount;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutAccount extends CreditCardRepayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevolutAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f69582b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutAccount(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutAccount[i];
            }
        }

        public RevolutAccount(String pocketId, boolean z) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f69581a = pocketId;
            this.f69582b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevolutAccount)) {
                return false;
            }
            RevolutAccount revolutAccount = (RevolutAccount) obj2;
            return Intrinsics.f(this.f69581a, revolutAccount.f69581a) && this.f69582b == revolutAccount.f69582b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f69582b) + (this.f69581a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69581a);
            dest.writeInt(this.f69582b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$RevolutAccountWithRevPointsRedeem;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutAccountWithRevPointsRedeem extends CreditCardRepayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevolutAccountWithRevPointsRedeem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f69583a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutAccountWithRevPointsRedeem((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutAccountWithRevPointsRedeem[i];
            }
        }

        public RevolutAccountWithRevPointsRedeem(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f69583a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevolutAccountWithRevPointsRedeem) && Intrinsics.f(this.f69583a, ((RevolutAccountWithRevPointsRedeem) obj2).f69583a);
        }

        public final int hashCode() {
            return this.f69583a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69583a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$Spei;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Spei extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Spei f69584a = new Spei();

        @NotNull
        public static final Parcelable.Creator<Spei> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Spei.f69584a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Spei[i];
            }
        }

        private Spei() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step$StatementFinancing;", "Lcom/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StatementFinancing extends CreditCardRepayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StatementFinancing f69585a = new StatementFinancing();

        @NotNull
        public static final Parcelable.Creator<StatementFinancing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StatementFinancing.f69585a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementFinancing[i];
            }
        }

        private StatementFinancing() {
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

    private CreditCardRepayFlowContract$Step() {
    }
}
