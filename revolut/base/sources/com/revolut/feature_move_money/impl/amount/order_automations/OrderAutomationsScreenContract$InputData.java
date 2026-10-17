package com.revolut.feature_move_money.impl.amount.order_automations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/amount/order_automations/OrderAutomationsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderAutomationsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OrderAutomationsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6i.a f97300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97302c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderAutomationsScreenContract$InputData(parcel.readInt() == 0 ? null : t6i.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderAutomationsScreenContract$InputData[i];
        }
    }

    public OrderAutomationsScreenContract$InputData(t6i.a aVar, boolean z, boolean z3) {
        this.f97300a = aVar;
        this.f97301b = z;
        this.f97302c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderAutomationsScreenContract$InputData)) {
            return false;
        }
        OrderAutomationsScreenContract$InputData orderAutomationsScreenContract$InputData = (OrderAutomationsScreenContract$InputData) obj2;
        return this.f97300a == orderAutomationsScreenContract$InputData.f97300a && this.f97301b == orderAutomationsScreenContract$InputData.f97301b && this.f97302c == orderAutomationsScreenContract$InputData.f97302c;
    }

    public final int hashCode() {
        t6i.a aVar = this.f97300a;
        return Boolean.hashCode(this.f97302c) + j6.a.c((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f97301b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        t6i.a aVar = this.f97300a;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeInt(this.f97301b ? 1 : 0);
        dest.writeInt(this.f97302c ? 1 : 0);
    }
}
