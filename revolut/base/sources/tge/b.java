package tge;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACCOUNT_PICKER;
    public static final b REMOVAL;
    public static final b SWITCHED;

    static {
        b bVar = new b("SWITCHED", 0);
        SWITCHED = bVar;
        b bVar2 = new b("ACCOUNT_PICKER", 1);
        ACCOUNT_PICKER = bVar2;
        b bVar3 = new b("REMOVAL", 2);
        REMOVAL = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
