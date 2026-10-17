package com.revolut.feature.crypto.features.impl.ui.features;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ExchangeFees", "Multichain", "SendLimits", "Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep$ExchangeFees;", "Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep$Multichain;", "Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep$SendLimits;", "feature_crypto_features_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoFeaturesControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep$ExchangeFees;", "Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_features_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExchangeFees implements CryptoFeaturesControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExchangeFees f70852a = new ExchangeFees();

        @NotNull
        public static final Parcelable.Creator<ExchangeFees> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExchangeFees.f70852a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeFees[i];
            }
        }

        private ExchangeFees() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep$Multichain;", "Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_features_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Multichain implements CryptoFeaturesControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Multichain f70853a = new Multichain();

        @NotNull
        public static final Parcelable.Creator<Multichain> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Multichain.f70853a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Multichain[i];
            }
        }

        private Multichain() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep$SendLimits;", "Lcom/revolut/feature/crypto/features/impl/ui/features/CryptoFeaturesControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_features_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SendLimits implements CryptoFeaturesControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SendLimits f70854a = new SendLimits();

        @NotNull
        public static final Parcelable.Creator<SendLimits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SendLimits.f70854a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SendLimits[i];
            }
        }

        private SendLimits() {
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
