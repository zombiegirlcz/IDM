package com.revolut.feature.kyc.impl.flow.addressverification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreenContract$InputData;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DocumentsIntro", "DocumentReview", "AddressConfirmation", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step$AddressConfirmation;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step$DocumentReview;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step$DocumentsIntro;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProofOfAddressFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step$AddressConfirmation;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressConfirmation extends ProofOfAddressFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddressConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AddressConfirmationScreenContract$InputData f77683a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressConfirmation(AddressConfirmationScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressConfirmation[i];
            }
        }

        public AddressConfirmation(AddressConfirmationScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f77683a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddressConfirmation) && Intrinsics.f(this.f77683a, ((AddressConfirmation) obj2).f77683a);
        }

        public final int hashCode() {
            return this.f77683a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77683a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step$DocumentReview;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentReview extends ProofOfAddressFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DocumentReviewScreenContract$InputData f77684a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentReview(DocumentReviewScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentReview[i];
            }
        }

        public DocumentReview(DocumentReviewScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f77684a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentReview) && Intrinsics.f(this.f77684a, ((DocumentReview) obj2).f77684a);
        }

        public final int hashCode() {
            return this.f77684a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77684a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step$DocumentsIntro;", "Lcom/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsIntro extends ProofOfAddressFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentsIntro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProofOfAddressFlowContract$DocumentsUploadConfig f77685a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsIntro(ProofOfAddressFlowContract$DocumentsUploadConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsIntro[i];
            }
        }

        public DocumentsIntro(ProofOfAddressFlowContract$DocumentsUploadConfig documentsUploadConfig) {
            Intrinsics.checkNotNullParameter(documentsUploadConfig, "documentsUploadConfig");
            this.f77685a = documentsUploadConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentsIntro) && Intrinsics.f(this.f77685a, ((DocumentsIntro) obj2).f77685a);
        }

        public final int hashCode() {
            return this.f77685a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77685a.writeToParcel(dest, i);
        }
    }

    private ProofOfAddressFlowContract$Step() {
    }
}
