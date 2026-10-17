package qem;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final h FRIDAY;
    public static final h MONDAY;
    public static final h SATURDAY;
    public static final h SUNDAY;
    public static final h THURSDAY;
    public static final h TUESDAY;
    public static final h WEDNESDAY;

    @NotNull
    private final String value;

    static {
        h hVar = new h("MONDAY", 0, "Mon");
        MONDAY = hVar;
        h hVar2 = new h("TUESDAY", 1, "Tue");
        TUESDAY = hVar2;
        h hVar3 = new h("WEDNESDAY", 2, "Wed");
        WEDNESDAY = hVar3;
        h hVar4 = new h("THURSDAY", 3, "Thu");
        THURSDAY = hVar4;
        h hVar5 = new h("FRIDAY", 4, "Fri");
        FRIDAY = hVar5;
        h hVar6 = new h("SATURDAY", 5, "Sat");
        SATURDAY = hVar6;
        h hVar7 = new h("SUNDAY", 6, "Sun");
        SUNDAY = hVar7;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
    }

    public h(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
