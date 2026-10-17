package e8l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Le8l/i;", "Le8l/j;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "key", "Le8l/a;", "Le8l/a;", "c", "()Le8l/a;", "limit", "current", "d", "next", "e", "renewsAtDateString", "Companion", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("limit")
    @NotNull
    private final a limit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("current")
    @NotNull
    private final a current;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("next")
    @NotNull
    private final a next;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("renewsAt")
    private final String renewsAtDateString;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRenewsAtDateString() {
        return this.renewsAtDateString;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.key, iVar.key) && Intrinsics.f(this.limit, iVar.limit) && Intrinsics.f(this.current, iVar.current) && Intrinsics.f(this.next, iVar.next) && Intrinsics.f(this.renewsAtDateString, iVar.renewsAtDateString);
    }

    public final int hashCode() {
        int iHashCode = (this.next.hashCode() + ((this.current.hashCode() + ((this.limit.hashCode() + (this.key.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.renewsAtDateString;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
