package com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/exchange/bottom_sheet/balance_breakdown/BalanceBreakdownBottomSheetContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevXOrdersBreakdown", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/bottom_sheet/balance_breakdown/BalanceBreakdownBottomSheetContract$ModalStep$RevXOrdersBreakdown;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BalanceBreakdownBottomSheetContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/bottom_sheet/balance_breakdown/BalanceBreakdownBottomSheetContract$ModalStep$RevXOrdersBreakdown;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/bottom_sheet/balance_breakdown/BalanceBreakdownBottomSheetContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevXOrdersBreakdown implements BalanceBreakdownBottomSheetContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevXOrdersBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96740a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevXOrdersBreakdown((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevXOrdersBreakdown[i];
            }
        }

        public RevXOrdersBreakdown(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f96740a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevXOrdersBreakdown) && Intrinsics.f(this.f96740a, ((RevXOrdersBreakdown) obj2).f96740a);
        }

        public final int hashCode() {
            return this.f96740a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96740a);
        }
    }
}
