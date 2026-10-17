package vd8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CO_GUARDIAN;
    public static final d GUARDIAN;
    private final int priority;

    static {
        d dVar = new d("GUARDIAN", 0, 0);
        GUARDIAN = dVar;
        d dVar2 = new d("CO_GUARDIAN", 1, 1);
        CO_GUARDIAN = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, int i2) {
        this.priority = i2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int a() {
        return this.priority;
    }
}
