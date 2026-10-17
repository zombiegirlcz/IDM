package ew9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DETAILS;
    public static final b QR_SCANNER;
    public static final b USERNAME;

    static {
        b bVar = new b("DETAILS", 0);
        DETAILS = bVar;
        b bVar2 = new b("QR_SCANNER", 1);
        QR_SCANNER = bVar2;
        b bVar3 = new b("USERNAME", 2);
        USERNAME = bVar3;
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
