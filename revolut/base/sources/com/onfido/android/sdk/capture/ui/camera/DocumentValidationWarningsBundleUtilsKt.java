package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.UiAlerts;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.api.client.data.DocumentValidationWarningsBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"firstRemoteWarningOrNull", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "remoteWarnings", "", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/UiAlerts$UiAlertType;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DocumentValidationWarningsBundleUtilsKt {
    public static final ErrorType firstRemoteWarningOrNull(@NotNull DocumentValidationWarningsBundle documentValidationWarningsBundle) {
        Intrinsics.checkNotNullParameter(documentValidationWarningsBundle, "<this>");
        if (documentValidationWarningsBundle.hasDocumentWarning()) {
            return ErrorType.Document.INSTANCE;
        }
        if (documentValidationWarningsBundle.hasGlareWarning()) {
            return ErrorType.Glare.INSTANCE;
        }
        if (documentValidationWarningsBundle.hasBlurWarning()) {
            return ErrorType.Blur.INSTANCE;
        }
        if (documentValidationWarningsBundle.hasBarcodeWarning()) {
            return ErrorType.Barcode.INSTANCE;
        }
        if (documentValidationWarningsBundle.hasCutoffWarning()) {
            return ErrorType.Cutoff.INSTANCE;
        }
        if (documentValidationWarningsBundle.hasPhotoOfScreenWarning()) {
            return ErrorType.PhotoOfScreen.INSTANCE;
        }
        if (documentValidationWarningsBundle.hasScreenshotWarning()) {
            return ErrorType.Screenshot.INSTANCE;
        }
        if (documentValidationWarningsBundle.hasPhotocopyWarning()) {
            return ErrorType.Photocopy.INSTANCE;
        }
        if (documentValidationWarningsBundle.hasScanWarning()) {
            return ErrorType.Scan.INSTANCE;
        }
        return null;
    }

    @NotNull
    public static final Map<ErrorType, UiAlerts.UiAlertType> remoteWarnings(@NotNull DocumentValidationWarningsBundle documentValidationWarningsBundle) {
        Intrinsics.checkNotNullParameter(documentValidationWarningsBundle, "<this>");
        List listK = v.k(new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasDocumentWarning()), ErrorType.Document.INSTANCE), new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasGlareWarning()), ErrorType.Glare.INSTANCE), new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasBlurWarning()), ErrorType.Blur.INSTANCE), new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasBarcodeWarning()), ErrorType.Barcode.INSTANCE), new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasCutoffWarning()), ErrorType.Cutoff.INSTANCE), new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasPhotoOfScreenWarning()), ErrorType.PhotoOfScreen.INSTANCE), new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasScreenshotWarning()), ErrorType.Screenshot.INSTANCE), new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasPhotocopyWarning()), ErrorType.Photocopy.INSTANCE), new Pair(Boolean.valueOf(documentValidationWarningsBundle.hasScanWarning()), ErrorType.Scan.INSTANCE));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listK) {
            if (((Boolean) ((Pair) obj2).f186385a).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int iB = q0.b(w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            linkedHashMap.put((ErrorType) ((Pair) it8.next()).f186386b, UiAlerts.UiAlertType.WARNING);
        }
        return linkedHashMap;
    }
}
