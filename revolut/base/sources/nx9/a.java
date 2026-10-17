package nx9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a GROUP_BILL;
    public static final a GROUP_SETTLEMENT;
    public static final a MESSAGE;
    public static final a MONEY_REQUEST;
    public static final a NEW_CONTACT;
    public static final a NEW_GROUP;
    public static final a PAYMENT_LINK;
    public static final a TRANSACTION;

    @NotNull
    private final String value;

    static {
        a aVar = new a("TRANSACTION", 0, "TRANSACTION");
        TRANSACTION = aVar;
        a aVar2 = new a("MONEY_REQUEST", 1, "MONEY_REQUEST");
        MONEY_REQUEST = aVar2;
        a aVar3 = new a("PAYMENT_LINK", 2, "PAYMENT_LINK");
        PAYMENT_LINK = aVar3;
        a aVar4 = new a("MESSAGE", 3, "MESSAGE");
        MESSAGE = aVar4;
        a aVar5 = new a("GROUP_BILL", 4, "GROUP_BILL");
        GROUP_BILL = aVar5;
        a aVar6 = new a("GROUP_SETTLEMENT", 5, "GROUP_SETTLEMENT");
        GROUP_SETTLEMENT = aVar6;
        a aVar7 = new a("NEW_GROUP", 6, "NEW_GROUP");
        NEW_GROUP = aVar7;
        a aVar8 = new a("NEW_CONTACT", 7, "NEW_CONTACT");
        NEW_CONTACT = aVar8;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
