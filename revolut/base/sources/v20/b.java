package v20;

import java.io.File;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0004R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006#"}, d2 = {"Lv20/b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "i", "()Ljava/util/UUID;", "uploadId", "b", "Ljava/lang/String;", "f", "mediaType", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "contentUploaded", "d", "caption", "e", "g", "thumbnailUrl", "", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "thumbnailUrlHeaders", "fileName", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "fileSize", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("uploadId")
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
    @lg.b("thumbnailUrl")
    private final String thumbnailUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("thumbnailUrlHeaders")
    private final Map<String, String> thumbnailUrlHeaders;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fileName")
    private final String fileName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("fileSize")
    private final Long fileSize;
    public transient File i;

    public b(UUID uuid, String mediaType, Boolean bool, String str, String str2, Map map, String str3, Long l2) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        this.uploadId = uuid;
        this.mediaType = mediaType;
        this.contentUploaded = bool;
        this.caption = str;
        this.thumbnailUrl = str2;
        this.thumbnailUrlHeaders = map;
        this.fileName = str3;
        this.fileSize = l2;
    }

    public static b a(b bVar, String str, String str2, Long l2, int i) {
        Boolean bool = Boolean.TRUE;
        UUID uuid = bVar.uploadId;
        if ((i & 2) != 0) {
            str = bVar.mediaType;
        }
        String mediaType = str;
        if ((i & 4) != 0) {
            bool = bVar.contentUploaded;
        }
        Boolean bool2 = bool;
        String str3 = bVar.caption;
        String str4 = bVar.thumbnailUrl;
        Map<String, String> map = bVar.thumbnailUrlHeaders;
        if ((i & 64) != 0) {
            str2 = bVar.fileName;
        }
        String str5 = str2;
        if ((i & 128) != 0) {
            l2 = bVar.fileSize;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new b(uuid, mediaType, bool2, str3, str4, map, str5, l2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getContentUploaded() {
        return this.contentUploaded;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.uploadId, bVar.uploadId) && Intrinsics.f(this.mediaType, bVar.mediaType) && Intrinsics.f(this.contentUploaded, bVar.contentUploaded) && Intrinsics.f(this.caption, bVar.caption) && Intrinsics.f(this.thumbnailUrl, bVar.thumbnailUrl) && Intrinsics.f(this.thumbnailUrlHeaders, bVar.thumbnailUrlHeaders) && Intrinsics.f(this.fileName, bVar.fileName) && Intrinsics.f(this.fileSize, bVar.fileSize);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Map getThumbnailUrlHeaders() {
        return this.thumbnailUrlHeaders;
    }

    public final int hashCode() {
        UUID uuid = this.uploadId;
        int iC = p.a.c((uuid == null ? 0 : uuid.hashCode()) * 31, 31, this.mediaType);
        Boolean bool = this.contentUploaded;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.caption;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumbnailUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.thumbnailUrlHeaders;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.fileName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.fileSize;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final UUID getUploadId() {
        return this.uploadId;
    }
}
