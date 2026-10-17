package com.revolut.trading.orders.ui.invest.placement.models;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/InvestInputValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestInputValue implements Parcelable {
    public static final InvestInputValue e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f106844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f106845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f106846c;
    public final boolean d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<InvestInputValue> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

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
            return new InvestInputValue(bigDecimal, boolValueOf, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestInputValue[i];
        }
    }

    static {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        e = new InvestInputValue(ZERO, null, 14);
    }

    public InvestInputValue(BigDecimal value, Boolean bool, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106844a = value;
        this.f106845b = bool;
        this.f106846c = z;
        this.d = z3;
    }

    public static InvestInputValue a(InvestInputValue investInputValue, BigDecimal value, Boolean bool, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            value = investInputValue.f106844a;
        }
        if ((i & 2) != 0) {
            bool = investInputValue.f106845b;
        }
        if ((i & 4) != 0) {
            z = investInputValue.f106846c;
        }
        if ((i & 8) != 0) {
            z3 = investInputValue.d;
        }
        investInputValue.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        return new InvestInputValue(value, bool, z, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestInputValue)) {
            return false;
        }
        InvestInputValue investInputValue = (InvestInputValue) obj2;
        return Intrinsics.f(this.f106844a, investInputValue.f106844a) && Intrinsics.f(this.f106845b, investInputValue.f106845b) && this.f106846c == investInputValue.f106846c && this.d == investInputValue.d;
    }

    public final int hashCode() {
        int iHashCode = this.f106844a.hashCode() * 31;
        Boolean bool = this.f106845b;
        return Boolean.hashCode(this.d) + a.c((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f106846c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f106844a);
        Boolean bool = this.f106845b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeInt(this.f106846c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ InvestInputValue(BigDecimal bigDecimal, Boolean bool, int i) {
        this(bigDecimal, (i & 2) != 0 ? null : bool, false, (i & 8) == 0);
    }
}
