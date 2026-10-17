package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xu3.b;
import xu3.f;
import xu3.x;
import xu3.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EvidenceCategorySelection", "EvidenceTypeSelection", "RevolutTransactionsSelection", "LinkExternalAccount", "MissingBank", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$EvidenceCategorySelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$EvidenceTypeSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$LinkExternalAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$MissingBank;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$RevolutTransactionsSelection;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddEvidenceFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$EvidenceCategorySelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceCategorySelection implements AddEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceCategorySelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f67691a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EvidenceCategorySelection((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceCategorySelection[i];
            }
        }

        public EvidenceCategorySelection(b configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67691a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EvidenceCategorySelection) && Intrinsics.f(this.f67691a, ((EvidenceCategorySelection) obj2).f67691a);
        }

        public final int hashCode() {
            return this.f67691a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67691a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$EvidenceTypeSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceTypeSelection implements AddEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceTypeSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zv3.a f67692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f67693b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EvidenceTypeSelection(zv3.a.valueOf(parcel.readString()), (x) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceTypeSelection[i];
            }
        }

        public EvidenceTypeSelection(zv3.a navigationIcon, x configuration) {
            Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67692a = navigationIcon;
            this.f67693b = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EvidenceTypeSelection)) {
                return false;
            }
            EvidenceTypeSelection evidenceTypeSelection = (EvidenceTypeSelection) obj2;
            return this.f67692a == evidenceTypeSelection.f67692a && Intrinsics.f(this.f67693b, evidenceTypeSelection.f67693b);
        }

        public final int hashCode() {
            return this.f67693b.hashCode() + (this.f67692a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67692a.name());
            dest.writeSerializable(this.f67693b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$LinkExternalAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkExternalAccount implements AddEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkExternalAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalAccountsFeatureConfig.Configuration.TrueLayer f67694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f67695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f67696c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkExternalAccount((ExternalAccountsFeatureConfig.Configuration.TrueLayer) parcel.readParcelable(LinkExternalAccount.class.getClassLoader()), (f) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkExternalAccount[i];
            }
        }

        public LinkExternalAccount(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayerConfiguration, f fVar, String str) {
            Intrinsics.checkNotNullParameter(trueLayerConfiguration, "trueLayerConfiguration");
            this.f67694a = trueLayerConfiguration;
            this.f67695b = fVar;
            this.f67696c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkExternalAccount)) {
                return false;
            }
            LinkExternalAccount linkExternalAccount = (LinkExternalAccount) obj2;
            return Intrinsics.f(this.f67694a, linkExternalAccount.f67694a) && Intrinsics.f(this.f67695b, linkExternalAccount.f67695b) && Intrinsics.f(this.f67696c, linkExternalAccount.f67696c);
        }

        public final int hashCode() {
            int iHashCode = this.f67694a.hashCode() * 31;
            f fVar = this.f67695b;
            int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
            String str = this.f67696c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67694a, i);
            dest.writeSerializable(this.f67695b);
            dest.writeString(this.f67696c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$MissingBank;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MissingBank implements AddEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MissingBank> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f67697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f67698b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MissingBank((f) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MissingBank[i];
            }
        }

        public MissingBank(f configuration, String uploadDocumentPopupTitle) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(uploadDocumentPopupTitle, "uploadDocumentPopupTitle");
            this.f67697a = configuration;
            this.f67698b = uploadDocumentPopupTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MissingBank)) {
                return false;
            }
            MissingBank missingBank = (MissingBank) obj2;
            return Intrinsics.f(this.f67697a, missingBank.f67697a) && Intrinsics.f(this.f67698b, missingBank.f67698b);
        }

        public final int hashCode() {
            return this.f67698b.hashCode() + (this.f67697a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67697a);
            dest.writeString(this.f67698b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step$RevolutTransactionsSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/add/flow/AddEvidenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutTransactionsSelection implements AddEvidenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevolutTransactionsSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f67699a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutTransactionsSelection((y) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutTransactionsSelection[i];
            }
        }

        public RevolutTransactionsSelection(y configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67699a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevolutTransactionsSelection) && Intrinsics.f(this.f67699a, ((RevolutTransactionsSelection) obj2).f67699a);
        }

        public final int hashCode() {
            return this.f67699a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67699a);
        }
    }
}
