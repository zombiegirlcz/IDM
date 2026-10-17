package vb2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.payto.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h BANK_DETAILS;
    public static final h PAY_ID;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f287364id;

    @NotNull
    private final Clause title;

    static {
        h hVar = new h(0, new TextLocalisedClause(R$string.topup_linked_account_tabs_payid, null, null, 14), "PAY_ID", "PAY_ID");
        PAY_ID = hVar;
        h hVar2 = new h(1, new TextLocalisedClause(R$string.topup_linked_account_tabs_bank_details, null, null, 14), "BANK_DETAILS", "BANK_DETAILS");
        BANK_DETAILS = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public h(int i, TextLocalisedClause textLocalisedClause, String str, String str2) {
        this.f287364id = str2;
        this.title = textLocalisedClause;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final Clause a() {
        return this.title;
    }

    public final String getId() {
        return this.f287364id;
    }
}
