package qtc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CARD_ON_FILE;
    public static final c CONTACTLESS_CHIP;
    public static final c EXISTING_TOKEN;
    public static final c ISSUER_APP;
    public static final c KEY_ENTERED;
    public static final c OTHER;

    static {
        c cVar = new c("KEY_ENTERED", 0);
        KEY_ENTERED = cVar;
        c cVar2 = new c("CARD_ON_FILE", 1);
        CARD_ON_FILE = cVar2;
        c cVar3 = new c("ISSUER_APP", 2);
        ISSUER_APP = cVar3;
        c cVar4 = new c("CONTACTLESS_CHIP", 3);
        CONTACTLESS_CHIP = cVar4;
        c cVar5 = new c("EXISTING_TOKEN", 4);
        EXISTING_TOKEN = cVar5;
        c cVar6 = new c("OTHER", 5);
        OTHER = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
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
