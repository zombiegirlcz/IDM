package com.revolut.feature.insurance_car.impl.ui.flow.upload_documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DocumentsList", "DocumentUploadHint", "DocumentRejectionReason", "DocumentsPreview", "FilesGeneric", "FilesLicenceFront", "FilesLicenceBack", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$DocumentRejectionReason;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$DocumentUploadHint;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$DocumentsList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$DocumentsPreview;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$FilesGeneric;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$FilesLicenceBack;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$FilesLicenceFront;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UploadDocumentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$DocumentRejectionReason;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentRejectionReason extends UploadDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentRejectionReason> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestedDocument f75498a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentRejectionReason(RequestedDocument.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentRejectionReason[i];
            }
        }

        public DocumentRejectionReason(RequestedDocument document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f75498a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentRejectionReason) && Intrinsics.f(this.f75498a, ((DocumentRejectionReason) obj2).f75498a);
        }

        public final int hashCode() {
            return this.f75498a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75498a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$DocumentUploadHint;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentUploadHint extends UploadDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentUploadHint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestedDocument f75499a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentUploadHint(RequestedDocument.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentUploadHint[i];
            }
        }

        public DocumentUploadHint(RequestedDocument document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f75499a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentUploadHint) && Intrinsics.f(this.f75499a, ((DocumentUploadHint) obj2).f75499a);
        }

        public final int hashCode() {
            return this.f75499a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75499a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$DocumentsList;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentsList extends UploadDocumentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentsList f75500a = new DocumentsList();

        @NotNull
        public static final Parcelable.Creator<DocumentsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentsList.f75500a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsList[i];
            }
        }

        private DocumentsList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$DocumentsPreview;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsPreview extends UploadDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentsPreview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestedDocument f75501a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsPreview(RequestedDocument.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsPreview[i];
            }
        }

        public DocumentsPreview(RequestedDocument document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f75501a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentsPreview) && Intrinsics.f(this.f75501a, ((DocumentsPreview) obj2).f75501a);
        }

        public final int hashCode() {
            return this.f75501a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75501a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$FilesGeneric;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FilesGeneric extends UploadDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FilesGeneric> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestedDocument f75502a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FilesGeneric(RequestedDocument.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FilesGeneric[i];
            }
        }

        public FilesGeneric(RequestedDocument document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f75502a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FilesGeneric) && Intrinsics.f(this.f75502a, ((FilesGeneric) obj2).f75502a);
        }

        public final int hashCode() {
            return this.f75502a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75502a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$FilesLicenceBack;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FilesLicenceBack extends UploadDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FilesLicenceBack> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestedDocument f75503a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FilesLicenceBack(RequestedDocument.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FilesLicenceBack[i];
            }
        }

        public FilesLicenceBack(RequestedDocument document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f75503a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FilesLicenceBack) && Intrinsics.f(this.f75503a, ((FilesLicenceBack) obj2).f75503a);
        }

        public final int hashCode() {
            return this.f75503a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75503a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step$FilesLicenceFront;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/upload_documents/UploadDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FilesLicenceFront extends UploadDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FilesLicenceFront> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestedDocument f75504a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FilesLicenceFront(RequestedDocument.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FilesLicenceFront[i];
            }
        }

        public FilesLicenceFront(RequestedDocument document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f75504a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FilesLicenceFront) && Intrinsics.f(this.f75504a, ((FilesLicenceFront) obj2).f75504a);
        }

        public final int hashCode() {
            return this.f75504a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75504a.writeToParcel(dest, i);
        }
    }

    private UploadDocumentsFlowContract$Step() {
    }
}
