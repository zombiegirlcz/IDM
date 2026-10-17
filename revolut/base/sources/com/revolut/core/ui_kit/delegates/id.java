package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class id {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ id[] $VALUES;
    public static final id HORIZONTAL;
    public static final id VERTICAL;

    static {
        id idVar = new id("VERTICAL", 0);
        VERTICAL = idVar;
        id idVar2 = new id("HORIZONTAL", 1);
        HORIZONTAL = idVar2;
        id[] idVarArr = {idVar, idVar2};
        $VALUES = idVarArr;
        $ENTRIES = vc.s.n(idVarArr);
    }

    public static id valueOf(String str) {
        return (id) Enum.valueOf(id.class, str);
    }

    public static id[] values() {
        return (id[]) $VALUES.clone();
    }
}
