package u91;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g COMPLETED;

    @NotNull
    public static final f Companion;
    public static final g INTRO;
    public static final g IN_PROGRESS;
    public static final g SUBMITTED;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f278353id;

    static {
        g gVar = new g("INTRO", 0, "INTRO");
        INTRO = gVar;
        g gVar2 = new g("IN_PROGRESS", 1, "IN_PROGRESS");
        IN_PROGRESS = gVar2;
        g gVar3 = new g("SUBMITTED", 2, "SUBMITTED");
        SUBMITTED = gVar3;
        g gVar4 = new g("COMPLETED", 3, "COMPLETED");
        COMPLETED = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
        Companion = new f();
    }

    public g(String str, int i, String str2) {
        this.f278353id = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f278353id;
    }
}
