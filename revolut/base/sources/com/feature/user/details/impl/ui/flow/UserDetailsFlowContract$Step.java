package com.feature.user.details.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"com/feature/user/details/impl/ui/flow/UserDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "UserDetailsStep", "Lcom/feature/user/details/impl/ui/flow/UserDetailsFlowContract$Step$UserDetailsStep;", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UserDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/feature/user/details/impl/ui/flow/UserDetailsFlowContract$Step$UserDetailsStep;", "Lcom/feature/user/details/impl/ui/flow/UserDetailsFlowContract$Step;", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UserDetailsStep extends UserDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserDetailsStep f26233a = new UserDetailsStep();

        @NotNull
        public static final Parcelable.Creator<UserDetailsStep> CREATOR = new a();

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
}
