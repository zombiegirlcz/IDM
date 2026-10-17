package ejb;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j AUTO_TRANSFER;

    @NotNull
    public static final i Companion;
    public static final j INTEREST;
    public static final j TOP_UP;
    public static final j WITHDRAWAL;

    static {
        j jVar = new j("TOP_UP", 0);
        TOP_UP = jVar;
        j jVar2 = new j("AUTO_TRANSFER", 1);
        AUTO_TRANSFER = jVar2;
        j jVar3 = new j("INTEREST", 2);
        INTEREST = jVar3;
        j jVar4 = new j("WITHDRAWAL", 3);
        WITHDRAWAL = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
        Companion = new i();
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
