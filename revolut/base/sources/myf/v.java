package myf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v AUDIO;
    public static final v GUIDE;
    public static final v WRITTEN;

    static {
        v vVar = new v("AUDIO", 0);
        AUDIO = vVar;
        v vVar2 = new v("WRITTEN", 1);
        WRITTEN = vVar2;
        v vVar3 = new v("GUIDE", 2);
        GUIDE = vVar3;
        v[] vVarArr = {vVar, vVar2, vVar3};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
