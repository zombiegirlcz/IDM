package cqc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BACKOFFICE_REJECTED;
    public static final b COUNTERPARTY_REJECTED;
    public static final b INTERNAL_ERROR;
    public static final b UNKNOWN;

    static {
        b bVar = new b("BACKOFFICE_REJECTED", 0);
        BACKOFFICE_REJECTED = bVar;
        b bVar2 = new b("COUNTERPARTY_REJECTED", 1);
        COUNTERPARTY_REJECTED = bVar2;
        b bVar3 = new b("INTERNAL_ERROR", 2);
        INTERNAL_ERROR = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        UNKNOWN = bVar4;
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
