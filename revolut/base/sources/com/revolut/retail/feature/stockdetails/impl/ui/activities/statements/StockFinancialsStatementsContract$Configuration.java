package com.revolut.retail.feature.stockdetails.impl.ui.activities.statements;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uqk.l;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/activities/statements/StockFinancialsStatementsContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockFinancialsStatementsContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StockFinancialsStatementsContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f103796c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockFinancialsStatementsContract$Configuration(parcel.readString(), parcel.readString(), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockFinancialsStatementsContract$Configuration[i];
        }
    }

    public StockFinancialsStatementsContract$Configuration(String flowName, String ref2, l statementType) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        this.f103794a = flowName;
        this.f103795b = ref2;
        this.f103796c = statementType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockFinancialsStatementsContract$Configuration)) {
            return false;
        }
        StockFinancialsStatementsContract$Configuration stockFinancialsStatementsContract$Configuration = (StockFinancialsStatementsContract$Configuration) obj2;
        return Intrinsics.f(this.f103794a, stockFinancialsStatementsContract$Configuration.f103794a) && Intrinsics.f(this.f103795b, stockFinancialsStatementsContract$Configuration.f103795b) && this.f103796c == stockFinancialsStatementsContract$Configuration.f103796c;
    }

    public final int hashCode() {
        return this.f103796c.hashCode() + p.a.c(this.f103794a.hashCode() * 31, 31, this.f103795b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103794a);
        dest.writeString(this.f103795b);
        dest.writeString(this.f103796c.name());
    }
}
