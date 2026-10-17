package com.revolut.feature.defi.remittances.impl.ui.send.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChainPicker", "AmountLimitError", "DualChooser", "Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep$AmountLimitError;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep$ChainPicker;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep$DualChooser;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiSendAmountScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep$AmountLimitError;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountLimitError implements DeFiSendAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AmountLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeFiQuoteAmountLimitError f71824a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountLimitError((DeFiQuoteAmountLimitError) parcel.readParcelable(AmountLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountLimitError[i];
            }
        }

        public AmountLimitError(DeFiQuoteAmountLimitError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f71824a = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AmountLimitError) && Intrinsics.f(this.f71824a, ((AmountLimitError) obj2).f71824a);
        }

        public final int hashCode() {
            return this.f71824a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71824a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep$ChainPicker;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChainPicker implements DeFiSendAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChainPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f71825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wk5.a f71826b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(wk5.a.valueOf(parcel.readString()));
                }
                return new ChainPicker(arrayList, wk5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChainPicker[i];
            }
        }

        public ChainPicker(ArrayList compatibleChains, wk5.a selectedChain) {
            Intrinsics.checkNotNullParameter(compatibleChains, "compatibleChains");
            Intrinsics.checkNotNullParameter(selectedChain, "selectedChain");
            this.f71825a = compatibleChains;
            this.f71826b = selectedChain;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChainPicker)) {
                return false;
            }
            ChainPicker chainPicker = (ChainPicker) obj2;
            return this.f71825a.equals(chainPicker.f71825a) && this.f71826b == chainPicker.f71826b;
        }

        public final int hashCode() {
            return this.f71826b.hashCode() + (this.f71825a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f71825a, dest);
            while (itY.hasNext()) {
                dest.writeString(((wk5.a) itY.next()).name());
            }
            dest.writeString(this.f71826b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep$DualChooser;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DualChooser implements DeFiSendAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DualChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DualChooserContract$InputData f71827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wk5.a f71828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DeFiBalance f71829c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DualChooser((DualChooserContract$InputData) parcel.readParcelable(DualChooser.class.getClassLoader()), wk5.a.valueOf(parcel.readString()), (DeFiBalance) parcel.readParcelable(DualChooser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DualChooser[i];
            }
        }

        public DualChooser(DualChooserContract$InputData inputData, wk5.a chain, DeFiBalance selectedBalance) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(chain, "chain");
            Intrinsics.checkNotNullParameter(selectedBalance, "selectedBalance");
            this.f71827a = inputData;
            this.f71828b = chain;
            this.f71829c = selectedBalance;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DualChooser)) {
                return false;
            }
            DualChooser dualChooser = (DualChooser) obj2;
            return Intrinsics.f(this.f71827a, dualChooser.f71827a) && this.f71828b == dualChooser.f71828b && Intrinsics.f(this.f71829c, dualChooser.f71829c);
        }

        public final int hashCode() {
            return this.f71829c.hashCode() + ((this.f71828b.hashCode() + (this.f71827a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71827a, i);
            dest.writeString(this.f71828b.name());
            dest.writeParcelable(this.f71829c, i);
        }
    }
}
