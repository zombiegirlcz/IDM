package com.revolut.feature.defi.exchange.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapSource;", "Landroid/os/Parcelable;", "DeFiAsset", "Pocket", "Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapSource$DeFiAsset;", "Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapSource$Pocket;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiSwapSource extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapSource$DeFiAsset;", "Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapSource;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeFiAsset implements DeFiSwapSource {

        @NotNull
        public static final Parcelable.Creator<DeFiAsset> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71738b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeFiAsset(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeFiAsset[i];
            }
        }

        public DeFiAsset(String accountScopedId, String ticker) {
            Intrinsics.checkNotNullParameter(accountScopedId, "accountScopedId");
            Intrinsics.checkNotNullParameter(ticker, "ticker");
            this.f71737a = accountScopedId;
            this.f71738b = ticker;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeFiAsset)) {
                return false;
            }
            DeFiAsset deFiAsset = (DeFiAsset) obj2;
            return Intrinsics.f(this.f71737a, deFiAsset.f71737a) && Intrinsics.f(this.f71738b, deFiAsset.f71738b);
        }

        @Override // com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSource
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF71739a() {
            return this.f71737a;
        }

        @Override // com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSource
        /* JADX INFO: renamed from: getSymbol, reason: from getter */
        public final String getF71740b() {
            return this.f71738b;
        }

        public final int hashCode() {
            return this.f71738b.hashCode() + (this.f71737a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71737a);
            dest.writeString(this.f71738b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapSource$Pocket;", "Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapSource;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pocket implements DeFiSwapSource {

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71740b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pocket(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public Pocket(String pocketId, String currencyCode) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f71739a = pocketId;
            this.f71740b = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pocket)) {
                return false;
            }
            Pocket pocket = (Pocket) obj2;
            return Intrinsics.f(this.f71739a, pocket.f71739a) && Intrinsics.f(this.f71740b, pocket.f71740b);
        }

        @Override // com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSource
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF71739a() {
            return this.f71739a;
        }

        @Override // com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSource
        /* JADX INFO: renamed from: getSymbol, reason: from getter */
        public final String getF71740b() {
            return this.f71740b;
        }

        public final int hashCode() {
            return this.f71740b.hashCode() + (this.f71739a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71739a);
            dest.writeString(this.f71740b);
        }
    }

    /* JADX INFO: renamed from: getId */
    String getF71739a();

    /* JADX INFO: renamed from: getSymbol */
    String getF71740b();
}
