package com.revolut.feature_crypto_order_flow.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import wd6.e;
import wd6.h;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/api/navigation/CryptoExchangeFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangeFlowInputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f96715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f96716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f96717c;
    public final h d;
    public final boolean e;
    public final ExchangeFeatureConfigFinishBehavior f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f96718g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExchangeFlowInputData((b) parcel.readSerializable(), (b) parcel.readSerializable(), e.valueOf(parcel.readString()), h.valueOf(parcel.readString()), parcel.readInt() != 0, (ExchangeFeatureConfigFinishBehavior) parcel.readParcelable(CryptoExchangeFlowInputData.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeFlowInputData[i];
        }
    }

    public CryptoExchangeFlowInputData(b targetCurrency, b bVar, e exchangeMode, h orderType, boolean z, ExchangeFeatureConfigFinishBehavior finishBehavior, Long l2) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
        this.f96715a = targetCurrency;
        this.f96716b = bVar;
        this.f96717c = exchangeMode;
        this.d = orderType;
        this.e = z;
        this.f = finishBehavior;
        this.f96718g = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeFlowInputData)) {
            return false;
        }
        CryptoExchangeFlowInputData cryptoExchangeFlowInputData = (CryptoExchangeFlowInputData) obj2;
        return Intrinsics.f(this.f96715a, cryptoExchangeFlowInputData.f96715a) && Intrinsics.f(this.f96716b, cryptoExchangeFlowInputData.f96716b) && this.f96717c == cryptoExchangeFlowInputData.f96717c && this.d == cryptoExchangeFlowInputData.d && this.e == cryptoExchangeFlowInputData.e && Intrinsics.f(this.f, cryptoExchangeFlowInputData.f) && Intrinsics.f(this.f96718g, cryptoExchangeFlowInputData.f96718g);
    }

    public final int hashCode() {
        int iHashCode = this.f96715a.hashCode() * 31;
        b bVar = this.f96716b;
        int iHashCode2 = (this.f.hashCode() + j6.a.c(c.b(this.d, y.g(this.f96717c, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31), 31, this.e)) * 31;
        Long l2 = this.f96718g;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96715a);
        dest.writeSerializable(this.f96716b);
        dest.writeString(this.f96717c.name());
        dest.writeString(this.d.name());
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
        Long l2 = this.f96718g;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
    }

    public /* synthetic */ CryptoExchangeFlowInputData(b bVar, b bVar2, e eVar, h hVar, boolean z, ExchangeFeatureConfigFinishBehavior exchangeFeatureConfigFinishBehavior, Long l2, int i) {
        this(bVar, (i & 2) != 0 ? null : bVar2, eVar, (i & 8) != 0 ? h.MARKET : hVar, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ExchangeFeatureConfigFinishBehavior.Default.f96860a : exchangeFeatureConfigFinishBehavior, (i & 64) != 0 ? null : l2);
    }
}
