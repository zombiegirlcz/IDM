package uhf;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CANCEL_TRANSFER_LINK;

    @NotNull
    public static final b Companion;
    public static final c EXCLUDE_FROM_ANALYTICS;
    public static final c HIDE;
    public static final c INCLUDE_IN_ANALYTICS;
    public static final c LOAN;
    public static final c OPEN_SPLIT_BILL;
    public static final c SHARE_PAYMENT_LINK;
    public static final c UNHIDE;

    static {
        c cVar = new c("SHARE_PAYMENT_LINK", 0);
        SHARE_PAYMENT_LINK = cVar;
        c cVar2 = new c("OPEN_SPLIT_BILL", 1);
        OPEN_SPLIT_BILL = cVar2;
        c cVar3 = new c("CANCEL_TRANSFER_LINK", 2);
        CANCEL_TRANSFER_LINK = cVar3;
        c cVar4 = new c("LOAN", 3);
        LOAN = cVar4;
        c cVar5 = new c("HIDE", 4);
        HIDE = cVar5;
        c cVar6 = new c("UNHIDE", 5);
        UNHIDE = cVar6;
        c cVar7 = new c("EXCLUDE_FROM_ANALYTICS", 6);
        EXCLUDE_FROM_ANALYTICS = cVar7;
        c cVar8 = new c("INCLUDE_IN_ANALYTICS", 7);
        INCLUDE_IN_ANALYTICS = cVar8;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
