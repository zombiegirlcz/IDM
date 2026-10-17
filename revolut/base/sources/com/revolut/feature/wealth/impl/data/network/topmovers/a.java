package com.revolut.feature.wealth.impl.data.network.topmovers;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\f\u0010\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/topmovers/a;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$c;", "a", "Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$c;", "()Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$c;", "timeSpan", "", "Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "topGainers", "c", "topLosers", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeSpan")
    private final c timeSpan;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("topGainers")
    private final List<b> topGainers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("topLosers")
    private final List<b> topLosers;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.revolut.feature.wealth.impl.data.network.topmovers.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$a;", "", "STOCK", "CRYPTO", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC0585a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0585a[] $VALUES;

        @lg.b("CRYPTO")
        public static final EnumC0585a CRYPTO;

        @lg.b("STOCK")
        public static final EnumC0585a STOCK;

        static {
            EnumC0585a enumC0585a = new EnumC0585a("STOCK", 0);
            STOCK = enumC0585a;
            EnumC0585a enumC0585a2 = new EnumC0585a("CRYPTO", 1);
            CRYPTO = enumC0585a2;
            EnumC0585a[] enumC0585aArr = {enumC0585a, enumC0585a2};
            $VALUES = enumC0585aArr;
            $ENTRIES = s.n(enumC0585aArr);
        }

        public static EnumC0585a valueOf(String str) {
            return (EnumC0585a) Enum.valueOf(EnumC0585a.class, str);
        }

        public static EnumC0585a[] values() {
            return (EnumC0585a[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "ref", "Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$a;", "b", "Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$a;", "()Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$a;", "assetType", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "basePrice", "Lko3/a;", "Lko3/a;", "()Lko3/a;", "basePricePrecise", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetType")
        @NotNull
        private final EnumC0585a assetType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("basePrice")
        @NotNull
        private final jo3.a basePrice;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("basePricePrecise")
        private final ko3.a basePricePrecise;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC0585a getAssetType() {
            return this.assetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getBasePrice() {
            return this.basePrice;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ko3.a getBasePricePrecise() {
            return this.basePricePrecise;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return Intrinsics.f(this.ref, bVar.ref) && this.assetType == bVar.assetType && Intrinsics.f(this.basePrice, bVar.basePrice) && Intrinsics.f(this.basePricePrecise, bVar.basePricePrecise);
        }

        public final int hashCode() {
            int iJ = v7.j(this.basePrice, (this.assetType.hashCode() + (this.ref.hashCode() * 31)) * 31, 31);
            ko3.a aVar = this.basePricePrecise;
            return iJ + (aVar == null ? 0 : aVar.hashCode());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$c;", "", "ONE_DAY", "ONE_MONTH", "ONE_WEEK", "ONE_YEAR", "FIVE_YEARS", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;

        @lg.b("FIVE_YEARS")
        public static final c FIVE_YEARS;

        @lg.b("ONE_DAY")
        public static final c ONE_DAY;

        @lg.b("ONE_MONTH")
        public static final c ONE_MONTH;

        @lg.b("ONE_WEEK")
        public static final c ONE_WEEK;

        @lg.b("ONE_YEAR")
        public static final c ONE_YEAR;

        static {
            c cVar = new c("ONE_DAY", 0);
            ONE_DAY = cVar;
            c cVar2 = new c("ONE_MONTH", 1);
            ONE_MONTH = cVar2;
            c cVar3 = new c("ONE_WEEK", 2);
            ONE_WEEK = cVar3;
            c cVar4 = new c("ONE_YEAR", 3);
            ONE_YEAR = cVar4;
            c cVar5 = new c("FIVE_YEARS", 4);
            FIVE_YEARS = cVar5;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
            $VALUES = cVarArr;
            $ENTRIES = s.n(cVarArr);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getTimeSpan() {
        return this.timeSpan;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getTopGainers() {
        return this.topGainers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTopLosers() {
        return this.topLosers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.timeSpan == aVar.timeSpan && Intrinsics.f(this.topGainers, aVar.topGainers) && Intrinsics.f(this.topLosers, aVar.topLosers);
    }

    public final int hashCode() {
        c cVar = this.timeSpan;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        List<b> list = this.topGainers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.topLosers;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
