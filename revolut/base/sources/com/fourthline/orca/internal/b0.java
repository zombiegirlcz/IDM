package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class b0 implements x20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f26948a = new b0("POSTAL_CODE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f26949b = new b0("HOUSE_NUMBER", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f26950c = new b0("HOUSE_NUMBER_SUFFIX", 2);
    public static final b0 d = new b0("STREET", 3);
    public static final b0 e = new b0("CITY", 4);
    private static final /* synthetic */ b0[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26951g;

    static {
        b0[] b0VarArrA = a();
        f = b0VarArrA;
        f26951g = vc.s.n(b0VarArrA);
    }

    private b0(String str, int i) {
    }

    private static final /* synthetic */ b0[] a() {
        return new b0[]{f26948a, f26949b, f26950c, d, e};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f.clone();
    }
}
