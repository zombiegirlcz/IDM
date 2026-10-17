package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class za1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final za1 f35552a = new za1("SUCCESS", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final za1 f35553b = new za1("REQUIRED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final za1 f35554c = new za1("INVALID_LENGTH", 2);
    public static final za1 d = new za1("INVALID_FORMAT", 3);
    private static final /* synthetic */ za1[] e;
    private static final /* synthetic */ EnumEntries f;

    static {
        za1[] za1VarArrA = a();
        e = za1VarArrA;
        f = vc.s.n(za1VarArrA);
    }

    private za1(String str, int i) {
    }

    private static final /* synthetic */ za1[] a() {
        return new za1[]{f35552a, f35553b, f35554c, d};
    }

    public static za1 valueOf(String str) {
        return (za1) Enum.valueOf(za1.class, str);
    }

    public static za1[] values() {
        return (za1[]) e.clone();
    }
}
