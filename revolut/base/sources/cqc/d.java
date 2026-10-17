package cqc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d COMPLETED;
    public static final d FAILED;
    public static final d OPEN;
    public static final d PENDING_REVIEW;
    public static final d UNKNOWN;

    static {
        d dVar = new d("PENDING_REVIEW", 0);
        PENDING_REVIEW = dVar;
        d dVar2 = new d("OPEN", 1);
        OPEN = dVar2;
        d dVar3 = new d("COMPLETED", 2);
        COMPLETED = dVar3;
        d dVar4 = new d("FAILED", 3);
        FAILED = dVar4;
        d dVar5 = new d("UNKNOWN", 4);
        UNKNOWN = dVar5;
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
