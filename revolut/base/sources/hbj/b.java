package hbj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b MINIMUM_DEPOSIT_INFO;
    public static final b NETWORK_PICKER;
    public static final b NONE;

    static {
        b bVar = new b("NETWORK_PICKER", 0);
        NETWORK_PICKER = bVar;
        b bVar2 = new b("MINIMUM_DEPOSIT_INFO", 1);
        MINIMUM_DEPOSIT_INFO = bVar2;
        b bVar3 = new b("NONE", 2);
        NONE = bVar3;
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
