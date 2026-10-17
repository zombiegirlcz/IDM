package hxf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CANCELLED;
    public static final d CONFIRMED;
    public static final d FAILED;
    public static final d PENDING;

    static {
        d dVar = new d("CONFIRMED", 0);
        CONFIRMED = dVar;
        d dVar2 = new d("FAILED", 1);
        FAILED = dVar2;
        d dVar3 = new d("CANCELLED", 2);
        CANCELLED = dVar3;
        d dVar4 = new d("PENDING", 3);
        PENDING = dVar4;
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
