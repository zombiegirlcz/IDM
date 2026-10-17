package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class sg {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ sg[] $VALUES;
    public static final sg Big;
    public static final sg Regular;
    private final int textAppearanceAttr;

    static {
        sg sgVar = new sg("Big", 0, R$attr.internal_textAppearanceHeading3);
        Big = sgVar;
        sg sgVar2 = new sg("Regular", 1, R$attr.internal_textAppearanceEmphasis1);
        Regular = sgVar2;
        sg[] sgVarArr = {sgVar, sgVar2};
        $VALUES = sgVarArr;
        $ENTRIES = vc.s.n(sgVarArr);
    }

    public sg(String str, int i, int i2) {
        this.textAppearanceAttr = i2;
    }

    public static sg valueOf(String str) {
        return (sg) Enum.valueOf(sg.class, str);
    }

    public static sg[] values() {
        return (sg[]) $VALUES.clone();
    }

    public final int a() {
        return this.textAppearanceAttr;
    }
}
