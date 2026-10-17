package com.revolut.feature.wealth.ui.impl.actions.handler;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$State;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Descriptor", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthTransferFlowControllerFactory$Descriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<WealthTransferFlowControllerFactory$Descriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthTransferPickerControllerContract$State f95941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthAction f95942b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthTransferFlowControllerFactory$Descriptor((WealthTransferPickerControllerContract$State) parcel.readParcelable(WealthTransferFlowControllerFactory$Descriptor.class.getClassLoader()), (WealthAction) parcel.readParcelable(WealthTransferFlowControllerFactory$Descriptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthTransferFlowControllerFactory$Descriptor[i];
        }
    }

    public WealthTransferFlowControllerFactory$Descriptor(WealthTransferPickerControllerContract$State state, WealthAction action) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f95941a = state;
        this.f95942b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthTransferFlowControllerFactory$Descriptor)) {
            return false;
        }
        WealthTransferFlowControllerFactory$Descriptor wealthTransferFlowControllerFactory$Descriptor = (WealthTransferFlowControllerFactory$Descriptor) obj2;
        return Intrinsics.f(this.f95941a, wealthTransferFlowControllerFactory$Descriptor.f95941a) && Intrinsics.f(this.f95942b, wealthTransferFlowControllerFactory$Descriptor.f95942b);
    }

    public final int hashCode() {
        return this.f95942b.hashCode() + (this.f95941a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95941a, i);
        dest.writeParcelable(this.f95942b, i);
    }
}
