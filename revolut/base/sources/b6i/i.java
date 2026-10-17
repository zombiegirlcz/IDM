package b6i;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ADD;
    public static final i MOVE;
    public static final i WITHDRAW;

    static {
        i iVar = new i("MOVE", 0);
        MOVE = iVar;
        i iVar2 = new i("ADD", 1);
        ADD = iVar2;
        i iVar3 = new i("WITHDRAW", 2);
        WITHDRAW = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
