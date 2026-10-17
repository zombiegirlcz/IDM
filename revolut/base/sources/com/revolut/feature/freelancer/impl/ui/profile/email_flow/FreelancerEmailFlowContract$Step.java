package com.revolut.feature.freelancer.impl.ui.profile.email_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/profile/email_flow/FreelancerEmailFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChangeEmail", "CheckEmail", "Lcom/revolut/feature/freelancer/impl/ui/profile/email_flow/FreelancerEmailFlowContract$Step$ChangeEmail;", "Lcom/revolut/feature/freelancer/impl/ui/profile/email_flow/FreelancerEmailFlowContract$Step$CheckEmail;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerEmailFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/email_flow/FreelancerEmailFlowContract$Step$ChangeEmail;", "Lcom/revolut/feature/freelancer/impl/ui/profile/email_flow/FreelancerEmailFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeEmail implements FreelancerEmailFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeEmail f74042a = new ChangeEmail();

        @NotNull
        public static final Parcelable.Creator<ChangeEmail> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeEmail.f74042a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeEmail[i];
            }
        }

        private ChangeEmail() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/email_flow/FreelancerEmailFlowContract$Step$CheckEmail;", "Lcom/revolut/feature/freelancer/impl/ui/profile/email_flow/FreelancerEmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckEmail implements FreelancerEmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CheckEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74043a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckEmail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckEmail[i];
            }
        }

        public CheckEmail(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f74043a = email;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CheckEmail) && Intrinsics.f(this.f74043a, ((CheckEmail) obj2).f74043a);
        }

        public final int hashCode() {
            return this.f74043a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74043a);
        }
    }
}
