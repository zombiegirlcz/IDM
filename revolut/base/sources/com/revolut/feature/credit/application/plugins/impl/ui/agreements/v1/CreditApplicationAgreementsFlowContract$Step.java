package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/CreditApplicationAgreementsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Documents", "DocumentViewer", "Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/CreditApplicationAgreementsFlowContract$Step$DocumentViewer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/CreditApplicationAgreementsFlowContract$Step$Documents;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditApplicationAgreementsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/CreditApplicationAgreementsFlowContract$Step$DocumentViewer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/CreditApplicationAgreementsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentViewer extends CreditApplicationAgreementsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentViewer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final du3.a f66995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DocumentViewerScreenConfig f66996b;

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
            this.f66995a = document;
            this.f66996b = screenConfig;
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
            return Intrinsics.f(this.f66995a, documentViewer.f66995a) && Intrinsics.f(this.f66996b, documentViewer.f66996b);
        }

        public final int hashCode() {
            return this.f66996b.hashCode() + (this.f66995a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66995a);
            dest.writeParcelable(this.f66996b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/CreditApplicationAgreementsFlowContract$Step$Documents;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/CreditApplicationAgreementsFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Documents extends CreditApplicationAgreementsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Documents f66997a = new Documents();

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Documents.f66997a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        private Documents() {
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

    private CreditApplicationAgreementsFlowContract$Step() {
    }
}
