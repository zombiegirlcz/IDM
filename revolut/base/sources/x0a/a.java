package x0a;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CHAT;
    public static final a PAYMENT_OVERVIEW_BUTTON;
    public static final a TRANSACTION_DETAILS;
    public static final a WIDGET;

    @NotNull
    private final String value;

    static {
        a aVar = new a("PAYMENT_OVERVIEW_BUTTON", 0, "PaymentOverviewButton");
        PAYMENT_OVERVIEW_BUTTON = aVar;
        a aVar2 = new a("TRANSACTION_DETAILS", 1, "TransactionDetails");
        TRANSACTION_DETAILS = aVar2;
        a aVar3 = new a("CHAT", 2, "Chat");
        CHAT = aVar3;
        a aVar4 = new a("WIDGET", 3, "Widget");
        WIDGET = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
}
