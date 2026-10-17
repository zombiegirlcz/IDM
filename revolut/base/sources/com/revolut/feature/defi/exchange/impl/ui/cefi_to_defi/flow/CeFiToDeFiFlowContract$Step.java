package com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.exchange.impl.ui.flow.DeFiExchangeFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/defi/exchange/impl/ui/cefi_to_defi/flow/CeFiToDeFiFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AssetSelection", "Exchange", "Lcom/revolut/feature/defi/exchange/impl/ui/cefi_to_defi/flow/CeFiToDeFiFlowContract$Step$AssetSelection;", "Lcom/revolut/feature/defi/exchange/impl/ui/cefi_to_defi/flow/CeFiToDeFiFlowContract$Step$Exchange;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CeFiToDeFiFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/cefi_to_defi/flow/CeFiToDeFiFlowContract$Step$AssetSelection;", "Lcom/revolut/feature/defi/exchange/impl/ui/cefi_to_defi/flow/CeFiToDeFiFlowContract$Step;", "<init>", "()V", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AssetSelection implements CeFiToDeFiFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AssetSelection f71750a = new AssetSelection();

        @NotNull
        public static final Parcelable.Creator<AssetSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AssetSelection.f71750a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssetSelection[i];
            }
        }

        private AssetSelection() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/cefi_to_defi/flow/CeFiToDeFiFlowContract$Step$Exchange;", "Lcom/revolut/feature/defi/exchange/impl/ui/cefi_to_defi/flow/CeFiToDeFiFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Exchange implements CeFiToDeFiFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Exchange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeFiExchangeFlowContract$InputData f71751a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Exchange(DeFiExchangeFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exchange[i];
            }
        }

        public Exchange(DeFiExchangeFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f71751a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Exchange) && Intrinsics.f(this.f71751a, ((Exchange) obj2).f71751a);
        }

        public final int hashCode() {
            return this.f71751a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71751a.writeToParcel(dest, i);
        }
    }
}
