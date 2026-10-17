package or0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d LEFT_TO_RIGHT;
    public static final d RIGHT_TO_LEFT;

    static {
        d dVar = new d("LEFT_TO_RIGHT", 0);
        LEFT_TO_RIGHT = dVar;
        d dVar2 = new d("RIGHT_TO_LEFT", 1);
        RIGHT_TO_LEFT = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
