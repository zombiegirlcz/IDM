package adb;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.private_banking.impl.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CRYPTO;
    public static final d MONEY;
    public static final d TRADING;
    private final int descriptionResId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f3313id;
    private final int imageResId;
    private final int titleResId;

    static {
        d dVar = new d(0, R$string.private_banking_deposit_assets_add_money_title, R$string.private_banking_deposit_assets_add_money_description, R$drawable.uikit_icn_24_plus, "MONEY", "MONEY_ITEM_ID");
        MONEY = dVar;
        d dVar2 = new d(1, R$string.private_banking_deposit_assets_transfer_stocks_title, R$string.private_banking_deposit_assets_transfer_stocks_description, R$drawable.uikit_icn_24_wealth, "TRADING", "TRADING_ITEM_ID");
        TRADING = dVar2;
        d dVar3 = new d(2, R$string.private_banking_deposit_assets_deposit_crypto_title, R$string.private_banking_deposit_assets_deposit_crypto_description, R$drawable.uikit_icn_24_bitcoin, "CRYPTO", "CRYPTO_ITEM_ID");
        CRYPTO = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(int i, int i2, int i3, int i5, String str, String str2) {
        this.f3313id = str2;
        this.titleResId = i2;
        this.descriptionResId = i3;
        this.imageResId = i5;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int a() {
        return this.descriptionResId;
    }

    public final int b() {
        return this.imageResId;
    }

    public final int c() {
        return this.titleResId;
    }

    public final String getId() {
        return this.f3313id;
    }
}
