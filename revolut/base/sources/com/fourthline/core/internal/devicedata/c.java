package com.fourthline.core.internal.devicedata;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f26345b = new c("RotationVector", 0, "Rotation");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f26346c = new c("Gyro", 1, "Gyro");
    public static final c d = new c("Zero", 2, "Fallback");
    private static final /* synthetic */ c[] e;
    private static final /* synthetic */ EnumEntries f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26347a;

    static {
        c[] cVarArrA = a();
        e = cVarArrA;
        f = s.n(cVarArrA);
    }

    private c(String str, int i, String str2) {
        this.f26347a = str2;
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f26345b, f26346c, d};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) e.clone();
    }

    public final String b() {
        return this.f26347a;
    }
}
