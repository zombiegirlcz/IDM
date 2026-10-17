package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider;

import android.os.Parcel;
import android.os.Parcelable;
import hha.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/dialog_provider/CommodityOrderErrorDialogProvider$Payload", "Landroid/os/Parcelable;", "<init>", "()V", "CurrencyNotAvailableError", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/dialog_provider/CommodityOrderErrorDialogProvider$Payload$CurrencyNotAvailableError;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CommodityOrderErrorDialogProvider$Payload implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/dialog_provider/CommodityOrderErrorDialogProvider$Payload$CurrencyNotAvailableError;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/dialog_provider/CommodityOrderErrorDialogProvider$Payload;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyNotAvailableError extends CommodityOrderErrorDialogProvider$Payload {

        @NotNull
        public static final Parcelable.Creator<CurrencyNotAvailableError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f99819a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyNotAvailableError((u) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyNotAvailableError[i];
            }
        }

        public CurrencyNotAvailableError(u uVar) {
            this.f99819a = uVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrencyNotAvailableError) && Intrinsics.f(this.f99819a, ((CurrencyNotAvailableError) obj2).f99819a);
        }

        public final int hashCode() {
            u uVar = this.f99819a;
            if (uVar == null) {
                return 0;
            }
            return uVar.f152366a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99819a);
        }
    }

    private CommodityOrderErrorDialogProvider$Payload() {
    }
}
