package com.revolut.feature.crypto.locked.balance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/api/navigation/CryptoBalanceBreakdownDisplayMode;", "Landroid/os/Parcelable;", "Full", "LockedAllocationsOnly", "Lcom/revolut/feature/crypto/locked/balance/api/navigation/CryptoBalanceBreakdownDisplayMode$Full;", "Lcom/revolut/feature/crypto/locked/balance/api/navigation/CryptoBalanceBreakdownDisplayMode$LockedAllocationsOnly;", "feature_crypto_locked_balance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoBalanceBreakdownDisplayMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/api/navigation/CryptoBalanceBreakdownDisplayMode$Full;", "Lcom/revolut/feature/crypto/locked/balance/api/navigation/CryptoBalanceBreakdownDisplayMode;", "<init>", "()V", "feature_crypto_locked_balance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Full implements CryptoBalanceBreakdownDisplayMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Full f70870a = new Full();

        @NotNull
        public static final Parcelable.Creator<Full> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Full.f70870a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Full[i];
            }
        }

        private Full() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/api/navigation/CryptoBalanceBreakdownDisplayMode$LockedAllocationsOnly;", "Lcom/revolut/feature/crypto/locked/balance/api/navigation/CryptoBalanceBreakdownDisplayMode;", "<init>", "()V", "feature_crypto_locked_balance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LockedAllocationsOnly implements CryptoBalanceBreakdownDisplayMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LockedAllocationsOnly f70871a = new LockedAllocationsOnly();

        @NotNull
        public static final Parcelable.Creator<LockedAllocationsOnly> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LockedAllocationsOnly.f70871a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LockedAllocationsOnly[i];
            }
        }

        private LockedAllocationsOnly() {
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
