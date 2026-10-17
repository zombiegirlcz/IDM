package m8h;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\r"}, d2 = {"Lm8h/a;", "", "", "toString", "()Ljava/lang/String;", "", "Lm8h/a$a;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "stocks", "etfs", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("stocks")
    private final List<C1151a> stocks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("etfs")
    private final List<C1151a> etfs;

    /* JADX INFO: renamed from: m8h.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lm8h/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "ref", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1151a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        public C1151a(String ref2) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.ref = ref2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1151a) && Intrinsics.f(this.ref, ((C1151a) obj2).ref);
        }

        public final int hashCode() {
            return this.ref.hashCode();
        }
    }

    public a(ArrayList arrayList, ArrayList arrayList2) {
        this.stocks = arrayList;
        this.etfs = arrayList2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getEtfs() {
        return this.etfs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getStocks() {
        return this.stocks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.stocks, aVar.stocks) && Intrinsics.f(this.etfs, aVar.etfs);
    }

    public final int hashCode() {
        List<C1151a> list = this.stocks;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C1151a> list2 = this.etfs;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
