package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
final class h51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h51 f29146a = new h51("ACTIVE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h51 f29147b = new h51("PROCESSED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h51 f29148c = new h51("UPCOMING", 2);
    private static final /* synthetic */ h51[] d;
    private static final /* synthetic */ EnumEntries e;

    static {
        h51[] h51VarArrA = a();
        d = h51VarArrA;
        e = vc.s.n(h51VarArrA);
    }

    private h51(String str, int i) {
    }

    private static final /* synthetic */ h51[] a() {
        return new h51[]{f29146a, f29147b, f29148c};
    }

    public static h51 valueOf(String str) {
        return (h51) Enum.valueOf(h51.class, str);
    }

    public static h51[] values() {
        return (h51[]) d.clone();
    }
}
