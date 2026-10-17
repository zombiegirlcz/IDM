package yzg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CLAIMED;
    public static final c ELIGIBLE;
    public static final c NOT_ELIGIBLE;
    public static final c NOT_ONBOARDED;
    public static final c ONBOARDING;

    static {
        c cVar = new c("NOT_ONBOARDED", 0);
        NOT_ONBOARDED = cVar;
        c cVar2 = new c("ONBOARDING", 1);
        ONBOARDING = cVar2;
        c cVar3 = new c("ELIGIBLE", 2);
        ELIGIBLE = cVar3;
        c cVar4 = new c("CLAIMED", 3);
        CLAIMED = cVar4;
        c cVar5 = new c("NOT_ELIGIBLE", 4);
        NOT_ELIGIBLE = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
