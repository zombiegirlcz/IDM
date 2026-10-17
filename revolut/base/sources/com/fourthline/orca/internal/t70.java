package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class t70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t70 f33239a = new t70("PORTRAIT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t70 f33240b = new t70("LANDSCAPE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ t70[] f33241c;
    private static final /* synthetic */ EnumEntries d;

    static {
        t70[] t70VarArrA = a();
        f33241c = t70VarArrA;
        d = vc.s.n(t70VarArrA);
    }

    private t70(String str, int i) {
    }

    private static final /* synthetic */ t70[] a() {
        return new t70[]{f33239a, f33240b};
    }

    public static t70 valueOf(String str) {
        return (t70) Enum.valueOf(t70.class, str);
    }

    public static t70[] values() {
        return (t70[]) f33241c.clone();
    }
}
