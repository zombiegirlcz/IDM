package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class l20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l20 f30507a = new l20("UNFOCUSED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l20 f30508b = new l20("FOCUSED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l20 f30509c = new l20("ERROR", 2);
    public static final l20 d = new l20("DISABLED", 3);
    private static final /* synthetic */ l20[] e;
    private static final /* synthetic */ EnumEntries f;

    static {
        l20[] l20VarArrA = a();
        e = l20VarArrA;
        f = vc.s.n(l20VarArrA);
    }

    private l20(String str, int i) {
    }

    private static final /* synthetic */ l20[] a() {
        return new l20[]{f30507a, f30508b, f30509c, d};
    }

    public static l20 valueOf(String str) {
        return (l20) Enum.valueOf(l20.class, str);
    }

    public static l20[] values() {
        return (l20[]) e.clone();
    }
}
