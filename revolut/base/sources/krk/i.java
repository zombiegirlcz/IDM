package krk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i Q1;
    public static final i Q2;
    public static final i Q3;
    public static final i Q4;

    static {
        i iVar = new i("Q1", 0);
        Q1 = iVar;
        i iVar2 = new i("Q2", 1);
        Q2 = iVar2;
        i iVar3 = new i("Q3", 2);
        Q3 = iVar3;
        i iVar4 = new i("Q4", 3);
        Q4 = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
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
