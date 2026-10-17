package se6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c LINK_ACCOUNT;
    public static final c PENNY_CONSENTS;
    public static final c PENNY_PAYMENT;
    public static final c POPULAR;
    public static final c RECOMMENDED;
    public static final c TOP_UP;

    static {
        c cVar = new c("POPULAR", 0);
        POPULAR = cVar;
        c cVar2 = new c("RECOMMENDED", 1);
        RECOMMENDED = cVar2;
        c cVar3 = new c("PENNY_CONSENTS", 2);
        PENNY_CONSENTS = cVar3;
        c cVar4 = new c("PENNY_PAYMENT", 3);
        PENNY_PAYMENT = cVar4;
        c cVar5 = new c("LINK_ACCOUNT", 4);
        LINK_ACCOUNT = cVar5;
        c cVar6 = new c("TOP_UP", 5);
        TOP_UP = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
