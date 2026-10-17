package yo6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e NEGATIVE;
    public static final e NEUTRAL;
    public static final e POSITIVE;
    private final int score;
    private final int selectedOption;

    static {
        e eVar = new e("NEGATIVE", 0, 0, -1);
        NEGATIVE = eVar;
        e eVar2 = new e("NEUTRAL", 1, 1, 0);
        NEUTRAL = eVar2;
        e eVar3 = new e("POSITIVE", 2, 2, 1);
        POSITIVE = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, int i2, int i3) {
        this.selectedOption = i2;
        this.score = i3;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int b() {
        return this.score;
    }

    public final int c() {
        return this.selectedOption;
    }
}
