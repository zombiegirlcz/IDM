package j30;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CMS_STORIES;
    public static final a MANDATORY_STORIES;
    public static final a VIDEO;

    static {
        a aVar = new a("MANDATORY_STORIES", 0);
        MANDATORY_STORIES = aVar;
        a aVar2 = new a("CMS_STORIES", 1);
        CMS_STORIES = aVar2;
        a aVar3 = new a("VIDEO", 2);
        VIDEO = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
