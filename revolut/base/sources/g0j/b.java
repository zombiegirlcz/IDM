package g0j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b EXPERIENCES;
    public static final b INSURANCE;
    public static final b LOUNGES;
    public static final b STAYS;

    static {
        b bVar = new b("STAYS", 0);
        STAYS = bVar;
        b bVar2 = new b("EXPERIENCES", 1);
        EXPERIENCES = bVar2;
        b bVar3 = new b("LOUNGES", 2);
        LOUNGES = bVar3;
        b bVar4 = new b("INSURANCE", 3);
        INSURANCE = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
