package lw0;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n AI_SEARCH;
    public static final n REGULAR_SEARCH;
    private final int iconRes;

    static {
        n nVar = new n("REGULAR_SEARCH", 0, R$drawable.uikit_icn_24_search);
        REGULAR_SEARCH = nVar;
        n nVar2 = new n("AI_SEARCH", 1, R$drawable.uikit_icn_24_ai_search);
        AI_SEARCH = nVar2;
        n[] nVarArr = {nVar, nVar2};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public n(String str, int i, int i2) {
        this.iconRes = i2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final int a() {
        return this.iconRes;
    }
}
