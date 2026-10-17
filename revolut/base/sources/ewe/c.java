package ewe;

import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AUTO_TOP_UP;
    public static final c CREDIT_REPAYMENT;
    public static final c DEFAULT;
    private final int message;
    private final int title;

    static {
        c cVar = new c("CREDIT_REPAYMENT", 0, R$string.credit_delete_repayment_card_forbidden_message_title, R$string.credit_delete_repayment_card_forbidden_message_subtitle);
        CREDIT_REPAYMENT = cVar;
        c cVar2 = new c("AUTO_TOP_UP", 1, R.string.bank_details_delete_confirmation_dialog_title, R.string.bank_details_delete_confirmation_dialog_message_w_autotopup);
        AUTO_TOP_UP = cVar2;
        c cVar3 = new c("DEFAULT", 2, R.string.bank_details_delete_confirmation_dialog_title, R.string.bank_details_delete_confirmation_dialog_message);
        DEFAULT = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, int i2, int i3) {
        this.title = i2;
        this.message = i3;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int a() {
        return this.message;
    }

    public final int b() {
        return this.title;
    }
}
