package com.revolut.feature.retail.restaurants.impl.domain.model;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b CHARGED;
    public static final b CHARGE_FAILED;
    public static final b CHARGE_PROCESSING;
    public static final b PENDING;
    public static final b REFUNDED;
    public static final b UNKNOWN;
    public static final b VOIDED;
    public static final b WAIVED;

    static {
        b bVar = new b("PENDING", 0);
        PENDING = bVar;
        b bVar2 = new b("ACTIVE", 1);
        ACTIVE = bVar2;
        b bVar3 = new b("CHARGE_PROCESSING", 2);
        CHARGE_PROCESSING = bVar3;
        b bVar4 = new b("CHARGED", 3);
        CHARGED = bVar4;
        b bVar5 = new b("CHARGE_FAILED", 4);
        CHARGE_FAILED = bVar5;
        b bVar6 = new b("VOIDED", 5);
        VOIDED = bVar6;
        b bVar7 = new b("WAIVED", 6);
        WAIVED = bVar7;
        b bVar8 = new b("REFUNDED", 7);
        REFUNDED = bVar8;
        b bVar9 = new b("UNKNOWN", 8);
        UNKNOWN = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
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
