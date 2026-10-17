package com.revolut.trading.orders.ui.invest.placement.models;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/TargetPriceInputValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TargetPriceInputValue implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f106872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f106873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f106874c;
    public final boolean d;

    @NotNull
    public static final Parcelable.Creator<TargetPriceInputValue> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TargetPriceInputValue(bigDecimal, boolValueOf, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TargetPriceInputValue[i];
        }
    }

    static {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        new TargetPriceInputValue(ZERO, (Boolean) null, false, 14);
    }

    public TargetPriceInputValue(BigDecimal value, Boolean bool, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106872a = value;
        this.f106873b = bool;
        this.f106874c = z;
        this.d = z3;
    }

    public static TargetPriceInputValue a(TargetPriceInputValue targetPriceInputValue, BigDecimal value, Boolean bool, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            value = targetPriceInputValue.f106872a;
        }
        if ((i & 2) != 0) {
            bool = targetPriceInputValue.f106873b;
        }
        if ((i & 4) != 0) {
            z = targetPriceInputValue.f106874c;
        }
        if ((i & 8) != 0) {
            z3 = targetPriceInputValue.d;
        }
        targetPriceInputValue.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        return new TargetPriceInputValue(value, bool, z, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TargetPriceInputValue)) {
            return false;
        }
        TargetPriceInputValue targetPriceInputValue = (TargetPriceInputValue) obj2;
        return Intrinsics.f(this.f106872a, targetPriceInputValue.f106872a) && Intrinsics.f(this.f106873b, targetPriceInputValue.f106873b) && this.f106874c == targetPriceInputValue.f106874c && this.d == targetPriceInputValue.d;
    }

    public final int hashCode() {
        int iHashCode = this.f106872a.hashCode() * 31;
        Boolean bool = this.f106873b;
        return Boolean.hashCode(this.d) + a.c((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f106874c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f106872a);
        Boolean bool = this.f106873b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeInt(this.f106874c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ TargetPriceInputValue(BigDecimal bigDecimal, Boolean bool, boolean z, int i) {
        this(bigDecimal, (i & 2) != 0 ? null : bool, false, (i & 8) != 0 ? false : z);
    }
}
