package gie;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CANCELLED;
    public static final b FINISHED;
    public static final b IN_PROGRESS;
    public static final b PENDING;

    static {
        b bVar = new b("PENDING", 0);
        PENDING = bVar;
        b bVar2 = new b("IN_PROGRESS", 1);
        IN_PROGRESS = bVar2;
        b bVar3 = new b("FINISHED", 2);
        FINISHED = bVar3;
        b bVar4 = new b("CANCELLED", 3);
        CANCELLED = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
