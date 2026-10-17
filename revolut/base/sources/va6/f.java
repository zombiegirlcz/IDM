package va6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\f"}, d2 = {"Lva6/f;", "", "", "toString", "()Ljava/lang/String;", "", "Lva6/e;", "a", "Ljava/util/List;", "()Ljava/util/List;", "activeCampaigns", "Companion", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("activeCampaigns")
    @NotNull
    private final List<e> activeCampaigns;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActiveCampaigns() {
        return this.activeCampaigns;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.activeCampaigns, ((f) obj2).activeCampaigns);
    }

    public final int hashCode() {
        return this.activeCampaigns.hashCode();
    }
}
