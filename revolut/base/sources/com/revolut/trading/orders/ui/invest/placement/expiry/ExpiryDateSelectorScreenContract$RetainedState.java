package com.revolut.trading.orders.ui.invest.placement.expiry;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.time.LocalDate;
import k4l.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/expiry/ExpiryDateSelectorScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpiryDateSelectorScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<ExpiryDateSelectorScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f106834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f106835b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpiryDateSelectorScreenContract$RetainedState((LocalDate) parcel.readSerializable(), k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpiryDateSelectorScreenContract$RetainedState[i];
        }
    }

    public ExpiryDateSelectorScreenContract$RetainedState(LocalDate localDate, k expiryDateType) {
        Intrinsics.checkNotNullParameter(expiryDateType, "expiryDateType");
        this.f106834a = expiryDateType;
        this.f106835b = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpiryDateSelectorScreenContract$RetainedState)) {
            return false;
        }
        ExpiryDateSelectorScreenContract$RetainedState expiryDateSelectorScreenContract$RetainedState = (ExpiryDateSelectorScreenContract$RetainedState) obj2;
        return this.f106834a == expiryDateSelectorScreenContract$RetainedState.f106834a && Intrinsics.f(this.f106835b, expiryDateSelectorScreenContract$RetainedState.f106835b);
    }

    public final int hashCode() {
        int iHashCode = this.f106834a.hashCode() * 31;
        LocalDate localDate = this.f106835b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106834a.name());
        dest.writeSerializable(this.f106835b);
    }
}
