package dy0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BOTTOM;
    public static final o LEFT;
    public static final o RIGHT;
    private final boolean horizontal;

    static {
        o oVar = new o("RIGHT", 0, true);
        RIGHT = oVar;
        o oVar2 = new o("LEFT", 1, true);
        LEFT = oVar2;
        o oVar3 = new o("BOTTOM", 2, false);
        BOTTOM = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public o(String str, int i, boolean z) {
        this.horizontal = z;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final float a() {
        int i = n.f121004a[ordinal()];
        if (i == 1 || i == 2) {
            return 1.0f;
        }
        if (i == 3) {
            return -1.0f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
