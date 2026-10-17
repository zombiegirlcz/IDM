package com.fourthline.vision.document;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerStepWarning;", "", "<init>", "(Ljava/lang/String;I)V", "DOCUMENT_TOO_DARK", "DEVICE_NOT_STEADY", "RECOGNITION_MODELS_NOT_DOWNLOADED", "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentScannerStepWarning {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DocumentScannerStepWarning[] f35905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f35906b;
    public static final DocumentScannerStepWarning DOCUMENT_TOO_DARK = new DocumentScannerStepWarning("DOCUMENT_TOO_DARK", 0);
    public static final DocumentScannerStepWarning DEVICE_NOT_STEADY = new DocumentScannerStepWarning("DEVICE_NOT_STEADY", 1);
    public static final DocumentScannerStepWarning RECOGNITION_MODELS_NOT_DOWNLOADED = new DocumentScannerStepWarning("RECOGNITION_MODELS_NOT_DOWNLOADED", 2);
    public static final DocumentScannerStepWarning GOOGLE_PLAY_SERVICES_NOT_AVAILABLE = new DocumentScannerStepWarning("GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", 3);

    private static final /* synthetic */ DocumentScannerStepWarning[] $values() {
        return new DocumentScannerStepWarning[]{DOCUMENT_TOO_DARK, DEVICE_NOT_STEADY, RECOGNITION_MODELS_NOT_DOWNLOADED, GOOGLE_PLAY_SERVICES_NOT_AVAILABLE};
    }

    static {
        DocumentScannerStepWarning[] documentScannerStepWarningArr$values = $values();
        f35905a = documentScannerStepWarningArr$values;
        f35906b = s.n(documentScannerStepWarningArr$values);
    }

    private DocumentScannerStepWarning(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f35906b;
    }

    public static DocumentScannerStepWarning valueOf(String str) {
        return (DocumentScannerStepWarning) Enum.valueOf(DocumentScannerStepWarning.class, str);
    }

    public static DocumentScannerStepWarning[] values() {
        return (DocumentScannerStepWarning[]) f35905a.clone();
    }
}
