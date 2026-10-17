package com.fourthline.vision.internal;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x5 f37091a = new x5("STEP", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x5 f37092b = new x5("INVALID_DETECTION_AREA", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x5 f37093c = new x5("AUTO_DETECTION", 2);
    private static final /* synthetic */ x5[] d;
    private static final /* synthetic */ EnumEntries e;

    private static final /* synthetic */ x5[] $values() {
        return new x5[]{f37091a, f37092b, f37093c};
    }

    static {
        x5[] x5VarArr$values = $values();
        d = x5VarArr$values;
        e = vc.s.n(x5VarArr$values);
    }

    private x5(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return e;
    }

    public static x5 valueOf(String str) {
        return (x5) Enum.valueOf(x5.class, str);
    }

    public static x5[] values() {
        return (x5[]) d.clone();
    }
}
