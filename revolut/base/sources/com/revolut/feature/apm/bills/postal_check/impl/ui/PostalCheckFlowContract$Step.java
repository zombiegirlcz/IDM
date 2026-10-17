package com.revolut.feature.apm.bills.postal_check.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "QrScanner", "TermsAndConditions", "Form", "Payment", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$Form;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$Payment;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$QrScanner;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$TermsAndConditions;", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PostalCheckFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$Form;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form implements PostalCheckFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PostalCheckQrScanResult.Success f61515a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Form((PostalCheckQrScanResult.Success) parcel.readParcelable(Form.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        public Form(PostalCheckQrScanResult.Success qrScan) {
            Intrinsics.checkNotNullParameter(qrScan, "qrScan");
            this.f61515a = qrScan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Form) && Intrinsics.f(this.f61515a, ((Form) obj2).f61515a);
        }

        public final int hashCode() {
            return this.f61515a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61515a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$Payment;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Payment implements PostalCheckFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Payment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PostalCheckQrScanResult.Success f61516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f61517b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                PostalCheckQrScanResult.Success success = (PostalCheckQrScanResult.Success) j6.a.f(parcel, "parcel", Payment.class);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Payment(success, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Payment[i];
            }
        }

        public Payment(PostalCheckQrScanResult.Success qrScan, Map userInputs) {
            Intrinsics.checkNotNullParameter(qrScan, "qrScan");
            Intrinsics.checkNotNullParameter(userInputs, "userInputs");
            this.f61516a = qrScan;
            this.f61517b = userInputs;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) obj2;
            return Intrinsics.f(this.f61516a, payment.f61516a) && Intrinsics.f(this.f61517b, payment.f61517b);
        }

        public final int hashCode() {
            return this.f61517b.hashCode() + (this.f61516a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61516a, i);
            Iterator itZ = j6.a.z(this.f61517b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step;", "<init>", "()V", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements PostalCheckFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f61518a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f61518a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$QrScanner;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step;", "<init>", "()V", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrScanner implements PostalCheckFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrScanner f61519a = new QrScanner();

        @NotNull
        public static final Parcelable.Creator<QrScanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrScanner.f61519a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrScanner[i];
            }
        }

        private QrScanner() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step$TermsAndConditions;", "Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions implements PostalCheckFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TermsAndConditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmOnboardingStatusTerms f61520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61521b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsAndConditions((ApmOnboardingStatusTerms) parcel.readParcelable(TermsAndConditions.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAndConditions[i];
            }
        }

        public TermsAndConditions(ApmOnboardingStatusTerms terms, String qrCode) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            Intrinsics.checkNotNullParameter(qrCode, "qrCode");
            this.f61520a = terms;
            this.f61521b = qrCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) obj2;
            return Intrinsics.f(this.f61520a, termsAndConditions.f61520a) && Intrinsics.f(this.f61521b, termsAndConditions.f61521b);
        }

        public final int hashCode() {
            return this.f61521b.hashCode() + (this.f61520a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61520a, i);
            dest.writeString(this.f61521b);
        }
    }
}
