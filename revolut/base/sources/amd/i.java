package amd;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CARDHOLDERS;
    public static final i CARDS;
    public static final i CATEGORIES;
    public static final i COUNTRIES;
    public static final i CURRENCIES;

    @NotNull
    public static final h Companion;
    public static final i MERCHANTS;
    public static final i PARTICIPANTS;
    public static final i SOURCE_ACCOUNTS;
    public static final i TRANSACTIONS;

    static {
        i iVar = new i("CATEGORIES", 0);
        CATEGORIES = iVar;
        i iVar2 = new i("PARTICIPANTS", 1);
        PARTICIPANTS = iVar2;
        i iVar3 = new i("MERCHANTS", 2);
        MERCHANTS = iVar3;
        i iVar4 = new i("TRANSACTIONS", 3);
        TRANSACTIONS = iVar4;
        i iVar5 = new i("COUNTRIES", 4);
        COUNTRIES = iVar5;
        i iVar6 = new i("SOURCE_ACCOUNTS", 5);
        SOURCE_ACCOUNTS = iVar6;
        i iVar7 = new i("CURRENCIES", 6);
        CURRENCIES = iVar7;
        i iVar8 = new i("CARDS", 7);
        CARDS = iVar8;
        i iVar9 = new i("CARDHOLDERS", 8);
        CARDHOLDERS = iVar9;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
        Companion = new h();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
