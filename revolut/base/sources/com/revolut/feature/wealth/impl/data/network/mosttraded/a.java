package com.revolut.feature.wealth.impl.data.network.mosttraded;

import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\r\b\u0006\u000fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0006\u0010\u0010R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$d;", "a", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$d;", "d", "()Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$d;", "timeSpan", "", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$b;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "mostTraded", "mostBought", "mostSold", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeSpan")
    private final d timeSpan;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("mostTraded")
    private final List<b> mostTraded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mostBought")
    private final List<b> mostBought;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("mostSold")
    private final List<b> mostSold;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.revolut.feature.wealth.impl.data.network.mosttraded.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$a;", "", "SECURITY", "CRYPTO", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC0584a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0584a[] $VALUES;

        @lg.b("CRYPTO")
        public static final EnumC0584a CRYPTO;

        @lg.b("SECURITY")
        public static final EnumC0584a SECURITY;

        static {
            EnumC0584a enumC0584a = new EnumC0584a("SECURITY", 0);
            SECURITY = enumC0584a;
            EnumC0584a enumC0584a2 = new EnumC0584a("CRYPTO", 1);
            CRYPTO = enumC0584a2;
            EnumC0584a[] enumC0584aArr = {enumC0584a, enumC0584a2};
            $VALUES = enumC0584aArr;
            $ENTRIES = s.n(enumC0584aArr);
        }

        public static EnumC0584a valueOf(String str) {
            return (EnumC0584a) Enum.valueOf(EnumC0584a.class, str);
        }

        public static EnumC0584a[] values() {
            return (EnumC0584a[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "ref", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$a;", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$a;", "getAssetType", "()Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$a;", "assetType", "", "c", "F", "()F", "buyToAllRatio", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetType")
        @NotNull
        private final EnumC0584a assetType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("buyToAllRatio")
        private final float buyToAllRatio;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getBuyToAllRatio() {
            return this.buyToAllRatio;
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
            return Intrinsics.f(this.ref, bVar.ref) && this.assetType == bVar.assetType && Float.compare(this.buyToAllRatio, bVar.buyToAllRatio) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.buyToAllRatio) + ((this.assetType.hashCode() + (this.ref.hashCode() * 31)) * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$c;", "", "CFD", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;

        @lg.b("CFD")
        public static final c CFD;

        static {
            c cVar = new c("CFD", 0);
            CFD = cVar;
            c[] cVarArr = {cVar};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$d;", "", "ONE_DAY", "ONE_MONTH", "ONE_WEEK", "ONE_YEAR", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;

        @lg.b("ONE_DAY")
        public static final d ONE_DAY;

        @lg.b("ONE_MONTH")
        public static final d ONE_MONTH;

        @lg.b("ONE_WEEK")
        public static final d ONE_WEEK;

        @lg.b("ONE_YEAR")
        public static final d ONE_YEAR;

        static {
            d dVar = new d("ONE_DAY", 0);
            ONE_DAY = dVar;
            d dVar2 = new d("ONE_MONTH", 1);
            ONE_MONTH = dVar2;
            d dVar3 = new d("ONE_WEEK", 2);
            ONE_WEEK = dVar3;
            d dVar4 = new d("ONE_YEAR", 3);
            ONE_YEAR = dVar4;
            d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
            $VALUES = dVarArr;
            $ENTRIES = s.n(dVarArr);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getMostBought() {
        return this.mostBought;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getMostSold() {
        return this.mostSold;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getMostTraded() {
        return this.mostTraded;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getTimeSpan() {
        return this.timeSpan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.timeSpan == aVar.timeSpan && Intrinsics.f(this.mostTraded, aVar.mostTraded) && Intrinsics.f(this.mostBought, aVar.mostBought) && Intrinsics.f(this.mostSold, aVar.mostSold);
    }

    public final int hashCode() {
        d dVar = this.timeSpan;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        List<b> list = this.mostTraded;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.mostBought;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<b> list3 = this.mostSold;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }
}
