package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ACCENT;
    public static final q HIGH_ALERT;
    public static final q REGULAR;
    public static final q REGULAR_NO_BACKGROUND;
    private final Integer backgroundResId;
    private final int dismissImageColorAttr;

    @NotNull
    private final ms0.h4 primaryActionButtonStyle;

    @NotNull
    private final ms0.h4 secondaryActionButtonStyle;
    private final int subtitleColorAttr;
    private final int titleColorAttr;
    private final int valuePrimaryColorAttr;
    private final int valueSecondaryColorAttr;

    static {
        Integer numValueOf = Integer.valueOf(R$drawable.internal_action_widget_background_regular);
        int i = R$attr.uikit_colorForeground;
        int i2 = R$attr.uikit_colorGreyTone50;
        int i3 = R$attr.uikit_colorForeground_40;
        ms0.h4 h4Var = ms0.h4.ACCENT;
        ms0.h4 h4Var2 = ms0.h4.SEMIACCENT;
        q qVar = new q("REGULAR", 0, numValueOf, i, i2, i, i2, i3, h4Var, h4Var2);
        REGULAR = qVar;
        Integer numValueOf2 = Integer.valueOf(R$drawable.internal_action_widget_background_accent);
        int i5 = R$attr.uikit_colorOnAccent;
        q qVar2 = new q("ACCENT", 1, numValueOf2, i5, i5, i5, i5, R$attr.uikit_colorOnAccent_60, ms0.h4.LIGHT_ON_ACCENT, ms0.h4.DARK_ON_ACCENT);
        ACCENT = qVar2;
        Integer numValueOf3 = Integer.valueOf(R$drawable.internal_action_widget_background_regular);
        int i6 = R$attr.uikit_colorForeground;
        int i21 = R$attr.uikit_colorGreyTone50;
        q qVar3 = new q("HIGH_ALERT", 2, numValueOf3, i6, i21, i6, i21, R$attr.uikit_colorForeground_40, ms0.h4.NEGATIVE_ACCENT, ms0.h4.NEGATIVE);
        HIGH_ALERT = qVar3;
        int i22 = R$attr.uikit_colorForeground;
        int i32 = R$attr.uikit_colorGreyTone50;
        q qVar4 = new q("REGULAR_NO_BACKGROUND", 3, null, i22, i32, i22, i32, R$attr.uikit_colorForeground_40, h4Var, h4Var2);
        REGULAR_NO_BACKGROUND = qVar4;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public q(String str, int i, Integer num, int i2, int i3, int i5, int i6, int i21, ms0.h4 h4Var, ms0.h4 h4Var2) {
        this.backgroundResId = num;
        this.titleColorAttr = i2;
        this.subtitleColorAttr = i3;
        this.valuePrimaryColorAttr = i5;
        this.valueSecondaryColorAttr = i6;
        this.dismissImageColorAttr = i21;
        this.primaryActionButtonStyle = h4Var;
        this.secondaryActionButtonStyle = h4Var2;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final Integer a() {
        return this.backgroundResId;
    }

    public final int b() {
        return this.dismissImageColorAttr;
    }

    public final ms0.h4 c() {
        return this.primaryActionButtonStyle;
    }

    public final ms0.h4 d() {
        return this.secondaryActionButtonStyle;
    }

    public final int e() {
        return this.subtitleColorAttr;
    }

    public final int f() {
        return this.titleColorAttr;
    }

    public final int h() {
        return this.valuePrimaryColorAttr;
    }

    public final int i() {
        return this.valueSecondaryColorAttr;
    }
}
