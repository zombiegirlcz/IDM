package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u CAPTION;
    public static final u PRIMARY;

    static {
        u uVar = new u("PRIMARY", 0);
        PRIMARY = uVar;
        u uVar2 = new u("CAPTION", 1);
        CAPTION = uVar2;
        u[] uVarArr = {uVar, uVar2};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
