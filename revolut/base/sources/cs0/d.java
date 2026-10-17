package cs0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BOTTOM_TO_TOP;
    public static final d LEFT_TO_RIGHT;
    public static final d RIGHT_TO_LEFT;
    public static final d TOP_TO_BOTTOM;

    static {
        d dVar = new d("LEFT_TO_RIGHT", 0);
        LEFT_TO_RIGHT = dVar;
        d dVar2 = new d("TOP_TO_BOTTOM", 1);
        TOP_TO_BOTTOM = dVar2;
        d dVar3 = new d("RIGHT_TO_LEFT", 2);
        RIGHT_TO_LEFT = dVar3;
        d dVar4 = new d("BOTTOM_TO_TOP", 3);
        BOTTOM_TO_TOP = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
