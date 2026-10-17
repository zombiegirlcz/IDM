package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b B2C;
    public static final b B2C_UPGRADE;
    public static final b LEGACY;
    public static final b MC;

    static {
        b bVar = new b("MC", 0);
        MC = bVar;
        b bVar2 = new b("B2C", 1);
        B2C = bVar2;
        b bVar3 = new b("B2C_UPGRADE", 2);
        B2C_UPGRADE = bVar3;
        b bVar4 = new b("LEGACY", 3);
        LEGACY = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
