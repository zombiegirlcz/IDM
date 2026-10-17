package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestOptionOrderExtended;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOrderExtended;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOptionOrderExtended implements InvestOrderExtended {

    @NotNull
    public static final Parcelable.Creator<InvestOptionOrderExtended> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOptionOrder f104605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104606b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestOptionOrderExtended(InvestOptionOrder.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOptionOrderExtended[i];
        }
    }

    public InvestOptionOrderExtended(InvestOptionOrder order, String str) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f104605a = order;
        this.f104606b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestOptionOrderExtended)) {
            return false;
        }
        InvestOptionOrderExtended investOptionOrderExtended = (InvestOptionOrderExtended) obj2;
        return Intrinsics.f(this.f104605a, investOptionOrderExtended.f104605a) && Intrinsics.f(this.f104606b, investOptionOrderExtended.f104606b);
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrderExtended
    public final InvestOrder getOrder() {
        return this.f104605a;
    }

    public final int hashCode() {
        int iHashCode = this.f104605a.hashCode() * 31;
        String str = this.f104606b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f104605a.writeToParcel(dest, i);
        dest.writeString(this.f104606b);
    }
}
