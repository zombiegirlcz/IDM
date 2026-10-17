package zxc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTION_REQUIRED;
    public static final b DONE;
    public static final b EMPTY;
    public static final b VERIFIED;

    static {
        b bVar = new b("DONE", 0);
        DONE = bVar;
        b bVar2 = new b("EMPTY", 1);
        EMPTY = bVar2;
        b bVar3 = new b("VERIFIED", 2);
        VERIFIED = bVar3;
        b bVar4 = new b("ACTION_REQUIRED", 3);
        ACTION_REQUIRED = bVar4;
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
