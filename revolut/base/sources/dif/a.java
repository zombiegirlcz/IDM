package dif;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a InitialVersion;
    public static final a Version1;
    public static final a Version2;
    private final long value;

    static {
        a aVar = new a("InitialVersion", 0, 0L);
        InitialVersion = aVar;
        a aVar2 = new a("Version1", 1, 1L);
        Version1 = aVar2;
        a aVar3 = new a("Version2", 2, 2L);
        Version2 = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, long j2) {
        this.value = j2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final long a() {
        return this.value;
    }
}
