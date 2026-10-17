package y9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rfi.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\r\u0010\u0019¨\u0006\u001b"}, d2 = {"Ly9g/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getTotalProperties", "()I", "totalProperties", "", "Lrfi/n;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "properties", "Ly9g/a;", "Ly9g/a;", "()Ly9g/a;", "paginationTokens", "Lqfi/a;", "d", "Lqfi/a;", "()Lqfi/a;", "promotion", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalProperties")
    private final int totalProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("properties")
    @NotNull
    private final List<n> properties;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paginationTokens")
    private final a paginationTokens;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("promotion")
    private final qfi.a promotion;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getPaginationTokens() {
        return this.paginationTokens;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final qfi.a getPromotion() {
        return this.promotion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getProperties() {
        return this.properties;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.totalProperties == bVar.totalProperties && Intrinsics.f(this.properties, bVar.properties) && Intrinsics.f(this.paginationTokens, bVar.paginationTokens) && Intrinsics.f(this.promotion, bVar.promotion);
    }

    public final int hashCode() {
        int iD = p.a.d(Integer.hashCode(this.totalProperties) * 31, 31, this.properties);
        a aVar = this.paginationTokens;
        int iHashCode = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        qfi.a aVar2 = this.promotion;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
