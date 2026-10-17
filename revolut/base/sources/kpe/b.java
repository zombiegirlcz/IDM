package kpe;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b ERROR;
    public static final b REVIEW;
    public static final b WARNING;

    static {
        b bVar = new b("REVIEW", 0);
        REVIEW = bVar;
        b bVar2 = new b("ACTIVE", 1);
        ACTIVE = bVar2;
        b bVar3 = new b("WARNING", 2);
        WARNING = bVar3;
        b bVar4 = new b("ERROR", 3);
        ERROR = bVar4;
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
