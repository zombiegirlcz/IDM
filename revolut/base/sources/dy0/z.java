package dy0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z DEFAULT;
    public static final z ROOT_SLIDER;

    static {
        z zVar = new z("ROOT_SLIDER", 0);
        ROOT_SLIDER = zVar;
        z zVar2 = new z("DEFAULT", 1);
        DEFAULT = zVar2;
        z[] zVarArr = {zVar, zVar2};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
