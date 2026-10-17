package ehc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"Lehc/y;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "d", "()Z", "thirdPartyPromotion", "Lahc/a;", "b", "Lahc/a;", "()Lahc/a;", "categories", "Lfhc/b;", "c", "Lfhc/b;", "()Lfhc/b;", "collections", "", "Lehc/x;", "Ljava/util/List;", "()Ljava/util/List;", "rewards", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("thirdPartyPromotion")
    private final boolean thirdPartyPromotion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("categories")
    @NotNull
    private final ahc.a categories;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("collections")
    @NotNull
    private final fhc.b collections;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("rewards")
    @NotNull
    private final List<x> rewards;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ahc.a getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fhc.b getCollections() {
        return this.collections;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getRewards() {
        return this.rewards;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getThirdPartyPromotion() {
        return this.thirdPartyPromotion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.thirdPartyPromotion == yVar.thirdPartyPromotion && Intrinsics.f(this.categories, yVar.categories) && Intrinsics.f(this.collections, yVar.collections) && Intrinsics.f(this.rewards, yVar.rewards);
    }

    public final int hashCode() {
        return this.rewards.hashCode() + ((this.collections.hashCode() + ((this.categories.hashCode() + (Boolean.hashCode(this.thirdPartyPromotion) * 31)) * 31)) * 31);
    }
}
