package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class iq {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ iq[] $VALUES;
    public static final iq CHECK_BUTTON;
    public static final iq RADIO_BUTTON;

    static {
        iq iqVar = new iq("CHECK_BUTTON", 0);
        CHECK_BUTTON = iqVar;
        iq iqVar2 = new iq("RADIO_BUTTON", 1);
        RADIO_BUTTON = iqVar2;
        iq[] iqVarArr = {iqVar, iqVar2};
        $VALUES = iqVarArr;
        $ENTRIES = vc.s.n(iqVarArr);
    }

    public static iq valueOf(String str) {
        return (iq) Enum.valueOf(iq.class, str);
    }

    public static iq[] values() {
        return (iq[]) $VALUES.clone();
    }
}
