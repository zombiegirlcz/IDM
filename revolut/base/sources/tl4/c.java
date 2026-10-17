package tl4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FOREGROUND;
    public static final c GREY_TONE_50;
    public static final c STATUS_DANGER;
    public static final c STATUS_SUCCESS;
    public static final c STATUS_WARNING;

    static {
        c cVar = new c("GREY_TONE_50", 0);
        GREY_TONE_50 = cVar;
        c cVar2 = new c("FOREGROUND", 1);
        FOREGROUND = cVar2;
        c cVar3 = new c("STATUS_SUCCESS", 2);
        STATUS_SUCCESS = cVar3;
        c cVar4 = new c("STATUS_WARNING", 3);
        STATUS_WARNING = cVar4;
        c cVar5 = new c("STATUS_DANGER", 4);
        STATUS_DANGER = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
