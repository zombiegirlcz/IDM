package fva;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BOLETO;
    public static final l BPAY;
    public static final l DE;
    public static final l NPP;
    public static final l NZ_BECS;
    public static final l PIX;

    static {
        l lVar = new l("PIX", 0);
        PIX = lVar;
        l lVar2 = new l("DE", 1);
        DE = lVar2;
        l lVar3 = new l("BPAY", 2);
        BPAY = lVar3;
        l lVar4 = new l("NPP", 3);
        NPP = lVar4;
        l lVar5 = new l("BOLETO", 4);
        BOLETO = lVar5;
        l lVar6 = new l("NZ_BECS", 5);
        NZ_BECS = lVar6;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
