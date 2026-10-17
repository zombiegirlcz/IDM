package v20;

import com.revolut.chat.domain.model.ReplyToDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u001c"}, d2 = {"Lv20/t0;", "", "", "toString", "()Ljava/lang/String;", "Lv20/t2;", "a", "Lv20/t2;", "g", "()Lv20/t2;", "waveform", "b", "Ljava/lang/String;", "c", "fileName", "", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "fileSize", "entryPoint", "Lcom/revolut/chat/domain/model/ReplyToDetails;", "e", "Lcom/revolut/chat/domain/model/ReplyToDetails;", "f", "()Lcom/revolut/chat/domain/model/ReplyToDetails;", "replyToDetails", "messageGroupId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("waveForm")
    private final t2 waveform;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fileName")
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fileSize")
    private final Long fileSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("entryPoint")
    private final String entryPoint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("replyToDetails")
    private final ReplyToDetails replyToDetails;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("messageGroupId")
    private final String messageGroupId;

    /* JADX WARN: Multi-variable type inference failed */
    public t0() {
        this(null, 0 == true ? 1 : 0, 63);
    }

    public static t0 a(t0 t0Var, String str, ReplyToDetails replyToDetails, int i) {
        t2 t2Var = t0Var.waveform;
        String str2 = t0Var.fileName;
        Long l2 = t0Var.fileSize;
        if ((i & 16) != 0) {
            replyToDetails = t0Var.replyToDetails;
        }
        return new t0(t2Var, str2, l2, str, replyToDetails, t0Var.messageGroupId);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMessageGroupId() {
        return this.messageGroupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.waveform, t0Var.waveform) && Intrinsics.f(this.fileName, t0Var.fileName) && Intrinsics.f(this.fileSize, t0Var.fileSize) && Intrinsics.f(this.entryPoint, t0Var.entryPoint) && Intrinsics.f(this.replyToDetails, t0Var.replyToDetails) && Intrinsics.f(this.messageGroupId, t0Var.messageGroupId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ReplyToDetails getReplyToDetails() {
        return this.replyToDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final t2 getWaveform() {
        return this.waveform;
    }

    public final int hashCode() {
        t2 t2Var = this.waveform;
        int iHashCode = (t2Var == null ? 0 : t2Var.hashCode()) * 31;
        String str = this.fileName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.fileSize;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.entryPoint;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReplyToDetails replyToDetails = this.replyToDetails;
        int iHashCode5 = (iHashCode4 + (replyToDetails == null ? 0 : replyToDetails.hashCode())) * 31;
        String str3 = this.messageGroupId;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ t0(t2 t2Var, String str, int i) {
        this((i & 1) != 0 ? null : t2Var, null, null, (i & 8) != 0 ? null : str, null, null);
    }

    public t0(t2 t2Var, String str, Long l2, String str2, ReplyToDetails replyToDetails, String str3) {
        this.waveform = t2Var;
        this.fileName = str;
        this.fileSize = l2;
        this.entryPoint = str2;
        this.replyToDetails = replyToDetails;
        this.messageGroupId = str3;
    }
}
