package com.revolut.feature.topup_screen.impl.flow.external_card_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ExternalCardDetails", "CardVerificationWorkflow", "DeleteCardConfirmation", "Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step$CardVerificationWorkflow;", "Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step$DeleteCardConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step$ExternalCardDetails;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExternalCardDetailsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step$CardVerificationWorkflow;", "Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardVerificationWorkflow implements ExternalCardDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardVerificationWorkflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90604a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardVerificationWorkflow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardVerificationWorkflow[i];
            }
        }

        public CardVerificationWorkflow(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f90604a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardVerificationWorkflow) && Intrinsics.f(this.f90604a, ((CardVerificationWorkflow) obj2).f90604a);
        }

        public final int hashCode() {
            return this.f90604a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90604a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step$DeleteCardConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteCardConfirmation implements ExternalCardDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeleteCardConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f90607c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteCardConfirmation(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteCardConfirmation[i];
            }
        }

        public DeleteCardConfirmation(String cardId, String cardName, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(cardName, "cardName");
            this.f90605a = cardId;
            this.f90606b = cardName;
            this.f90607c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeleteCardConfirmation)) {
                return false;
            }
            DeleteCardConfirmation deleteCardConfirmation = (DeleteCardConfirmation) obj2;
            return Intrinsics.f(this.f90605a, deleteCardConfirmation.f90605a) && Intrinsics.f(this.f90606b, deleteCardConfirmation.f90606b) && this.f90607c == deleteCardConfirmation.f90607c && this.d == deleteCardConfirmation.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f90605a.hashCode() * 31, 31, this.f90606b), 31, this.f90607c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90605a);
            dest.writeString(this.f90606b);
            dest.writeInt(this.f90607c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step$ExternalCardDetails;", "Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalCardDetails implements ExternalCardDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExternalCardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalCardDetailsScreenContract$InputData f90608a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalCardDetails(ExternalCardDetailsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalCardDetails[i];
            }
        }

        public ExternalCardDetails(ExternalCardDetailsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90608a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExternalCardDetails) && Intrinsics.f(this.f90608a, ((ExternalCardDetails) obj2).f90608a);
        }

        public final int hashCode() {
            return this.f90608a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90608a.writeToParcel(dest, i);
        }
    }
}
