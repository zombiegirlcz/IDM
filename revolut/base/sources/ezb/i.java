package ezb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ACTIVE;
    public static final i COMPLETED;
    private final int position;

    static {
        i iVar = new i("ACTIVE", 0, 0);
        ACTIVE = iVar;
        i iVar2 = new i("COMPLETED", 1, 1);
        COMPLETED = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public i(String str, int i, int i2) {
        this.position = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int b() {
        return this.position;
    }
}
