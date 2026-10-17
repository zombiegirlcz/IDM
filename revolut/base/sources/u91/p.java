package u91;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p AUTOMATIC;

    @NotNull
    public static final o Companion;
    public static final p INTERACTIVE;
    public static final p MANUAL;
    public static final p ONLINE;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f278374id;

    static {
        p pVar = new p("MANUAL", 0, "MANUAL");
        MANUAL = pVar;
        p pVar2 = new p("AUTOMATIC", 1, "AUTOMATIC");
        AUTOMATIC = pVar2;
        p pVar3 = new p("INTERACTIVE", 2, "INTERACTIVE");
        INTERACTIVE = pVar3;
        p pVar4 = new p("ONLINE", 3, "ONLINE");
        ONLINE = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
        Companion = new o();
    }

    public p(String str, int i, String str2) {
        this.f278374id = str2;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f278374id;
    }
}
