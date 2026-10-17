package j7l;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lj7l/b;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "endDate", "b", "c", "socialNetwork", "getUrl", "url", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "reward", "feature_shared_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("end_date")
    @NotNull
    private final String endDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("social_network")
    @NotNull
    private final String socialNetwork;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("url")
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("reward")
    @NotNull
    private final jo3.a reward;

    public b(String endDate, String socialNetwork, String url2, jo3.a reward) {
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.endDate = endDate;
        this.socialNetwork = socialNetwork;
        this.url = url2;
        this.reward = reward;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSocialNetwork() {
        return this.socialNetwork;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.endDate, bVar.endDate) && Intrinsics.f(this.socialNetwork, bVar.socialNetwork) && Intrinsics.f(this.url, bVar.url) && Intrinsics.f(this.reward, bVar.reward);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.reward.hashCode() + p.a.c(p.a.c(this.endDate.hashCode() * 31, 31, this.socialNetwork), 31, this.url);
    }
}
