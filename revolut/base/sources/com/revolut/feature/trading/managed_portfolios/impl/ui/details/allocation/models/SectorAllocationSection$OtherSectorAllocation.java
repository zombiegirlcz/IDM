package com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6f.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/SectorAllocationSection$OtherSectorAllocation", "Lm6f/u;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SectorAllocationSection$OtherSectorAllocation implements u, Parcelable {

    @NotNull
    public static final Parcelable.Creator<SectorAllocationSection$OtherSectorAllocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f91293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f91294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91295c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SectorAllocationSection$RegularSectorAllocation.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SectorAllocationSection$OtherSectorAllocation(bigDecimal, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SectorAllocationSection$OtherSectorAllocation[i];
        }
    }

    public SectorAllocationSection$OtherSectorAllocation(BigDecimal allocation, ArrayList individualAllocations, boolean z) {
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Intrinsics.checkNotNullParameter(individualAllocations, "individualAllocations");
        this.f91293a = allocation;
        this.f91294b = individualAllocations;
        this.f91295c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SectorAllocationSection$OtherSectorAllocation)) {
            return false;
        }
        SectorAllocationSection$OtherSectorAllocation sectorAllocationSection$OtherSectorAllocation = (SectorAllocationSection$OtherSectorAllocation) obj2;
        return Intrinsics.f(this.f91293a, sectorAllocationSection$OtherSectorAllocation.f91293a) && this.f91294b.equals(sectorAllocationSection$OtherSectorAllocation.f91294b) && this.f91295c == sectorAllocationSection$OtherSectorAllocation.f91295c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91295c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f91294b, this.f91293a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91293a);
        Iterator itY = j6.a.y(this.f91294b, dest);
        while (itY.hasNext()) {
            ((SectorAllocationSection$RegularSectorAllocation) itY.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f91295c ? 1 : 0);
    }
}
