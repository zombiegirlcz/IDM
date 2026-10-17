package wel;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class i implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ACTIVATED;
    public static final i CREATED;
    public static final i OFFBOARDING;
    public static final i SUSPENDED;
    public static final i TERMINATED;

    static {
        i iVar = new i("CREATED", 0);
        CREATED = iVar;
        i iVar2 = new i("ACTIVATED", 1);
        ACTIVATED = iVar2;
        i iVar3 = new i("SUSPENDED", 2);
        SUSPENDED = iVar3;
        i iVar4 = new i("OFFBOARDING", 3);
        OFFBOARDING = iVar4;
        i iVar5 = new i("TERMINATED", 4);
        TERMINATED = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
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
