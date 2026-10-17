package com.fourthline.kyc;

import com.fourthline.core.Validatable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/fourthline/kyc/QesAttachment;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/QesAttachmentValidationError;", "Ljava/util/UUID;", "id", "Ljava/net/URI;", "fileUrl", "<init>", "(Ljava/util/UUID;Ljava/net/URI;)V", "", "a", "()Z", "", "validate", "()Ljava/util/List;", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/net/URI;", "copy", "(Ljava/util/UUID;Ljava/net/URI;)Lcom/fourthline/kyc/QesAttachment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "b", "Ljava/net/URI;", "getFileUrl", "Ljava/io/File;", "c", "Ljava/io/File;", "getPdfFile$fourthline_kyc_release", "()Ljava/io/File;", "pdfFile", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class QesAttachment implements Validatable<QesAttachmentValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final URI fileUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File pdfFile;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QesAttachment(@org.jetbrains.annotations.NotNull java.util.UUID r2, @org.jetbrains.annotations.NotNull java.net.URI r3) {
        /*
            r1 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "fileUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.id = r2
            r1.fileUrl = r3
            java.io.File r2 = new java.io.File     // Catch: java.lang.IllegalArgumentException -> L22
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L22
            boolean r3 = r2.isDirectory()     // Catch: java.lang.IllegalArgumentException -> L22
            if (r3 != 0) goto L22
            boolean r3 = r2.exists()     // Catch: java.lang.IllegalArgumentException -> L22
            if (r3 != 0) goto L23
        L22:
            r2 = 0
        L23:
            r1.pdfFile = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.kyc.QesAttachment.<init>(java.util.UUID, java.net.URI):void");
    }

    private final boolean a() throws IOException {
        File file = this.pdfFile;
        if (file == null) {
            return false;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            Intrinsics.checkNotNullExpressionValue(line, "readLine(...)");
            boolean z = !a0.H(line, "%PDF-", false);
            bufferedReader.close();
            return z;
        } finally {
        }
    }

    public static /* synthetic */ QesAttachment copy$default(QesAttachment qesAttachment, UUID uuid, URI uri2, int i, Object obj2) {
        if ((i & 1) != 0) {
            uuid = qesAttachment.id;
        }
        if ((i & 2) != 0) {
            uri2 = qesAttachment.fileUrl;
        }
        return qesAttachment.copy(uuid, uri2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final URI getFileUrl() {
        return this.fileUrl;
    }

    @NotNull
    public final QesAttachment copy(@NotNull UUID id10, @NotNull URI fileUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        return new QesAttachment(id10, fileUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QesAttachment)) {
            return false;
        }
        QesAttachment qesAttachment = (QesAttachment) other;
        return Intrinsics.f(this.id, qesAttachment.id) && Intrinsics.f(this.fileUrl, qesAttachment.fileUrl);
    }

    @NotNull
    public final URI getFileUrl() {
        return this.fileUrl;
    }

    @NotNull
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getPdfFile$fourthline_kyc_release, reason: from getter */
    public final File getPdfFile() {
        return this.pdfFile;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.fileUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "QesAttachment(id=" + this.id + ", fileUrl=" + this.fileUrl + ")";
    }

    @Override // com.fourthline.core.Validatable
    @NotNull
    public List<QesAttachmentValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (this.pdfFile == null) {
            arrayList.add(QesAttachmentValidationError.FILE_NOT_FOUND);
        }
        if (a()) {
            arrayList.add(QesAttachmentValidationError.INVALID_FILE_FORMAT);
        }
        return arrayList;
    }
}
