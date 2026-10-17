package vuc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.security_hub.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m MERCHANTS;
    public static final m WALLETS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f292328id;

    @NotNull
    private final Clause title;

    static {
        m mVar = new m(0, new TextLocalisedClause(R$string.security_hub_home_card_connections_tab_wallets, null, null, 14), "WALLETS", "WALLETS");
        WALLETS = mVar;
        m mVar2 = new m(1, new TextLocalisedClause(R$string.security_hub_home_card_connections_tab_merchants, null, null, 14), "MERCHANTS", "MERCHANTS");
        MERCHANTS = mVar2;
        m[] mVarArr = {mVar, mVar2};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public m(int i, TextLocalisedClause textLocalisedClause, String str, String str2) {
        this.f292328id = str2;
        this.title = textLocalisedClause;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final Clause b() {
        return this.title;
    }

    public final String getId() {
        return this.f292328id;
    }
}
