package com.revolut.feature.credit.autopay.ui.screen.confirm_autopay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.autopay.model.CreditCardAutoPayDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$PaymentUiStyle;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "LoanApplication", "LoanManagement", "CreditCard", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData$CreditCard;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData$LoanApplication;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData$LoanManagement;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConfirmAutopayContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData$LoanApplication;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanApplication implements ConfirmAutopayContract$InputData {

        @NotNull
        public static final Parcelable.Creator<LoanApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoPayRepaymentDataRequest f68622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsContext f68623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConfirmAutopayContract$PaymentUiStyle f68624c;
        public final ConfirmAutopayContract$ScreenConfig d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanApplication((AutoPayRepaymentDataRequest) parcel.readParcelable(LoanApplication.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(LoanApplication.class.getClassLoader()), (ConfirmAutopayContract$PaymentUiStyle) parcel.readParcelable(LoanApplication.class.getClassLoader()), ConfirmAutopayContract$ScreenConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanApplication[i];
            }
        }

        public LoanApplication(AutoPayRepaymentDataRequest autoPayDataRequest, AnalyticsContext analyticsContext, ConfirmAutopayContract$PaymentUiStyle paymentUiStyle, ConfirmAutopayContract$ScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(autoPayDataRequest, "autoPayDataRequest");
            Intrinsics.checkNotNullParameter(paymentUiStyle, "paymentUiStyle");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f68622a = autoPayDataRequest;
            this.f68623b = analyticsContext;
            this.f68624c = paymentUiStyle;
            this.d = screenConfig;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: I, reason: from getter */
        public final ConfirmAutopayContract$ScreenConfig getD() {
            return this.d;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: I9, reason: from getter */
        public final AutoPayRepaymentDataRequest getF68625a() {
            return this.f68622a;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: R, reason: from getter */
        public final AnalyticsContext getF68626b() {
            return this.f68623b;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: b6, reason: from getter */
        public final ConfirmAutopayContract$PaymentUiStyle getF68627c() {
            return this.f68624c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoanApplication)) {
                return false;
            }
            LoanApplication loanApplication = (LoanApplication) obj2;
            return Intrinsics.f(this.f68622a, loanApplication.f68622a) && Intrinsics.f(this.f68623b, loanApplication.f68623b) && Intrinsics.f(this.f68624c, loanApplication.f68624c) && Intrinsics.f(this.d, loanApplication.d);
        }

        public final int hashCode() {
            int iHashCode = this.f68622a.hashCode() * 31;
            AnalyticsContext analyticsContext = this.f68623b;
            return this.d.hashCode() + ((this.f68624c.hashCode() + ((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68622a, i);
            dest.writeParcelable(this.f68623b, i);
            dest.writeParcelable(this.f68624c, i);
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData$LoanManagement;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanManagement implements ConfirmAutopayContract$InputData {

        @NotNull
        public static final Parcelable.Creator<LoanManagement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoPayRepaymentDataRequest f68625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsContext f68626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConfirmAutopayContract$PaymentUiStyle f68627c;
        public final ConfirmAutopayContract$ScreenConfig d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanManagement((AutoPayRepaymentDataRequest) parcel.readParcelable(LoanManagement.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(LoanManagement.class.getClassLoader()), (ConfirmAutopayContract$PaymentUiStyle) parcel.readParcelable(LoanManagement.class.getClassLoader()), ConfirmAutopayContract$ScreenConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanManagement[i];
            }
        }

        public LoanManagement(AutoPayRepaymentDataRequest autoPayDataRequest, AnalyticsContext analyticsContext, ConfirmAutopayContract$PaymentUiStyle paymentUiStyle, ConfirmAutopayContract$ScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(autoPayDataRequest, "autoPayDataRequest");
            Intrinsics.checkNotNullParameter(paymentUiStyle, "paymentUiStyle");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f68625a = autoPayDataRequest;
            this.f68626b = analyticsContext;
            this.f68627c = paymentUiStyle;
            this.d = screenConfig;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: I, reason: from getter */
        public final ConfirmAutopayContract$ScreenConfig getD() {
            return this.d;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: I9, reason: from getter */
        public final AutoPayRepaymentDataRequest getF68625a() {
            return this.f68625a;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: R, reason: from getter */
        public final AnalyticsContext getF68626b() {
            return this.f68626b;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: b6, reason: from getter */
        public final ConfirmAutopayContract$PaymentUiStyle getF68627c() {
            return this.f68627c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoanManagement)) {
                return false;
            }
            LoanManagement loanManagement = (LoanManagement) obj2;
            return Intrinsics.f(this.f68625a, loanManagement.f68625a) && Intrinsics.f(this.f68626b, loanManagement.f68626b) && Intrinsics.f(this.f68627c, loanManagement.f68627c) && Intrinsics.f(this.d, loanManagement.d);
        }

        public final int hashCode() {
            int iHashCode = this.f68625a.hashCode() * 31;
            AnalyticsContext analyticsContext = this.f68626b;
            return this.d.hashCode() + ((this.f68627c.hashCode() + ((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68625a, i);
            dest.writeParcelable(this.f68626b, i);
            dest.writeParcelable(this.f68627c, i);
            this.d.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: I */
    ConfirmAutopayContract$ScreenConfig getD();

    /* JADX INFO: renamed from: I9 */
    AutoPayRepaymentDataRequest getF68625a();

    /* JADX INFO: renamed from: R */
    AnalyticsContext getF68626b();

    /* JADX INFO: renamed from: b6 */
    ConfirmAutopayContract$PaymentUiStyle getF68627c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData$CreditCard;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCard implements ConfirmAutopayContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CreditCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoPayRepaymentDataRequest f68619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsContext f68620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConfirmAutopayContract$PaymentUiStyle f68621c;
        public final ConfirmAutopayContract$ScreenConfig d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCard((AutoPayRepaymentDataRequest) parcel.readParcelable(CreditCard.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(CreditCard.class.getClassLoader()), (ConfirmAutopayContract$PaymentUiStyle) parcel.readParcelable(CreditCard.class.getClassLoader()), ConfirmAutopayContract$ScreenConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCard[i];
            }
        }

        public CreditCard(AutoPayRepaymentDataRequest autoPayDataRequest, AnalyticsContext analyticsContext, ConfirmAutopayContract$PaymentUiStyle paymentUiStyle, ConfirmAutopayContract$ScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(autoPayDataRequest, "autoPayDataRequest");
            Intrinsics.checkNotNullParameter(paymentUiStyle, "paymentUiStyle");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f68619a = autoPayDataRequest;
            this.f68620b = analyticsContext;
            this.f68621c = paymentUiStyle;
            this.d = screenConfig;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: I, reason: from getter */
        public final ConfirmAutopayContract$ScreenConfig getD() {
            return this.d;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: I9, reason: from getter */
        public final AutoPayRepaymentDataRequest getF68625a() {
            return this.f68619a;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: R, reason: from getter */
        public final AnalyticsContext getF68626b() {
            return this.f68620b;
        }

        @Override // com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData
        /* JADX INFO: renamed from: b6, reason: from getter */
        public final ConfirmAutopayContract$PaymentUiStyle getF68627c() {
            return this.f68621c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCard)) {
                return false;
            }
            CreditCard creditCard = (CreditCard) obj2;
            return Intrinsics.f(this.f68619a, creditCard.f68619a) && Intrinsics.f(this.f68620b, creditCard.f68620b) && Intrinsics.f(this.f68621c, creditCard.f68621c) && Intrinsics.f(this.d, creditCard.d);
        }

        public final int hashCode() {
            int iHashCode = this.f68619a.hashCode() * 31;
            AnalyticsContext analyticsContext = this.f68620b;
            return this.d.hashCode() + ((this.f68621c.hashCode() + ((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68619a, i);
            dest.writeParcelable(this.f68620b, i);
            dest.writeParcelable(this.f68621c, i);
            this.d.writeToParcel(dest, i);
        }

        public /* synthetic */ CreditCard(CreditCardAutoPayDataRequest creditCardAutoPayDataRequest, AnalyticsContext analyticsContext, ConfirmAutopayContract$PaymentUiStyle.Custom custom, ConfirmAutopayContract$ScreenConfig confirmAutopayContract$ScreenConfig, int i) {
            this(creditCardAutoPayDataRequest, (i & 2) != 0 ? null : analyticsContext, (i & 4) != 0 ? ConfirmAutopayContract$PaymentUiStyle.Default.f68631a : custom, confirmAutopayContract$ScreenConfig);
        }
    }
}
