package w7h;

import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lw7h/a;", "", "", "toString", "()Ljava/lang/String;", "Lw7h/a$b;", "a", "Lw7h/a$b;", "b", "()Lw7h/a$b;", "key", "", "Lw7h/a$a;", "Ljava/util/List;", "()Ljava/util/List;", "instruments", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    private final b key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("instruments")
    private final List<C1630a> instruments;

    /* JADX INFO: renamed from: w7h.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lw7h/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "ref", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1630a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1630a) && Intrinsics.f(this.ref, ((C1630a) obj2).ref);
        }

        public final int hashCode() {
            return this.ref.hashCode();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lw7h/a$b;", "", "STOCKS", "ETFS", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @lg.b("popular-first-time-buys-etfs")
        public static final b ETFS;

        @lg.b("popular-first-time-buys-stocks")
        public static final b STOCKS;

        static {
            b bVar = new b("STOCKS", 0);
            STOCKS = bVar;
            b bVar2 = new b("ETFS", 1);
            ETFS = bVar2;
            b[] bVarArr = {bVar, bVar2};
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

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getInstruments() {
        return this.instruments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getKey() {
        return this.key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.key == aVar.key && Intrinsics.f(this.instruments, aVar.instruments);
    }

    public final int hashCode() {
        b bVar = this.key;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List<C1630a> list = this.instruments;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
