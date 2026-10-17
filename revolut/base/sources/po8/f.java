package po8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CONTACT_DISCOVERABILITY;
    public static final f REVTAG_DISCOVERABILITY;

    static {
        f fVar = new f("CONTACT_DISCOVERABILITY", 0);
        CONTACT_DISCOVERABILITY = fVar;
        f fVar2 = new f("REVTAG_DISCOVERABILITY", 1);
        REVTAG_DISCOVERABILITY = fVar2;
        f[] fVarArr = {fVar, fVar2};
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
