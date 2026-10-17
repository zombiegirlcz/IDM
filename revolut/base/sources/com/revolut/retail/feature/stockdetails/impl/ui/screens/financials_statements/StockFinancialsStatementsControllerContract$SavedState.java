package com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.models.StockFinancialsStatementItemExpandedState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uqk.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/financials_statements/StockFinancialsStatementsControllerContract$SavedState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockFinancialsStatementsControllerContract$SavedState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StockFinancialsStatementsControllerContract$SavedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f103965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StockFinancialsStatementPeriodState f103966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StockFinancialsStatementPeriodState f103967c;
    public final Map d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            Parcelable.Creator<StockFinancialsStatementPeriodState> creator = StockFinancialsStatementPeriodState.CREATOR;
            StockFinancialsStatementPeriodState stockFinancialsStatementPeriodStateCreateFromParcel = creator.createFromParcel(parcel);
            StockFinancialsStatementPeriodState stockFinancialsStatementPeriodStateCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(StockFinancialsStatementItemExpandedState.CREATOR.createFromParcel(parcel), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new StockFinancialsStatementsControllerContract$SavedState(eVarValueOf, stockFinancialsStatementPeriodStateCreateFromParcel, stockFinancialsStatementPeriodStateCreateFromParcel2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockFinancialsStatementsControllerContract$SavedState[i];
        }
    }

    public StockFinancialsStatementsControllerContract$SavedState(e selectedPeriod, StockFinancialsStatementPeriodState annualStatementPeriod, StockFinancialsStatementPeriodState quarterlyStatementPeriod, Map expandedItems) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(annualStatementPeriod, "annualStatementPeriod");
        Intrinsics.checkNotNullParameter(quarterlyStatementPeriod, "quarterlyStatementPeriod");
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        this.f103965a = selectedPeriod;
        this.f103966b = annualStatementPeriod;
        this.f103967c = quarterlyStatementPeriod;
        this.d = expandedItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockFinancialsStatementsControllerContract$SavedState)) {
            return false;
        }
        StockFinancialsStatementsControllerContract$SavedState stockFinancialsStatementsControllerContract$SavedState = (StockFinancialsStatementsControllerContract$SavedState) obj2;
        return this.f103965a == stockFinancialsStatementsControllerContract$SavedState.f103965a && Intrinsics.f(this.f103966b, stockFinancialsStatementsControllerContract$SavedState.f103966b) && Intrinsics.f(this.f103967c, stockFinancialsStatementsControllerContract$SavedState.f103967c) && Intrinsics.f(this.d, stockFinancialsStatementsControllerContract$SavedState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f103967c.hashCode() + ((this.f103966b.hashCode() + (this.f103965a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103965a.name());
        this.f103966b.writeToParcel(dest, i);
        this.f103967c.writeToParcel(dest, i);
        Iterator itZ = j6.a.z(this.d, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            ((StockFinancialsStatementItemExpandedState) entry.getKey()).writeToParcel(dest, i);
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }
}
