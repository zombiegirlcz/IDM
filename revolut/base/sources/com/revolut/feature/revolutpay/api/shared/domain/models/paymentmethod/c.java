package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AIRPLUS;
    public static final c AMEX;

    @NotNull
    public static final b Companion;
    public static final c DINERS;
    public static final c DISCOVER;
    public static final c JCB;
    public static final c MAESTRO;
    public static final c MASTERCARD;
    public static final c VISA;

    @NotNull
    private final String displayName;

    @NotNull
    private final m5l.d regex;

    static {
        c cVar = new c("VISA", 0, m5l.d.VISA, "Visa");
        VISA = cVar;
        c cVar2 = new c("MASTERCARD", 1, m5l.d.MASTERCARD, "Mastercard");
        MASTERCARD = cVar2;
        c cVar3 = new c("MAESTRO", 2, m5l.d.MAESTRO, "Maestro");
        MAESTRO = cVar3;
        c cVar4 = new c("AMEX", 3, m5l.d.AMEX, "AmEx");
        AMEX = cVar4;
        c cVar5 = new c("DINERS", 4, m5l.d.DINERS, "Diners");
        DINERS = cVar5;
        c cVar6 = new c("DISCOVER", 5, m5l.d.DISCOVER, "Discover");
        DISCOVER = cVar6;
        c cVar7 = new c("JCB", 6, m5l.d.JCB, "JCB");
        JCB = cVar7;
        c cVar8 = new c("AIRPLUS", 7, m5l.d.AIRPLUS, "AirPlus");
        AIRPLUS = cVar8;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
    }

    public c(String str, int i, m5l.d dVar, String str2) {
        this.regex = dVar;
        this.displayName = str2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.displayName;
    }

    public final m5l.d c() {
        return this.regex;
    }
}
