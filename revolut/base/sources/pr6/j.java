package pr6;

import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j APPLE_PAY;
    public static final j APPLE_TAP_TO_PAY;
    public static final j BANK_TRANSFER;
    public static final j CARD;
    public static final j CARD_PRESENT;
    public static final j CASH;
    public static final j CLICK_TO_PAY;

    @NotNull
    public static final i Companion;
    public static final j GOOGLE_PAY;

    @NotNull
    private static final Set<j> NON_REFUNDABLE_METHODS;
    public static final j OPEN_BANKING;
    public static final j PAY_WITH_REVOLUT;
    public static final j SEPA_DIRECT_DEBIT;

    static {
        j jVar = new j("APPLE_PAY", 0);
        APPLE_PAY = jVar;
        j jVar2 = new j("APPLE_TAP_TO_PAY", 1);
        APPLE_TAP_TO_PAY = jVar2;
        j jVar3 = new j("BANK_TRANSFER", 2);
        BANK_TRANSFER = jVar3;
        j jVar4 = new j("CARD", 3);
        CARD = jVar4;
        j jVar5 = new j("CARD_PRESENT", 4);
        CARD_PRESENT = jVar5;
        j jVar6 = new j("CASH", 5);
        CASH = jVar6;
        j jVar7 = new j("CLICK_TO_PAY", 6);
        CLICK_TO_PAY = jVar7;
        j jVar8 = new j("GOOGLE_PAY", 7);
        GOOGLE_PAY = jVar8;
        j jVar9 = new j("OPEN_BANKING", 8);
        OPEN_BANKING = jVar9;
        j jVar10 = new j("PAY_WITH_REVOLUT", 9);
        PAY_WITH_REVOLUT = jVar10;
        j jVar11 = new j("SEPA_DIRECT_DEBIT", 10);
        SEPA_DIRECT_DEBIT = jVar11;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
        Companion = new i();
        j[] elements = {jVar3, jVar6, jVar9};
        Intrinsics.checkNotNullParameter(elements, "elements");
        NON_REFUNDABLE_METHODS = kotlin.collections.d.y0(elements);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
