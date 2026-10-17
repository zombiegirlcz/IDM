package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, d2 = {"Li20/q;", "Li20/o0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "getMessageId", "()Ljava/util/UUID;", "messageId", "c", "uploadId", "d", "getMediaType", "mediaType", "Lv20/t0;", "e", "Lv20/t0;", "getMeta", "()Lv20/t0;", "meta", "f", "getPayloadType", "payloadType", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageId")
    @NotNull
    private final UUID messageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("uploadId")
    @NotNull
    private final UUID uploadId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("mediaType")
    @NotNull
    private final String mediaType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("meta")
    private final v20.t0 meta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("payloadType")
    @NotNull
    private final String payloadType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getUploadId() {
        return this.uploadId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.type, qVar.type) && Intrinsics.f(this.messageId, qVar.messageId) && Intrinsics.f(this.uploadId, qVar.uploadId) && Intrinsics.f(this.mediaType, qVar.mediaType) && Intrinsics.f(this.meta, qVar.meta) && Intrinsics.f(this.payloadType, qVar.payloadType);
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.f(this.uploadId, t61.a.f(this.messageId, this.type.hashCode() * 31, 31), 31), 31, this.mediaType);
        v20.t0 t0Var = this.meta;
        return this.payloadType.hashCode() + ((iC + (t0Var == null ? 0 : t0Var.hashCode())) * 31);
    }
}
