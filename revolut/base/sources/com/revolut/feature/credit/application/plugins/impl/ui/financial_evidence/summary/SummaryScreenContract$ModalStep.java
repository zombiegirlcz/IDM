package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import xu3.g0;
import xu3.h0;
import xu3.i0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevolutAccountDetails", "RevolutOnlyConfirmation", "RevokeRevolutAccount", "RemoveDocumentConfirmation", "TransactionManagement", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$RemoveDocumentConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$RevokeRevolutAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$RevolutAccountDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$RevolutOnlyConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$TransactionManagement;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SummaryScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$RemoveDocumentConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveDocumentConfirmation implements SummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RemoveDocumentConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ry3.a f67736a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveDocumentConfirmation((ry3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveDocumentConfirmation[i];
            }
        }

        public RemoveDocumentConfirmation(ry3.a document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f67736a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemoveDocumentConfirmation) && Intrinsics.f(this.f67736a, ((RemoveDocumentConfirmation) obj2).f67736a);
        }

        public final int hashCode() {
            return this.f67736a.f258207a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67736a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$RevokeRevolutAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeRevolutAccount implements SummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevokeRevolutAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g0 f67737a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeRevolutAccount((g0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeRevolutAccount[i];
            }
        }

        public RevokeRevolutAccount(g0 configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67737a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevokeRevolutAccount) && Intrinsics.f(this.f67737a, ((RevokeRevolutAccount) obj2).f67737a);
        }

        public final int hashCode() {
            return this.f67737a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67737a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$RevolutAccountDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutAccountDetails implements SummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevolutAccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f67738a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutAccountDetails((h0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutAccountDetails[i];
            }
        }

        public RevolutAccountDetails(h0 configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67738a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevolutAccountDetails) && Intrinsics.f(this.f67738a, ((RevolutAccountDetails) obj2).f67738a);
        }

        public final int hashCode() {
            return this.f67738a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67738a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$RevolutOnlyConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutOnlyConfirmation implements SummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevolutOnlyConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f67739a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutOnlyConfirmation((i0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutOnlyConfirmation[i];
            }
        }

        public RevolutOnlyConfirmation(i0 configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67739a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevolutOnlyConfirmation) && Intrinsics.f(this.f67739a, ((RevolutOnlyConfirmation) obj2).f67739a);
        }

        public final int hashCode() {
            return this.f67739a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67739a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep$TransactionManagement;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionManagement implements SummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TransactionManagement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f67740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a3 f67741b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionManagement((Clause) parcel.readParcelable(TransactionManagement.class.getClassLoader()), (a3) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionManagement[i];
            }
        }

        public TransactionManagement(Clause title, a3 transaction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f67740a = title;
            this.f67741b = transaction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionManagement)) {
                return false;
            }
            TransactionManagement transactionManagement = (TransactionManagement) obj2;
            return Intrinsics.f(this.f67740a, transactionManagement.f67740a) && Intrinsics.f(this.f67741b, transactionManagement.f67741b);
        }

        public final int hashCode() {
            return this.f67741b.hashCode() + (this.f67740a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67740a, i);
            dest.writeSerializable(this.f67741b);
        }
    }
}
