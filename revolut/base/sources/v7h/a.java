package v7h;

import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\b\u0006\u0010J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lv7h/a;", "", "", "toString", "()Ljava/lang/String;", "Lv7h/a$c;", "a", "Lv7h/a$c;", "b", "()Lv7h/a$c;", "section", "", "Lv7h/a$b;", "Ljava/util/List;", "()Ljava/util/List;", "instruments", "c", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    private final c section;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("instruments")
    private final List<b> instruments;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: v7h.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lv7h/a$a;", "", "SECURITY", "CRYPTO", "COMMODITY", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC1582a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC1582a[] $VALUES;

        @lg.b("COMMODITY")
        public static final EnumC1582a COMMODITY;

        @lg.b("CRYPTO")
        public static final EnumC1582a CRYPTO;

        @lg.b("SECURITY")
        public static final EnumC1582a SECURITY;

        static {
            EnumC1582a enumC1582a = new EnumC1582a("SECURITY", 0);
            SECURITY = enumC1582a;
            EnumC1582a enumC1582a2 = new EnumC1582a("CRYPTO", 1);
            CRYPTO = enumC1582a2;
            EnumC1582a enumC1582a3 = new EnumC1582a("COMMODITY", 2);
            COMMODITY = enumC1582a3;
            EnumC1582a[] enumC1582aArr = {enumC1582a, enumC1582a2, enumC1582a3};
            $VALUES = enumC1582aArr;
            $ENTRIES = s.n(enumC1582aArr);
        }

        public static EnumC1582a valueOf(String str) {
            return (EnumC1582a) Enum.valueOf(EnumC1582a.class, str);
        }

        public static EnumC1582a[] values() {
            return (EnumC1582a[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lv7h/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "symbol", "b", "ref", "Lv7h/a$a;", "Lv7h/a$a;", "()Lv7h/a$a;", "assetType", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("symbol")
        @NotNull
        private final String symbol;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetType")
        private final EnumC1582a assetType;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC1582a getAssetType() {
            return this.assetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.symbol, bVar.symbol) && Intrinsics.f(this.ref, bVar.ref) && this.assetType == bVar.assetType;
        }

        public final int hashCode() {
            int iC = p.a.c(this.symbol.hashCode() * 31, 31, this.ref);
            EnumC1582a enumC1582a = this.assetType;
            return iC + (enumC1582a == null ? 0 : enumC1582a.hashCode());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lv7h/a$c;", "", "MOST_OWNED_COMMODITIES", "MOST_OWNED_ASSETS", "MOST_OWNED_STOCKS", "MOST_OWNED_CRYPTO", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;

        @lg.b("most-owned-all-assets")
        public static final c MOST_OWNED_ASSETS;

        @lg.b("most-owned-commodities")
        public static final c MOST_OWNED_COMMODITIES;

        @lg.b("most-owned-crypto")
        public static final c MOST_OWNED_CRYPTO;

        @lg.b("most-owned-stocks")
        public static final c MOST_OWNED_STOCKS;

        static {
            c cVar = new c("MOST_OWNED_COMMODITIES", 0);
            MOST_OWNED_COMMODITIES = cVar;
            c cVar2 = new c("MOST_OWNED_ASSETS", 1);
            MOST_OWNED_ASSETS = cVar2;
            c cVar3 = new c("MOST_OWNED_STOCKS", 2);
            MOST_OWNED_STOCKS = cVar3;
            c cVar4 = new c("MOST_OWNED_CRYPTO", 3);
            MOST_OWNED_CRYPTO = cVar4;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
    public final List getInstruments() {
        return this.instruments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getSection() {
        return this.section;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.section == aVar.section && Intrinsics.f(this.instruments, aVar.instruments);
    }

    public final int hashCode() {
        c cVar = this.section;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        List<b> list = this.instruments;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
