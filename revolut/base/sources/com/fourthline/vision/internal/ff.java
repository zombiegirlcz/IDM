package com.fourthline.vision.internal;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ff f36208a = new ff("CAMERA", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ff f36209b = new ff("RECORD_AUDIO", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ff[] f36210c;
    private static final /* synthetic */ EnumEntries d;

    private static final /* synthetic */ ff[] $values() {
        return new ff[]{f36208a, f36209b};
    }

    static {
        ff[] ffVarArr$values = $values();
        f36210c = ffVarArr$values;
        d = vc.s.n(ffVarArr$values);
    }

    private ff(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return d;
    }

    public static ff valueOf(String str) {
        return (ff) Enum.valueOf(ff.class, str);
    }

    public static ff[] values() {
        return (ff[]) f36210c.clone();
    }
}
