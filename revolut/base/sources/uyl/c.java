package uyl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c NO_SHADOW_BLUE;
    public static final c OUTLINED_BLUE;
    public static final c OUTLINED_GREY;
    public static final c SHADOW_BLUE;

    static {
        c cVar = new c("SHADOW_BLUE", 0);
        SHADOW_BLUE = cVar;
        c cVar2 = new c("NO_SHADOW_BLUE", 1);
        NO_SHADOW_BLUE = cVar2;
        c cVar3 = new c("OUTLINED_BLUE", 2);
        OUTLINED_BLUE = cVar3;
        c cVar4 = new c("OUTLINED_GREY", 3);
        OUTLINED_GREY = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
