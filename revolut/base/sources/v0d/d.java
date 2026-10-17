package v0d;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d START_WITH_ADD_PARENT_PROMPT;
    public static final d START_WITH_CONTACT_CHOOSER;

    static {
        d dVar = new d("START_WITH_ADD_PARENT_PROMPT", 0);
        START_WITH_ADD_PARENT_PROMPT = dVar;
        d dVar2 = new d("START_WITH_CONTACT_CHOOSER", 1);
        START_WITH_CONTACT_CHOOSER = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
