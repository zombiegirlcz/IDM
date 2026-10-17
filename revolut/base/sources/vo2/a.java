package vo2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTION_NEEDED;
    public static final a DONE;
    public static final a FAILED;
    public static final a PENDING;
    public static final a SUCCESS;
    private final boolean active;

    static {
        a aVar = new a("PENDING", 0, true);
        PENDING = aVar;
        a aVar2 = new a("SUCCESS", 1, true);
        SUCCESS = aVar2;
        a aVar3 = new a("ACTION_NEEDED", 2, true);
        ACTION_NEEDED = aVar3;
        a aVar4 = new a("DONE", 3, false);
        DONE = aVar4;
        a aVar5 = new a("FAILED", 4, false);
        FAILED = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, boolean z) {
        this.active = z;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.active;
    }
}
