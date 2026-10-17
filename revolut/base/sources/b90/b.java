package b90;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DASHBOARD;
    public static final b DEEPLINK;
    public static final b WALLET;

    static {
        b bVar = new b("WALLET", 0);
        WALLET = bVar;
        b bVar2 = new b("DASHBOARD", 1);
        DASHBOARD = bVar2;
        b bVar3 = new b("DEEPLINK", 2);
        DEEPLINK = bVar3;
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
