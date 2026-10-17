package iv0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FADE;
    public static final b NO_ANIMATION;
    public static final b SLIDE;

    static {
        b bVar = new b("NO_ANIMATION", 0);
        NO_ANIMATION = bVar;
        b bVar2 = new b("SLIDE", 1);
        SLIDE = bVar2;
        b bVar3 = new b("FADE", 2);
        FADE = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
