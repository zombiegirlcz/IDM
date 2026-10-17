package dy0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEFAULT;
    public static final c KEEP_HIDDEN_IF_OVERLAY_BLUR_PRESENT;

    static {
        c cVar = new c("DEFAULT", 0);
        DEFAULT = cVar;
        c cVar2 = new c("KEEP_HIDDEN_IF_OVERLAY_BLUR_PRESENT", 1);
        KEEP_HIDDEN_IF_OVERLAY_BLUR_PRESENT = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
