package m7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ADULT;
    public static final j CHILD;

    @NotNull
    public static final i Companion;
    public static final j INFANT;
    public static final long MIN_ADULT_AGE = 18;
    public static final long MIN_CHILD_AGE = 2;
    public static final j UNKNOWN;

    static {
        j jVar = new j("ADULT", 0);
        ADULT = jVar;
        j jVar2 = new j("CHILD", 1);
        CHILD = jVar2;
        j jVar3 = new j("INFANT", 2);
        INFANT = jVar3;
        j jVar4 = new j("UNKNOWN", 3);
        UNKNOWN = jVar4;
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
