package sil;

import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ANNUALLY;

    @NotNull
    public static final b Companion;
    public static final c DAILY;

    @NotNull
    private static final List<c> JUST_ANNUAL_FREQUENCY;
    public static final c MONTHLY;
    public static final c ONE_TIME;
    public static final c WEEKLY;

    static {
        c cVar = new c("ONE_TIME", 0);
        ONE_TIME = cVar;
        c cVar2 = new c("DAILY", 1);
        DAILY = cVar2;
        c cVar3 = new c("WEEKLY", 2);
        WEEKLY = cVar3;
        c cVar4 = new c("MONTHLY", 3);
        MONTHLY = cVar4;
        c cVar5 = new c("ANNUALLY", 4);
        ANNUALLY = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
        JUST_ANNUAL_FREQUENCY = u.c(cVar5);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
