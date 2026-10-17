package i20;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Li20/g;", "", "", "toString", "()Ljava/lang/String;", "Li20/m0;", "a", "Li20/m0;", "b", "()Li20/m0;", "replyToDetails", "Ljava/lang/String;", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyToDetails")
    private final m0 replyToDetails = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageGroupId")
    private final String messageGroupId = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessageGroupId() {
        return this.messageGroupId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m0 getReplyToDetails() {
        return this.replyToDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.replyToDetails, gVar.replyToDetails) && Intrinsics.f(this.messageGroupId, gVar.messageGroupId);
    }

    public final int hashCode() {
        m0 m0Var = this.replyToDetails;
        int iHashCode = (m0Var == null ? 0 : m0Var.hashCode()) * 31;
        String str = this.messageGroupId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
