package vt0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ANIMATING_TO_LIST_SCREEN;
    public static final b FULL_SCREEN;
    public static final b LIST_SCREEN;

    static {
        b bVar = new b("LIST_SCREEN", 0);
        LIST_SCREEN = bVar;
        b bVar2 = new b("FULL_SCREEN", 1);
        FULL_SCREEN = bVar2;
        b bVar3 = new b("ANIMATING_TO_LIST_SCREEN", 2);
        ANIMATING_TO_LIST_SCREEN = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
