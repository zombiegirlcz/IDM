package com.fourthline.kyc.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.zipper.ZipperError;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
public final class n implements m {
    private final double b(File file) {
        return a(file) / ((double) 1024);
    }

    private final double c(File file) {
        return b(file) / ((double) 1024);
    }

    @Override // com.fourthline.kyc.internal.m
    public void a() {
        ib.h hVar = hb.a.f150532a;
        hb.a.c(q0.c(a("zipper_start")), "zipper_start", 2);
    }

    @Override // com.fourthline.kyc.internal.m
    public void a(KycInfo kycInfo, URI uri2) {
        DocumentType type;
        Intrinsics.checkNotNullParameter(kycInfo, "kycInfo");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        ib.h hVar = hb.a.f150532a;
        Pair pairA = a("zipper_success");
        Pair pair = new Pair("zip_size", Double.valueOf(c(a(uri2))));
        Pair pair2 = new Pair("number_of_images", Integer.valueOf(a(kycInfo)));
        Document document = kycInfo.getDocument();
        hb.a.c(r0.k(pairA, pair, pair2, new Pair("document_type", (document == null || (type = document.getType()) == null) ? null : a(type))), "zipper_success", 2);
    }

    @Override // com.fourthline.kyc.internal.m
    public void a(KycInfo kycInfo, ZipperError error) {
        DocumentType type;
        Intrinsics.checkNotNullParameter(kycInfo, "kycInfo");
        Intrinsics.checkNotNullParameter(error, "error");
        ib.h hVar = hb.a.f150532a;
        Pair pairA = a(error);
        Pair pairA2 = a("zipper_fail");
        Pair pair = new Pair("number_of_images", Integer.valueOf(a(kycInfo)));
        Document document = kycInfo.getDocument();
        hb.a.b(2, "zipper_fail", null, r0.k(pairA, pairA2, pair, new Pair("document_type", (document == null || (type = document.getType()) == null) ? null : a(type))));
    }

    private final Pair a(ZipperError zipperError) {
        String str;
        if (Intrinsics.f(zipperError, ZipperError.CannotCreateZip.INSTANCE)) {
            str = "cannot_create_zip";
        } else if (Intrinsics.f(zipperError, ZipperError.KycNotValid.INSTANCE)) {
            str = "kyc_not_valid";
        } else if (Intrinsics.f(zipperError, ZipperError.NotEnoughSpace.INSTANCE)) {
            str = "not_enough_space";
        } else {
            if (!Intrinsics.f(zipperError, ZipperError.ZipExceedMaximumSize.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "zip_exceed_maximum_size";
        }
        return new Pair("fatal_error", str);
    }

    private final double a(File file) {
        if (file.exists()) {
            return file.length();
        }
        return 0.0d;
    }

    private final File a(URI uri2) {
        Path path = Paths.get(uri2);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return new File(path.toString());
    }

    private final int a(KycInfo kycInfo) {
        Attachment.Nfc nfc2;
        List<Attachment.Document> images;
        Document document = kycInfo.getDocument();
        int size = (document == null || (images = document.getImages()) == null) ? 0 : images.size();
        Iterator<T> it8 = kycInfo.getSecondaryDocuments().iterator();
        int size2 = 0;
        while (it8.hasNext()) {
            List<Attachment.Document> images2 = ((SecondaryDocument) it8.next()).getImages();
            size2 += images2 != null ? images2.size() : 0;
        }
        Document document2 = kycInfo.getDocument();
        int i = ((document2 == null || (nfc2 = document2.getNfc()) == null) ? null : nfc2.getImage()) != null ? 1 : 0;
        Attachment.Selfie selfie = kycInfo.getSelfie();
        return size + size2 + i + ((selfie != null ? selfie.getImage() : null) != null ? 1 : 0);
    }

    private final Pair a(String str) {
        return new Pair("zipper_flow", str);
    }

    private final String a(DocumentType documentType) {
        String strName = documentType.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
