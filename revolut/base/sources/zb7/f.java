package zb7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CARDS;
    public static final f CHARGEBACK;

    @NotNull
    public static final e Companion;
    public static final f HOME;
    public static final f LINKED_ACCOUNTS;
    public static final f STOCKS;
    public static final f TRANSFERS;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    @NotNull
    private final String f320837tag;

    static {
        f fVar = new f("HOME", 0, "HOME_SCREEN");
        HOME = fVar;
        f fVar2 = new f("CARDS", 1, "CARDS_SCREEN");
        CARDS = fVar2;
        f fVar3 = new f("TRANSFERS", 2, "TRANSFERS_SCREEN");
        TRANSFERS = fVar3;
        f fVar4 = new f("LINKED_ACCOUNTS", 3, "LINKED_ACCOUNTS_SCREEN");
        LINKED_ACCOUNTS = fVar4;
        f fVar5 = new f("STOCKS", 4, "STOCKS_SCREEN");
        STOCKS = fVar5;
        f fVar6 = new f("CHARGEBACK", 5, "CHARGEBACKS_SCREEN");
        CHARGEBACK = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
    }

    public f(String str, int i, String str2) {
        this.f320837tag = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.f320837tag;
    }
}
