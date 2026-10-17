package r7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final e Companion;
    public static final f ONE_WAY_COMBINATION;
    public static final f SELF_TRANSFER;
    public static final f UNKNOWN;

    static {
        f fVar = new f("SELF_TRANSFER", 0);
        SELF_TRANSFER = fVar;
        f fVar2 = new f("ONE_WAY_COMBINATION", 1);
        ONE_WAY_COMBINATION = fVar2;
        f fVar3 = new f("UNKNOWN", 2);
        UNKNOWN = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
