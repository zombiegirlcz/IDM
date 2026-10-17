package com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/exchange/extensions/dialog/OrderTypeDialogContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderTypeDialogContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OrderTypeDialogContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f96753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f96754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96755c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f96756g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            h hVarValueOf = h.valueOf(parcel.readString());
            boolean z12 = false;
            boolean z29 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z12 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z29 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z11 = z6;
            } else {
                z11 = z6;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z11 = z;
            }
            return new OrderTypeDialogContract$Input(hVarValueOf, z12, z29, z3, z4, z6, z11);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderTypeDialogContract$Input[i];
        }
    }

    public OrderTypeDialogContract$Input(h orderType, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f96753a = orderType;
        this.f96754b = z;
        this.f96755c = z3;
        this.d = z4;
        this.e = z6;
        this.f = z11;
        this.f96756g = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderTypeDialogContract$Input)) {
            return false;
        }
        OrderTypeDialogContract$Input orderTypeDialogContract$Input = (OrderTypeDialogContract$Input) obj2;
        return this.f96753a == orderTypeDialogContract$Input.f96753a && this.f96754b == orderTypeDialogContract$Input.f96754b && this.f96755c == orderTypeDialogContract$Input.f96755c && this.d == orderTypeDialogContract$Input.d && this.e == orderTypeDialogContract$Input.e && this.f == orderTypeDialogContract$Input.f && this.f96756g == orderTypeDialogContract$Input.f96756g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96756g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(this.f96753a.hashCode() * 31, 31, this.f96754b), 31, this.f96755c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96753a.name());
        dest.writeInt(this.f96754b ? 1 : 0);
        dest.writeInt(this.f96755c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f96756g ? 1 : 0);
    }
}
