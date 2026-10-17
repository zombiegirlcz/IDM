package com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/payments/profile/impl/ui_kompot/lazy_flow/PaymentProfileLazyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Profile", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/lazy_flow/PaymentProfileLazyFlowContract$Step$Profile;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentProfileLazyFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/lazy_flow/PaymentProfileLazyFlowContract$Step$Profile;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/lazy_flow/PaymentProfileLazyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Profile implements PaymentProfileLazyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Profile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentProfileFlowContract$InputData f79646a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Profile(PaymentProfileFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        public Profile(PaymentProfileFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f79646a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Profile) && Intrinsics.f(this.f79646a, ((Profile) obj2).f79646a);
        }

        public final int hashCode() {
            return this.f79646a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79646a.writeToParcel(dest, i);
        }
    }
}
