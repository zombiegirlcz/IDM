package jjb;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    public static final c NORMAL;
    public static final c PAUSED;
    public static final c REJECTED;
    public static final c UNDER_REVIEW;

    static {
        c cVar = new c("REJECTED", 0);
        REJECTED = cVar;
        c cVar2 = new c("UNDER_REVIEW", 1);
        UNDER_REVIEW = cVar2;
        c cVar3 = new c("PAUSED", 2);
        PAUSED = cVar3;
        c cVar4 = new c("NORMAL", 3);
        NORMAL = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
