package yte;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CARDHOLDER_VERIFICATION_PENDING;
    public static final p CARD_LIMIT_APPLIED;
    public static final p CARD_LIMIT_EXCEEDED;

    @NotNull
    public static final o Companion;
    public static final p INSTANT;

    static {
        p pVar = new p("CARD_LIMIT_APPLIED", 0);
        CARD_LIMIT_APPLIED = pVar;
        p pVar2 = new p("CARD_LIMIT_EXCEEDED", 1);
        CARD_LIMIT_EXCEEDED = pVar2;
        p pVar3 = new p("CARDHOLDER_VERIFICATION_PENDING", 2);
        CARDHOLDER_VERIFICATION_PENDING = pVar3;
        p pVar4 = new p("INSTANT", 3);
        INSTANT = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
        Companion = new o();
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
