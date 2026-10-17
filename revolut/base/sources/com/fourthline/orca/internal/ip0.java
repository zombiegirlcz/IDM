package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ip0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ip0 f29665a = new ip0("IMAGE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ip0 f29666b = new ip0("PDF", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ip0[] f29667c;
    private static final /* synthetic */ EnumEntries d;

    static {
        ip0[] ip0VarArrA = a();
        f29667c = ip0VarArrA;
        d = vc.s.n(ip0VarArrA);
    }

    private ip0(String str, int i) {
    }

    private static final /* synthetic */ ip0[] a() {
        return new ip0[]{f29665a, f29666b};
    }

    public static ip0 valueOf(String str) {
        return (ip0) Enum.valueOf(ip0.class, str);
    }

    public static ip0[] values() {
        return (ip0[]) f29667c.clone();
    }
}
