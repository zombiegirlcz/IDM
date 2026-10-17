package com.revolut.feature.retail.cfd.impl.screens.order.utils;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/order/utils/CfdInputValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdInputValue implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f82234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f82235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f82236c;
    public final boolean d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CfdInputValue> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdInputValue$a, reason: from kotlin metadata */
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
            return new CfdInputValue(bigDecimal, boolValueOf, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdInputValue[i];
        }
    }

    static {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        new CfdInputValue(ZERO, null, 14);
    }

    public CfdInputValue(BigDecimal value, Boolean bool, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f82234a = value;
        this.f82235b = bool;
        this.f82236c = z;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdInputValue)) {
            return false;
        }
        CfdInputValue cfdInputValue = (CfdInputValue) obj2;
        return Intrinsics.f(this.f82234a, cfdInputValue.f82234a) && Intrinsics.f(this.f82235b, cfdInputValue.f82235b) && this.f82236c == cfdInputValue.f82236c && this.d == cfdInputValue.d;
    }

    public final int hashCode() {
        int iHashCode = this.f82234a.hashCode() * 31;
        Boolean bool = this.f82235b;
        return Boolean.hashCode(this.d) + a.c((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f82236c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f82234a);
        Boolean bool = this.f82235b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeInt(this.f82236c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ CfdInputValue(BigDecimal bigDecimal, Boolean bool, int i) {
        this(bigDecimal, (i & 2) != 0 ? null : bool, false, (i & 8) == 0);
    }
}
