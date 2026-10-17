package com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/trading_add_ons/impl/ui/add_ons/flow/TradingAddOnsFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "<init>", "()V", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradingAddOnsFlowContract$State implements FlowState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TradingAddOnsFlowContract$State f91666a = new TradingAddOnsFlowContract$State();

    @NotNull
    public static final Parcelable.Creator<TradingAddOnsFlowContract$State> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return TradingAddOnsFlowContract$State.f91666a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingAddOnsFlowContract$State[i];
        }
    }

    private TradingAddOnsFlowContract$State() {
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
