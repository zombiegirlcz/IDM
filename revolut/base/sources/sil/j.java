package sil;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j REQUEST_USER_INFORMATION;

    static {
        j jVar = new j("REQUEST_USER_INFORMATION", 0);
        REQUEST_USER_INFORMATION = jVar;
        j[] jVarArr = {jVar};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
