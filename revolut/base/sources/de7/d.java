package de7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACCEPT;
    public static final d OPEN_ACTIVE;
    public static final d RINGING;

    static {
        d dVar = new d("RINGING", 0);
        RINGING = dVar;
        d dVar2 = new d("ACCEPT", 1);
        ACCEPT = dVar2;
        d dVar3 = new d("OPEN_ACTIVE", 2);
        OPEN_ACTIVE = dVar3;
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
