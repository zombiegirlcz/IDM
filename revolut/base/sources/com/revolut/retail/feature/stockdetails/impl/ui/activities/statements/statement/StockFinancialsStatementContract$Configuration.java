package com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uqk.e;
import uqk.l;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/activities/statements/statement/StockFinancialsStatementContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockFinancialsStatementContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StockFinancialsStatementContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f103800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f103801c;
    public final Integer d;
    public final Integer e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockFinancialsStatementContract$Configuration(parcel.readString(), l.valueOf(parcel.readString()), e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockFinancialsStatementContract$Configuration[i];
        }
    }

    public StockFinancialsStatementContract$Configuration(String ref2, l statementType, e selectedPeriod, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f103799a = ref2;
        this.f103800b = statementType;
        this.f103801c = selectedPeriod;
        this.d = num;
        this.e = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockFinancialsStatementContract$Configuration)) {
            return false;
        }
        StockFinancialsStatementContract$Configuration stockFinancialsStatementContract$Configuration = (StockFinancialsStatementContract$Configuration) obj2;
        return Intrinsics.f(this.f103799a, stockFinancialsStatementContract$Configuration.f103799a) && this.f103800b == stockFinancialsStatementContract$Configuration.f103800b && this.f103801c == stockFinancialsStatementContract$Configuration.f103801c && Intrinsics.f(this.d, stockFinancialsStatementContract$Configuration.d) && Intrinsics.f(this.e, stockFinancialsStatementContract$Configuration.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f103801c.hashCode() + ((this.f103800b.hashCode() + (this.f103799a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103799a);
        dest.writeString(this.f103800b.name());
        dest.writeString(this.f103801c.name());
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
    }
}
