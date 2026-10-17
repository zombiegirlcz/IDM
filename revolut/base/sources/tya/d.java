package tya;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACTIVE_UI_TYPE;
    public static final d PAST_UI_TYPE;
    public static final d RECENT_UI_TYPE;

    static {
        d dVar = new d("ACTIVE_UI_TYPE", 0);
        ACTIVE_UI_TYPE = dVar;
        d dVar2 = new d("PAST_UI_TYPE", 1);
        PAST_UI_TYPE = dVar2;
        d dVar3 = new d("RECENT_UI_TYPE", 2);
        RECENT_UI_TYPE = dVar3;
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
