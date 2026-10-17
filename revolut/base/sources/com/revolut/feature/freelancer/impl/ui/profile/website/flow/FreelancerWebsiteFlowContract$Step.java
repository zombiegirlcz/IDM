package com.revolut.feature.freelancer.impl.ui.profile.website.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "EditWebsite", "ReviewPrompt", "ChangeRequest", "Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step$ChangeRequest;", "Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step$EditWebsite;", "Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step$ReviewPrompt;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerWebsiteFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step$ChangeRequest;", "Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeRequest extends FreelancerWebsiteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74080a;

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
            this.f74080a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeRequest) && Intrinsics.f(this.f74080a, ((ChangeRequest) obj2).f74080a);
        }

        public final int hashCode() {
            return this.f74080a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74080a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step$EditWebsite;", "Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditWebsite extends FreelancerWebsiteFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditWebsite f74081a = new EditWebsite();

        @NotNull
        public static final Parcelable.Creator<EditWebsite> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditWebsite.f74081a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditWebsite[i];
            }
        }

        private EditWebsite() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step$ReviewPrompt;", "Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReviewPrompt extends FreelancerWebsiteFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReviewPrompt f74082a = new ReviewPrompt();

        @NotNull
        public static final Parcelable.Creator<ReviewPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReviewPrompt.f74082a;
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

    private FreelancerWebsiteFlowContract$Step() {
    }
}
