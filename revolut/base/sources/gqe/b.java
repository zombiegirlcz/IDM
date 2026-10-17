package gqe;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b DOCUMENTS_REQUIRED;
    public static final b REVIEWING_DOCUMENTS;

    static {
        b bVar = new b("ACTIVE", 0);
        ACTIVE = bVar;
        b bVar2 = new b("DOCUMENTS_REQUIRED", 1);
        DOCUMENTS_REQUIRED = bVar2;
        b bVar3 = new b("REVIEWING_DOCUMENTS", 2);
        REVIEWING_DOCUMENTS = bVar3;
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
