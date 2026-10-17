package com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/flow/documents_review/InsuranceDocumentsReviewFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DocumentsReview", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/documents_review/InsuranceDocumentsReviewFlowContract$Step$DocumentsReview;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InsuranceDocumentsReviewFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/documents_review/InsuranceDocumentsReviewFlowContract$Step$DocumentsReview;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/documents_review/InsuranceDocumentsReviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsReview extends InsuranceDocumentsReviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76067a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsReview(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsReview[i];
            }
        }

        public DocumentsReview(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f76067a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentsReview) && Intrinsics.f(this.f76067a, ((DocumentsReview) obj2).f76067a);
        }

        public final int hashCode() {
            return this.f76067a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76067a);
        }
    }

    private InsuranceDocumentsReviewFlowContract$Step() {
    }
}
