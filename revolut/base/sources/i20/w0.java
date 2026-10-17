package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0012"}, d2 = {"Li20/w0;", "Li20/o0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "messageId", "c", "transcriptState", "d", "transcriptText", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageId")
    @NotNull
    private final UUID messageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transcriptState")
    @NotNull
    private final String transcriptState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transcriptText")
    private final String transcriptText;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTranscriptState() {
        return this.transcriptState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTranscriptText() {
        return this.transcriptText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.type, w0Var.type) && Intrinsics.f(this.messageId, w0Var.messageId) && Intrinsics.f(this.transcriptState, w0Var.transcriptState) && Intrinsics.f(this.transcriptText, w0Var.transcriptText);
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.f(this.messageId, this.type.hashCode() * 31, 31), 31, this.transcriptState);
        String str = this.transcriptText;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
