package com.revolut.feature.tab.crypto.impl.ui.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FlexibleModalStep", "FlexibleDisableModalStep", "Lcom/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreenContract$ModalStep$FlexibleDisableModalStep;", "Lcom/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreenContract$ModalStep$FlexibleModalStep;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoSettingsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreenContract$ModalStep$FlexibleDisableModalStep;", "Lcom/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreenContract$ModalStep;", "<init>", "()V", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FlexibleDisableModalStep implements CryptoSettingsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FlexibleDisableModalStep f89798a = new FlexibleDisableModalStep();

        @NotNull
        public static final Parcelable.Creator<FlexibleDisableModalStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FlexibleDisableModalStep.f89798a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlexibleDisableModalStep[i];
            }
        }

        private FlexibleDisableModalStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreenContract$ModalStep$FlexibleModalStep;", "Lcom/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreenContract$ModalStep;", "<init>", "()V", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FlexibleModalStep implements CryptoSettingsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FlexibleModalStep f89799a = new FlexibleModalStep();

        @NotNull
        public static final Parcelable.Creator<FlexibleModalStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FlexibleModalStep.f89799a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlexibleModalStep[i];
            }
        }

        private FlexibleModalStep() {
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
