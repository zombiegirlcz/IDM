package ld6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.entity.provider.models.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b REVOLUT_BANK;
    public static final b REVOLUT_BANK_COLOMBIA;
    public static final b REVOLUT_GLOBAL_DIGITAL_ASSETS;
    public static final b REVOLUT_LTD;
    public static final b REVOLUT_SECURITIES_SINGAPORE;
    public static final b REVOLUT_TECHNOLOGIES_SINGAPORE;
    private final Clause description;

    @NotNull
    private final Clause legalName;

    static {
        b bVar = new b(0, new TextLocalisedClause(R$string.legal_entity_name_revolut_ltd, null, null, 14), new TextLocalisedClause(R$string.legal_entity_description_revolut_ltd, null, null, 14), "REVOLUT_LTD");
        REVOLUT_LTD = bVar;
        b bVar2 = new b(1, new TextLocalisedClause(R$string.legal_entity_name_revolut_bank, null, null, 14), null, "REVOLUT_BANK");
        REVOLUT_BANK = bVar2;
        b bVar3 = new b(2, new TextLocalisedClause(R$string.legal_entity_name_revolut_bank_colombia, null, null, 14), null, "REVOLUT_BANK_COLOMBIA");
        REVOLUT_BANK_COLOMBIA = bVar3;
        b bVar4 = new b(3, new TextLocalisedClause(R$string.legal_entity_name_revolut_technologies_singapore, null, null, 14), null, "REVOLUT_TECHNOLOGIES_SINGAPORE");
        REVOLUT_TECHNOLOGIES_SINGAPORE = bVar4;
        b bVar5 = new b(4, new TextLocalisedClause(R$string.legal_entity_name_revolut_securities_singapore, null, null, 14), null, "REVOLUT_SECURITIES_SINGAPORE");
        REVOLUT_SECURITIES_SINGAPORE = bVar5;
        b bVar6 = new b(5, new TextLocalisedClause(R$string.legal_entity_name_revolut_global_digital_assets_ltd, null, null, 14), null, "REVOLUT_GLOBAL_DIGITAL_ASSETS");
        REVOLUT_GLOBAL_DIGITAL_ASSETS = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, String str) {
        this.legalName = textLocalisedClause;
        this.description = textLocalisedClause2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final Clause a() {
        return this.description;
    }

    public final TextLocalisedClause b() {
        return new TextLocalisedClause(R$string.legal_entity_offered_by, u.c(this.legalName), null, 12);
    }

    public final Clause c() {
        return this.legalName;
    }
}
