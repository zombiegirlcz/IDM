package no;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CYBERPUNK;
    public static final j DEEP_BLUE;
    public static final j DEFAULT;
    public static final j DYNAMIC;
    public static final j ORANGE;
    public static final j PINK;
    public static final j PURPLE;
    public static final j TEAL;

    @NotNull
    private final String value;

    static {
        j jVar = new j("PURPLE", 0, "purple");
        PURPLE = jVar;
        j jVar2 = new j("TEAL", 1, "teal");
        TEAL = jVar2;
        j jVar3 = new j("ORANGE", 2, "orange");
        ORANGE = jVar3;
        j jVar4 = new j("PINK", 3, "pink");
        PINK = jVar4;
        j jVar5 = new j("DEEP_BLUE", 4, "deepBlue");
        DEEP_BLUE = jVar5;
        j jVar6 = new j("DYNAMIC", 5, "dynamic");
        DYNAMIC = jVar6;
        j jVar7 = new j("CYBERPUNK", 6, "cyberpunk");
        CYBERPUNK = jVar7;
        j jVar8 = new j("DEFAULT", 7, "default");
        DEFAULT = jVar8;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public j(String str, int i, String str2) {
        this.value = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
