package com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Documents", "DocumentViewer", "QuitApplicationDialog", "Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step$DocumentViewer;", "Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step$Documents;", "Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step$QuitApplicationDialog;", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditForbearanceAgreementsContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step$DocumentViewer;", "Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentViewer extends CreditForbearanceAgreementsContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentViewer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final du3.a f69932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DocumentViewerScreenConfig f69933b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentViewer((du3.a) parcel.readSerializable(), (DocumentViewerScreenConfig) parcel.readParcelable(DocumentViewer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentViewer[i];
            }
        }

        public DocumentViewer(du3.a document, DocumentViewerScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(document, "document");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f69932a = document;
            this.f69933b = screenConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentViewer)) {
                return false;
            }
            DocumentViewer documentViewer = (DocumentViewer) obj2;
            return Intrinsics.f(this.f69932a, documentViewer.f69932a) && Intrinsics.f(this.f69933b, documentViewer.f69933b);
        }

        public final int hashCode() {
            return this.f69933b.hashCode() + (this.f69932a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69932a);
            dest.writeParcelable(this.f69933b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step$Documents;", "Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents extends CreditForbearanceAgreementsContract$Step {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f69935b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Documents(parcel.readString(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        public Documents(String applicationId, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f69934a = applicationId;
            this.f69935b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Documents)) {
                return false;
            }
            Documents documents = (Documents) obj2;
            return Intrinsics.f(this.f69934a, documents.f69934a) && Intrinsics.f(this.f69935b, documents.f69935b);
        }

        public final int hashCode() {
            return this.f69935b.f297794a.hashCode() + (this.f69934a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69934a);
            dest.writeSerializable(this.f69935b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step$QuitApplicationDialog;", "Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsContract$Step;", "<init>", "()V", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QuitApplicationDialog extends CreditForbearanceAgreementsContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QuitApplicationDialog f69936a = new QuitApplicationDialog();

        @NotNull
        public static final Parcelable.Creator<QuitApplicationDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QuitApplicationDialog.f69936a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QuitApplicationDialog[i];
            }
        }

        private QuitApplicationDialog() {
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

    private CreditForbearanceAgreementsContract$Step() {
    }
}
