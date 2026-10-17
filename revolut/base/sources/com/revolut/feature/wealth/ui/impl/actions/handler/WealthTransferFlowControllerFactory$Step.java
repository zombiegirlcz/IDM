package com.revolut.feature.wealth.ui.impl.actions.handler;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$Output;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "TransferDestination", "Lcom/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Step$Initial;", "Lcom/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Step$TransferDestination;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthTransferFlowControllerFactory$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Step$Initial;", "Lcom/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Step;", "<init>", "()V", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial implements WealthTransferFlowControllerFactory$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f95943a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f95943a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Step$TransferDestination;", "Lcom/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferDestination implements WealthTransferFlowControllerFactory$Step {

        @NotNull
        public static final Parcelable.Creator<TransferDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthTransferPickerControllerContract$Output f95944a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferDestination((WealthTransferPickerControllerContract$Output) parcel.readParcelable(TransferDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferDestination[i];
            }
        }

        public TransferDestination(WealthTransferPickerControllerContract$Output output) {
            Intrinsics.checkNotNullParameter(output, "output");
            this.f95944a = output;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransferDestination) && Intrinsics.f(this.f95944a, ((TransferDestination) obj2).f95944a);
        }

        public final int hashCode() {
            return this.f95944a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95944a, i);
        }
    }
}
