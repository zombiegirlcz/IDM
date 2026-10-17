package ht3;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class l implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BACKGROUND_MEDIA_CONTENT;
    public static final l FULLSCREEN_MEDIA_CONTENT;
    public static final l MEDIA_CONTENT;

    static {
        l lVar = new l("MEDIA_CONTENT", 0);
        MEDIA_CONTENT = lVar;
        l lVar2 = new l("BACKGROUND_MEDIA_CONTENT", 1);
        BACKGROUND_MEDIA_CONTENT = lVar2;
        l lVar3 = new l("FULLSCREEN_MEDIA_CONTENT", 2);
        FULLSCREEN_MEDIA_CONTENT = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
