package uvg;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Luvg/a0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "assetType", "Ljo3/a;", "b", "Ljo3/a;", "c", "()Ljo3/a;", "totalValue", "", "Luvg/d;", "Ljava/util/List;", "()Ljava/util/List;", "assets", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetType")
    @NotNull
    private final String assetType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalValue")
    @NotNull
    private final jo3.a totalValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("assets")
    @NotNull
    private final List<d> assets;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAssetType() {
        return this.assetType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAssets() {
        return this.assets;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getTotalValue() {
        return this.totalValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.assetType, a0Var.assetType) && Intrinsics.f(this.totalValue, a0Var.totalValue) && Intrinsics.f(this.assets, a0Var.assets);
    }

    public final int hashCode() {
        return this.assets.hashCode() + v7.j(this.totalValue, this.assetType.hashCode() * 31, 31);
    }
}
