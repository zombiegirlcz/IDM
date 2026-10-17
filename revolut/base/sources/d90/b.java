package d90;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CREATED;
    public static final b FAILED;
    public static final b STARTED;
    public static final b STOPPED;

    static {
        b bVar = new b("CREATED", 0);
        CREATED = bVar;
        b bVar2 = new b("STARTED", 1);
        STARTED = bVar2;
        b bVar3 = new b("STOPPED", 2);
        STOPPED = bVar3;
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
