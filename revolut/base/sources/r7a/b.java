package r7a;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALLOWED;
    public static final b DENIED;
    public static final b EXPLANATION;

    static {
        b bVar = new b("DENIED", 0);
        DENIED = bVar;
        b bVar2 = new b("ALLOWED", 1);
        ALLOWED = bVar2;
        b bVar3 = new b("EXPLANATION", 2);
        EXPLANATION = bVar3;
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
