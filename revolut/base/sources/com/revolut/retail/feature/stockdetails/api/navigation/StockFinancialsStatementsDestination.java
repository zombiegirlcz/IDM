package com.revolut.retail.feature.stockdetails.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uqk.l;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/api/navigation/StockFinancialsStatementsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockFinancialsStatementsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<StockFinancialsStatementsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f103750b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockFinancialsStatementsDestination(parcel.readString(), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockFinancialsStatementsDestination[i];
        }
    }

    public StockFinancialsStatementsDestination(String ref2, l statementType) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        this.f103749a = ref2;
        this.f103750b = statementType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getF103750b() {
        return this.f103750b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockFinancialsStatementsDestination)) {
            return false;
        }
        StockFinancialsStatementsDestination stockFinancialsStatementsDestination = (StockFinancialsStatementsDestination) obj2;
        return Intrinsics.f(this.f103749a, stockFinancialsStatementsDestination.f103749a) && this.f103750b == stockFinancialsStatementsDestination.f103750b;
    }

    public final int hashCode() {
        return this.f103750b.hashCode() + (this.f103749a.hashCode() * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF103749a() {
        return this.f103749a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103749a);
        dest.writeString(this.f103750b.name());
    }
}
