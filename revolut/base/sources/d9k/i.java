package d9k;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ABSENT;
    public static final i SIMPLE;
    public static final i WITH_GIF;
    public static final i WITH_PERSONALISATION;

    static {
        i iVar = new i("ABSENT", 0);
        ABSENT = iVar;
        i iVar2 = new i("SIMPLE", 1);
        SIMPLE = iVar2;
        i iVar3 = new i("WITH_GIF", 2);
        WITH_GIF = iVar3;
        i iVar4 = new i("WITH_PERSONALISATION", 3);
        WITH_PERSONALISATION = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
