package com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import eel.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/stock_details_overview/StockDetailsOverviewControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockDetailsOverviewControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StockDetailsOverviewControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f104063c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockDetailsOverviewControllerContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockDetailsOverviewControllerContract$InputData[i];
        }
    }

    public StockDetailsOverviewControllerContract$InputData(String ref2, boolean z, c cVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f104061a = ref2;
        this.f104062b = z;
        this.f104063c = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockDetailsOverviewControllerContract$InputData)) {
            return false;
        }
        StockDetailsOverviewControllerContract$InputData stockDetailsOverviewControllerContract$InputData = (StockDetailsOverviewControllerContract$InputData) obj2;
        return Intrinsics.f(this.f104061a, stockDetailsOverviewControllerContract$InputData.f104061a) && this.f104062b == stockDetailsOverviewControllerContract$InputData.f104062b && this.f104063c == stockDetailsOverviewControllerContract$InputData.f104063c;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f104061a.hashCode() * 31, 31, this.f104062b);
        c cVar = this.f104063c;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104061a);
        dest.writeInt(this.f104062b ? 1 : 0);
        c cVar = this.f104063c;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }
}
