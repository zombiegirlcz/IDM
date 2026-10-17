package bw0;

import ch.qos.logback.core.CoreConstants;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ADD;

    @NotNull
    public static final i Companion;
    public static final j DIVIDE;
    public static final j EQUALS;
    public static final j MULTIPLY;
    public static final j SUBTRACT;

    @NotNull
    private static final j[] cachedValues;
    private final char symbol;

    static {
        j jVar = new j("ADD", 0, '+');
        ADD = jVar;
        j jVar2 = new j("SUBTRACT", 1, CoreConstants.DASH_CHAR);
        SUBTRACT = jVar2;
        j jVar3 = new j("DIVIDE", 2, (char) 247);
        DIVIDE = jVar3;
        j jVar4 = new j("MULTIPLY", 3, (char) 215);
        MULTIPLY = jVar4;
        j jVar5 = new j("EQUALS", 4, '=');
        EQUALS = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
        Companion = new i();
        cachedValues = values();
    }

    public j(String str, int i, char c2) {
        this.symbol = c2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final char b() {
        return this.symbol;
    }
}
