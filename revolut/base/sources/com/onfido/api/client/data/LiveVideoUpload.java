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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:Bk\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0011J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J&\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÁ\u0001¢\u0006\u0002\b8R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0018¨\u0006;"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoUpload;", "", "seen1", "", "id", "", "createdAt", "Ljava/util/Date;", "fileName", "fileType", "href", "downloadHref", "fileSize", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getCreatedAt$annotations", "()V", "getCreatedAt", "()Ljava/util/Date;", "getDownloadHref$annotations", "getDownloadHref", "()Ljava/lang/String;", "getFileName$annotations", "getFileName", "getFileSize$annotations", "getFileSize", "()J", "getFileType$annotations", "getFileType", "getHref$annotations", "getHref", "getId$annotations", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class LiveVideoUpload {

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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoUpload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/LiveVideoUpload;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LiveVideoUpload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ LiveVideoUpload(int i, String str, @g(with = a.class) Date date, String str2, String str3, String str4, String str5, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(LiveVideoUpload$$serializer.INSTANCE.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.id = str;
        this.createdAt = date;
        this.fileName = str2;
        this.fileType = str3;
        this.href = str4;
        this.downloadHref = str5;
        this.fileSize = j2;
    }

    public static /* synthetic */ LiveVideoUpload copy$default(LiveVideoUpload liveVideoUpload, String str, Date date, String str2, String str3, String str4, String str5, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = liveVideoUpload.id;
        }
        if ((i & 2) != 0) {
            date = liveVideoUpload.createdAt;
        }
        if ((i & 4) != 0) {
            str2 = liveVideoUpload.fileName;
        }
        if ((i & 8) != 0) {
            str3 = liveVideoUpload.fileType;
        }
        if ((i & 16) != 0) {
            str4 = liveVideoUpload.href;
        }
        if ((i & 32) != 0) {
            str5 = liveVideoUpload.downloadHref;
        }
        if ((i & 64) != 0) {
            j2 = liveVideoUpload.fileSize;
        }
        long j3 = j2;
        String str6 = str4;
        String str7 = str5;
        return liveVideoUpload.copy(str, date, str2, str3, str6, str7, j3);
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

    public static final /* synthetic */ void write$Self$onfido_api_client(LiveVideoUpload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, a.f16438a, self.createdAt);
        output.encodeStringElement(serialDesc, 2, self.fileName);
        output.encodeStringElement(serialDesc, 3, self.fileType);
        output.encodeStringElement(serialDesc, 4, self.href);
        output.encodeStringElement(serialDesc, 5, self.downloadHref);
        output.encodeLongElement(serialDesc, 6, self.fileSize);
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

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDownloadHref() {
        return this.downloadHref;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final LiveVideoUpload copy(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, @NotNull String href, @NotNull String downloadHref, long fileSize) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(href, "href");
        Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
        return new LiveVideoUpload(id10, createdAt, fileName, fileType, href, downloadHref, fileSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveVideoUpload)) {
            return false;
        }
        LiveVideoUpload liveVideoUpload = (LiveVideoUpload) other;
        return Intrinsics.f(this.id, liveVideoUpload.id) && Intrinsics.f(this.createdAt, liveVideoUpload.createdAt) && Intrinsics.f(this.fileName, liveVideoUpload.fileName) && Intrinsics.f(this.fileType, liveVideoUpload.fileType) && Intrinsics.f(this.href, liveVideoUpload.href) && Intrinsics.f(this.downloadHref, liveVideoUpload.downloadHref) && this.fileSize == liveVideoUpload.fileSize;
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
        return Long.hashCode(this.fileSize) + p.a.c(p.a.c(p.a.c(p.a.c(t61.a.e(this.createdAt, this.id.hashCode() * 31, 31), 31, this.fileName), 31, this.fileType), 31, this.href), 31, this.downloadHref);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Date date = this.createdAt;
        String str2 = this.fileName;
        String str3 = this.fileType;
        String str4 = this.href;
        String str5 = this.downloadHref;
        long j2 = this.fileSize;
        StringBuilder sb6 = new StringBuilder("LiveVideoUpload(id=");
        sb6.append(str);
        sb6.append(", createdAt=");
        sb6.append(date);
        sb6.append(", fileName=");
        j6.a.D(sb6, str2, ", fileType=", str3, ", href=");
        j6.a.D(sb6, str4, ", downloadHref=", str5, ", fileSize=");
        return a0.d.j(j2, ")", sb6);
    }

    public LiveVideoUpload(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, @NotNull String href, @NotNull String downloadHref, long j2) {
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
        this.href = href;
        this.downloadHref = downloadHref;
        this.fileSize = j2;
    }
}
