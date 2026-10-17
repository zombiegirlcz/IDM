package se6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f GLOBAL;
    public static final f LOCAL;
    public static final f LOCAL_WITH_BRANCHES;

    static {
        f fVar = new f("GLOBAL", 0);
        GLOBAL = fVar;
        f fVar2 = new f("LOCAL", 1);
        LOCAL = fVar2;
        f fVar3 = new f("LOCAL_WITH_BRANCHES", 2);
        LOCAL_WITH_BRANCHES = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
