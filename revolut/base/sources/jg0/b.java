package jg0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COMPLETED;
    public static final b FAILED;
    public static final b IN_PROGRESS;
    public static final b PENDING;

    static {
        b bVar = new b("PENDING", 0);
        PENDING = bVar;
        b bVar2 = new b("IN_PROGRESS", 1);
        IN_PROGRESS = bVar2;
        b bVar3 = new b("COMPLETED", 2);
        COMPLETED = bVar3;
        b bVar4 = new b("FAILED", 3);
        FAILED = bVar4;
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
