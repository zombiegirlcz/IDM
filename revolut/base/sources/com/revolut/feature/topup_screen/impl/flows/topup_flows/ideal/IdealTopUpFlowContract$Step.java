package com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import cue.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup_flows/ideal/IdealTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ThreeDs", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/ideal/IdealTopUpFlowContract$Step$ThreeDs;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IdealTopUpFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/ideal/IdealTopUpFlowContract$Step$ThreeDs;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/ideal/IdealTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThreeDs extends IdealTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ThreeDs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f90998a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThreeDs((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThreeDs[i];
            }
        }

        public ThreeDs(d paymentInfo) {
            Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
            this.f90998a = paymentInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ThreeDs) && Intrinsics.f(this.f90998a, ((ThreeDs) obj2).f90998a);
        }

        public final int hashCode() {
            return this.f90998a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90998a);
        }
    }

    private IdealTopUpFlowContract$Step() {
    }
}
