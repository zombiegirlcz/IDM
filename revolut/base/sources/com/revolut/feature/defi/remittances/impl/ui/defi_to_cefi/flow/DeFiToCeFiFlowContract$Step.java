package com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/flow/DeFiToCeFiFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AssetSelection", "AmountInput", "Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/flow/DeFiToCeFiFlowContract$Step$AmountInput;", "Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/flow/DeFiToCeFiFlowContract$Step$AssetSelection;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiToCeFiFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/flow/DeFiToCeFiFlowContract$Step$AmountInput;", "Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/flow/DeFiToCeFiFlowContract$Step;", "<init>", "()V", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmountInput implements DeFiToCeFiFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AmountInput f71804a = new AmountInput();

        @NotNull
        public static final Parcelable.Creator<AmountInput> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AmountInput.f71804a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountInput[i];
            }
        }

        private AmountInput() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/flow/DeFiToCeFiFlowContract$Step$AssetSelection;", "Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/flow/DeFiToCeFiFlowContract$Step;", "<init>", "()V", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AssetSelection implements DeFiToCeFiFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AssetSelection f71805a = new AssetSelection();

        @NotNull
        public static final Parcelable.Creator<AssetSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AssetSelection.f71805a;
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
}
