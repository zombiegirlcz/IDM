package e93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t AUM_CHECK;
    public static final t CHALLENGE;

    @NotNull
    public static final s Companion;
    public static final t REVPOINTS;

    static {
        t tVar = new t("CHALLENGE", 0);
        CHALLENGE = tVar;
        t tVar2 = new t("AUM_CHECK", 1);
        AUM_CHECK = tVar2;
        t tVar3 = new t("REVPOINTS", 2);
        REVPOINTS = tVar3;
        t[] tVarArr = {tVar, tVar2, tVar3};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
        Companion = new s();
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
