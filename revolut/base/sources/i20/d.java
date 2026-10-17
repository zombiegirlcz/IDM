package i20;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0019"}, d2 = {"Li20/d;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "uploadId", "b", "Ljava/lang/String;", "c", "mediaType", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "contentUploaded", "d", "caption", "Lv20/t0;", "Lv20/t0;", "()Lv20/t0;", "meta", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("uploadId")
    @NotNull
    private final UUID uploadId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("mediaType")
    @NotNull
    private final String mediaType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("contentUploaded")
    private final Boolean contentUploaded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("caption")
    private final String caption;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("meta")
    private final v20.t0 meta;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getContentUploaded() {
        return this.contentUploaded;
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
    public final UUID getUploadId() {
        return this.uploadId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.uploadId, dVar.uploadId) && Intrinsics.f(this.mediaType, dVar.mediaType) && Intrinsics.f(this.contentUploaded, dVar.contentUploaded) && Intrinsics.f(this.caption, dVar.caption) && Intrinsics.f(this.meta, dVar.meta);
    }

    public final int hashCode() {
        int iC = p.a.c(this.uploadId.hashCode() * 31, 31, this.mediaType);
        Boolean bool = this.contentUploaded;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.caption;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        v20.t0 t0Var = this.meta;
        return iHashCode2 + (t0Var != null ? t0Var.hashCode() : 0);
    }
}
