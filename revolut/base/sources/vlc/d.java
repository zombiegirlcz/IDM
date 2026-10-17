package vlc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jel.a3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0007\u0015\u0016\u0005\u0007\u0010\u001f\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001cR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b#\u0010\u001cR\"\u0010'\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b&\u0010\u001cR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\n\u0010,R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b*\u0010\u0004¨\u00060"}, d2 = {"Lvlc/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "Lvlc/d$d;", "b", "Lvlc/d$d;", "i", "()Lvlc/d$d;", "riskProfile", "Lvlc/d$f;", "c", "Lvlc/d$f;", "l", "()Lvlc/d$f;", "thematicGroup", "d", "f", "name", "iconName", "", "Lvlc/d$a;", "Ljava/util/List;", "()Ljava/util/List;", "allocations", "Lvlc/d$e;", "g", "j", "sectorAllocations", "Lvlc/d$c;", "h", "regionAllocations", "Lvlc/d$g;", "m", "topHoldingAllocations", "description", "Lvlc/d$b;", "k", "Lvlc/d$b;", "()Lvlc/d$b;", "benchmark", "overview", "strategyReport", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("riskProfile")
    @NotNull
    private final EnumC1604d riskProfile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("thematicGroup")
    @NotNull
    private final f thematicGroup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("iconName")
    private final String iconName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("allocations")
    private final List<a> allocations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("sectorAllocations")
    private final List<e> sectorAllocations;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("regionAllocations")
    private final List<c> regionAllocations;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("topHoldingsAllocations")
    private final List<g> topHoldingAllocations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("benchmark")
    private final b benchmark;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("overview")
    private final String overview;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("strategyReport")
    private final String strategyReport;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\n\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvlc/d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "ref", "Lvlc/d$a$b;", "b", "Lvlc/d$a$b;", "d", "()Lvlc/d$a$b;", "subclass", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "", "Lvlc/d$a$a;", "Ljava/util/List;", "()Ljava/util/List;", "adjustments", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b(alternate = {"currency"}, value = "ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetClass")
        private final b subclass;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("adjustments")
        private final List<C1603a> adjustments;

        /* JADX INFO: renamed from: vlc.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lvlc/d$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "weight", "rationale", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1603a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("weight")
            @NotNull
            private final BigDecimal weight;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("rationale")
            @NotNull
            private final String rationale;

            public C1603a(String type, String rationale, BigDecimal weight) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(weight, "weight");
                Intrinsics.checkNotNullParameter(rationale, "rationale");
                this.type = type;
                this.weight = weight;
                this.rationale = rationale;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getRationale() {
                return this.rationale;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BigDecimal getWeight() {
                return this.weight;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1603a)) {
                    return false;
                }
                C1603a c1603a = (C1603a) obj2;
                return Intrinsics.f(this.type, c1603a.type) && Intrinsics.f(this.weight, c1603a.weight) && Intrinsics.f(this.rationale, c1603a.rationale);
            }

            public final int hashCode() {
                return this.rationale.hashCode() + t61.a.d(this.weight, this.type.hashCode() * 31, 31);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lvlc/d$a$b;", "", "STOCK", "BOND", "CASH", "COMMODITY", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;

            @lg.b("BOND")
            public static final b BOND;

            @lg.b("CASH")
            public static final b CASH;

            @lg.b("COMMODITY")
            public static final b COMMODITY;

            @lg.b("STOCK")
            public static final b STOCK;

            static {
                b bVar = new b("STOCK", 0);
                STOCK = bVar;
                b bVar2 = new b("BOND", 1);
                BOND = bVar2;
                b bVar3 = new b("CASH", 2);
                CASH = bVar3;
                b bVar4 = new b("COMMODITY", 3);
                COMMODITY = bVar4;
                b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
                $VALUES = bVarArr;
                $ENTRIES = s.n(bVarArr);
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public a(String ref2, b bVar, BigDecimal allocation, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            this.ref = ref2;
            this.subclass = bVar;
            this.allocation = allocation;
            this.adjustments = arrayList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getAdjustments() {
            return this.adjustments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getAllocation() {
            return this.allocation;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getSubclass() {
            return this.subclass;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.ref, aVar.ref) && this.subclass == aVar.subclass && Intrinsics.f(this.allocation, aVar.allocation) && Intrinsics.f(this.adjustments, aVar.adjustments);
        }

        public final int hashCode() {
            int iHashCode = this.ref.hashCode() * 31;
            b bVar = this.subclass;
            int iD = t61.a.d(this.allocation, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
            List<C1603a> list = this.adjustments;
            return iD + (list != null ? list.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lvlc/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "ref", "name", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        public b(String ref2, String name) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(name, "name");
            this.ref = ref2;
            this.name = name;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.ref, bVar.ref) && Intrinsics.f(this.name, bVar.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + (this.ref.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lvlc/d$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "region", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("region")
        @NotNull
        private final String region;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        public c(String region, BigDecimal allocation) {
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
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.region, cVar.region) && Intrinsics.f(this.allocation, cVar.allocation);
        }

        public final int hashCode() {
            return this.allocation.hashCode() + (this.region.hashCode() * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: vlc.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lvlc/d$d;", "", "CONSERVATIVE", "CAUTIOUS", "BALANCED", "BOLD", "AGGRESSIVE", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC1604d {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC1604d[] $VALUES;

        @lg.b("AGGRESSIVE")
        public static final EnumC1604d AGGRESSIVE;

        @lg.b("BALANCED")
        public static final EnumC1604d BALANCED;

        @lg.b("BOLD")
        public static final EnumC1604d BOLD;

        @lg.b("CAUTIOUS")
        public static final EnumC1604d CAUTIOUS;

        @lg.b("CONSERVATIVE")
        public static final EnumC1604d CONSERVATIVE;

        static {
            EnumC1604d enumC1604d = new EnumC1604d("CONSERVATIVE", 0);
            CONSERVATIVE = enumC1604d;
            EnumC1604d enumC1604d2 = new EnumC1604d("CAUTIOUS", 1);
            CAUTIOUS = enumC1604d2;
            EnumC1604d enumC1604d3 = new EnumC1604d("BALANCED", 2);
            BALANCED = enumC1604d3;
            EnumC1604d enumC1604d4 = new EnumC1604d("BOLD", 3);
            BOLD = enumC1604d4;
            EnumC1604d enumC1604d5 = new EnumC1604d("AGGRESSIVE", 4);
            AGGRESSIVE = enumC1604d5;
            EnumC1604d[] enumC1604dArr = {enumC1604d, enumC1604d2, enumC1604d3, enumC1604d4, enumC1604d5};
            $VALUES = enumC1604dArr;
            $ENTRIES = s.n(enumC1604dArr);
        }

        public static EnumC1604d valueOf(String str) {
            return (EnumC1604d) Enum.valueOf(EnumC1604d.class, str);
        }

        public static EnumC1604d[] values() {
            return (EnumC1604d[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lvlc/d$e;", "", "", "toString", "()Ljava/lang/String;", "Ljel/a3;", "a", "Ljel/a3;", "b", "()Ljel/a3;", "sector", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("sector")
        @NotNull
        private final a3 sector;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        public e(BigDecimal allocation, a3 sector) {
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
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return this.sector == eVar.sector && Intrinsics.f(this.allocation, eVar.allocation);
        }

        public final int hashCode() {
            return this.allocation.hashCode() + (this.sector.hashCode() * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lvlc/d$f;", "", "CORE", "SUSTAINABLE", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ f[] $VALUES;

        @lg.b("CORE")
        public static final f CORE;

        @lg.b("SUSTAINABLE")
        public static final f SUSTAINABLE;

        static {
            f fVar = new f("CORE", 0);
            CORE = fVar;
            f fVar2 = new f("SUSTAINABLE", 1);
            SUSTAINABLE = fVar2;
            f[] fVarArr = {fVar, fVar2};
            $VALUES = fVarArr;
            $ENTRIES = s.n(fVarArr);
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lvlc/d$g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "ref", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        public g(String ref2, BigDecimal allocation) {
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
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.ref, gVar.ref) && Intrinsics.f(this.allocation, gVar.allocation);
        }

        public final int hashCode() {
            return this.allocation.hashCode() + (this.ref.hashCode() * 31);
        }
    }

    public d(String id10, EnumC1604d riskProfile, f thematicGroup, String name, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str2, b bVar, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
        Intrinsics.checkNotNullParameter(thematicGroup, "thematicGroup");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id10;
        this.riskProfile = riskProfile;
        this.thematicGroup = thematicGroup;
        this.name = name;
        this.iconName = str;
        this.allocations = arrayList;
        this.sectorAllocations = arrayList2;
        this.regionAllocations = arrayList3;
        this.topHoldingAllocations = arrayList4;
        this.description = str2;
        this.benchmark = bVar;
        this.overview = str3;
        this.strategyReport = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAllocations() {
        return this.allocations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getBenchmark() {
        return this.benchmark;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && this.riskProfile == dVar.riskProfile && this.thematicGroup == dVar.thematicGroup && Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.iconName, dVar.iconName) && Intrinsics.f(this.allocations, dVar.allocations) && Intrinsics.f(this.sectorAllocations, dVar.sectorAllocations) && Intrinsics.f(this.regionAllocations, dVar.regionAllocations) && Intrinsics.f(this.topHoldingAllocations, dVar.topHoldingAllocations) && Intrinsics.f(this.description, dVar.description) && Intrinsics.f(this.benchmark, dVar.benchmark) && Intrinsics.f(this.overview, dVar.overview) && Intrinsics.f(this.strategyReport, dVar.strategyReport);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOverview() {
        return this.overview;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getRegionAllocations() {
        return this.regionAllocations;
    }

    public final int hashCode() {
        int iC = p.a.c((this.thematicGroup.hashCode() + ((this.riskProfile.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.name);
        String str = this.iconName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<a> list = this.allocations;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<e> list2 = this.sectorAllocations;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<c> list3 = this.regionAllocations;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<g> list4 = this.topHoldingAllocations;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.benchmark;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.overview;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.strategyReport;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC1604d getRiskProfile() {
        return this.riskProfile;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getSectorAllocations() {
        return this.sectorAllocations;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStrategyReport() {
        return this.strategyReport;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final f getThematicGroup() {
        return this.thematicGroup;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getTopHoldingAllocations() {
        return this.topHoldingAllocations;
    }
}
