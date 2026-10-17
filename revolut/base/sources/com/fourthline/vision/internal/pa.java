package com.fourthline.vision.internal;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pa f36695a = new pa("UNKNOWN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pa f36696b = new pa("TIMEOUT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pa f36697c = new pa("INVALID_CONTENT_DETECTION_AREA", 2);
    public static final pa d = new pa("CONTENT_DISAPPEARED", 3);
    public static final pa e = new pa("CAMERA_NOT_AVAILABLE", 4);
    public static final pa f = new pa("NO_CAMERA_PERMISSION", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final pa f36698g = new pa("NO_AUDIO_PERMISSION", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final pa f36699h = new pa("MANUAL_MODE_NOT_ALLOWED", 7);
    public static final pa i = new pa("RECORDING_FAILED", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final pa f36700j = new pa("SCANNER_INTERRUPTED", 9);
    public static final pa k = new pa("TAKE_SNAPSHOT_NOT_ALLOWED", 10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final pa f36701l = new pa("MOVE_TO_NEXT_STEP_NOT_ALLOWED", 11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final pa f36702m = new pa("RESET_CURRENT_STEP_NOT_ALLOWED", 12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final pa f36703n = new pa("RECOGNITION_MODELS_NOT_DOWNLOADED", 13);
    public static final pa o = new pa("MULTIPLE_FACES_DETECTED", 14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final pa f36704p = new pa("GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", 15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ pa[] f36705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f36706r;

    private static final /* synthetic */ pa[] $values() {
        return new pa[]{f36695a, f36696b, f36697c, d, e, f, f36698g, f36699h, i, f36700j, k, f36701l, f36702m, f36703n, o, f36704p};
    }

    static {
        pa[] paVarArr$values = $values();
        f36705q = paVarArr$values;
        f36706r = vc.s.n(paVarArr$values);
    }

    private pa(String str, int i2) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f36706r;
    }

    public static pa valueOf(String str) {
        return (pa) Enum.valueOf(pa.class, str);
    }

    public static pa[] values() {
        return (pa[]) f36705q.clone();
    }
}
