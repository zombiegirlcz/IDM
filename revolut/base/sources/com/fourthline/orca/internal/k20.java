package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class k20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k20 f30106a = new k20("REQUIRED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k20 f30107b = new k20("INVALID_FIELD", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ k20[] f30108c;
    private static final /* synthetic */ EnumEntries d;

    static {
        k20[] k20VarArrA = a();
        f30108c = k20VarArrA;
        d = vc.s.n(k20VarArrA);
    }

    private k20(String str, int i) {
    }

    private static final /* synthetic */ k20[] a() {
        return new k20[]{f30106a, f30107b};
    }

    public static k20 valueOf(String str) {
        return (k20) Enum.valueOf(k20.class, str);
    }

    public static k20[] values() {
        return (k20[]) f30108c.clone();
    }
}
