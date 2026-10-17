package x15;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE_PRODUCT;
    public static final b APPLICATION;
    public static final b CLOSED_PRODUCT;
    public static final b DISCOVER;
    public static final b UNKNOWN;
    private final int rank;

    static {
        b bVar = new b("ACTIVE_PRODUCT", 0, 0);
        ACTIVE_PRODUCT = bVar;
        b bVar2 = new b("APPLICATION", 1, 1);
        APPLICATION = bVar2;
        b bVar3 = new b("DISCOVER", 2, 2);
        DISCOVER = bVar3;
        b bVar4 = new b("UNKNOWN", 3, 3);
        UNKNOWN = bVar4;
        b bVar5 = new b("CLOSED_PRODUCT", 4, 4);
        CLOSED_PRODUCT = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public b(String str, int i, int i2) {
        this.rank = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.rank;
    }
}
