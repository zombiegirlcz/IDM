package kc0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CARD;
    public static final d SELFIE_AND_CARD;
    public static final d SELFIE_WITH_CARD;

    static {
        d dVar = new d("CARD", 0);
        CARD = dVar;
        d dVar2 = new d("SELFIE_WITH_CARD", 1);
        SELFIE_WITH_CARD = dVar2;
        d dVar3 = new d("SELFIE_AND_CARD", 2);
        SELFIE_AND_CARD = dVar3;
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
