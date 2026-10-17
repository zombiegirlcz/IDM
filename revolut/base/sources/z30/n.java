package z30;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ASSETS;

    @NotNull
    public static final m Companion;
    public static final n DEFAULT;
    public static final n EMOJI;
    public static final n STARS;
    private final String key;

    static {
        n nVar = new n("DEFAULT", 0, null);
        DEFAULT = nVar;
        n nVar2 = new n("EMOJI", 1, "Emoji");
        EMOJI = nVar2;
        n nVar3 = new n("ASSETS", 2, "Assets");
        ASSETS = nVar3;
        n nVar4 = new n("STARS", 3, "Stars");
        STARS = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
        Companion = new m();
    }

    public n(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
