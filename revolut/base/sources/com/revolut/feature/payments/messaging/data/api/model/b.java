package com.revolut.feature.payments.messaging.data.api.model;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ESSENTIALS;
    public static final b METAL;
    public static final b PLUS;
    public static final b PREMIUM;
    public static final b PRIVATE;
    public static final b STANDARD;
    public static final b ULTRA;
    public static final b UNKNOWN;

    static {
        b bVar = new b("ULTRA", 0);
        ULTRA = bVar;
        b bVar2 = new b("METAL", 1);
        METAL = bVar2;
        b bVar3 = new b("PREMIUM", 2);
        PREMIUM = bVar3;
        b bVar4 = new b("PLUS", 3);
        PLUS = bVar4;
        b bVar5 = new b("STANDARD", 4);
        STANDARD = bVar5;
        b bVar6 = new b("ESSENTIALS", 5);
        ESSENTIALS = bVar6;
        b bVar7 = new b("PRIVATE", 6);
        PRIVATE = bVar7;
        b bVar8 = new b("UNKNOWN", 7);
        UNKNOWN = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
