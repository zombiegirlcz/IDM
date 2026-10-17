package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class jb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jb[] $VALUES;
    public static final jb DEFAULT;
    public static final jb SELECTED;

    static {
        jb jbVar = new jb("SELECTED", 0);
        SELECTED = jbVar;
        jb jbVar2 = new jb("DEFAULT", 1);
        DEFAULT = jbVar2;
        jb[] jbVarArr = {jbVar, jbVar2};
        $VALUES = jbVarArr;
        $ENTRIES = vc.s.n(jbVarArr);
    }

    public static jb valueOf(String str) {
        return (jb) Enum.valueOf(jb.class, str);
    }

    public static jb[] values() {
        return (jb[]) $VALUES.clone();
    }
}
