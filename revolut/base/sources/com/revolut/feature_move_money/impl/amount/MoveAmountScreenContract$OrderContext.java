package com.revolut.feature_move_money.impl.amount;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OrderContext", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveAmountScreenContract$OrderContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoveAmountScreenContract$OrderContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8l.d f97275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f97276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f97277c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoveAmountScreenContract$OrderContext(j8l.d.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveAmountScreenContract$OrderContext[i];
        }
    }

    public MoveAmountScreenContract$OrderContext(j8l.d currentBuyMode, xi0.b baseCurrency, xi0.b counterCurrency) {
        Intrinsics.checkNotNullParameter(currentBuyMode, "currentBuyMode");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        this.f97275a = currentBuyMode;
        this.f97276b = baseCurrency;
        this.f97277c = counterCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveAmountScreenContract$OrderContext)) {
            return false;
        }
        MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext = (MoveAmountScreenContract$OrderContext) obj2;
        return this.f97275a == moveAmountScreenContract$OrderContext.f97275a && Intrinsics.f(this.f97276b, moveAmountScreenContract$OrderContext.f97276b) && Intrinsics.f(this.f97277c, moveAmountScreenContract$OrderContext.f97277c);
    }

    public final int hashCode() {
        return this.f97277c.hashCode() + l.j(this.f97276b, this.f97275a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97275a.name());
        dest.writeSerializable(this.f97276b);
        dest.writeSerializable(this.f97277c);
    }
}
