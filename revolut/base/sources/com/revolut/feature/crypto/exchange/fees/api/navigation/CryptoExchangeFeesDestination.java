package com.revolut.feature.crypto.exchange.fees.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesDialogMode;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf5.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/navigation/CryptoExchangeFeesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "FeesWithUpgradePlans", "FeesBreakDown", "Lcom/revolut/feature/crypto/exchange/fees/api/navigation/CryptoExchangeFeesDestination$FeesBreakDown;", "Lcom/revolut/feature/crypto/exchange/fees/api/navigation/CryptoExchangeFeesDestination$FeesWithUpgradePlans;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoExchangeFeesDestination implements KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/navigation/CryptoExchangeFeesDestination$FeesWithUpgradePlans;", "Lcom/revolut/feature/crypto/exchange/fees/api/navigation/CryptoExchangeFeesDestination;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeesWithUpgradePlans extends CryptoExchangeFeesDestination {

        @NotNull
        public static final Parcelable.Creator<FeesWithUpgradePlans> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f70821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CryptoExchangeFeesMode f70822b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeesWithUpgradePlans(b.valueOf(parcel.readString()), (CryptoExchangeFeesMode) parcel.readParcelable(FeesWithUpgradePlans.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeesWithUpgradePlans[i];
            }
        }

        public FeesWithUpgradePlans(b source, CryptoExchangeFeesMode mode) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f70821a = source;
            this.f70822b = mode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CryptoExchangeFeesMode getF70822b() {
            return this.f70822b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getF70821a() {
            return this.f70821a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeesWithUpgradePlans)) {
                return false;
            }
            FeesWithUpgradePlans feesWithUpgradePlans = (FeesWithUpgradePlans) obj2;
            return this.f70821a == feesWithUpgradePlans.f70821a && Intrinsics.f(this.f70822b, feesWithUpgradePlans.f70822b);
        }

        public final int hashCode() {
            return this.f70822b.hashCode() + (this.f70821a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70821a.name());
            dest.writeParcelable(this.f70822b, i);
        }
    }

    private CryptoExchangeFeesDestination() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/navigation/CryptoExchangeFeesDestination$FeesBreakDown;", "Lcom/revolut/feature/crypto/exchange/fees/api/navigation/CryptoExchangeFeesDestination;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeesBreakDown extends CryptoExchangeFeesDestination {

        @NotNull
        public static final Parcelable.Creator<FeesBreakDown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoExchangeFeesDialogMode f70820a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeesBreakDown(CryptoExchangeFeesDialogMode.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeesBreakDown[i];
            }
        }

        public FeesBreakDown(CryptoExchangeFeesDialogMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f70820a = mode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CryptoExchangeFeesDialogMode getF70820a() {
            return this.f70820a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeesBreakDown) && this.f70820a == ((FeesBreakDown) obj2).f70820a;
        }

        public final int hashCode() {
            return this.f70820a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70820a.writeToParcel(dest, i);
        }

        public FeesBreakDown() {
            this(CryptoExchangeFeesDialogMode.DEFAULT);
        }
    }
}
