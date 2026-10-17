package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c7 f27387a = new c7("NEW", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c7 f27388b = new c7("PENDING", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c7 f27389c = new c7("PENDING_VERIFICATION", 2);
    public static final c7 d = new c7("KYC_REQUIRED", 3);
    public static final c7 e = new c7("FAILED", 4);
    public static final c7 f = new c7("COMPLETED", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c7 f27390g = new c7("COMPILING_MANDATE", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ c7[] f27391h;
    private static final /* synthetic */ EnumEntries i;

    static {
        c7[] c7VarArrA = a();
        f27391h = c7VarArrA;
        i = vc.s.n(c7VarArrA);
    }

    private c7(String str, int i2) {
    }

    private static final /* synthetic */ c7[] a() {
        return new c7[]{f27387a, f27388b, f27389c, d, e, f, f27390g};
    }

    public static c7 valueOf(String str) {
        return (c7) Enum.valueOf(c7.class, str);
    }

    public static c7[] values() {
        return (c7[]) f27391h.clone();
    }
}
