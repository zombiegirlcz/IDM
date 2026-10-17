package q6l;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lq6l/k;", "", "", "toString", "()Ljava/lang/String;", "Li93/d;", "a", "Li93/d;", "getBindingStrategy", "()Li93/d;", "bindingStrategy", "", "b", "Ljava/util/Set;", "getBindingStrategyPockets", "()Ljava/util/Set;", "bindingStrategyPockets", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("bindingStrategy")
    private final i93.d bindingStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pockets")
    private final Set<String> bindingStrategyPockets;

    public k() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.bindingStrategy == kVar.bindingStrategy && Intrinsics.f(this.bindingStrategyPockets, kVar.bindingStrategyPockets);
    }

    public final int hashCode() {
        i93.d dVar = this.bindingStrategy;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Set<String> set = this.bindingStrategyPockets;
        return iHashCode + (set != null ? set.hashCode() : 0);
    }

    public k(i93.d dVar, Set set) {
        this.bindingStrategy = dVar;
        this.bindingStrategyPockets = set;
    }
}
