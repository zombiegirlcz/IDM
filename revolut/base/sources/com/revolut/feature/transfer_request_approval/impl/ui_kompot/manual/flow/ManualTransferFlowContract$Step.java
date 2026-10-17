package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferContract$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Amount", "Review", "Apm", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step$Amount;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step$Apm;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step$Review;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ManualTransferFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step$Amount;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount implements ManualTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManualTransferContract$InputData f92474a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount((ManualTransferContract$InputData) parcel.readParcelable(Amount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(ManualTransferContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f92474a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amount) && Intrinsics.f(this.f92474a, ((Amount) obj2).f92474a);
        }

        public final int hashCode() {
            return this.f92474a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92474a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step$Apm;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Apm implements ManualTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Apm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTransferWrapperNavigation$InputData f92475a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Apm((ApmTransferWrapperNavigation$InputData) parcel.readParcelable(Apm.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Apm[i];
            }
        }

        public Apm(ApmTransferWrapperNavigation$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f92475a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Apm) && Intrinsics.f(this.f92475a, ((Apm) obj2).f92475a);
        }

        public final int hashCode() {
            return this.f92475a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92475a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step$Review;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements ManualTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManualTransferReviewScreenContract$InputData f92476a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(ManualTransferReviewScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(ManualTransferReviewScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f92476a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f92476a, ((Review) obj2).f92476a);
        }

        public final int hashCode() {
            return this.f92476a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f92476a.writeToParcel(dest, i);
        }
    }
}
