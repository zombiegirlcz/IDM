package kk8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CONFIG_USER;
    public static final p USER_CURRENT_FEATURES;
    public static final p USER_PLAN;

    static {
        p pVar = new p("USER_CURRENT_FEATURES", 0);
        USER_CURRENT_FEATURES = pVar;
        p pVar2 = new p("USER_PLAN", 1);
        USER_PLAN = pVar2;
        p pVar3 = new p("CONFIG_USER", 2);
        CONFIG_USER = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
