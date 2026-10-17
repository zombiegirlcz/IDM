package ip0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class xy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ xy[] $VALUES;
    public static final xy PRIMARY_ACTIVE;
    public static final xy PRIMARY_INACTIVE;
    public static final xy SECONDARY_ACTIVE;
    public static final xy SECONDARY_INACTIVE;
    private final boolean enabled;

    @NotNull
    private final ms0.h4 smallButtonStyle;

    static {
        ms0.h4 h4Var = ms0.h4.ACCENT;
        xy xyVar = new xy("PRIMARY_ACTIVE", 0, h4Var, true);
        PRIMARY_ACTIVE = xyVar;
        ms0.h4 h4Var2 = ms0.h4.SEMIACCENT;
        xy xyVar2 = new xy("SECONDARY_ACTIVE", 1, h4Var2, true);
        SECONDARY_ACTIVE = xyVar2;
        xy xyVar3 = new xy("PRIMARY_INACTIVE", 2, h4Var, false);
        PRIMARY_INACTIVE = xyVar3;
        xy xyVar4 = new xy("SECONDARY_INACTIVE", 3, h4Var2, false);
        SECONDARY_INACTIVE = xyVar4;
        xy[] xyVarArr = {xyVar, xyVar2, xyVar3, xyVar4};
        $VALUES = xyVarArr;
        $ENTRIES = vc.s.n(xyVarArr);
    }

    public xy(String str, int i, ms0.h4 h4Var, boolean z) {
        this.smallButtonStyle = h4Var;
        this.enabled = z;
    }

    public static xy valueOf(String str) {
        return (xy) Enum.valueOf(xy.class, str);
    }

    public static xy[] values() {
        return (xy[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.enabled;
    }

    public final ms0.h4 b() {
        return this.smallButtonStyle;
    }
}
