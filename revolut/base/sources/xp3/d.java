package xp3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AUTOMATICALLY_INCREASE;
    public static final d DO_NOT_OFFER;
    public static final d LET_ME_DECIDE;

    static {
        d dVar = new d("AUTOMATICALLY_INCREASE", 0);
        AUTOMATICALLY_INCREASE = dVar;
        d dVar2 = new d("LET_ME_DECIDE", 1);
        LET_ME_DECIDE = dVar2;
        d dVar3 = new d("DO_NOT_OFFER", 2);
        DO_NOT_OFFER = dVar3;
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
