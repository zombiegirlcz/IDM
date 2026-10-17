package com.revolut.feature.trading_orders.api.invest.placement.locked_period;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.UUID;
import k4l.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/invest/placement/locked_period/SecurityAssetBalanceBreakdownScreenDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecurityAssetBalanceBreakdownScreenDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SecurityAssetBalanceBreakdownScreenDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f91730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f91731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f91732c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SecurityAssetBalanceBreakdownScreenDescriptor$InputData((n) parcel.readSerializable(), (UUID) parcel.readSerializable(), (e0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecurityAssetBalanceBreakdownScreenDescriptor$InputData[i];
        }
    }

    public SecurityAssetBalanceBreakdownScreenDescriptor$InputData(n instrument, UUID tradingAccountId, e0 e0Var) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        this.f91730a = instrument;
        this.f91731b = tradingAccountId;
        this.f91732c = e0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SecurityAssetBalanceBreakdownScreenDescriptor$InputData)) {
            return false;
        }
        SecurityAssetBalanceBreakdownScreenDescriptor$InputData securityAssetBalanceBreakdownScreenDescriptor$InputData = (SecurityAssetBalanceBreakdownScreenDescriptor$InputData) obj2;
        return Intrinsics.f(this.f91730a, securityAssetBalanceBreakdownScreenDescriptor$InputData.f91730a) && Intrinsics.f(this.f91731b, securityAssetBalanceBreakdownScreenDescriptor$InputData.f91731b) && Intrinsics.f(this.f91732c, securityAssetBalanceBreakdownScreenDescriptor$InputData.f91732c);
    }

    public final int hashCode() {
        int iF = t61.a.f(this.f91731b, this.f91730a.hashCode() * 31, 31);
        e0 e0Var = this.f91732c;
        return iF + (e0Var == null ? 0 : e0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91730a);
        dest.writeSerializable(this.f91731b);
        dest.writeSerializable(this.f91732c);
    }
}
