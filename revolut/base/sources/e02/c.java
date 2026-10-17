package e02;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DOUBLE_BASE64;
    public static final c PEM;
    public static final c SINGLE_BASE64;

    static {
        c cVar = new c("DOUBLE_BASE64", 0);
        DOUBLE_BASE64 = cVar;
        c cVar2 = new c("SINGLE_BASE64", 1);
        SINGLE_BASE64 = cVar2;
        c cVar3 = new c("PEM", 2);
        PEM = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
