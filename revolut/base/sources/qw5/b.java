package qw5;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0006\b\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lqw5/b;", "", "", "toString", "()Ljava/lang/String;", "Lqw5/b$c;", "a", "Lqw5/b$c;", "c", "()Lqw5/b$c;", "timeSpan", "Lqw5/b$b;", "b", "Lqw5/b$b;", "()Lqw5/b$b;", "assetType", "", "Lqw5/b$a;", "Ljava/util/List;", "()Ljava/util/List;", "assets", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeSpan")
    private final c timeSpan;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetType")
    @NotNull
    private final EnumC1371b assetType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("assets")
    @NotNull
    private final List<a> assets;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqw5/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "ref", "Lqw5/b$b;", "Lqw5/b$b;", "()Lqw5/b$b;", "assetType", "Ljava/math/BigDecimal;", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "volumeChange", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetType")
        @NotNull
        private final EnumC1371b assetType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("volumeChange")
        @NotNull
        private final BigDecimal volumeChange;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC1371b getAssetType() {
            return this.assetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getVolumeChange() {
            return this.volumeChange;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.ref, aVar.ref) && this.assetType == aVar.assetType && Intrinsics.f(this.volumeChange, aVar.volumeChange);
        }

        public final int hashCode() {
            return this.volumeChange.hashCode() + ((this.assetType.hashCode() + (this.ref.hashCode() * 31)) * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: qw5.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lqw5/b$b;", "", "SECURITY", "CRYPTO", "COMMODITY", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC1371b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC1371b[] $VALUES;

        @lg.b("COMMODITY")
        public static final EnumC1371b COMMODITY;

        @lg.b("CRYPTO")
        public static final EnumC1371b CRYPTO;

        @lg.b("SECURITY")
        public static final EnumC1371b SECURITY;

        static {
            EnumC1371b enumC1371b = new EnumC1371b("SECURITY", 0);
            SECURITY = enumC1371b;
            EnumC1371b enumC1371b2 = new EnumC1371b("CRYPTO", 1);
            CRYPTO = enumC1371b2;
            EnumC1371b enumC1371b3 = new EnumC1371b("COMMODITY", 2);
            COMMODITY = enumC1371b3;
            EnumC1371b[] enumC1371bArr = {enumC1371b, enumC1371b2, enumC1371b3};
            $VALUES = enumC1371bArr;
            $ENTRIES = s.n(enumC1371bArr);
        }

        public static EnumC1371b valueOf(String str) {
            return (EnumC1371b) Enum.valueOf(EnumC1371b.class, str);
        }

        public static EnumC1371b[] values() {
            return (EnumC1371b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lqw5/b$c;", "", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "ONE_YEAR", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;

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
            c cVar2 = new c("ONE_WEEK", 1);
            ONE_WEEK = cVar2;
            c cVar3 = new c("ONE_MONTH", 2);
            ONE_MONTH = cVar3;
            c cVar4 = new c("ONE_YEAR", 3);
            ONE_YEAR = cVar4;
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
    public final EnumC1371b getAssetType() {
        return this.assetType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAssets() {
        return this.assets;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getTimeSpan() {
        return this.timeSpan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.timeSpan == bVar.timeSpan && this.assetType == bVar.assetType && Intrinsics.f(this.assets, bVar.assets);
    }

    public final int hashCode() {
        c cVar = this.timeSpan;
        return this.assets.hashCode() + ((this.assetType.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31)) * 31);
    }
}
