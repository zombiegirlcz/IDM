package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class ua {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ua[] $VALUES;
    public static final ua Body3;
    public static final ua Emphasis1;

    static {
        ua uaVar = new ua("Body3", 0);
        Body3 = uaVar;
        ua uaVar2 = new ua("Emphasis1", 1);
        Emphasis1 = uaVar2;
        ua[] uaVarArr = {uaVar, uaVar2};
        $VALUES = uaVarArr;
        $ENTRIES = vc.s.n(uaVarArr);
    }

    public static ua valueOf(String str) {
        return (ua) Enum.valueOf(ua.class, str);
    }

    public static ua[] values() {
        return (ua[]) $VALUES.clone();
    }
}
