package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class zu {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ zu[] $VALUES;
    public static final zu DEFAULT;
    public static final zu ON_MEDIA_STATIC;

    static {
        zu zuVar = new zu("DEFAULT", 0);
        DEFAULT = zuVar;
        zu zuVar2 = new zu("ON_MEDIA_STATIC", 1);
        ON_MEDIA_STATIC = zuVar2;
        zu[] zuVarArr = {zuVar, zuVar2};
        $VALUES = zuVarArr;
        $ENTRIES = vc.s.n(zuVarArr);
    }

    public static zu valueOf(String str) {
        return (zu) Enum.valueOf(zu.class, str);
    }

    public static zu[] values() {
        return (zu[]) $VALUES.clone();
    }
}
