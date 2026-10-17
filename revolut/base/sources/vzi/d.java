package vzi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AI_ONLY;
    public static final d MIXED;
    public static final d NONE;
    public static final d STATIC_ONLY;

    static {
        d dVar = new d("NONE", 0);
        NONE = dVar;
        d dVar2 = new d("STATIC_ONLY", 1);
        STATIC_ONLY = dVar2;
        d dVar3 = new d("AI_ONLY", 2);
        AI_ONLY = dVar3;
        d dVar4 = new d("MIXED", 3);
        MIXED = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
