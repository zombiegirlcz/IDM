package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f EQUAL_BUTTONS;
    public static final f EQUAL_BUTTONS_REVERSED;
    public static final f SMALL_PRIMARY_BUTTON;
    public static final f SMALL_SECONDARY_BUTTON;

    static {
        f fVar = new f("EQUAL_BUTTONS", 0);
        EQUAL_BUTTONS = fVar;
        f fVar2 = new f("EQUAL_BUTTONS_REVERSED", 1);
        EQUAL_BUTTONS_REVERSED = fVar2;
        f fVar3 = new f("SMALL_PRIMARY_BUTTON", 2);
        SMALL_PRIMARY_BUTTON = fVar3;
        f fVar4 = new f("SMALL_SECONDARY_BUTTON", 3);
        SMALL_SECONDARY_BUTTON = fVar4;
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
