package ts5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_feed.impl.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CryptoCard;
    public static final a Earn;
    public static final a Futures;
    public static final a Learn;
    public static final a RevolutX;
    public static final a Strategies;
    private final int drawableRes;

    @NotNull
    private final Clause subtitle;

    @NotNull
    private final Clause title;

    static {
        a aVar = new a("Earn", 0, R$drawable.uikit_icn_24_percent, new TextLocalisedClause(R$string.crypto_home_widget_features_staking_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_widget_features_staking_subtitle_generic, null, null, 14));
        Earn = aVar;
        a aVar2 = new a("RevolutX", 1, R$drawable.uikit_icn_24_candlestick_chart, new TextLocalisedClause(R$string.crypto_home_widget_features_rev_x_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_widget_features_rev_x_subtitle, null, null, 14));
        RevolutX = aVar2;
        a aVar3 = new a("Futures", 2, R$drawable.uikit_icn_24_cfd, new TextLocalisedClause(R$string.crypto_home_widget_features_futures_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_widget_features_futures_subtitle, null, null, 14));
        Futures = aVar3;
        a aVar4 = new a("Learn", 3, R$drawable.uikit_icn_24_lightbulb, new TextLocalisedClause(R$string.crypto_home_widget_features_learn_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_widget_features_learn_subtitle, null, null, 14));
        Learn = aVar4;
        a aVar5 = new a("Strategies", 4, R$drawable.uikit_icn_24_calendar_recurring, new TextLocalisedClause(R$string.crypto_home_widget_features_strategies_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_widget_features_strategies_subtitle, null, null, 14));
        Strategies = aVar5;
        a aVar6 = new a("CryptoCard", 5, R$drawable.uikit_icn_24_card, new TextLocalisedClause(R$string.crypto_home_widget_features_card_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_widget_features_card_subtitle, null, null, 14));
        CryptoCard = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        this.drawableRes = i2;
        this.title = textLocalisedClause;
        this.subtitle = textLocalisedClause2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.drawableRes;
    }

    public final Clause b() {
        return this.subtitle;
    }

    public final Clause c() {
        return this.title;
    }
}
