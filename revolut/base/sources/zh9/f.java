package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f Cancellation;
    public static final f Pl2Ftc;
    public static final f Termination;
    public static final f Withdrawal;

    static {
        f fVar = new f("Withdrawal", 0);
        Withdrawal = fVar;
        f fVar2 = new f("Cancellation", 1);
        Cancellation = fVar2;
        f fVar3 = new f("Termination", 2);
        Termination = fVar3;
        f fVar4 = new f("Pl2Ftc", 3);
        Pl2Ftc = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
