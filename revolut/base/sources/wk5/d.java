package wk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d MANUAL;
    public static final d MANUAL_VERIFIED;
    public static final d REVOLUT;
    public static final d TRUST;

    static {
        d dVar = new d("REVOLUT", 0);
        REVOLUT = dVar;
        d dVar2 = new d("TRUST", 1);
        TRUST = dVar2;
        d dVar3 = new d("MANUAL_VERIFIED", 2);
        MANUAL_VERIFIED = dVar3;
        d dVar4 = new d("MANUAL", 3);
        MANUAL = dVar4;
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
