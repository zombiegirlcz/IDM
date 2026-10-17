package com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/hostingflow/CryptoAddressHostingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AddressHostingPicker", "AddProvider", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingflow/CryptoAddressHostingFlowContract$Step$AddProvider;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingflow/CryptoAddressHostingFlowContract$Step$AddressHostingPicker;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoAddressHostingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingflow/CryptoAddressHostingFlowContract$Step$AddProvider;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingflow/CryptoAddressHostingFlowContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddProvider extends CryptoAddressHostingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddProvider f71309a = new AddProvider();

        @NotNull
        public static final Parcelable.Creator<AddProvider> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddProvider.f71309a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddProvider[i];
            }
        }

        private AddProvider() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingflow/CryptoAddressHostingFlowContract$Step$AddressHostingPicker;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingflow/CryptoAddressHostingFlowContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressHostingPicker extends CryptoAddressHostingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressHostingPicker f71310a = new AddressHostingPicker();

        @NotNull
        public static final Parcelable.Creator<AddressHostingPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressHostingPicker.f71310a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressHostingPicker[i];
            }
        }

        private AddressHostingPicker() {
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

    private CryptoAddressHostingFlowContract$Step() {
    }
}
