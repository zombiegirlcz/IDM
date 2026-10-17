package kdj;

import com.revolut.retail.feature.cryptocommoditydetails.impl.R$string;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CENTRAL_BANK_OPERATIONS;
    public static final b FABRICATION_DEMAND;
    public static final b INVESTMENT_DEMAND;
    public static final b MINE_SUPPLY;
    public static final b PRICE_FORECAST;
    public static final b SECONDARY_SUPPLY;
    private final int descriptionResId;
    private final int index;
    private final int titleResId;

    static {
        b bVar = new b("MINE_SUPPLY", 0, 0, R$string.commodity_price_targets_faq_mine_supply_title, R$string.commodity_price_targets_faq_mine_supply_description);
        MINE_SUPPLY = bVar;
        b bVar2 = new b("SECONDARY_SUPPLY", 1, 1, R$string.commodity_price_targets_faq_secondary_supply_title, R$string.commodity_price_targets_faq_secondary_supply_description);
        SECONDARY_SUPPLY = bVar2;
        b bVar3 = new b("CENTRAL_BANK_OPERATIONS", 2, 2, R$string.commodity_price_targets_faq_bank_operations_title, R$string.commodity_price_targets_faq_bank_operations_description);
        CENTRAL_BANK_OPERATIONS = bVar3;
        b bVar4 = new b("FABRICATION_DEMAND", 3, 3, R$string.commodity_price_targets_faq_fabrication_demand_title, R$string.commodity_price_targets_faq_fabrication_demand_description);
        FABRICATION_DEMAND = bVar4;
        b bVar5 = new b("INVESTMENT_DEMAND", 4, 4, R$string.commodity_price_targets_faq_investment_demand_title, R$string.commodity_price_targets_faq_investment_demand_description);
        INVESTMENT_DEMAND = bVar5;
        b bVar6 = new b("PRICE_FORECAST", 5, 5, R$string.commodity_price_targets_faq_price_forecast_title, R$string.commodity_price_targets_faq_price_forecast_description);
        PRICE_FORECAST = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, int i2, int i3, int i5) {
        this.index = i2;
        this.titleResId = i3;
        this.descriptionResId = i5;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.descriptionResId;
    }

    public final int b() {
        return this.index;
    }

    public final int c() {
        return this.titleResId;
    }
}
