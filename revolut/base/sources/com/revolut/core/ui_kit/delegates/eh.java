package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class eh {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ eh[] $VALUES;
    public static final eh CENTER_HORIZONTAL;
    public static final eh START;
    private final int gravity;
    private final int textAlignment;

    static {
        eh ehVar = new eh("START", 0, 5, 8388611);
        START = ehVar;
        eh ehVar2 = new eh("CENTER_HORIZONTAL", 1, 4, 1);
        CENTER_HORIZONTAL = ehVar2;
        eh[] ehVarArr = {ehVar, ehVar2};
        $VALUES = ehVarArr;
        $ENTRIES = vc.s.n(ehVarArr);
    }

    public eh(String str, int i, int i2, int i3) {
        this.textAlignment = i2;
        this.gravity = i3;
    }

    public static eh valueOf(String str) {
        return (eh) Enum.valueOf(eh.class, str);
    }

    public static eh[] values() {
        return (eh[]) $VALUES.clone();
    }

    public final int a() {
        return this.gravity;
    }

    public final int b() {
        return this.textAlignment;
    }
}
