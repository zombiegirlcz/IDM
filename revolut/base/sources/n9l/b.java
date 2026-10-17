package n9l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SEC_1;
    public static final b SEC_10;
    public static final b SEC_3;
    public static final b SEC_30;
    public static final b SEC_60;
    private final long value;

    static {
        b bVar = new b("SEC_1", 0, 1L);
        SEC_1 = bVar;
        b bVar2 = new b("SEC_3", 1, 3L);
        SEC_3 = bVar2;
        b bVar3 = new b("SEC_10", 2, 10L);
        SEC_10 = bVar3;
        b bVar4 = new b("SEC_30", 3, 30L);
        SEC_30 = bVar4;
        b bVar5 = new b("SEC_60", 4, 60L);
        SEC_60 = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, long j2) {
        this.value = j2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final long a() {
        return this.value;
    }
}
