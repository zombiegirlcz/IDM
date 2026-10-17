package zb7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BAD;

    @NotNull
    public static final b Companion;
    public static final c GOOD;
    public static final c GREAT;
    public static final c OK;
    public static final c TERRIBLE;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    @NotNull
    private final String f320833tag;

    static {
        c cVar = new c("OK", 0, "OK");
        OK = cVar;
        c cVar2 = new c("GOOD", 1, "Good");
        GOOD = cVar2;
        c cVar3 = new c("GREAT", 2, "Great");
        GREAT = cVar3;
        c cVar4 = new c("BAD", 3, "Bad");
        BAD = cVar4;
        c cVar5 = new c("TERRIBLE", 4, "Terrible");
        TERRIBLE = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
    }

    public c(String str, int i, String str2) {
        this.f320833tag = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.f320833tag;
    }
}
