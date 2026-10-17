package com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import jel.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6f.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/SectorAllocationSection$RegularSectorAllocation", "Lm6f/u;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SectorAllocationSection$RegularSectorAllocation implements u, Parcelable {

    @NotNull
    public static final Parcelable.Creator<SectorAllocationSection$RegularSectorAllocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f91296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f91297b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SectorAllocationSection$RegularSectorAllocation((BigDecimal) parcel.readSerializable(), a3.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SectorAllocationSection$RegularSectorAllocation[i];
        }
    }

    public SectorAllocationSection$RegularSectorAllocation(BigDecimal allocation, a3 sector) {
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Intrinsics.checkNotNullParameter(sector, "sector");
        this.f91296a = allocation;
        this.f91297b = sector;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SectorAllocationSection$RegularSectorAllocation)) {
            return false;
        }
        SectorAllocationSection$RegularSectorAllocation sectorAllocationSection$RegularSectorAllocation = (SectorAllocationSection$RegularSectorAllocation) obj2;
        return Intrinsics.f(this.f91296a, sectorAllocationSection$RegularSectorAllocation.f91296a) && this.f91297b == sectorAllocationSection$RegularSectorAllocation.f91297b;
    }

    public final int hashCode() {
        return this.f91297b.hashCode() + (this.f91296a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91296a);
        dest.writeString(this.f91297b.name());
    }
}
