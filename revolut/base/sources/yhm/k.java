package yhm;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k NONE;
    public static final k PUBLICATION;
    public static final k SYNCHRONIZED;

    static {
        k kVar = new k("SYNCHRONIZED", 0);
        SYNCHRONIZED = kVar;
        k kVar2 = new k("PUBLICATION", 1);
        PUBLICATION = kVar2;
        k kVar3 = new k("NONE", 2);
        NONE = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
