package jp8;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Ljp8/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getJuniorId", "juniorId", "b", "getName", "name", "Ljo3/a;", "c", "Ljo3/a;", "getReward", "()Ljo3/a;", "reward", "d", "getDescription", "description", "", "e", "Ljava/lang/Long;", "getStartDate", "()Ljava/lang/Long;", "startDate", "f", "getFrequency", "frequency", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("youthId")
    @NotNull
    private final String juniorId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reward")
    @NotNull
    private final jo3.a reward;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("frequency")
    @NotNull
    private final String frequency;

    public b(String juniorId, String name, jo3.a reward, String str, Long l2, String frequency) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.juniorId = juniorId;
        this.name = name;
        this.reward = reward;
        this.description = str;
        this.startDate = l2;
        this.frequency = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.juniorId, bVar.juniorId) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.reward, bVar.reward) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.startDate, bVar.startDate) && Intrinsics.f(this.frequency, bVar.frequency);
    }

    public final int hashCode() {
        int iJ = v7.j(this.reward, p.a.c(this.juniorId.hashCode() * 31, 31, this.name), 31);
        String str = this.description;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.startDate;
        return this.frequency.hashCode() + ((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }
}
