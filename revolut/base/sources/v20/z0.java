package v20;

import com.revolut.chat.domain.model.MessageType;
import com.revolut.chat.domain.model.ReplyToDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u001a"}, d2 = {"Lv20/z0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "isBotMessage", "Lcom/revolut/chat/domain/model/MessageType;", "b", "Lcom/revolut/chat/domain/model/MessageType;", "e", "()Lcom/revolut/chat/domain/model/MessageType;", "type", "c", "Ljava/lang/String;", "entryPoint", "Lcom/revolut/chat/domain/model/ReplyToDetails;", "d", "Lcom/revolut/chat/domain/model/ReplyToDetails;", "()Lcom/revolut/chat/domain/model/ReplyToDetails;", "replyToDetails", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("botMessage")
    private final Boolean isBotMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final MessageType type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("entryPoint")
    private final String entryPoint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("replyToDetails")
    private final ReplyToDetails replyToDetails;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("messageGroupId")
    private final String messageGroupId;

    public z0() {
        this(null, 31);
    }

    public static z0 a(z0 z0Var, String str, ReplyToDetails replyToDetails, int i) {
        Boolean bool = z0Var.isBotMessage;
        MessageType messageType = z0Var.type;
        if ((i & 8) != 0) {
            replyToDetails = z0Var.replyToDetails;
        }
        return new z0(bool, messageType, str, replyToDetails, z0Var.messageGroupId);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessageGroupId() {
        return this.messageGroupId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ReplyToDetails getReplyToDetails() {
        return this.replyToDetails;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final MessageType getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.isBotMessage, z0Var.isBotMessage) && Intrinsics.f(this.type, z0Var.type) && Intrinsics.f(this.entryPoint, z0Var.entryPoint) && Intrinsics.f(this.replyToDetails, z0Var.replyToDetails) && Intrinsics.f(this.messageGroupId, z0Var.messageGroupId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getIsBotMessage() {
        return this.isBotMessage;
    }

    public final int hashCode() {
        Boolean bool = this.isBotMessage;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        MessageType messageType = this.type;
        int iHashCode2 = (iHashCode + (messageType == null ? 0 : messageType.hashCode())) * 31;
        String str = this.entryPoint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ReplyToDetails replyToDetails = this.replyToDetails;
        int iHashCode4 = (iHashCode3 + (replyToDetails == null ? 0 : replyToDetails.hashCode())) * 31;
        String str2 = this.messageGroupId;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ z0(MessageType messageType, int i) {
        this(null, (i & 2) != 0 ? null : messageType, null, null, null);
    }

    public z0(Boolean bool, MessageType messageType, String str, ReplyToDetails replyToDetails, String str2) {
        this.isBotMessage = bool;
        this.type = messageType;
        this.entryPoint = str;
        this.replyToDetails = replyToDetails;
        this.messageGroupId = str2;
    }
}
