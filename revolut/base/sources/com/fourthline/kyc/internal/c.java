package com.fourthline.kyc.internal;

import android.graphics.Bitmap;
import com.fourthline.core.VideoRecording;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.QesAttachment;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.zipper.ZipperError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26549b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f26550a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(k xmlBuilder) {
        Intrinsics.checkNotNullParameter(xmlBuilder, "xmlBuilder");
        this.f26550a = xmlBuilder;
    }

    private final void b(ZipOutputStream zipOutputStream, List list) throws IOException {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            QesAttachment qesAttachment = (QesAttachment) it8.next();
            String str = "kyc/DocumentsToSign/" + qesAttachment.getId() + ".pdf";
            File pdfFile = qesAttachment.getPdfFile();
            Intrinsics.h(pdfFile);
            a(zipOutputStream, str, lim.m.d(pdfFile));
        }
    }

    public final OutputStream a(KycInfo kyc2, OutputStream outputStream) throws ZipperError.CannotCreateZip, ZipperError.KycNotValid {
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        if (!kyc2.validate().isEmpty()) {
            throw ZipperError.KycNotValid.INSTANCE;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
            Attachment.Selfie selfie = kyc2.getSelfie();
            if (selfie != null) {
                a(zipOutputStream, selfie);
                VideoRecording videoRecording = selfie.getVideoRecording();
                a(zipOutputStream, videoRecording != null ? videoRecording.getUrl() : null, selfie.getVideoUUID$fourthline_kyc_release());
            }
            Document document = kyc2.getDocument();
            if (document != null) {
                a(zipOutputStream, document.getImages());
                VideoRecording videoRecording2 = document.getVideoRecording();
                a(zipOutputStream, videoRecording2 != null ? videoRecording2.getUrl() : null, document.getVideoUUID$fourthline_kyc_release());
                a(zipOutputStream, document.getNfc());
            }
            Iterator<T> it8 = kyc2.getSecondaryDocuments().iterator();
            while (it8.hasNext()) {
                a(zipOutputStream, ((SecondaryDocument) it8.next()).getImages());
            }
            b(zipOutputStream, kyc2.getDocumentsToSign());
            byte[] bytes = this.f26550a.a(kyc2).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            a(zipOutputStream, "kyc/kyc.xml", bytes);
            zipOutputStream.close();
            outputStream.flush();
            return outputStream;
        } catch (IOException unused) {
            throw ZipperError.CannotCreateZip.INSTANCE;
        }
    }

    private final void a(ZipOutputStream zipOutputStream, Attachment attachment) throws IOException {
        String str = "kyc/Documents/" + attachment.getUuid() + ".jpg";
        Bitmap image = attachment.getImage();
        Intrinsics.h(image);
        a(zipOutputStream, str, a(image));
    }

    private final Unit a(ZipOutputStream zipOutputStream, Attachment.Nfc nfc2) throws IOException {
        Bitmap image;
        if (nfc2 == null || (image = nfc2.getImage()) == null) {
            return null;
        }
        a(zipOutputStream, "kyc/EmbeddedData/face.jpg", a(image));
        return Unit.f186387a;
    }

    private final Unit a(ZipOutputStream zipOutputStream, URI uri2, UUID uuid, String str) throws IOException {
        if (uri2 == null) {
            return null;
        }
        a(zipOutputStream, "kyc/Documents/" + uuid + "." + str, a(uri2));
        return Unit.f186387a;
    }

    private final Unit a(ZipOutputStream zipOutputStream, URI uri2, UUID uuid) throws IOException {
        if (uri2 == null) {
            return null;
        }
        a(zipOutputStream, "kyc/Documents/" + uuid + ".mp4", a(uri2));
        return Unit.f186387a;
    }

    private final void a(ZipOutputStream zipOutputStream, String str, byte[] bArr) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
    }

    private final byte[] a(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
            return byteArray;
        } finally {
        }
    }

    private final byte[] a(URI uri2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(uri2));
        try {
            byte[] bArrH = zi0.c.H(fileInputStream);
            fileInputStream.close();
            return bArrH;
        } finally {
        }
    }

    private final Unit a(ZipOutputStream zipOutputStream, List list) throws IOException {
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Attachment.Document document = (Attachment.Document) it8.next();
            Attachment.LocalFileAttachment file = document.getFile();
            if (file == null || a(zipOutputStream, file.getFilePath(), document.getUuid(), b.a(document)) == null) {
                a(zipOutputStream, document);
            }
        }
        return Unit.f186387a;
    }
}
