package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class r20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r20 f32616a = new r20("Text", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r20 f32617b = new r20("NumberOrIdentifier", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r20 f32618c = new r20("Date", 2);
    public static final r20 d = new r20("DropDown", 3);
    private static final /* synthetic */ r20[] e;
    private static final /* synthetic */ EnumEntries f;

    static {
        r20[] r20VarArrA = a();
        e = r20VarArrA;
        f = vc.s.n(r20VarArrA);
    }

    private r20(String str, int i) {
    }

    private static final /* synthetic */ r20[] a() {
        return new r20[]{f32616a, f32617b, f32618c, d};
    }

    public static r20 valueOf(String str) {
        return (r20) Enum.valueOf(r20.class, str);
    }

    public static r20[] values() {
        return (r20[]) e.clone();
    }
}
