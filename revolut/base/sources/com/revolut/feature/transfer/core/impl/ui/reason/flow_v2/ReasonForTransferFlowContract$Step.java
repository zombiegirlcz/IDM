package com.revolut.feature.transfer.core.impl.ui.reason.flow_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/transfer/core/impl/ui/reason/flow_v2/ReasonForTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Goods", "NewChooser", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow_v2/ReasonForTransferFlowContract$Step$Goods;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow_v2/ReasonForTransferFlowContract$Step$NewChooser;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReasonForTransferFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/flow_v2/ReasonForTransferFlowContract$Step$Goods;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow_v2/ReasonForTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Goods implements ReasonForTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Goods> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f92204a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Goods((c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Goods[i];
            }
        }

        public Goods(c transferReason) {
            Intrinsics.checkNotNullParameter(transferReason, "transferReason");
            this.f92204a = transferReason;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Goods) && Intrinsics.f(this.f92204a, ((Goods) obj2).f92204a);
        }

        public final int hashCode() {
            return this.f92204a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92204a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/flow_v2/ReasonForTransferFlowContract$Step$NewChooser;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow_v2/ReasonForTransferFlowContract$Step;", "<init>", "()V", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewChooser implements ReasonForTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewChooser f92205a = new NewChooser();

        @NotNull
        public static final Parcelable.Creator<NewChooser> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewChooser.f92205a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewChooser[i];
            }
        }

        private NewChooser() {
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
}
