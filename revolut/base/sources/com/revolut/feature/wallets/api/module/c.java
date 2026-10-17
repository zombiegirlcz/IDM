package com.revolut.feature.wallets.api.module;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AMOUNT;
    public static final c TRANSACTION_INBOUND_MCY;

    @NotNull
    private final String value;

    static {
        c cVar = new c("AMOUNT", 0, "AMOUNT");
        AMOUNT = cVar;
        c cVar2 = new c("TRANSACTION_INBOUND_MCY", 1, "TRANSACTION_INBOUND_MCY");
        TRANSACTION_INBOUND_MCY = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.value = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
