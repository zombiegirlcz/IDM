package com.fourthline.vision.internal;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class fe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fe f36205b = new fe("AVC", 0, "video/avc");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ fe[] f36206c;
    private static final /* synthetic */ EnumEntries d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36207a;

    private static final /* synthetic */ fe[] $values() {
        return new fe[]{f36205b};
    }

    static {
        fe[] feVarArr$values = $values();
        f36206c = feVarArr$values;
        d = vc.s.n(feVarArr$values);
    }

    private fe(String str, int i, String str2) {
        this.f36207a = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return d;
    }

    public static fe valueOf(String str) {
        return (fe) Enum.valueOf(fe.class, str);
    }

    public static fe[] values() {
        return (fe[]) f36206c.clone();
    }

    @NotNull
    public final String getMimeType() {
        return this.f36207a;
    }
}
