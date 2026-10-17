package bl3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DENIED;
    public static final b DENIED_PERMANENTLY;
    public static final b GRANTED;

    static {
        b bVar = new b("GRANTED", 0);
        GRANTED = bVar;
        b bVar2 = new b("DENIED_PERMANENTLY", 1);
        DENIED_PERMANENTLY = bVar2;
        b bVar3 = new b("DENIED", 2);
        DENIED = bVar3;
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
