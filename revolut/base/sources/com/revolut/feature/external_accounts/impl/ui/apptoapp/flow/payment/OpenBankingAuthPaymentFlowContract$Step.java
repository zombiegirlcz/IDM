package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PaymentScreen", "BalancePicker", "TotalMayChangeDialog", "PaymentBreakdown", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step$BalancePicker;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step$PaymentBreakdown;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step$PaymentScreen;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step$TotalMayChangeDialog;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenBankingAuthPaymentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step$BalancePicker;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalancePicker extends OpenBankingAuthPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BalancePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BalanceSelector$InputData f72508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f72510c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalancePicker((BalanceSelector$InputData) parcel.readParcelable(BalancePicker.class.getClassLoader()), parcel.readString(), (dj0.d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalancePicker[i];
            }
        }

        public BalancePicker(BalanceSelector$InputData inputData, String initialPocketId, dj0.d paymentAmount, boolean z) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(initialPocketId, "initialPocketId");
            Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
            this.f72508a = inputData;
            this.f72509b = initialPocketId;
            this.f72510c = paymentAmount;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalancePicker)) {
                return false;
            }
            BalancePicker balancePicker = (BalancePicker) obj2;
            return Intrinsics.f(this.f72508a, balancePicker.f72508a) && Intrinsics.f(this.f72509b, balancePicker.f72509b) && Intrinsics.f(this.f72510c, balancePicker.f72510c) && this.d == balancePicker.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + v7.c(p.a.c(this.f72508a.hashCode() * 31, 31, this.f72509b), 31, this.f72510c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72508a, i);
            dest.writeString(this.f72509b);
            dest.writeSerializable(this.f72510c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step$PaymentBreakdown;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentBreakdown extends OpenBankingAuthPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundPaymentExtras f72511a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentBreakdown((OutboundPaymentExtras) parcel.readParcelable(PaymentBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentBreakdown[i];
            }
        }

        public PaymentBreakdown(OutboundPaymentExtras extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            this.f72511a = extras;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentBreakdown) && Intrinsics.f(this.f72511a, ((PaymentBreakdown) obj2).f72511a);
        }

        public final int hashCode() {
            return this.f72511a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72511a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step$PaymentScreen;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentScreen extends OpenBankingAuthPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OpenBankingAuthPaymentScreenContract$InputData f72512a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentScreen(OpenBankingAuthPaymentScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentScreen[i];
            }
        }

        public PaymentScreen(OpenBankingAuthPaymentScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f72512a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentScreen) && Intrinsics.f(this.f72512a, ((PaymentScreen) obj2).f72512a);
        }

        public final int hashCode() {
            return this.f72512a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72512a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step$TotalMayChangeDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/payment/OpenBankingAuthPaymentFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalMayChangeDialog extends OpenBankingAuthPaymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TotalMayChangeDialog f72513a = new TotalMayChangeDialog();

        @NotNull
        public static final Parcelable.Creator<TotalMayChangeDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TotalMayChangeDialog.f72513a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalMayChangeDialog[i];
            }
        }

        private TotalMayChangeDialog() {
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

    private OpenBankingAuthPaymentFlowContract$Step() {
    }
}
