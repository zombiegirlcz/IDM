package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yk f35367a = new yk("Traditional", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yk f35368b = new yk("Eid", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ yk[] f35369c;
    private static final /* synthetic */ EnumEntries d;

    static {
        yk[] ykVarArrA = a();
        f35369c = ykVarArrA;
        d = vc.s.n(ykVarArrA);
    }

    private yk(String str, int i) {
    }

    private static final /* synthetic */ yk[] a() {
        return new yk[]{f35367a, f35368b};
    }

    public static yk valueOf(String str) {
        return (yk) Enum.valueOf(yk.class, str);
    }

    public static yk[] values() {
        return (yk[]) f35369c.clone();
    }
}
