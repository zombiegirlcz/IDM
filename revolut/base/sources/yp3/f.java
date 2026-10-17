package yp3;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class f implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f SHOW_ALL;
    public static final f SKIP_ALL;
    public static final f SKIP_RESUME_INTRO;

    static {
        f fVar = new f("SHOW_ALL", 0);
        SHOW_ALL = fVar;
        f fVar2 = new f("SKIP_ALL", 1);
        SKIP_ALL = fVar2;
        f fVar3 = new f("SKIP_RESUME_INTRO", 2);
        SKIP_RESUME_INTRO = fVar3;
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
