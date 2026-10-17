package kp8;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b\u0005\u0010!R\u001c\u0010$\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010!R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006&"}, d2 = {"Lkp8/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "h", "juniorId", "c", "coparentId", "d", "i", "name", "e", "l", "state", "Ljo3/b;", "f", "Ljo3/b;", "j", "()Ljo3/b;", "reward", "iconUrl", "description", "", "J", "()J", "createdDate", "Ljava/lang/Long;", "()Ljava/lang/Long;", "completedDate", "k", "startDate", "frequency", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("youthId")
    @NotNull
    private final String juniorId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("coparent")
    @NotNull
    private final String coparentId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reward")
    @NotNull
    private final jo3.b reward;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("iconUrl")
    @NotNull
    private final String iconUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedDate")
    private final Long completedDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    @NotNull
    private final String frequency;

    public a(String id10, String juniorId, String coparentId, String name, String state, jo3.b reward, String iconUrl, String str, long j2, Long l2, Long l3, String frequency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(coparentId, "coparentId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.id = id10;
        this.juniorId = juniorId;
        this.coparentId = coparentId;
        this.name = name;
        this.state = state;
        this.reward = reward;
        this.iconUrl = iconUrl;
        this.description = str;
        this.createdDate = j2;
        this.completedDate = l2;
        this.startDate = l3;
        this.frequency = frequency;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCompletedDate() {
        return this.completedDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCoparentId() {
        return this.coparentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.juniorId, aVar.juniorId) && Intrinsics.f(this.coparentId, aVar.coparentId) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.reward, aVar.reward) && Intrinsics.f(this.iconUrl, aVar.iconUrl) && Intrinsics.f(this.description, aVar.description) && this.createdDate == aVar.createdDate && Intrinsics.f(this.completedDate, aVar.completedDate) && Intrinsics.f(this.startDate, aVar.startDate) && Intrinsics.f(this.frequency, aVar.frequency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getJuniorId() {
        return this.juniorId;
    }

    public final int hashCode() {
        int iC = p.a.c(y.e(this.reward, p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.juniorId), 31, this.coparentId), 31, this.name), 31, this.state), 31), 31, this.iconUrl);
        String str = this.description;
        int iC2 = d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.createdDate);
        Long l2 = this.completedDate;
        int iHashCode = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.startDate;
        return this.frequency.hashCode() + ((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.b getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
