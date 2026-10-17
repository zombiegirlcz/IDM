package q6l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lq6l/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBindingStrategy", "bindingStrategy", "", "b", "Ljava/util/List;", "getPockets", "()Ljava/util/List;", "pockets", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("bindingStrategy")
    private final String bindingStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pockets")
    private final List<String> pockets;

    public p(String str, List list) {
        this.bindingStrategy = str;
        this.pockets = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.bindingStrategy, pVar.bindingStrategy) && Intrinsics.f(this.pockets, pVar.pockets);
    }

    public final int hashCode() {
        String str = this.bindingStrategy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.pockets;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
