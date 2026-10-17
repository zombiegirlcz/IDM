package lzi;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v AMBITIOUS;
    public static final v COMFORTABLE;
    public static final v SUGGESTED;
    public static final v TOO_HIGH;
    public static final v VERY_LOW;

    @NotNull
    private final String value;

    static {
        v vVar = new v("VERY_LOW", 0, "very_low");
        VERY_LOW = vVar;
        v vVar2 = new v("AMBITIOUS", 1, "ambitious");
        AMBITIOUS = vVar2;
        v vVar3 = new v("SUGGESTED", 2, "suggested");
        SUGGESTED = vVar3;
        v vVar4 = new v("COMFORTABLE", 3, "comfortable");
        COMFORTABLE = vVar4;
        v vVar5 = new v("TOO_HIGH", 4, "too_high");
        TOO_HIGH = vVar5;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public v(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
