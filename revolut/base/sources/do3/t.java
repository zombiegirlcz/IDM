package do3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t GRADUATED;
    public static final t NOT_VERIFIED;
    public static final t VERIFIED;

    static {
        t tVar = new t("NOT_VERIFIED", 0);
        NOT_VERIFIED = tVar;
        t tVar2 = new t("GRADUATED", 1);
        GRADUATED = tVar2;
        t tVar3 = new t("VERIFIED", 2);
        VERIFIED = tVar3;
        t[] tVarArr = {tVar, tVar2, tVar3};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
