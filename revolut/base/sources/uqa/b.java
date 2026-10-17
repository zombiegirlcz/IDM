package uqa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Empty;
    public static final b Invalid;
    public static final b InvalidFilled;
    public static final b Valid;

    static {
        b bVar = new b("Empty", 0);
        Empty = bVar;
        b bVar2 = new b("Invalid", 1);
        Invalid = bVar2;
        b bVar3 = new b("InvalidFilled", 2);
        InvalidFilled = bVar3;
        b bVar4 = new b("Valid", 3);
        Valid = bVar4;
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
