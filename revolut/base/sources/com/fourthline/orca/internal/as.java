package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final as f26892a = new as("Pin", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final as f26893b = new as("RetryPin", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final as f26894c = new as("Can", 2);
    private static final /* synthetic */ as[] d;
    private static final /* synthetic */ EnumEntries e;

    static {
        as[] asVarArrA = a();
        d = asVarArrA;
        e = vc.s.n(asVarArrA);
    }

    private as(String str, int i) {
    }

    private static final /* synthetic */ as[] a() {
        return new as[]{f26892a, f26893b, f26894c};
    }

    public static as valueOf(String str) {
        return (as) Enum.valueOf(as.class, str);
    }

    public static as[] values() {
        return (as[]) d.clone();
    }
}
