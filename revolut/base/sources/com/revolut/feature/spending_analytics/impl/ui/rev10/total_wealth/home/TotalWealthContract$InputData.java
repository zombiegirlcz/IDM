package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home;

import amd.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yld.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalWealthContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TotalWealthContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f88016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetWorthAccount f88017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f88018c;
    public final amd.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TotalWealthContract$InputData(g.valueOf(parcel.readString()), (NetWorthAccount) parcel.readParcelable(TotalWealthContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readInt() != 0 ? amd.a.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalWealthContract$InputData[i];
        }
    }

    public TotalWealthContract$InputData(g netWorthType, NetWorthAccount netWorthAccount, b bVar, amd.a aVar) {
        Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
        Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
        this.f88016a = netWorthType;
        this.f88017b = netWorthAccount;
        this.f88018c = bVar;
        this.d = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalWealthContract$InputData)) {
            return false;
        }
        TotalWealthContract$InputData totalWealthContract$InputData = (TotalWealthContract$InputData) obj2;
        return this.f88016a == totalWealthContract$InputData.f88016a && Intrinsics.f(this.f88017b, totalWealthContract$InputData.f88017b) && this.f88018c == totalWealthContract$InputData.f88018c && this.d == totalWealthContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f88017b.hashCode() + (this.f88016a.hashCode() * 31)) * 31;
        b bVar = this.f88018c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        amd.a aVar = this.d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88016a.name());
        dest.writeParcelable(this.f88017b, i);
        b bVar = this.f88018c;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        amd.a aVar = this.d;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
