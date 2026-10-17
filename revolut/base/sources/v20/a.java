package v20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lv20/a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "c", "()Ljava/util/UUID;", "messageId", "b", "correlationId", "Lv20/b;", "Lv20/b;", "d", "()Lv20/b;", "upload", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageId")
    private final UUID messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("correlationId")
    @NotNull
    private final UUID correlationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("upload")
    @NotNull
    private final b upload;

    public a(UUID uuid, UUID correlationId, b upload) {
        Intrinsics.checkNotNullParameter(correlationId, "correlationId");
        Intrinsics.checkNotNullParameter(upload, "upload");
        this.messageId = uuid;
        this.correlationId = correlationId;
        this.upload = upload;
    }

    public static a a(a aVar, b upload) {
        UUID uuid = aVar.messageId;
        UUID correlationId = aVar.correlationId;
        Intrinsics.checkNotNullParameter(correlationId, "correlationId");
        Intrinsics.checkNotNullParameter(upload, "upload");
        return new a(uuid, correlationId, upload);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getCorrelationId() {
        return this.correlationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UUID getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getUpload() {
        return this.upload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.messageId, aVar.messageId) && Intrinsics.f(this.correlationId, aVar.correlationId) && Intrinsics.f(this.upload, aVar.upload);
    }

    public final int hashCode() {
        UUID uuid = this.messageId;
        return this.upload.hashCode() + t61.a.f(this.correlationId, (uuid == null ? 0 : uuid.hashCode()) * 31, 31);
    }
}
