package com.revolut.sso.api.models;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ADDRESS;
    public static final c BIRTH_DATE;
    public static final c CITIZENSHIP;
    public static final c EMAIL;
    public static final c NAME;
    public static final c PHONE;
    public static final c UNKNOWN;

    @NotNull
    private final String value;

    static {
        c cVar = new c("ADDRESS", 0, "address");
        ADDRESS = cVar;
        c cVar2 = new c("BIRTH_DATE", 1, "birthdate");
        BIRTH_DATE = cVar2;
        c cVar3 = new c("CITIZENSHIP", 2, "citizenship");
        CITIZENSHIP = cVar3;
        c cVar4 = new c("EMAIL", 3, "email");
        EMAIL = cVar4;
        c cVar5 = new c("NAME", 4, "name");
        NAME = cVar5;
        c cVar6 = new c("PHONE", 5, "phone");
        PHONE = cVar6;
        c cVar7 = new c("UNKNOWN", 6, "unknown");
        UNKNOWN = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
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
}
