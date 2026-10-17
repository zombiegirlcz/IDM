package com.onfido.api.client.data;

import bl.a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:Bk\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J&\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÁ\u0001¢\u0006\u0002\b8R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0018¨\u0006;"}, d2 = {"Lcom/onfido/api/client/data/LivePhotoUpload;", "", "seen1", "", "id", "", "createdAt", "Ljava/util/Date;", "fileName", "fileType", "fileSize", "", "href", "downloadHref", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getCreatedAt$annotations", "()V", "getCreatedAt", "()Ljava/util/Date;", "getDownloadHref$annotations", "getDownloadHref", "()Ljava/lang/String;", "getFileName$annotations", "getFileName", "getFileSize$annotations", "getFileSize", "()J", "getFileType$annotations", "getFileType", "getHref$annotations", "getHref", "getId$annotations", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class LivePhotoUpload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Date createdAt;

    @NotNull
    private final String downloadHref;

    @NotNull
    private final String fileName;
    private final long fileSize;

    @NotNull
    private final String fileType;

    @NotNull
    private final String href;

    @NotNull
    private final String id;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/LivePhotoUpload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/LivePhotoUpload;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LivePhotoUpload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ LivePhotoUpload(int i, String str, @g(with = a.class) Date date, String str2, String str3, long j2, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(LivePhotoUpload$$serializer.INSTANCE.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.id = str;
        this.createdAt = date;
        this.fileName = str2;
        this.fileType = str3;
        this.fileSize = j2;
        this.href = str4;
        this.downloadHref = str5;
    }

    public static /* synthetic */ LivePhotoUpload copy$default(LivePhotoUpload livePhotoUpload, String str, Date date, String str2, String str3, long j2, String str4, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = livePhotoUpload.id;
        }
        if ((i & 2) != 0) {
            date = livePhotoUpload.createdAt;
        }
        if ((i & 4) != 0) {
            str2 = livePhotoUpload.fileName;
        }
        if ((i & 8) != 0) {
            str3 = livePhotoUpload.fileType;
        }
        if ((i & 16) != 0) {
            j2 = livePhotoUpload.fileSize;
        }
        if ((i & 32) != 0) {
            str4 = livePhotoUpload.href;
        }
        if ((i & 64) != 0) {
            str5 = livePhotoUpload.downloadHref;
        }
        long j3 = j2;
        String str6 = str2;
        String str7 = str3;
        return livePhotoUpload.copy(str, date, str6, str7, j3, str4, str5);
    }

    @g(with = a.class)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getDownloadHref$annotations() {
    }

    public static /* synthetic */ void getFileName$annotations() {
    }

    public static /* synthetic */ void getFileSize$annotations() {
    }

    public static /* synthetic */ void getFileType$annotations() {
    }

    public static /* synthetic */ void getHref$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(LivePhotoUpload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, a.f16438a, self.createdAt);
        output.encodeStringElement(serialDesc, 2, self.fileName);
        output.encodeStringElement(serialDesc, 3, self.fileType);
        output.encodeLongElement(serialDesc, 4, self.fileSize);
        output.encodeStringElement(serialDesc, 5, self.href);
        output.encodeStringElement(serialDesc, 6, self.downloadHref);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDownloadHref() {
        return this.downloadHref;
    }

    @NotNull
    public final LivePhotoUpload copy(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long fileSize, @NotNull String href, @NotNull String downloadHref) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(href, "href");
        Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
        return new LivePhotoUpload(id10, createdAt, fileName, fileType, fileSize, href, downloadHref);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivePhotoUpload)) {
            return false;
        }
        LivePhotoUpload livePhotoUpload = (LivePhotoUpload) other;
        return Intrinsics.f(this.id, livePhotoUpload.id) && Intrinsics.f(this.createdAt, livePhotoUpload.createdAt) && Intrinsics.f(this.fileName, livePhotoUpload.fileName) && Intrinsics.f(this.fileType, livePhotoUpload.fileType) && this.fileSize == livePhotoUpload.fileSize && Intrinsics.f(this.href, livePhotoUpload.href) && Intrinsics.f(this.downloadHref, livePhotoUpload.downloadHref);
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getDownloadHref() {
        return this.downloadHref;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    @NotNull
    public final String getHref() {
        return this.href;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.downloadHref.hashCode() + p.a.c(a0.d.c(p.a.c(p.a.c(t61.a.e(this.createdAt, this.id.hashCode() * 31, 31), 31, this.fileName), 31, this.fileType), 31, this.fileSize), 31, this.href);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Date date = this.createdAt;
        String str2 = this.fileName;
        String str3 = this.fileType;
        long j2 = this.fileSize;
        String str4 = this.href;
        String str5 = this.downloadHref;
        StringBuilder sb6 = new StringBuilder("LivePhotoUpload(id=");
        sb6.append(str);
        sb6.append(", createdAt=");
        sb6.append(date);
        sb6.append(", fileName=");
        j6.a.D(sb6, str2, ", fileType=", str3, ", fileSize=");
        sb6.append(j2);
        sb6.append(", href=");
        sb6.append(str4);
        return a0.d.u(sb6, ", downloadHref=", str5, ")");
    }

    public LivePhotoUpload(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long j2, @NotNull String href, @NotNull String downloadHref) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(href, "href");
        Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
        this.id = id10;
        this.createdAt = createdAt;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = j2;
        this.href = href;
        this.downloadHref = downloadHref;
    }
}
