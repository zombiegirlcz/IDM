package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class dm implements x20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dm f27818a = new dm("Birthplace", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ dm[] f27819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f27820c;

    static {
        dm[] dmVarArrA = a();
        f27819b = dmVarArrA;
        f27820c = vc.s.n(dmVarArrA);
    }

    private dm(String str, int i) {
    }

    private static final /* synthetic */ dm[] a() {
        return new dm[]{f27818a};
    }

    public static dm valueOf(String str) {
        return (dm) Enum.valueOf(dm.class, str);
    }

    public static dm[] values() {
        return (dm[]) f27819b.clone();
    }
}
