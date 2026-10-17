package q89;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f SIGN_IN;
    public static final f SIGN_IN_LOST_ACCESS_TO_PHONE;
    public static final f SIGN_UP;
    public static final f STORIES;

    static {
        f fVar = new f("STORIES", 0);
        STORIES = fVar;
        f fVar2 = new f("SIGN_IN", 1);
        SIGN_IN = fVar2;
        f fVar3 = new f("SIGN_IN_LOST_ACCESS_TO_PHONE", 2);
        SIGN_IN_LOST_ACCESS_TO_PHONE = fVar3;
        f fVar4 = new f("SIGN_UP", 3);
        SIGN_UP = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
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
