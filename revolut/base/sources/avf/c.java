package avf;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ADDRESS;

    @NotNull
    public static final b Companion;
    public static final c DATE_BIRTH;
    public static final c DATE_PICKER;
    public static final c DATE_TIME_PICKER;
    public static final c DROPDOWN;
    public static final c TEXT;

    @NotNull
    private final String value;

    static {
        c cVar = new c("TEXT", 0, "TEXT");
        TEXT = cVar;
        c cVar2 = new c("DROPDOWN", 1, "TEXT_ENUM");
        DROPDOWN = cVar2;
        c cVar3 = new c("DATE_PICKER", 2, "DATE");
        DATE_PICKER = cVar3;
        c cVar4 = new c("DATE_TIME_PICKER", 3, "DATE_TIME");
        DATE_TIME_PICKER = cVar4;
        c cVar5 = new c("DATE_BIRTH", 4, "DATE_BIRTH");
        DATE_BIRTH = cVar5;
        c cVar6 = new c("ADDRESS", 5, "ADDRESS");
        ADDRESS = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
    }

    public c(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
