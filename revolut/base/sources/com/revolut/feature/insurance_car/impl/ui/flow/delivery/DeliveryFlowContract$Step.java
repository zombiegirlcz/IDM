package com.revolut.feature.insurance_car.impl.ui.flow.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Tracking", "Print", "Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$Step$Print;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$Step$Tracking;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DeliveryFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$Step$Print;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Print extends DeliveryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Print f75349a = new Print();

        @NotNull
        public static final Parcelable.Creator<Print> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Print.f75349a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Print[i];
            }
        }

        private Print() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$Step$Tracking;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/delivery/DeliveryFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Tracking extends DeliveryFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Tracking f75350a = new Tracking();

        @NotNull
        public static final Parcelable.Creator<Tracking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Tracking.f75350a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tracking[i];
            }
        }

        private Tracking() {
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

    private DeliveryFlowContract$Step() {
    }
}
