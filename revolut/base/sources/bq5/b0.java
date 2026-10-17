package bq5;

import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 CREATION;
    public static final b0 EDIT_LABEL;
    public static final b0 SUBMIT_DEPOSITED_COUNTERPARTY_DETAILS;
    public static final b0 SUBMIT_RECIPIENT_DETAILS;

    @NotNull
    private final Set<c0> fields;

    static {
        c0 c0Var = c0.LABEL;
        b0 b0Var = new b0("EDIT_LABEL", zhm.y0.b(c0Var), 0);
        EDIT_LABEL = b0Var;
        c0 c0Var2 = c0.HOSTING_DROPDOWN;
        c0 c0Var3 = c0.RECIPIENT_DETAILS_DROPDOWN;
        c0 c0Var4 = c0.NAME;
        c0 c0Var5 = c0.SURNAME;
        c0 c0Var6 = c0.COMPANY_NAME;
        c0[] elements = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6};
        Intrinsics.checkNotNullParameter(elements, "elements");
        b0 b0Var2 = new b0("SUBMIT_RECIPIENT_DETAILS", kotlin.collections.d.y0(elements), 1);
        SUBMIT_RECIPIENT_DETAILS = b0Var2;
        c0[] elements2 = {c0Var2, c0Var3, c0Var6, c0Var4, c0Var5, c0.BUSINESS_REGISTRATION_NUMBER};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        b0 b0Var3 = new b0("SUBMIT_DEPOSITED_COUNTERPARTY_DETAILS", kotlin.collections.d.y0(elements2), 2);
        SUBMIT_DEPOSITED_COUNTERPARTY_DETAILS = b0Var3;
        b0 b0Var4 = new b0("CREATION", zhm.h0.f322473a, 3);
        CREATION = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        $VALUES = b0VarArr;
        $ENTRIES = vc.s.n(b0VarArr);
    }

    public b0(String str, Set set, int i) {
        this.fields = set;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }

    public final boolean a(c0 field) {
        Intrinsics.checkNotNullParameter(field, "field");
        return this.fields.isEmpty() || this.fields.contains(field);
    }
}
