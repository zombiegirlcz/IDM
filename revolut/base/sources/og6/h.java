package og6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h JSR_LINKED_ACCOUNT;
    public static final h PAYMENT;
    public static final h PIX_AUTOMATICO;

    static {
        h hVar = new h("PAYMENT", 0);
        PAYMENT = hVar;
        h hVar2 = new h("PIX_AUTOMATICO", 1);
        PIX_AUTOMATICO = hVar2;
        h hVar3 = new h("JSR_LINKED_ACCOUNT", 2);
        JSR_LINKED_ACCOUNT = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
