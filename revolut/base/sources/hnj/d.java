package hnj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CONTINUE_WITH_REFUND;
    public static final d NO_BUTTON;
    public static final d PROCEED_WITH_CANCELLATION;

    static {
        d dVar = new d("CONTINUE_WITH_REFUND", 0);
        CONTINUE_WITH_REFUND = dVar;
        d dVar2 = new d("PROCEED_WITH_CANCELLATION", 1);
        PROCEED_WITH_CANCELLATION = dVar2;
        d dVar3 = new d("NO_BUTTON", 2);
        NO_BUTTON = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
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
