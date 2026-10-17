package com.revolut.feature.crypto.gift.asset.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/gift/asset/impl/ui/flow/CryptoGiftAssetFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ClaimScreen", "NotEligibleScreen", "Lcom/revolut/feature/crypto/gift/asset/impl/ui/flow/CryptoGiftAssetFlowContract$Step$ClaimScreen;", "Lcom/revolut/feature/crypto/gift/asset/impl/ui/flow/CryptoGiftAssetFlowContract$Step$NotEligibleScreen;", "feature_crypto_gift_asset_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoGiftAssetFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/impl/ui/flow/CryptoGiftAssetFlowContract$Step$ClaimScreen;", "Lcom/revolut/feature/crypto/gift/asset/impl/ui/flow/CryptoGiftAssetFlowContract$Step;", "<init>", "()V", "feature_crypto_gift_asset_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ClaimScreen implements CryptoGiftAssetFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClaimScreen f70864a = new ClaimScreen();

        @NotNull
        public static final Parcelable.Creator<ClaimScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ClaimScreen.f70864a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimScreen[i];
            }
        }

        private ClaimScreen() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/gift/asset/impl/ui/flow/CryptoGiftAssetFlowContract$Step$NotEligibleScreen;", "Lcom/revolut/feature/crypto/gift/asset/impl/ui/flow/CryptoGiftAssetFlowContract$Step;", "<init>", "()V", "feature_crypto_gift_asset_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotEligibleScreen implements CryptoGiftAssetFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotEligibleScreen f70865a = new NotEligibleScreen();

        @NotNull
        public static final Parcelable.Creator<NotEligibleScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotEligibleScreen.f70865a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotEligibleScreen[i];
            }
        }

        private NotEligibleScreen() {
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
