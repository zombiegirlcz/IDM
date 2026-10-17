package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001a\u0010\u0004¨\u0006 "}, d2 = {"Li20/w;", "Li20/d0;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "g", "()Ljava/util/UUID;", "uploadId", "b", "Ljava/lang/String;", "c", "mediaType", "filePath", "Lv20/t0;", "d", "Lv20/t0;", "()Lv20/t0;", "meta", "", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "contentUploaded", "f", "getReplyToMessageServerId", "replyToMessageServerId", "transcriptState", "h", "transcriptText", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("uploadId")
    private final UUID uploadId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("mediaType")
    @NotNull
    private final String mediaType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("localFilePath")
    private final String filePath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("meta")
    private final v20.t0 meta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("contentUploaded")
    private final Boolean contentUploaded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("replyToMessageId")
    private final UUID replyToMessageServerId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("transcriptState")
    private final String transcriptState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("transcriptText")
    private final String transcriptText;

    public w(String mediaType, String str, UUID uuid, UUID uuid2, v20.t0 t0Var) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        this.uploadId = uuid;
        this.mediaType = mediaType;
        this.filePath = str;
        this.meta = t0Var;
        this.contentUploaded = null;
        this.replyToMessageServerId = uuid2;
        this.transcriptState = null;
        this.transcriptText = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getContentUploaded() {
        return this.contentUploaded;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v20.t0 getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTranscriptState() {
        return this.transcriptState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.uploadId, wVar.uploadId) && Intrinsics.f(this.mediaType, wVar.mediaType) && Intrinsics.f(this.filePath, wVar.filePath) && Intrinsics.f(this.meta, wVar.meta) && Intrinsics.f(this.contentUploaded, wVar.contentUploaded) && Intrinsics.f(this.replyToMessageServerId, wVar.replyToMessageServerId) && Intrinsics.f(this.transcriptState, wVar.transcriptState) && Intrinsics.f(this.transcriptText, wVar.transcriptText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTranscriptText() {
        return this.transcriptText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final UUID getUploadId() {
        return this.uploadId;
    }

    public final int hashCode() {
        UUID uuid = this.uploadId;
        int iC = p.a.c((uuid == null ? 0 : uuid.hashCode()) * 31, 31, this.mediaType);
        String str = this.filePath;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        v20.t0 t0Var = this.meta;
        int iHashCode2 = (iHashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        Boolean bool = this.contentUploaded;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        UUID uuid2 = this.replyToMessageServerId;
        int iHashCode4 = (iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        String str2 = this.transcriptState;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transcriptText;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
