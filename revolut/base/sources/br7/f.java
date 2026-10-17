package br7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f GENERIC;
    public static final f LICENCE_BACK;
    public static final f LICENCE_FRONT;

    static {
        f fVar = new f("GENERIC", 0);
        GENERIC = fVar;
        f fVar2 = new f("LICENCE_FRONT", 1);
        LICENCE_FRONT = fVar2;
        f fVar3 = new f("LICENCE_BACK", 2);
        LICENCE_BACK = fVar3;
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
