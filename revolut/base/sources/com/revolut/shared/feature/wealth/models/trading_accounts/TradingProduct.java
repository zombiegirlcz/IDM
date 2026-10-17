package com.revolut.shared.feature.wealth.models.trading_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import cfl.v;
import java.time.Instant;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProduct;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cfl/v", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradingProduct implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradingProduct> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f105280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingProductCode f105281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f105282c;
    public final Instant d;
    public final Instant e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradingProduct((UUID) parcel.readSerializable(), (TradingProductCode) parcel.readParcelable(TradingProduct.class.getClassLoader()), v.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingProduct[i];
        }
    }

    public TradingProduct(UUID id10, TradingProductCode code, v state, Instant instant, Instant instant2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f105280a = id10;
        this.f105281b = code;
        this.f105282c = state;
        this.d = instant;
        this.e = instant2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradingProduct)) {
            return false;
        }
        TradingProduct tradingProduct = (TradingProduct) obj2;
        return Intrinsics.f(this.f105280a, tradingProduct.f105280a) && Intrinsics.f(this.f105281b, tradingProduct.f105281b) && this.f105282c == tradingProduct.f105282c && Intrinsics.f(this.d, tradingProduct.d) && Intrinsics.f(this.e, tradingProduct.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f105282c.hashCode() + ((this.f105281b.hashCode() + (this.f105280a.hashCode() * 31)) * 31)) * 31;
        Instant instant = this.d;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.e;
        return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105280a);
        dest.writeParcelable(this.f105281b, i);
        dest.writeString(this.f105282c.name());
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
