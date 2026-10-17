package x7h;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jel.a3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0006\u0012\r\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0019"}, d2 = {"Lx7h/a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "e", "()Ljo3/a;", "totalNetTopUp", "", "Lx7h/a$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "allocations", "Lx7h/a$c;", "c", "sectorAllocations", "Lx7h/a$b;", "d", "regionAllocations", "Lx7h/a$d;", "topHoldingAllocations", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalNetTopUp")
    private final jo3.a totalNetTopUp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allocations")
    @NotNull
    private final List<C1684a> allocations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sectorAllocations")
    private final List<c> sectorAllocations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("regionAllocations")
    private final List<b> regionAllocations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("topHoldingsAllocations")
    private final List<d> topHoldingAllocations;

    /* JADX INFO: renamed from: x7h.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx7h/a$a;", "", "", "toString", "()Ljava/lang/String;", "Lx7h/a$a$a;", "a", "Lx7h/a$a$a;", "b", "()Lx7h/a$a$a;", "assetClass", "Ljava/lang/String;", "c", "ref", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1684a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetClass")
        @NotNull
        private final EnumC1685a assetClass;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: x7h.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx7h/a$a$a;", "", "STOCK", "BOND", "CASH", "COMMODITY", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class EnumC1685a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EnumC1685a[] $VALUES;

            @lg.b("BOND")
            public static final EnumC1685a BOND;

            @lg.b("CASH")
            public static final EnumC1685a CASH;

            @lg.b("COMMODITY")
            public static final EnumC1685a COMMODITY;

            @lg.b("STOCK")
            public static final EnumC1685a STOCK;

            static {
                EnumC1685a enumC1685a = new EnumC1685a("STOCK", 0);
                STOCK = enumC1685a;
                EnumC1685a enumC1685a2 = new EnumC1685a("BOND", 1);
                BOND = enumC1685a2;
                EnumC1685a enumC1685a3 = new EnumC1685a("CASH", 2);
                CASH = enumC1685a3;
                EnumC1685a enumC1685a4 = new EnumC1685a("COMMODITY", 3);
                COMMODITY = enumC1685a4;
                EnumC1685a[] enumC1685aArr = {enumC1685a, enumC1685a2, enumC1685a3, enumC1685a4};
                $VALUES = enumC1685aArr;
                $ENTRIES = s.n(enumC1685aArr);
            }

            public static EnumC1685a valueOf(String str) {
                return (EnumC1685a) Enum.valueOf(EnumC1685a.class, str);
            }

            public static EnumC1685a[] values() {
                return (EnumC1685a[]) $VALUES.clone();
            }
        }

        public C1684a(EnumC1685a assetClass, String ref2, BigDecimal allocation) {
            Intrinsics.checkNotNullParameter(assetClass, "assetClass");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            this.assetClass = assetClass;
            this.ref = ref2;
            this.allocation = allocation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAllocation() {
            return this.allocation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC1685a getAssetClass() {
            return this.assetClass;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1684a)) {
                return false;
            }
            C1684a c1684a = (C1684a) obj2;
            return this.assetClass == c1684a.assetClass && Intrinsics.f(this.ref, c1684a.ref) && Intrinsics.f(this.allocation, c1684a.allocation);
        }

        public final int hashCode() {
            return this.allocation.hashCode() + p.a.c(this.assetClass.hashCode() * 31, 31, this.ref);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lx7h/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "region", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("region")
        @NotNull
        private final String region;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        public b(String region, BigDecimal allocation) {
            Intrinsics.checkNotNullParameter(region, "region");
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            this.region = region;
            this.allocation = allocation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAllocation() {
            return this.allocation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.region, bVar.region) && Intrinsics.f(this.allocation, bVar.allocation);
        }

        public final int hashCode() {
            return this.allocation.hashCode() + (this.region.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lx7h/a$c;", "", "", "toString", "()Ljava/lang/String;", "Ljel/a3;", "a", "Ljel/a3;", "b", "()Ljel/a3;", "sector", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("sector")
        @NotNull
        private final a3 sector;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        public c(BigDecimal allocation, a3 sector) {
            Intrinsics.checkNotNullParameter(sector, "sector");
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            this.sector = sector;
            this.allocation = allocation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAllocation() {
            return this.allocation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a3 getSector() {
            return this.sector;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.sector == cVar.sector && Intrinsics.f(this.allocation, cVar.allocation);
        }

        public final int hashCode() {
            return this.allocation.hashCode() + (this.sector.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lx7h/a$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "ref", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        public d(String ref2, BigDecimal allocation) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            this.ref = ref2;
            this.allocation = allocation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAllocation() {
            return this.allocation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.ref, dVar.ref) && Intrinsics.f(this.allocation, dVar.allocation);
        }

        public final int hashCode() {
            return this.allocation.hashCode() + (this.ref.hashCode() * 31);
        }
    }

    public a(jo3.a aVar, ArrayList allocations, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        this.totalNetTopUp = aVar;
        this.allocations = allocations;
        this.sectorAllocations = arrayList;
        this.regionAllocations = arrayList2;
        this.topHoldingAllocations = arrayList3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAllocations() {
        return this.allocations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getRegionAllocations() {
        return this.regionAllocations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSectorAllocations() {
        return this.sectorAllocations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTopHoldingAllocations() {
        return this.topHoldingAllocations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getTotalNetTopUp() {
        return this.totalNetTopUp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.totalNetTopUp, aVar.totalNetTopUp) && Intrinsics.f(this.allocations, aVar.allocations) && Intrinsics.f(this.sectorAllocations, aVar.sectorAllocations) && Intrinsics.f(this.regionAllocations, aVar.regionAllocations) && Intrinsics.f(this.topHoldingAllocations, aVar.topHoldingAllocations);
    }

    public final int hashCode() {
        jo3.a aVar = this.totalNetTopUp;
        int iD = p.a.d((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.allocations);
        List<c> list = this.sectorAllocations;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.regionAllocations;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<d> list3 = this.topHoldingAllocations;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
