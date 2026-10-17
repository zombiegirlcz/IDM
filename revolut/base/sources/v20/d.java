package v20;

import com.revolut.chat.domain.model.ReplyToDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lv20/d;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/chat/domain/model/ReplyToDetails;", "a", "Lcom/revolut/chat/domain/model/ReplyToDetails;", "b", "()Lcom/revolut/chat/domain/model/ReplyToDetails;", "replyToDetails", "Ljava/lang/String;", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyToDetails")
    private final ReplyToDetails replyToDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageGroupId")
    private final String messageGroupId;

    public d() {
        this((ReplyToDetails) null, 3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessageGroupId() {
        return this.messageGroupId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ReplyToDetails getReplyToDetails() {
        return this.replyToDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.replyToDetails, dVar.replyToDetails) && Intrinsics.f(this.messageGroupId, dVar.messageGroupId);
    }

    public final int hashCode() {
        ReplyToDetails replyToDetails = this.replyToDetails;
        int iHashCode = (replyToDetails == null ? 0 : replyToDetails.hashCode()) * 31;
        String str = this.messageGroupId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ d(ReplyToDetails replyToDetails, int i) {
        this((i & 1) != 0 ? null : replyToDetails, (String) null);
    }

    public d(ReplyToDetails replyToDetails, String str) {
        this.replyToDetails = replyToDetails;
        this.messageGroupId = str;
    }
}
