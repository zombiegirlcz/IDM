package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Li20/e;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "b", "()Ljava/util/UUID;", "messageId", "correlationId", "Li20/d;", "c", "Li20/d;", "()Li20/d;", "upload", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageId")
    @NotNull
    private final UUID messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("correlationId")
    @NotNull
    private final UUID correlationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("upload")
    @NotNull
    private final d upload;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getCorrelationId() {
        return this.correlationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getUpload() {
        return this.upload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.messageId, eVar.messageId) && Intrinsics.f(this.correlationId, eVar.correlationId) && Intrinsics.f(this.upload, eVar.upload);
    }

    public final int hashCode() {
        return this.upload.hashCode() + t61.a.f(this.correlationId, this.messageId.hashCode() * 31, 31);
    }
}
