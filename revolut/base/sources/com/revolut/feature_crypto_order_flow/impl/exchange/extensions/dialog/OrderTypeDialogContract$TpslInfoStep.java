package com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/exchange/extensions/dialog/OrderTypeDialogContract$TpslInfoStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderTypeDialogContract$TpslInfoStep implements FlowStep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OrderTypeDialogContract$TpslInfoStep f96757a = new OrderTypeDialogContract$TpslInfoStep();

    @NotNull
    public static final Parcelable.Creator<OrderTypeDialogContract$TpslInfoStep> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return OrderTypeDialogContract$TpslInfoStep.f96757a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderTypeDialogContract$TpslInfoStep[i];
        }
    }

    private OrderTypeDialogContract$TpslInfoStep() {
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
