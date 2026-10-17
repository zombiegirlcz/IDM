package oo0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ABSENT;
    public static final a ERROR;
    public static final a LOADING;
    public static final a PAUSED;
    public static final a PLAYING;

    static {
        a aVar = new a("ABSENT", 0);
        ABSENT = aVar;
        a aVar2 = new a("LOADING", 1);
        LOADING = aVar2;
        a aVar3 = new a("PLAYING", 2);
        PLAYING = aVar3;
        a aVar4 = new a("PAUSED", 3);
        PAUSED = aVar4;
        a aVar5 = new a("ERROR", 4);
        ERROR = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
