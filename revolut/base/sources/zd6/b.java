package zd6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BROWSER_EXTENSION;
    public static final b MOBILE_CLIENT;
    public static final b OPEN_BANKING;
    public static final b WEB_CLIENT;

    static {
        b bVar = new b("WEB_CLIENT", 0);
        WEB_CLIENT = bVar;
        b bVar2 = new b("BROWSER_EXTENSION", 1);
        BROWSER_EXTENSION = bVar2;
        b bVar3 = new b("OPEN_BANKING", 2);
        OPEN_BANKING = bVar3;
        b bVar4 = new b("MOBILE_CLIENT", 3);
        MOBILE_CLIENT = bVar4;
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
