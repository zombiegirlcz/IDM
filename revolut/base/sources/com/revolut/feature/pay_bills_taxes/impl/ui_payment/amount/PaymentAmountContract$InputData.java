package com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui_payment/amount/PaymentAmountContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewTransfer", "WithTransferData", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/amount/PaymentAmountContract$InputData$NewTransfer;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/amount/PaymentAmountContract$InputData$WithTransferData;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentAmountContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/amount/PaymentAmountContract$InputData$NewTransfer;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/amount/PaymentAmountContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer implements PaymentAmountContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f78762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BillPaymentNavigation$BillData f78763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f78764c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f78765g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                g gVarValueOf = g.valueOf(parcel.readString());
                BillPaymentNavigation$BillData billPaymentNavigation$BillData = (BillPaymentNavigation$BillData) parcel.readParcelable(NewTransfer.class.getClassLoader());
                Clause clause = (Clause) parcel.readParcelable(NewTransfer.class.getClassLoader());
                boolean z6 = false;
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z11 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new NewTransfer(gVarValueOf, billPaymentNavigation$BillData, clause, z6, z11, z3, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(g paymentMethod, BillPaymentNavigation$BillData billData, Clause descriptor, boolean z, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(billData, "billData");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f78762a = paymentMethod;
            this.f78763b = billData;
            this.f78764c = descriptor;
            this.d = z;
            this.e = z3;
            this.f = z4;
            this.f78765g = z6;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: G3, reason: from getter */
        public final BillPaymentNavigation$BillData getF78768c() {
            return this.f78763b;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: H4, reason: from getter */
        public final boolean getF78769g() {
            return this.f;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: S3, reason: from getter */
        public final g getF78767b() {
            return this.f78762a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewTransfer)) {
                return false;
            }
            NewTransfer newTransfer = (NewTransfer) obj2;
            return this.f78762a == newTransfer.f78762a && Intrinsics.f(this.f78763b, newTransfer.f78763b) && Intrinsics.f(this.f78764c, newTransfer.f78764c) && this.d == newTransfer.d && this.e == newTransfer.e && this.f == newTransfer.f && this.f78765g == newTransfer.f78765g;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: getDescriptor, reason: from getter */
        public final Clause getD() {
            return this.f78764c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78765g) + j6.a.c(j6.a.c(j6.a.c(p.a.a((this.f78763b.hashCode() + (this.f78762a.hashCode() * 31)) * 31, 31, this.f78764c), 31, this.d), 31, this.e), 31, this.f);
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: r3, reason: from getter */
        public final boolean getF78770h() {
            return this.f78765g;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: t4, reason: from getter */
        public final boolean getF() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78762a.name());
            dest.writeParcelable(this.f78763b, i);
            dest.writeParcelable(this.f78764c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f78765g ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/amount/PaymentAmountContract$InputData$WithTransferData;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/amount/PaymentAmountContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithTransferData implements PaymentAmountContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithTransferData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentData f78766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f78767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BillPaymentNavigation$BillData f78768c;
        public final Clause d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f78769g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f78770h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PaymentData paymentDataCreateFromParcel = PaymentData.CREATOR.createFromParcel(parcel);
                g gVarValueOf = g.valueOf(parcel.readString());
                BillPaymentNavigation$BillData billPaymentNavigation$BillData = (BillPaymentNavigation$BillData) parcel.readParcelable(WithTransferData.class.getClassLoader());
                Clause clause = (Clause) parcel.readParcelable(WithTransferData.class.getClassLoader());
                boolean z6 = false;
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z11 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new WithTransferData(paymentDataCreateFromParcel, gVarValueOf, billPaymentNavigation$BillData, clause, z6, z11, z3, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTransferData[i];
            }
        }

        public WithTransferData(PaymentData paymentData, g paymentMethod, BillPaymentNavigation$BillData billData, Clause descriptor, boolean z, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(paymentData, "paymentData");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(billData, "billData");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f78766a = paymentData;
            this.f78767b = paymentMethod;
            this.f78768c = billData;
            this.d = descriptor;
            this.e = z;
            this.f = z3;
            this.f78769g = z4;
            this.f78770h = z6;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: G3, reason: from getter */
        public final BillPaymentNavigation$BillData getF78768c() {
            return this.f78768c;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: H4, reason: from getter */
        public final boolean getF78769g() {
            return this.f78769g;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: S3, reason: from getter */
        public final g getF78767b() {
            return this.f78767b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithTransferData)) {
                return false;
            }
            WithTransferData withTransferData = (WithTransferData) obj2;
            return Intrinsics.f(this.f78766a, withTransferData.f78766a) && this.f78767b == withTransferData.f78767b && Intrinsics.f(this.f78768c, withTransferData.f78768c) && Intrinsics.f(this.d, withTransferData.d) && this.e == withTransferData.e && this.f == withTransferData.f && this.f78769g == withTransferData.f78769g && this.f78770h == withTransferData.f78770h;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: getDescriptor, reason: from getter */
        public final Clause getD() {
            return this.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78770h) + j6.a.c(j6.a.c(j6.a.c(p.a.a((this.f78768c.hashCode() + ((this.f78767b.hashCode() + (this.f78766a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f78769g);
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: r3, reason: from getter */
        public final boolean getF78770h() {
            return this.f78770h;
        }

        @Override // com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData
        /* JADX INFO: renamed from: t4, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f78766a.writeToParcel(dest, i);
            dest.writeString(this.f78767b.name());
            dest.writeParcelable(this.f78768c, i);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f78769g ? 1 : 0);
            dest.writeInt(this.f78770h ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: G3 */
    BillPaymentNavigation$BillData getF78768c();

    /* JADX INFO: renamed from: H4 */
    boolean getF78769g();

    /* JADX INFO: renamed from: S3 */
    g getF78767b();

    /* JADX INFO: renamed from: getDescriptor */
    Clause getD();

    /* JADX INFO: renamed from: r3 */
    boolean getF78770h();

    /* JADX INFO: renamed from: t4 */
    boolean getF();
}
