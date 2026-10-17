package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStepMetadata;
import com.fourthline.vision.document.DocumentScannerStepResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class go {
    public static final void a(fh fhVar, DocumentScannerResult result) {
        Intrinsics.checkNotNullParameter(fhVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        MrzInfo mrzInfo = result.getMrzInfo();
        if (mrzInfo instanceof MrtdMrzInfo) {
            MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrzInfo;
            fhVar.a(mrtdMrzInfo.getValidationErrors().contains(MrtdMrzInfoValidationError.INVALID_DOCUMENT_NUMBER) ? null : mrtdMrzInfo.getDocumentNumber());
            fhVar.a(mrtdMrzInfo.getValidationErrors().contains(MrtdMrzInfoValidationError.INVALID_EXPIRATION_DATE) ? null : mrtdMrzInfo.getExpirationDate());
        } else if (mrzInfo instanceof IdlMrzInfo) {
            IdlMrzInfo idlMrzInfo = (IdlMrzInfo) mrzInfo;
            fhVar.a(idlMrzInfo.getValidationErrors().contains(IdlMrzInfoValidationError.INVALID_DOCUMENT_NUMBER) ? null : idlMrzInfo.getDocumentNumber());
        }
        fhVar.a(result.getDocumentType());
        fhVar.a(result.getVideoRecording());
        MrzInfo mrzInfo2 = result.getMrzInfo();
        fhVar.b(mrzInfo2 != null ? mrzInfo2.getRawMrz() : null);
        fhVar.a(result.getMrzInfo());
        fhVar.a(a(result.getStepResults()));
    }

    public static final void a(xz0 xz0Var, DocumentScannerResult result) {
        Intrinsics.checkNotNullParameter(xz0Var, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        xz0Var.a(result.getDocumentType());
        MrzInfo mrzInfo = result.getMrzInfo();
        MrtdMrzInfo mrtdMrzInfo = mrzInfo instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrzInfo : null;
        xz0Var.a(mrtdMrzInfo != null ? mrtdMrzInfo.getExpirationDate() : null);
        xz0Var.a(a(result.getStepResults()));
    }

    public static final List a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            DocumentScannerStepResult documentScannerStepResult = (DocumentScannerStepResult) it8.next();
            DocumentScannerStepMetadata metadata = documentScannerStepResult.getMetadata();
            DocumentFileSide fileSide = metadata.getFileSide();
            boolean zIsAngled = metadata.isAngled();
            Bitmap full = documentScannerStepResult.getImage().getFull();
            long time = metadata.getTimestamp().getTime();
            arrayList.add(new eh(full, null, fileSide, zIsAngled, Long.valueOf(time), metadata.getLocation(), 2, null));
        }
        return arrayList;
    }
}
