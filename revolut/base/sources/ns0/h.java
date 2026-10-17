package ns0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h Decrease;
    public static final h Increase;
    private final float multiplier;

    static {
        h hVar = new h(1.0f, 0, "Increase");
        Increase = hVar;
        h hVar2 = new h(-1.0f, 1, "Decrease");
        Decrease = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public h(float f, int i, String str) {
        this.multiplier = f;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final float a() {
        return this.multiplier;
    }
}
