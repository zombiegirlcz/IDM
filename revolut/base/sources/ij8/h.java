package ij8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACTIVE;
    public static final h CREATED;
    public static final h DISABLED;
    public static final h LOCKED;
    public static final h OFFBOARDING;

    static {
        h hVar = new h("ACTIVE", 0);
        ACTIVE = hVar;
        h hVar2 = new h("LOCKED", 1);
        LOCKED = hVar2;
        h hVar3 = new h("OFFBOARDING", 2);
        OFFBOARDING = hVar3;
        h hVar4 = new h("DISABLED", 3);
        DISABLED = hVar4;
        h hVar5 = new h("CREATED", 4);
        CREATED = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
