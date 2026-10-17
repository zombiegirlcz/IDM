package bgf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i REMEDIATION;
    public static final i UNKNOWN;
    public static final i WORKFLOW;

    static {
        i iVar = new i("WORKFLOW", 0);
        WORKFLOW = iVar;
        i iVar2 = new i("REMEDIATION", 1);
        REMEDIATION = iVar2;
        i iVar3 = new i("UNKNOWN", 2);
        UNKNOWN = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
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
