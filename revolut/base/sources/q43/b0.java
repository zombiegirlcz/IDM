package q43;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 CRYPTO;
    public static final b0 FIAT;
    public static final b0 PERSONAL_VAULT;

    @NotNull
    private final String headerItemListId;

    @NotNull
    private final String tabId;

    static {
        b0 b0Var = new b0("FIAT", 0, "LIST_ID_FIAT_SECTION_HEADER", "tab_id_section_fiat");
        FIAT = b0Var;
        b0 b0Var2 = new b0("CRYPTO", 1, "LIST_ID_CRYPTO_SECTION_HEADER", "tab_id_section_crypto");
        CRYPTO = b0Var2;
        b0 b0Var3 = new b0("PERSONAL_VAULT", 2, "LIST_ID_PERSONAL_VAULT_SECTION_HEADER", "tab_id_section_personal_vault");
        PERSONAL_VAULT = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3};
        $VALUES = b0VarArr;
        $ENTRIES = vc.s.n(b0VarArr);
    }

    public b0(String str, int i, String str2, String str3) {
        this.headerItemListId = str2;
        this.tabId = str3;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }

    public final String a() {
        return this.headerItemListId;
    }

    public final String b() {
        return this.tabId;
    }
}
