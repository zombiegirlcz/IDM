package com.revolut.feature_move_money.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import j8l.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/model/MoveMoneyOrderInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyOrderInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyOrderInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderMode f97401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuote f97402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f97403c;
    public final AccountWrapper d;
    public final AccountWrapper e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f97404g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoveMoneyOrderInfo((OrderMode) parcel.readParcelable(MoveMoneyOrderInfo.class.getClassLoader()), (OrderQuote) parcel.readParcelable(MoveMoneyOrderInfo.class.getClassLoader()), parcel.readLong(), (AccountWrapper) parcel.readParcelable(MoveMoneyOrderInfo.class.getClassLoader()), (AccountWrapper) parcel.readParcelable(MoveMoneyOrderInfo.class.getClassLoader()), d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyOrderInfo[i];
        }
    }

    public MoveMoneyOrderInfo(OrderMode orderMode, OrderQuote orderQuote, long j2, AccountWrapper source, AccountWrapper target, d buyMode, Integer num) {
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(buyMode, "buyMode");
        this.f97401a = orderMode;
        this.f97402b = orderQuote;
        this.f97403c = j2;
        this.d = source;
        this.e = target;
        this.f = buyMode;
        this.f97404g = num;
    }

    public static MoveMoneyOrderInfo a(MoveMoneyOrderInfo moveMoneyOrderInfo, OrderMode orderMode, OrderQuote orderQuote, int i) {
        if ((i & 1) != 0) {
            orderMode = moveMoneyOrderInfo.f97401a;
        }
        OrderMode orderMode2 = orderMode;
        if ((i & 2) != 0) {
            orderQuote = moveMoneyOrderInfo.f97402b;
        }
        long j2 = moveMoneyOrderInfo.f97403c;
        AccountWrapper source = moveMoneyOrderInfo.d;
        AccountWrapper target = moveMoneyOrderInfo.e;
        d buyMode = moveMoneyOrderInfo.f;
        Integer num = moveMoneyOrderInfo.f97404g;
        moveMoneyOrderInfo.getClass();
        Intrinsics.checkNotNullParameter(orderMode2, "orderMode");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(buyMode, "buyMode");
        return new MoveMoneyOrderInfo(orderMode2, orderQuote, j2, source, target, buyMode, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyOrderInfo)) {
            return false;
        }
        MoveMoneyOrderInfo moveMoneyOrderInfo = (MoveMoneyOrderInfo) obj2;
        return Intrinsics.f(this.f97401a, moveMoneyOrderInfo.f97401a) && Intrinsics.f(this.f97402b, moveMoneyOrderInfo.f97402b) && this.f97403c == moveMoneyOrderInfo.f97403c && Intrinsics.f(this.d, moveMoneyOrderInfo.d) && Intrinsics.f(this.e, moveMoneyOrderInfo.e) && this.f == moveMoneyOrderInfo.f && Intrinsics.f(this.f97404g, moveMoneyOrderInfo.f97404g);
    }

    public final int hashCode() {
        int iHashCode = this.f97401a.hashCode() * 31;
        OrderQuote orderQuote = this.f97402b;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + a0.d.c((iHashCode + (orderQuote == null ? 0 : orderQuote.hashCode())) * 31, 31, this.f97403c)) * 31)) * 31)) * 31;
        Integer num = this.f97404g;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97401a, i);
        dest.writeParcelable(this.f97402b, i);
        dest.writeLong(this.f97403c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
        Integer num = this.f97404g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
