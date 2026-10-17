package com.onfido.android.sdk.capture.internal.model;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.api.client.data.DocType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0012\u0010\u0012\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t\u0082\u0001\u0004\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "Landroid/os/Parcelable;", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "downloadHref", "", "getDownloadHref", "()Ljava/lang/String;", "fileName", "getFileName", "fileSize", "", "getFileSize", "()J", "fileType", "getFileType", "href", "getHref", "id", "getId", "AVCVideo", "Document", "LiveVideo", "Photo", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact$AVCVideo;", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact$Document;", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact$LiveVideo;", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact$Photo;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UploadedArtifact extends Parcelable {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000b¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact$AVCVideo;", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "uuid", "", "createdAt", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getCreatedAt", "()Ljava/util/Date;", "downloadHref", "getDownloadHref", "()Ljava/lang/String;", "fileName", "getFileName", "fileSize", "", "getFileSize", "()J", "fileType", "getFileType", "href", "getHref", "id", "getId", "getUuid", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AVCVideo implements UploadedArtifact {

        @NotNull
        public static final Parcelable.Creator<AVCVideo> CREATOR = new Creator();

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

        @NotNull
        private final String uuid;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AVCVideo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final AVCVideo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AVCVideo(parcel.readString(), (Date) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final AVCVideo[] newArray(int i) {
                return new AVCVideo[i];
            }
        }

        public AVCVideo(@NotNull String uuid, @NotNull Date createdAt) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            this.uuid = uuid;
            this.createdAt = createdAt;
            this.id = uuid;
            this.fileName = "";
            this.fileType = "";
            this.href = "";
            this.downloadHref = "";
        }

        public static /* synthetic */ AVCVideo copy$default(AVCVideo aVCVideo, String str, Date date, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = aVCVideo.uuid;
            }
            if ((i & 2) != 0) {
                date = aVCVideo.createdAt;
            }
            return aVCVideo.copy(str, date);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Date getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final AVCVideo copy(@NotNull String uuid, @NotNull Date createdAt) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            return new AVCVideo(uuid, createdAt);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AVCVideo)) {
                return false;
            }
            AVCVideo aVCVideo = (AVCVideo) other;
            return Intrinsics.f(this.uuid, aVCVideo.uuid) && Intrinsics.f(this.createdAt, aVCVideo.createdAt);
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public Date getCreatedAt() {
            return this.createdAt;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getDownloadHref() {
            return this.downloadHref;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        public long getFileSize() {
            return this.fileSize;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getFileType() {
            return this.fileType;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getHref() {
            return this.href;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            return this.createdAt.hashCode() + (this.uuid.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AVCVideo(uuid=" + this.uuid + ", createdAt=" + this.createdAt + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.uuid);
            parcel.writeSerializable(this.createdAt);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J{\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.HÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006:"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact$Document;", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "id", "", "createdAt", "Ljava/util/Date;", "fileName", "fileType", "fileSize", "", "downloadHref", "href", "side", "issuingCountry", "type", "Lcom/onfido/api/client/data/DocType;", "applicantId", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/DocType;Ljava/lang/String;)V", "getApplicantId", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getDownloadHref", "getFileName", "getFileSize", "()J", "getFileType", "getHref", "getId", "getIssuingCountry", "getSide", "getType", "()Lcom/onfido/api/client/data/DocType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Document implements UploadedArtifact {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new Creator();

        @NotNull
        private final String applicantId;

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
        private final String issuingCountry;
        private final String side;

        @NotNull
        private final DocType type;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Document> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Document createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document(parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), DocType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Document[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long j2, @NotNull String downloadHref, @NotNull String href, String str, String str2, @NotNull DocType type, @NotNull String applicantId) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
            Intrinsics.checkNotNullParameter(href, "href");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(applicantId, "applicantId");
            this.id = id10;
            this.createdAt = createdAt;
            this.fileName = fileName;
            this.fileType = fileType;
            this.fileSize = j2;
            this.downloadHref = downloadHref;
            this.href = href;
            this.side = str;
            this.issuingCountry = str2;
            this.type = type;
            this.applicantId = applicantId;
        }

        public static /* synthetic */ Document copy$default(Document document, String str, Date date, String str2, String str3, long j2, String str4, String str5, String str6, String str7, DocType docType, String str8, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = document.id;
            }
            if ((i & 2) != 0) {
                date = document.createdAt;
            }
            if ((i & 4) != 0) {
                str2 = document.fileName;
            }
            if ((i & 8) != 0) {
                str3 = document.fileType;
            }
            if ((i & 16) != 0) {
                j2 = document.fileSize;
            }
            if ((i & 32) != 0) {
                str4 = document.downloadHref;
            }
            if ((i & 64) != 0) {
                str5 = document.href;
            }
            if ((i & 128) != 0) {
                str6 = document.side;
            }
            if ((i & 256) != 0) {
                str7 = document.issuingCountry;
            }
            if ((i & 512) != 0) {
                docType = document.type;
            }
            if ((i & 1024) != 0) {
                str8 = document.applicantId;
            }
            DocType docType2 = docType;
            String str9 = str8;
            long j3 = j2;
            String str10 = str2;
            String str11 = str3;
            return document.copy(str, date, str10, str11, j3, str4, str5, str6, str7, docType2, str9);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final DocType getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getApplicantId() {
            return this.applicantId;
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
        public final String getDownloadHref() {
            return this.downloadHref;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getHref() {
            return this.href;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getIssuingCountry() {
            return this.issuingCountry;
        }

        @NotNull
        public final Document copy(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long fileSize, @NotNull String downloadHref, @NotNull String href, String side, String issuingCountry, @NotNull DocType type, @NotNull String applicantId) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
            Intrinsics.checkNotNullParameter(href, "href");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(applicantId, "applicantId");
            return new Document(id10, createdAt, fileName, fileType, fileSize, downloadHref, href, side, issuingCountry, type, applicantId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return Intrinsics.f(this.id, document.id) && Intrinsics.f(this.createdAt, document.createdAt) && Intrinsics.f(this.fileName, document.fileName) && Intrinsics.f(this.fileType, document.fileType) && this.fileSize == document.fileSize && Intrinsics.f(this.downloadHref, document.downloadHref) && Intrinsics.f(this.href, document.href) && Intrinsics.f(this.side, document.side) && Intrinsics.f(this.issuingCountry, document.issuingCountry) && this.type == document.type && Intrinsics.f(this.applicantId, document.applicantId);
        }

        @NotNull
        public final String getApplicantId() {
            return this.applicantId;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public Date getCreatedAt() {
            return this.createdAt;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getDownloadHref() {
            return this.downloadHref;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        public long getFileSize() {
            return this.fileSize;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getFileType() {
            return this.fileType;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getHref() {
            return this.href;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getId() {
            return this.id;
        }

        public final String getIssuingCountry() {
            return this.issuingCountry;
        }

        public final String getSide() {
            return this.side;
        }

        @NotNull
        public final DocType getType() {
            return this.type;
        }

        public int hashCode() {
            int iC = a.c(a.c(d.c(a.c(a.c(t61.a.e(this.createdAt, this.id.hashCode() * 31, 31), 31, this.fileName), 31, this.fileType), 31, this.fileSize), 31, this.downloadHref), 31, this.href);
            String str = this.side;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.issuingCountry;
            return this.applicantId.hashCode() + ((this.type.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("Document(id=");
            sb6.append(this.id);
            sb6.append(", createdAt=");
            sb6.append(this.createdAt);
            sb6.append(", fileName=");
            sb6.append(this.fileName);
            sb6.append(", fileType=");
            sb6.append(this.fileType);
            sb6.append(", fileSize=");
            sb6.append(this.fileSize);
            sb6.append(", downloadHref=");
            sb6.append(this.downloadHref);
            sb6.append(", href=");
            sb6.append(this.href);
            sb6.append(", side=");
            sb6.append(this.side);
            sb6.append(", issuingCountry=");
            sb6.append(this.issuingCountry);
            sb6.append(", type=");
            sb6.append(this.type);
            sb6.append(", applicantId=");
            return j6.a.u(sb6, this.applicantId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeSerializable(this.createdAt);
            parcel.writeString(this.fileName);
            parcel.writeString(this.fileType);
            parcel.writeLong(this.fileSize);
            parcel.writeString(this.downloadHref);
            parcel.writeString(this.href);
            parcel.writeString(this.side);
            parcel.writeString(this.issuingCountry);
            parcel.writeString(this.type.name());
            parcel.writeString(this.applicantId);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006,"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact$LiveVideo;", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "id", "", "createdAt", "Ljava/util/Date;", "fileName", "fileType", "fileSize", "", "href", "downloadHref", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "getDownloadHref", "()Ljava/lang/String;", "getFileName", "getFileSize", "()J", "getFileType", "getHref", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LiveVideo implements UploadedArtifact {

        @NotNull
        public static final Parcelable.Creator<LiveVideo> CREATOR = new Creator();

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

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LiveVideo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LiveVideo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LiveVideo(parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LiveVideo[] newArray(int i) {
                return new LiveVideo[i];
            }
        }

        public LiveVideo(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long j2, @NotNull String href, @NotNull String downloadHref) {
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

        public static /* synthetic */ LiveVideo copy$default(LiveVideo liveVideo, String str, Date date, String str2, String str3, long j2, String str4, String str5, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = liveVideo.id;
            }
            if ((i & 2) != 0) {
                date = liveVideo.createdAt;
            }
            if ((i & 4) != 0) {
                str2 = liveVideo.fileName;
            }
            if ((i & 8) != 0) {
                str3 = liveVideo.fileType;
            }
            if ((i & 16) != 0) {
                j2 = liveVideo.fileSize;
            }
            if ((i & 32) != 0) {
                str4 = liveVideo.href;
            }
            if ((i & 64) != 0) {
                str5 = liveVideo.downloadHref;
            }
            long j3 = j2;
            String str6 = str2;
            String str7 = str3;
            return liveVideo.copy(str, date, str6, str7, j3, str4, str5);
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
        public final LiveVideo copy(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long fileSize, @NotNull String href, @NotNull String downloadHref) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            Intrinsics.checkNotNullParameter(href, "href");
            Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
            return new LiveVideo(id10, createdAt, fileName, fileType, fileSize, href, downloadHref);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiveVideo)) {
                return false;
            }
            LiveVideo liveVideo = (LiveVideo) other;
            return Intrinsics.f(this.id, liveVideo.id) && Intrinsics.f(this.createdAt, liveVideo.createdAt) && Intrinsics.f(this.fileName, liveVideo.fileName) && Intrinsics.f(this.fileType, liveVideo.fileType) && this.fileSize == liveVideo.fileSize && Intrinsics.f(this.href, liveVideo.href) && Intrinsics.f(this.downloadHref, liveVideo.downloadHref);
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public Date getCreatedAt() {
            return this.createdAt;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getDownloadHref() {
            return this.downloadHref;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        public long getFileSize() {
            return this.fileSize;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getFileType() {
            return this.fileType;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getHref() {
            return this.href;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.downloadHref.hashCode() + a.c(d.c(a.c(a.c(t61.a.e(this.createdAt, this.id.hashCode() * 31, 31), 31, this.fileName), 31, this.fileType), 31, this.fileSize), 31, this.href);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("LiveVideo(id=");
            sb6.append(this.id);
            sb6.append(", createdAt=");
            sb6.append(this.createdAt);
            sb6.append(", fileName=");
            sb6.append(this.fileName);
            sb6.append(", fileType=");
            sb6.append(this.fileType);
            sb6.append(", fileSize=");
            sb6.append(this.fileSize);
            sb6.append(", href=");
            sb6.append(this.href);
            sb6.append(", downloadHref=");
            return j6.a.u(sb6, this.downloadHref, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeSerializable(this.createdAt);
            parcel.writeString(this.fileName);
            parcel.writeString(this.fileType);
            parcel.writeLong(this.fileSize);
            parcel.writeString(this.href);
            parcel.writeString(this.downloadHref);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006,"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact$Photo;", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "id", "", "createdAt", "Ljava/util/Date;", "fileName", "fileType", "fileSize", "", "downloadHref", "href", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "getDownloadHref", "()Ljava/lang/String;", "getFileName", "getFileSize", "()J", "getFileType", "getHref", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Photo implements UploadedArtifact {

        @NotNull
        public static final Parcelable.Creator<Photo> CREATOR = new Creator();

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

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Photo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Photo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Photo(parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Photo[] newArray(int i) {
                return new Photo[i];
            }
        }

        public Photo(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long j2, @NotNull String downloadHref, @NotNull String href) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
            Intrinsics.checkNotNullParameter(href, "href");
            this.id = id10;
            this.createdAt = createdAt;
            this.fileName = fileName;
            this.fileType = fileType;
            this.fileSize = j2;
            this.downloadHref = downloadHref;
            this.href = href;
        }

        public static /* synthetic */ Photo copy$default(Photo photo, String str, Date date, String str2, String str3, long j2, String str4, String str5, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = photo.id;
            }
            if ((i & 2) != 0) {
                date = photo.createdAt;
            }
            if ((i & 4) != 0) {
                str2 = photo.fileName;
            }
            if ((i & 8) != 0) {
                str3 = photo.fileType;
            }
            if ((i & 16) != 0) {
                j2 = photo.fileSize;
            }
            if ((i & 32) != 0) {
                str4 = photo.downloadHref;
            }
            if ((i & 64) != 0) {
                str5 = photo.href;
            }
            long j3 = j2;
            String str6 = str2;
            String str7 = str3;
            return photo.copy(str, date, str6, str7, j3, str4, str5);
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
        public final String getDownloadHref() {
            return this.downloadHref;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getHref() {
            return this.href;
        }

        @NotNull
        public final Photo copy(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long fileSize, @NotNull String downloadHref, @NotNull String href) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
            Intrinsics.checkNotNullParameter(href, "href");
            return new Photo(id10, createdAt, fileName, fileType, fileSize, downloadHref, href);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) other;
            return Intrinsics.f(this.id, photo.id) && Intrinsics.f(this.createdAt, photo.createdAt) && Intrinsics.f(this.fileName, photo.fileName) && Intrinsics.f(this.fileType, photo.fileType) && this.fileSize == photo.fileSize && Intrinsics.f(this.downloadHref, photo.downloadHref) && Intrinsics.f(this.href, photo.href);
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public Date getCreatedAt() {
            return this.createdAt;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getDownloadHref() {
            return this.downloadHref;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        public long getFileSize() {
            return this.fileSize;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getFileType() {
            return this.fileType;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getHref() {
            return this.href;
        }

        @Override // com.onfido.android.sdk.capture.internal.model.UploadedArtifact
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.href.hashCode() + a.c(d.c(a.c(a.c(t61.a.e(this.createdAt, this.id.hashCode() * 31, 31), 31, this.fileName), 31, this.fileType), 31, this.fileSize), 31, this.downloadHref);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("Photo(id=");
            sb6.append(this.id);
            sb6.append(", createdAt=");
            sb6.append(this.createdAt);
            sb6.append(", fileName=");
            sb6.append(this.fileName);
            sb6.append(", fileType=");
            sb6.append(this.fileType);
            sb6.append(", fileSize=");
            sb6.append(this.fileSize);
            sb6.append(", downloadHref=");
            sb6.append(this.downloadHref);
            sb6.append(", href=");
            return j6.a.u(sb6, this.href, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeSerializable(this.createdAt);
            parcel.writeString(this.fileName);
            parcel.writeString(this.fileType);
            parcel.writeLong(this.fileSize);
            parcel.writeString(this.downloadHref);
            parcel.writeString(this.href);
        }
    }

    @NotNull
    Date getCreatedAt();

    @NotNull
    String getDownloadHref();

    @NotNull
    String getFileName();

    long getFileSize();

    @NotNull
    String getFileType();

    @NotNull
    String getHref();

    @NotNull
    String getId();
}
