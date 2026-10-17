package yoj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DISABLED;
    public static final d ENABLED;
    public static final d INACTIVE;
    public static final d LOCKED;
    public static final d PENDING;

    static {
        d dVar = new d("DISABLED", 0);
        DISABLED = dVar;
        d dVar2 = new d("INACTIVE", 1);
        INACTIVE = dVar2;
        d dVar3 = new d("LOCKED", 2);
        LOCKED = dVar3;
        d dVar4 = new d("PENDING", 3);
        PENDING = dVar4;
        d dVar5 = new d("ENABLED", 4);
        ENABLED = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
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
