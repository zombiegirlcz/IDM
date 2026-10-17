package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/OrderRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f104792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f104793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f104794c;
    public final Amount d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderRate((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), Amount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderRate[i];
        }
    }

    public OrderRate(BigDecimal marketRate, BigDecimal finalRate, BigDecimal bigDecimal, Amount totalMarkup, boolean z) {
        Intrinsics.checkNotNullParameter(marketRate, "marketRate");
        Intrinsics.checkNotNullParameter(finalRate, "finalRate");
        Intrinsics.checkNotNullParameter(totalMarkup, "totalMarkup");
        this.f104792a = marketRate;
        this.f104793b = finalRate;
        this.f104794c = bigDecimal;
        this.d = totalMarkup;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderRate)) {
            return false;
        }
        OrderRate orderRate = (OrderRate) obj2;
        return Intrinsics.f(this.f104792a, orderRate.f104792a) && Intrinsics.f(this.f104793b, orderRate.f104793b) && Intrinsics.f(this.f104794c, orderRate.f104794c) && Intrinsics.f(this.d, orderRate.d) && this.e == orderRate.e;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f104793b, this.f104792a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f104794c;
        return Boolean.hashCode(this.e) + y.d(this.d, (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104792a);
        dest.writeSerializable(this.f104793b);
        dest.writeSerializable(this.f104794c);
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
