package kw4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f INIT;
    public static final f KEYBOARD;
    public static final f SLIDER;
    public static final f TIP;

    static {
        f fVar = new f("KEYBOARD", 0);
        KEYBOARD = fVar;
        f fVar2 = new f("SLIDER", 1);
        SLIDER = fVar2;
        f fVar3 = new f("TIP", 2);
        TIP = fVar3;
        f fVar4 = new f("INIT", 3);
        INIT = fVar4;
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
