package g99;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l COMPLETION;
    public static final l INTRO;
    public static final l LOOP;

    @NotNull
    private final String markerName;

    static {
        l lVar = new l("INTRO", 0, "intro");
        INTRO = lVar;
        l lVar2 = new l("LOOP", 1, "loop");
        LOOP = lVar2;
        l lVar3 = new l("COMPLETION", 2, "completion");
        COMPLETION = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public l(String str, int i, String str2) {
        this.markerName = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final String a() {
        return this.markerName;
    }
}
