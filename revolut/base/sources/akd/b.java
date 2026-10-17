package akd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACCENT;
    public static final b DANGER;
    public static final b SUCCESS;
    public static final b WARNING;

    static {
        b bVar = new b("ACCENT", 0);
        ACCENT = bVar;
        b bVar2 = new b("DANGER", 1);
        DANGER = bVar2;
        b bVar3 = new b("SUCCESS", 2);
        SUCCESS = bVar3;
        b bVar4 = new b("WARNING", 3);
        WARNING = bVar4;
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
