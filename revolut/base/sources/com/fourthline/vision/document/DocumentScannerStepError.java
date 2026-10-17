package com.fourthline.vision.document;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerStepError;", "", "<init>", "(Ljava/lang/String;I)V", "TAKE_SNAPSHOT_NOT_ALLOWED", "RESET_CURRENT_STEP_NOT_ALLOWED", "MOVE_TO_NEXT_STEP_NOT_ALLOWED", "INVALID_CONTENT_DETECTION_AREA", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentScannerStepError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DocumentScannerStepError[] f35897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f35898b;
    public static final DocumentScannerStepError TAKE_SNAPSHOT_NOT_ALLOWED = new DocumentScannerStepError("TAKE_SNAPSHOT_NOT_ALLOWED", 0);
    public static final DocumentScannerStepError RESET_CURRENT_STEP_NOT_ALLOWED = new DocumentScannerStepError("RESET_CURRENT_STEP_NOT_ALLOWED", 1);
    public static final DocumentScannerStepError MOVE_TO_NEXT_STEP_NOT_ALLOWED = new DocumentScannerStepError("MOVE_TO_NEXT_STEP_NOT_ALLOWED", 2);
    public static final DocumentScannerStepError INVALID_CONTENT_DETECTION_AREA = new DocumentScannerStepError("INVALID_CONTENT_DETECTION_AREA", 3);

    private static final /* synthetic */ DocumentScannerStepError[] $values() {
        return new DocumentScannerStepError[]{TAKE_SNAPSHOT_NOT_ALLOWED, RESET_CURRENT_STEP_NOT_ALLOWED, MOVE_TO_NEXT_STEP_NOT_ALLOWED, INVALID_CONTENT_DETECTION_AREA};
    }

    static {
        DocumentScannerStepError[] documentScannerStepErrorArr$values = $values();
        f35897a = documentScannerStepErrorArr$values;
        f35898b = s.n(documentScannerStepErrorArr$values);
    }

    private DocumentScannerStepError(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f35898b;
    }

    public static DocumentScannerStepError valueOf(String str) {
        return (DocumentScannerStepError) Enum.valueOf(DocumentScannerStepError.class, str);
    }

    public static DocumentScannerStepError[] values() {
        return (DocumentScannerStepError[]) f35897a.clone();
    }
}
