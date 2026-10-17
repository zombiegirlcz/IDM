package com.fourthline.vision.document;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerError;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA_PERMISSION_NOT_GRANTED", "RECORD_AUDIO_PERMISSION_NOT_GRANTED", "CAMERA_NOT_AVAILABLE", "RECORDING_FAILED", "SCANNER_INTERRUPTED", "UNKNOWN", "TIMEOUT", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentScannerError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DocumentScannerError[] f35888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f35889b;
    public static final DocumentScannerError CAMERA_PERMISSION_NOT_GRANTED = new DocumentScannerError("CAMERA_PERMISSION_NOT_GRANTED", 0);
    public static final DocumentScannerError RECORD_AUDIO_PERMISSION_NOT_GRANTED = new DocumentScannerError("RECORD_AUDIO_PERMISSION_NOT_GRANTED", 1);
    public static final DocumentScannerError CAMERA_NOT_AVAILABLE = new DocumentScannerError("CAMERA_NOT_AVAILABLE", 2);
    public static final DocumentScannerError RECORDING_FAILED = new DocumentScannerError("RECORDING_FAILED", 3);
    public static final DocumentScannerError SCANNER_INTERRUPTED = new DocumentScannerError("SCANNER_INTERRUPTED", 4);
    public static final DocumentScannerError UNKNOWN = new DocumentScannerError("UNKNOWN", 5);
    public static final DocumentScannerError TIMEOUT = new DocumentScannerError("TIMEOUT", 6);

    private static final /* synthetic */ DocumentScannerError[] $values() {
        return new DocumentScannerError[]{CAMERA_PERMISSION_NOT_GRANTED, RECORD_AUDIO_PERMISSION_NOT_GRANTED, CAMERA_NOT_AVAILABLE, RECORDING_FAILED, SCANNER_INTERRUPTED, UNKNOWN, TIMEOUT};
    }

    static {
        DocumentScannerError[] documentScannerErrorArr$values = $values();
        f35888a = documentScannerErrorArr$values;
        f35889b = s.n(documentScannerErrorArr$values);
    }

    private DocumentScannerError(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f35889b;
    }

    public static DocumentScannerError valueOf(String str) {
        return (DocumentScannerError) Enum.valueOf(DocumentScannerError.class, str);
    }

    public static DocumentScannerError[] values() {
        return (DocumentScannerError[]) f35888a.clone();
    }
}
