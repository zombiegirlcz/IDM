package com.revolut.domain.models.wallet.account;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/wallet/account/JpBankNameCodes;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "JP_JPM", "JP_RAKUTEN", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JpBankNameCodes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JpBankNameCodes[] $VALUES;
    public static final JpBankNameCodes JP_JPM = new JpBankNameCodes("JP_JPM", 0);
    public static final JpBankNameCodes JP_RAKUTEN = new JpBankNameCodes("JP_RAKUTEN", 1);

    private static final /* synthetic */ JpBankNameCodes[] $values() {
        return new JpBankNameCodes[]{JP_JPM, JP_RAKUTEN};
    }

    static {
        JpBankNameCodes[] jpBankNameCodesArr$values = $values();
        $VALUES = jpBankNameCodesArr$values;
        $ENTRIES = s.n(jpBankNameCodesArr$values);
        INSTANCE = new Companion();
    }

    private JpBankNameCodes(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static JpBankNameCodes valueOf(String str) {
        return (JpBankNameCodes) Enum.valueOf(JpBankNameCodes.class, str);
    }

    public static JpBankNameCodes[] values() {
        return (JpBankNameCodes[]) $VALUES.clone();
    }
}
