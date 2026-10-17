package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkfj/n;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "alreadySubscribed", "", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "priority", "c", "popular", "Lkfj/m;", "Lkfj/m;", "()Lkfj/m;", "abroadWarning", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("alreadySubscribed")
    private final Boolean alreadySubscribed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("priority")
    private final Integer priority;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("popular")
    private final Boolean popular;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("abroadWarning")
    private final m abroadWarning;

    public n(Boolean bool, Integer num, Boolean bool2, m mVar) {
        this.alreadySubscribed = bool;
        this.priority = num;
        this.popular = bool2;
        this.abroadWarning = mVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getAbroadWarning() {
        return this.abroadWarning;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAlreadySubscribed() {
        return this.alreadySubscribed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getPopular() {
        return this.popular;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getPriority() {
        return this.priority;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.alreadySubscribed, nVar.alreadySubscribed) && Intrinsics.f(this.priority, nVar.priority) && Intrinsics.f(this.popular, nVar.popular) && Intrinsics.f(this.abroadWarning, nVar.abroadWarning);
    }

    public final int hashCode() {
        Boolean bool = this.alreadySubscribed;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.priority;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.popular;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        m mVar = this.abroadWarning;
        return iHashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }
}
