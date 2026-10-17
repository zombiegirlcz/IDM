package com.revolut.feature.crypto.earn.assets.shared.impl.ui.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Loading", "Error", "Preview", "Assets", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step$Assets;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step$Error;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step$Loading;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step$Preview;", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EarnAssetsRootScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step$Assets;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Assets implements EarnAssetsRootScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Assets f70804a = new Assets();

        @NotNull
        public static final Parcelable.Creator<Assets> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Assets.f70804a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Assets[i];
            }
        }

        private Assets() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step$Error;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Error implements EarnAssetsRootScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f70805a = new Error();

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f70805a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        private Error() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step$Loading;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements EarnAssetsRootScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f70806a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f70806a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step$Preview;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenContract$Step;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Preview implements EarnAssetsRootScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Preview f70807a = new Preview();

        @NotNull
        public static final Parcelable.Creator<Preview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Preview.f70807a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Preview[i];
            }
        }

        private Preview() {
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
