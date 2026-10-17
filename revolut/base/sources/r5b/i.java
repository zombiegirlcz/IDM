package r5b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i DOWNGRADE;
    public static final i KEEP;
    public static final i SUBSCRIBE;
    public static final i SUBSCRIBE_WITH_BENEFITS;

    static {
        i iVar = new i("KEEP", 0);
        KEEP = iVar;
        i iVar2 = new i("SUBSCRIBE", 1);
        SUBSCRIBE = iVar2;
        i iVar3 = new i("SUBSCRIBE_WITH_BENEFITS", 2);
        SUBSCRIBE_WITH_BENEFITS = iVar3;
        i iVar4 = new i("DOWNGRADE", 3);
        DOWNGRADE = iVar4;
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
