package com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/freelancer/impl/ui/profile/trading_name/flow/FreelancerTradingNameFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ReviewPrompt", "ChangeRequest", "Lcom/revolut/feature/freelancer/impl/ui/profile/trading_name/flow/FreelancerTradingNameFlowContract$Step$ChangeRequest;", "Lcom/revolut/feature/freelancer/impl/ui/profile/trading_name/flow/FreelancerTradingNameFlowContract$Step$ReviewPrompt;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerTradingNameFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/trading_name/flow/FreelancerTradingNameFlowContract$Step$ChangeRequest;", "Lcom/revolut/feature/freelancer/impl/ui/profile/trading_name/flow/FreelancerTradingNameFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeRequest extends FreelancerTradingNameFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74065a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeRequest(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeRequest[i];
            }
        }

        public ChangeRequest(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f74065a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeRequest) && Intrinsics.f(this.f74065a, ((ChangeRequest) obj2).f74065a);
        }

        public final int hashCode() {
            return this.f74065a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74065a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/trading_name/flow/FreelancerTradingNameFlowContract$Step$ReviewPrompt;", "Lcom/revolut/feature/freelancer/impl/ui/profile/trading_name/flow/FreelancerTradingNameFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReviewPrompt extends FreelancerTradingNameFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReviewPrompt f74066a = new ReviewPrompt();

        @NotNull
        public static final Parcelable.Creator<ReviewPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReviewPrompt.f74066a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewPrompt[i];
            }
        }

        private ReviewPrompt() {
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

    private FreelancerTradingNameFlowContract$Step() {
    }
}
