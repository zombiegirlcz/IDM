package nze;

import com.revolut.feature.topup_screen.impl.R$string;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOTH_LIMITS;
    public static final a MONTHLY_LIMIT;
    public static final a TRANSFER_LIMIT;
    private final int title;

    static {
        a aVar = new a("TRANSFER_LIMIT", 0, R$string.open_banking_mandate_topup_limit_exceeded_per_transfer);
        TRANSFER_LIMIT = aVar;
        a aVar2 = new a("MONTHLY_LIMIT", 1, R$string.open_banking_mandate_topup_limit_exceeded_per_month);
        MONTHLY_LIMIT = aVar2;
        a aVar3 = new a("BOTH_LIMITS", 2, R$string.open_banking_mandate_topup_limit_exceeded_both);
        BOTH_LIMITS = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.title = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.title;
    }
}
