package com.revolut.feature_move_money.impl.amount.order_options;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6i.b;
import u6i.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/amount/order_options/OrderOptionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderOptionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OrderOptionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f97303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f97304b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderOptionsScreenContract$InputData(parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderOptionsScreenContract$InputData[i];
        }
    }

    public OrderOptionsScreenContract$InputData(c cVar, b mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f97303a = cVar;
        this.f97304b = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderOptionsScreenContract$InputData)) {
            return false;
        }
        OrderOptionsScreenContract$InputData orderOptionsScreenContract$InputData = (OrderOptionsScreenContract$InputData) obj2;
        return this.f97303a == orderOptionsScreenContract$InputData.f97303a && this.f97304b == orderOptionsScreenContract$InputData.f97304b;
    }

    public final int hashCode() {
        c cVar = this.f97303a;
        return this.f97304b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        c cVar = this.f97303a;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeString(this.f97304b.name());
    }
}
