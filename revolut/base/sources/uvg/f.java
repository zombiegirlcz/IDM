package uvg;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Luvg/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "assetType", "b", "asset", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "value", "", "F", "()F", "allocation", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("typesParameter")
    @NotNull
    private final String assetType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("asset")
    @NotNull
    private final String asset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final jo3.a value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("allocation")
    private final float allocation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAllocation() {
        return this.allocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAssetType() {
        return this.assetType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.assetType, fVar.assetType) && Intrinsics.f(this.asset, fVar.asset) && Intrinsics.f(this.value, fVar.value) && Float.compare(this.allocation, fVar.allocation) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.allocation) + v7.j(this.value, p.a.c(this.assetType.hashCode() * 31, 31, this.asset), 31);
    }
}
