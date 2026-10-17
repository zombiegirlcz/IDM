package c1b;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CREATE;
    public static final p PASTE_STUDY;
    public static final p PRICE_SCALE_CHANGED;
    public static final p REMOVE;

    @NotNull
    private final String eventType;

    static {
        p pVar = new p("CREATE", 0, "create");
        CREATE = pVar;
        p pVar2 = new p("REMOVE", 1, "remove");
        REMOVE = pVar2;
        p pVar3 = new p("PRICE_SCALE_CHANGED", 2, "price_scale_changed");
        PRICE_SCALE_CHANGED = pVar3;
        p pVar4 = new p("PASTE_STUDY", 3, "paste_study");
        PASTE_STUDY = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public p(String str, int i, String str2) {
        this.eventType = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final String b() {
        return this.eventType;
    }
}
