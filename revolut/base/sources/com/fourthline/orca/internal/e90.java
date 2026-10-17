package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
final class e90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e90 f28078a = new e90("Connectivity", 0, "connection_lost");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e90 f28079b = new e90("Canceled", 1, "canceled");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e90 f28080c = new e90("Generic", 2, "generic");
    private static final /* synthetic */ e90[] d;
    private static final /* synthetic */ EnumEntries e;

    static {
        e90[] e90VarArrA = a();
        d = e90VarArrA;
        e = vc.s.n(e90VarArrA);
    }

    private e90(String str, int i, String str2) {
    }

    private static final /* synthetic */ e90[] a() {
        return new e90[]{f28078a, f28079b, f28080c};
    }

    public static e90 valueOf(String str) {
        return (e90) Enum.valueOf(e90.class, str);
    }

    public static e90[] values() {
        return (e90[]) d.clone();
    }
}
