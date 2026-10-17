package com.revolut.feature.slot_manager.api.model.checklist;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b ATTENTION_REQUIRED;
    public static final b COMPLETED;
    public static final b LOCKED;
    public static final b PENDING;

    static {
        b bVar = new b("LOCKED", 0);
        LOCKED = bVar;
        b bVar2 = new b("ACTIVE", 1);
        ACTIVE = bVar2;
        b bVar3 = new b("PENDING", 2);
        PENDING = bVar3;
        b bVar4 = new b("ATTENTION_REQUIRED", 3);
        ATTENTION_REQUIRED = bVar4;
        b bVar5 = new b("COMPLETED", 4);
        COMPLETED = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
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
