package com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/activities/statements/models/StockFinancialsStatementPeriodState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockFinancialsStatementPeriodState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StockFinancialsStatementPeriodState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f103797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f103798b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockFinancialsStatementPeriodState(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockFinancialsStatementPeriodState[i];
        }
    }

    public StockFinancialsStatementPeriodState(Integer num, Integer num2) {
        this.f103797a = num;
        this.f103798b = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockFinancialsStatementPeriodState)) {
            return false;
        }
        StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState = (StockFinancialsStatementPeriodState) obj2;
        return Intrinsics.f(this.f103797a, stockFinancialsStatementPeriodState.f103797a) && Intrinsics.f(this.f103798b, stockFinancialsStatementPeriodState.f103798b);
    }

    public final int hashCode() {
        Integer num = this.f103797a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f103798b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.f103797a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f103798b;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
    }

    public StockFinancialsStatementPeriodState() {
        this(null, null);
    }
}
