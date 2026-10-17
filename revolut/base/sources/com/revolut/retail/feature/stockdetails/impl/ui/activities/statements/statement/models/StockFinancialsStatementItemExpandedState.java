package com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uqk.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/activities/statements/statement/models/StockFinancialsStatementItemExpandedState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockFinancialsStatementItemExpandedState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StockFinancialsStatementItemExpandedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f103805b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockFinancialsStatementItemExpandedState(parcel.readString(), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockFinancialsStatementItemExpandedState[i];
        }
    }

    public StockFinancialsStatementItemExpandedState(String id10, e period) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f103804a = id10;
        this.f103805b = period;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockFinancialsStatementItemExpandedState)) {
            return false;
        }
        StockFinancialsStatementItemExpandedState stockFinancialsStatementItemExpandedState = (StockFinancialsStatementItemExpandedState) obj2;
        return Intrinsics.f(this.f103804a, stockFinancialsStatementItemExpandedState.f103804a) && this.f103805b == stockFinancialsStatementItemExpandedState.f103805b;
    }

    public final int hashCode() {
        return this.f103805b.hashCode() + (this.f103804a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103804a);
        dest.writeString(this.f103805b.name());
    }
}
