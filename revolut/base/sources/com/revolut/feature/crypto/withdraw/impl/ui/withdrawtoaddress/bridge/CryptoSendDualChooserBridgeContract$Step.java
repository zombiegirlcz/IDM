package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/bridge/CryptoSendDualChooserBridgeContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DualChooser", "Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/bridge/CryptoSendDualChooserBridgeContract$Step$DualChooser;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoSendDualChooserBridgeContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/bridge/CryptoSendDualChooserBridgeContract$Step$DualChooser;", "Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/bridge/CryptoSendDualChooserBridgeContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DualChooser extends CryptoSendDualChooserBridgeContract$Step {

        @NotNull
        public static final Parcelable.Creator<DualChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DualChooserContract$InputData f71162a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DualChooser((DualChooserContract$InputData) parcel.readParcelable(DualChooser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DualChooser[i];
            }
        }

        public DualChooser(DualChooserContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f71162a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DualChooser) && Intrinsics.f(this.f71162a, ((DualChooser) obj2).f71162a);
        }

        public final int hashCode() {
            return this.f71162a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71162a, i);
        }
    }

    private CryptoSendDualChooserBridgeContract$Step() {
    }
}
