package ir6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f INVOICE;
    public static final f PAYMENT_LINK;
    public static final f SHOPIFY;

    static {
        f fVar = new f("INVOICE", 0);
        INVOICE = fVar;
        f fVar2 = new f("PAYMENT_LINK", 1);
        PAYMENT_LINK = fVar2;
        f fVar3 = new f("SHOPIFY", 2);
        SHOPIFY = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
