package com.onfido.android.sdk.capture.ui.proofOfAddress;

import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001J#\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u001f\u0010\u0015\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0016J\u001a\u0010\u0017\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u0018\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;", "", "()V", "fileExtensionPdf", "", "getBitmapFromUri", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getDocumentUri", "uriString", "getFileExtension", "contentResolver", "Landroid/content/ContentResolver;", "getFileExtension$onfido_capture_sdk_core_release", "isImageFile", "", "isImageFileAndValid", "documentUri", "isImageFileValid", "isImageFileValid$onfido_capture_sdk_core_release", "isPdfFile", "isPdfFileAndValid", "isPdfFileValid", "isValidSupportedFile", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaUtils {

    @NotNull
    private final String fileExtensionPdf = "pdf";

    private final boolean isImageFileAndValid(ContentResolver contentResolver, Uri documentUri) {
        return isImageFile(contentResolver, documentUri) && isImageFileValid$onfido_capture_sdk_core_release(contentResolver, documentUri);
    }

    private final boolean isPdfFileAndValid(ContentResolver contentResolver, Uri documentUri) {
        return isPdfFile(contentResolver, documentUri) && isPdfFileValid(contentResolver, documentUri);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap getBitmapFromUri(android.content.Context r2, @org.jetbrains.annotations.NotNull android.net.Uri r3) {
        /*
            r1 = this;
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            if (r2 == 0) goto L13
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.io.FileNotFoundException -> L19
            if (r2 == 0) goto L13
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch: java.io.FileNotFoundException -> L19
            goto L14
        L13:
            r2 = r0
        L14:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.io.FileNotFoundException -> L19
            return r2
        L19:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils.getBitmapFromUri(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    @NotNull
    public final Uri getDocumentUri(Object uriString) {
        if (!(uriString instanceof String)) {
            Intrinsics.i(uriString, "null cannot be cast to non-null type android.net.Uri");
            return (Uri) uriString;
        }
        Uri uri2 = Uri.parse((String) uriString);
        Intrinsics.h(uri2);
        return uri2;
    }

    public final String getFileExtension$onfido_capture_sdk_core_release(ContentResolver contentResolver, Object uriString) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver != null ? contentResolver.getType(getDocumentUri(uriString)) : null);
    }

    public final boolean isImageFile(ContentResolver contentResolver, Object uriString) {
        String type = contentResolver != null ? contentResolver.getType(getDocumentUri(uriString)) : null;
        if (type != null) {
            return d0.J(type, "image/", false);
        }
        return false;
    }

    public final boolean isImageFileValid$onfido_capture_sdk_core_release(ContentResolver contentResolver, @NotNull Uri documentUri) {
        InputStream inputStreamOpenInputStream;
        Intrinsics.checkNotNullParameter(documentUri, "documentUri");
        if (contentResolver != null) {
            try {
                inputStreamOpenInputStream = contentResolver.openInputStream(documentUri);
            } catch (FileNotFoundException unused) {
                return false;
            }
        } else {
            inputStreamOpenInputStream = null;
        }
        return BitmapFactory.decodeStream(inputStreamOpenInputStream) != null;
    }

    public final boolean isPdfFile(ContentResolver contentResolver, Object uriString) {
        return Intrinsics.f(getFileExtension$onfido_capture_sdk_core_release(contentResolver, uriString), this.fileExtensionPdf);
    }

    public final boolean isPdfFileValid(ContentResolver contentResolver, @NotNull Uri uri2) throws IOException {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver != null ? contentResolver.openFileDescriptor(uri2, "r") : null;
        try {
            Intrinsics.h(parcelFileDescriptorOpenFileDescriptor);
            new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
            parcelFileDescriptorOpenFileDescriptor.close();
            return true;
        } catch (Exception unused) {
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return false;
            }
            parcelFileDescriptorOpenFileDescriptor.close();
            return false;
        } catch (Throwable th10) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            throw th10;
        }
    }

    public final boolean isValidSupportedFile(@NotNull ContentResolver contentResolver, @NotNull Uri documentUri) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(documentUri, "documentUri");
        return isPdfFileAndValid(contentResolver, documentUri) || isImageFileAndValid(contentResolver, documentUri);
    }
}
