package sjm;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BACKING_FIELD;
    public static final b DELEGATE_FIELD;
    public static final b PROPERTY;

    static {
        b bVar = new b("PROPERTY", 0);
        PROPERTY = bVar;
        b bVar2 = new b("BACKING_FIELD", 1);
        BACKING_FIELD = bVar2;
        b bVar3 = new b("DELEGATE_FIELD", 2);
        DELEGATE_FIELD = bVar3;
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
