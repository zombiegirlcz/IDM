package com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup_flows/card_facade/FacadeCardTopupFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ForcedCvv", "DeferredCvv", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_facade/FacadeCardTopupFlowContract$Step$DeferredCvv;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_facade/FacadeCardTopupFlowContract$Step$ForcedCvv;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FacadeCardTopupFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_facade/FacadeCardTopupFlowContract$Step$DeferredCvv;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_facade/FacadeCardTopupFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeferredCvv extends FacadeCardTopupFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeferredCvv f90991a = new DeferredCvv();

        @NotNull
        public static final Parcelable.Creator<DeferredCvv> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeferredCvv.f90991a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeferredCvv[i];
            }
        }

        private DeferredCvv() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_facade/FacadeCardTopupFlowContract$Step$ForcedCvv;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_facade/FacadeCardTopupFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForcedCvv extends FacadeCardTopupFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForcedCvv f90992a = new ForcedCvv();

        @NotNull
        public static final Parcelable.Creator<ForcedCvv> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForcedCvv.f90992a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForcedCvv[i];
            }
        }

        private ForcedCvv() {
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

    private FacadeCardTopupFlowContract$Step() {
    }
}
