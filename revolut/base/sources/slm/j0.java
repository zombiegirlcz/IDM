package slm;

import ch.qos.logback.core.CoreConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 LIST;
    public static final j0 MAP;
    public static final j0 OBJ;
    public static final j0 POLY_OBJ;
    public final char begin;

    /* JADX INFO: renamed from: end, reason: collision with root package name */
    public final char f264269end;

    static {
        j0 j0Var = new j0("OBJ", 0, CoreConstants.CURLY_LEFT, CoreConstants.CURLY_RIGHT);
        OBJ = j0Var;
        j0 j0Var2 = new j0("LIST", 1, '[', ']');
        LIST = j0Var2;
        j0 j0Var3 = new j0("MAP", 2, CoreConstants.CURLY_LEFT, CoreConstants.CURLY_RIGHT);
        MAP = j0Var3;
        j0 j0Var4 = new j0("POLY_OBJ", 3, '[', ']');
        POLY_OBJ = j0Var4;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public j0(String str, int i, char c2, char c3) {
        this.begin = c2;
        this.f264269end = c3;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
