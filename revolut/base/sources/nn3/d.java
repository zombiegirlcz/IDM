package nn3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALL_ENABLED;
    public static final d CONTACTS_ENABLED;
    public static final d GROUPS_ENABLED;

    static {
        d dVar = new d("ALL_ENABLED", 0);
        ALL_ENABLED = dVar;
        d dVar2 = new d("CONTACTS_ENABLED", 1);
        CONTACTS_ENABLED = dVar2;
        d dVar3 = new d("GROUPS_ENABLED", 2);
        GROUPS_ENABLED = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
