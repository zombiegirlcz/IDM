package com.revolut.feature.trading.transfer.investments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8f.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/navigation/TransferOutFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "TransferOut", "Lcom/revolut/feature/trading/transfer/investments/api/navigation/TransferOutFeatureConfig$TransferOut;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferOutFeatureConfig extends FeatureConfig {

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/navigation/TransferOutFeatureConfig$TransferOut;", "Lcom/revolut/feature/trading/transfer/investments/api/navigation/TransferOutFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferOut implements TransferOutFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TransferOut> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f91540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91541b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferOut(h.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferOut[i];
            }
        }

        public TransferOut(h transferType, String str) {
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            this.f91540a = transferType;
            this.f91541b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransferOut)) {
                return false;
            }
            TransferOut transferOut = (TransferOut) obj2;
            return this.f91540a == transferOut.f91540a && Intrinsics.f(this.f91541b, transferOut.f91541b);
        }

        public final int hashCode() {
            int iHashCode = this.f91540a.hashCode() * 31;
            String str = this.f91541b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91540a.name());
            dest.writeString(this.f91541b);
        }
    }
}
