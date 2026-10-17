package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class tc0 implements x20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tc0 f33272a = new tc0("Can", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ tc0[] f33273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33274c;

    static {
        tc0[] tc0VarArrA = a();
        f33273b = tc0VarArrA;
        f33274c = vc.s.n(tc0VarArrA);
    }

    private tc0(String str, int i) {
    }

    private static final /* synthetic */ tc0[] a() {
        return new tc0[]{f33272a};
    }

    public static tc0 valueOf(String str) {
        return (tc0) Enum.valueOf(tc0.class, str);
    }

    public static tc0[] values() {
        return (tc0[]) f33273b.clone();
    }
}
