package qv0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k Bottom;
    public static final k Header;
    public static final k Middle;
    public static final k OutOfGroup;
    public static final k Single;
    public static final k Top;

    static {
        k kVar = new k("Top", 0);
        Top = kVar;
        k kVar2 = new k("Middle", 1);
        Middle = kVar2;
        k kVar3 = new k("Bottom", 2);
        Bottom = kVar3;
        k kVar4 = new k("Single", 3);
        Single = kVar4;
        k kVar5 = new k("Header", 4);
        Header = kVar5;
        k kVar6 = new k("OutOfGroup", 5);
        OutOfGroup = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
