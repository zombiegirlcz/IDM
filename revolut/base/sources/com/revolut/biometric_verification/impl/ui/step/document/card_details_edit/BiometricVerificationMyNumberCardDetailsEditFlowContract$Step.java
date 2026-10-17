package com.revolut.biometric_verification.impl.ui.step.document.card_details_edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vs.f;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/card_details_edit/BiometricVerificationMyNumberCardDetailsEditFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DateOfBirth", "CardDetails", "Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/BiometricVerificationMyNumberCardDetailsEditFlowContract$Step$CardDetails;", "Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/BiometricVerificationMyNumberCardDetailsEditFlowContract$Step$DateOfBirth;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationMyNumberCardDetailsEditFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/BiometricVerificationMyNumberCardDetailsEditFlowContract$Step$CardDetails;", "Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/BiometricVerificationMyNumberCardDetailsEditFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardDetails implements BiometricVerificationMyNumberCardDetailsEditFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f50525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f50526b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardDetails(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDetails[i];
            }
        }

        public CardDetails(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details, f fVar) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f50525a = details;
            this.f50526b = fVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardDetails)) {
                return false;
            }
            CardDetails cardDetails = (CardDetails) obj2;
            return Intrinsics.f(this.f50525a, cardDetails.f50525a) && this.f50526b == cardDetails.f50526b;
        }

        public final int hashCode() {
            int iHashCode = this.f50525a.hashCode() * 31;
            f fVar = this.f50526b;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f50525a.writeToParcel(dest, i);
            f fVar = this.f50526b;
            if (fVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(fVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/BiometricVerificationMyNumberCardDetailsEditFlowContract$Step$DateOfBirth;", "Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/BiometricVerificationMyNumberCardDetailsEditFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateOfBirth implements BiometricVerificationMyNumberCardDetailsEditFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DateOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f50527a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateOfBirth(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateOfBirth[i];
            }
        }

        public DateOfBirth(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f50527a = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateOfBirth) && Intrinsics.f(this.f50527a, ((DateOfBirth) obj2).f50527a);
        }

        public final int hashCode() {
            return this.f50527a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f50527a.writeToParcel(dest, i);
        }
    }
}
