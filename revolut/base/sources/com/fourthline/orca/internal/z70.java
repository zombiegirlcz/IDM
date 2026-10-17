package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class z70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z70 f35538b = new z70("HandLandMarkerModel", 0, "hand_landmark_lite.tflite");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ z70[] f35539c;
    private static final /* synthetic */ EnumEntries d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35540a;

    static {
        z70[] z70VarArrA = a();
        f35539c = z70VarArrA;
        d = vc.s.n(z70VarArrA);
    }

    private z70(String str, int i, String str2) {
        this.f35540a = str2;
    }

    private static final /* synthetic */ z70[] a() {
        return new z70[]{f35538b};
    }

    public static z70 valueOf(String str) {
        return (z70) Enum.valueOf(z70.class, str);
    }

    public static z70[] values() {
        return (z70[]) f35539c.clone();
    }

    public final String b() {
        return this.f35540a;
    }
}
