package gp3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ASSET_DETAILS;
    public static final d JOIN;
    public static final d WATCH;

    static {
        d dVar = new d("ASSET_DETAILS", 0);
        ASSET_DETAILS = dVar;
        d dVar2 = new d("WATCH", 1);
        WATCH = dVar2;
        d dVar3 = new d("JOIN", 2);
        JOIN = dVar3;
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
