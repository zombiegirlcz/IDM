package iv9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Liv9/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "reaction", "authorCode", "", "c", "J", "()J", "timestamp", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("reaction")
    @NotNull
    private final String reaction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorCode")
    @NotNull
    private final String authorCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("timestamp")
    private final long timestamp;

    public l(String reaction, String authorCode, long j2) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(authorCode, "authorCode");
        this.reaction = reaction;
        this.authorCode = authorCode;
        this.timestamp = j2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthorCode() {
        return this.authorCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReaction() {
        return this.reaction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.reaction, lVar.reaction) && Intrinsics.f(this.authorCode, lVar.authorCode) && this.timestamp == lVar.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + p.a.c(this.reaction.hashCode() * 31, 31, this.authorCode);
    }
}
