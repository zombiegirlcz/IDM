package tgi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b HEY_THERE;
    public static final b HI;
    public static final b NICE_TO_SEE_YOU;
    public static final b WELCOME_BACK;

    static {
        b bVar = new b("WELCOME_BACK", 0);
        WELCOME_BACK = bVar;
        b bVar2 = new b("HEY_THERE", 1);
        HEY_THERE = bVar2;
        b bVar3 = new b("HI", 2);
        HI = bVar3;
        b bVar4 = new b("NICE_TO_SEE_YOU", 3);
        NICE_TO_SEE_YOU = bVar4;
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
