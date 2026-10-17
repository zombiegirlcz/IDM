package azl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h LEFT;
    public static final h RIGHT;
    private int androidGravity;

    static {
        h hVar = new h("LEFT", 0, 3);
        LEFT = hVar;
        h hVar2 = new h("RIGHT", 1, 5);
        RIGHT = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public h(String str, int i, int i2) {
        this.androidGravity = i2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final int a() {
        return this.androidGravity;
    }
}
