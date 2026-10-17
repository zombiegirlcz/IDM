package a94;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c JOINT;
    public static final c SOLE;
    private final int icon;
    private final int title;

    @NotNull
    private final qu3.f type;

    static {
        c cVar = new c("SOLE", 0, qu3.f.SOLE, R$string.credit_application_outstanding_debts_debt_details_dialog_loan_type_sole, R$drawable.uikit_icn_24_profile);
        SOLE = cVar;
        c cVar2 = new c("JOINT", 1, qu3.f.JOINT, R$string.credit_application_outstanding_debts_debt_details_dialog_loan_type_joint, R$drawable.uikit_icn_24_people);
        JOINT = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, qu3.f fVar, int i2, int i3) {
        this.type = fVar;
        this.title = i2;
        this.icon = i3;
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

    public final int b() {
        return this.icon;
    }

    public final int c() {
        return this.title;
    }
}
