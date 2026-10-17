package ng5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COMPLETED;
    public static final b IN_PROGRESS;
    public static final b NOT_STARTED;
    public static final b UNKNOWN;

    static {
        b bVar = new b("NOT_STARTED", 0);
        NOT_STARTED = bVar;
        b bVar2 = new b("IN_PROGRESS", 1);
        IN_PROGRESS = bVar2;
        b bVar3 = new b("COMPLETED", 2);
        COMPLETED = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        UNKNOWN = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
