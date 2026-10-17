package a94;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CREDIT_CARD;
    public static final b LOAN;
    public static final b MORTGAGE;
    public static final b OTHER;
    private final int description;
    private final int icon;
    private final int title;

    @NotNull
    private final List<pu3.d> types;

    static {
        b bVar = new b("MORTGAGE", 0, u.c(pu3.d.MORTGAGE), R$string.credit_application_outstanding_debts_add_debt_dialog_mortgage_title, R$string.credit_application_outstanding_debts_add_debt_dialog_mortgage_subtitle, R$drawable.uikit_icn_24_mortgage);
        MORTGAGE = bVar;
        b bVar2 = new b("LOAN", 1, u.c(pu3.d.LOAN), R$string.credit_application_outstanding_debts_add_debt_dialog_loan_title, R$string.credit_application_outstanding_debts_add_debt_dialog_loan_subtitle, R$drawable.uikit_icn_24_credit);
        LOAN = bVar2;
        b bVar3 = new b("CREDIT_CARD", 2, u.c(pu3.d.CREDIT_CARD), R$string.credit_application_outstanding_debts_add_debt_dialog_credit_card_title, R$string.credit_application_outstanding_debts_add_debt_dialog_credit_card_subtitle, R$drawable.uikit_icn_24_credit_card);
        CREDIT_CARD = bVar3;
        b bVar4 = new b("OTHER", 3, v.k(pu3.d.BNPL, pu3.d.LINE_OF_CREDIT, pu3.d.OVERDRAFT), R$string.credit_application_outstanding_debts_add_debt_dialog_other_title, R$string.credit_application_outstanding_debts_add_debt_dialog_other_subtitle, R$drawable.uikit_icn_24_credit_bag);
        OTHER = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, List list, int i2, int i3, int i5) {
        this.types = list;
        this.title = i2;
        this.description = i3;
        this.icon = i5;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.description;
    }

    public final int c() {
        return this.icon;
    }

    public final int d() {
        return this.title;
    }

    public final List e() {
        return this.types;
    }
}
