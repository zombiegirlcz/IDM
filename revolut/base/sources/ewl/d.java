package ewl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d FULL_SCREEN;
    public static final d NEXT_BUTTON;
    public static final d TOOLBAR_NEXT_BUTTON;

    static {
        d dVar = new d("FULL_SCREEN", 0);
        FULL_SCREEN = dVar;
        d dVar2 = new d("NEXT_BUTTON", 1);
        NEXT_BUTTON = dVar2;
        d dVar3 = new d("TOOLBAR_NEXT_BUTTON", 2);
        TOOLBAR_NEXT_BUTTON = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
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
