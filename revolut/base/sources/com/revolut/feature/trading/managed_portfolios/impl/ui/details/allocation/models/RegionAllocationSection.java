package com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/RegionAllocationSection;", "Landroid/os/Parcelable;", "RegularRegionAllocation", "OtherRegionAllocation", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/RegionAllocationSection$OtherRegionAllocation;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/RegionAllocationSection$RegularRegionAllocation;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RegionAllocationSection extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/RegionAllocationSection$OtherRegionAllocation;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/RegionAllocationSection;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OtherRegionAllocation implements RegionAllocationSection {

        @NotNull
        public static final Parcelable.Creator<OtherRegionAllocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f91289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f91290c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(RegularRegionAllocation.CREATOR, parcel, arrayList, iA, 1);
                }
                return new OtherRegionAllocation(bigDecimal, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtherRegionAllocation[i];
            }
        }

        public OtherRegionAllocation(BigDecimal allocation, ArrayList individualAllocations, boolean z) {
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(individualAllocations, "individualAllocations");
            this.f91288a = allocation;
            this.f91289b = individualAllocations;
            this.f91290c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OtherRegionAllocation)) {
                return false;
            }
            OtherRegionAllocation otherRegionAllocation = (OtherRegionAllocation) obj2;
            return Intrinsics.f(this.f91288a, otherRegionAllocation.f91288a) && this.f91289b.equals(otherRegionAllocation.f91289b) && this.f91290c == otherRegionAllocation.f91290c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f91290c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f91289b, this.f91288a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91288a);
            Iterator itY = j6.a.y(this.f91289b, dest);
            while (itY.hasNext()) {
                ((RegularRegionAllocation) itY.next()).writeToParcel(dest, i);
            }
            dest.writeInt(this.f91290c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/RegionAllocationSection$RegularRegionAllocation;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/allocation/models/RegionAllocationSection;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegularRegionAllocation implements RegionAllocationSection {

        @NotNull
        public static final Parcelable.Creator<RegularRegionAllocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f91291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final qdh.a f91292b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RegularRegionAllocation((BigDecimal) parcel.readSerializable(), qdh.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegularRegionAllocation[i];
            }
        }

        public RegularRegionAllocation(BigDecimal allocation, qdh.a region) {
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(region, "region");
            this.f91291a = allocation;
            this.f91292b = region;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RegularRegionAllocation)) {
                return false;
            }
            RegularRegionAllocation regularRegionAllocation = (RegularRegionAllocation) obj2;
            return Intrinsics.f(this.f91291a, regularRegionAllocation.f91291a) && this.f91292b == regularRegionAllocation.f91292b;
        }

        public final int hashCode() {
            return this.f91292b.hashCode() + (this.f91291a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91291a);
            dest.writeString(this.f91292b.name());
        }
    }
}
