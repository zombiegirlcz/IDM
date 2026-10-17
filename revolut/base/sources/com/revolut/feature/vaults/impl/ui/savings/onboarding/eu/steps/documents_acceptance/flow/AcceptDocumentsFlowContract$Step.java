package com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DocumentsToAcceptList", "ReviewAndAccept", "Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlowContract$Step$DocumentsToAcceptList;", "Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlowContract$Step$ReviewAndAccept;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AcceptDocumentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlowContract$Step$DocumentsToAcceptList;", "Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlowContract$Step;", "<init>", "()V", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentsToAcceptList extends AcceptDocumentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentsToAcceptList f94803a = new DocumentsToAcceptList();

        @NotNull
        public static final Parcelable.Creator<DocumentsToAcceptList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentsToAcceptList.f94803a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsToAcceptList[i];
            }
        }

        private DocumentsToAcceptList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlowContract$Step$ReviewAndAccept;", "Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewAndAccept extends AcceptDocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewAndAccept> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsDocumentToAccept f94804a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewAndAccept((SavingsDocumentToAccept) parcel.readParcelable(ReviewAndAccept.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewAndAccept[i];
            }
        }

        public ReviewAndAccept(SavingsDocumentToAccept document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f94804a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewAndAccept) && Intrinsics.f(this.f94804a, ((ReviewAndAccept) obj2).f94804a);
        }

        public final int hashCode() {
            return this.f94804a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94804a, i);
        }
    }

    private AcceptDocumentsFlowContract$Step() {
    }
}
