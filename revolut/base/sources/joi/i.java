package joi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i IDLE;
    public static final i PRESSED;
    public static final i PRESSING;
    public static final i RELEASE_PENDING;
    public static final i RELEASING;

    static {
        i iVar = new i("IDLE", 0);
        IDLE = iVar;
        i iVar2 = new i("PRESSING", 1);
        PRESSING = iVar2;
        i iVar3 = new i("PRESSED", 2);
        PRESSED = iVar3;
        i iVar4 = new i("RELEASE_PENDING", 3);
        RELEASE_PENDING = iVar4;
        i iVar5 = new i("RELEASING", 4);
        RELEASING = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
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
