package nt9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.payments.groups.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h FAMILY;
    public static final h HOLIDAYS;
    public static final h HOME;
    public static final h PARTY;

    @NotNull
    private final RetailBackgroundKey.SplitBillGroupCreation backgroundKey;

    @NotNull
    private final Clause clause;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f219003id;

    static {
        h hVar = new h("HOLIDAYS", 0, "HOLIDAYS", new TextLocalisedClause(R$string.groups_suggestion_name_holidays, null, null, 14), new RetailBackgroundKey.SplitBillGroupCreation("suggestionHolidays", null, null));
        HOLIDAYS = hVar;
        h hVar2 = new h("HOME", 1, "HOME", new TextLocalisedClause(R$string.payments_groups_customisation_suggestion_home, null, null, 14), new RetailBackgroundKey.SplitBillGroupCreation("suggestionHome", null, null));
        HOME = hVar2;
        h hVar3 = new h("PARTY", 2, "PARTY", new TextLocalisedClause(R$string.payments_groups_customisation_suggestion_party, null, null, 14), new RetailBackgroundKey.SplitBillGroupCreation("suggestionParty", null, null));
        PARTY = hVar3;
        h hVar4 = new h("FAMILY", 3, "FAMILY", new TextLocalisedClause(R$string.payments_groups_customisation_suggestion_family, null, null, 14), new RetailBackgroundKey.SplitBillGroupCreation("suggestionFamily", null, null));
        FAMILY = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public h(String str, int i, String str2, TextLocalisedClause textLocalisedClause, RetailBackgroundKey.SplitBillGroupCreation splitBillGroupCreation) {
        this.f219003id = str2;
        this.clause = textLocalisedClause;
        this.backgroundKey = splitBillGroupCreation;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final RetailBackgroundKey.SplitBillGroupCreation a() {
        return this.backgroundKey;
    }

    public final Clause b() {
        return this.clause;
    }

    public final String getId() {
        return this.f219003id;
    }
}
