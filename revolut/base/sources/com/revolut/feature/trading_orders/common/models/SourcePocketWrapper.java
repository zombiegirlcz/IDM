package com.revolut.feature.trading_orders.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocketWrapper;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SourcePocketWrapper implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SourcePocketWrapper> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SourcePocket f91794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f91795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91796c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SourcePocketWrapper((SourcePocket) parcel.readParcelable(SourcePocketWrapper.class.getClassLoader()), (Amount) parcel.readParcelable(SourcePocketWrapper.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SourcePocketWrapper[i];
        }
    }

    public SourcePocketWrapper(SourcePocket sourcePocket, Amount balance, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f91794a = sourcePocket;
        this.f91795b = balance;
        this.f91796c = z;
        this.d = z3;
    }

    public final boolean a() {
        SourcePocket sourcePocket = this.f91794a;
        if ((sourcePocket instanceof SourcePocket.Holding) || (sourcePocket instanceof SourcePocket.Pocket) || (sourcePocket instanceof SourcePocket.Savings) || (sourcePocket instanceof SourcePocket.VaultWrapper)) {
            return false;
        }
        if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        return !this.f91796c || a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SourcePocketWrapper)) {
            return false;
        }
        SourcePocketWrapper sourcePocketWrapper = (SourcePocketWrapper) obj2;
        return Intrinsics.f(this.f91794a, sourcePocketWrapper.f91794a) && Intrinsics.f(this.f91795b, sourcePocketWrapper.f91795b) && this.f91796c == sourcePocketWrapper.f91796c && this.d == sourcePocketWrapper.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(y.d(this.f91795b, this.f91794a.hashCode() * 31, 31), 31, this.f91796c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91794a, i);
        dest.writeParcelable(this.f91795b, i);
        dest.writeInt(this.f91796c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}
