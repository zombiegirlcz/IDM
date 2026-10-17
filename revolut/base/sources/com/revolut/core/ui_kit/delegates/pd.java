package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class pd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ pd[] $VALUES;
    public static final pd BLACK;
    public static final pd REGULAR;
    private final int defaultBackgroundColorAttr;
    private final int descriptionColorAttr;
    private final int dialogBackgroundColorAttr;
    private final aw0.v1 navBarColorScheme;

    @NotNull
    private final LargeActionButton.ButtonStyle primaryActionButtonStyle;

    @NotNull
    private final LargeActionButton.ButtonStyle secondaryActionButtonStyle;
    private final int titleColorAttr;

    static {
        pd pdVar = new pd("REGULAR", 0, R$attr.uikit_colorTransparent, R$attr.uikit_colorElevatedGroupedBackground, R$attr.uikit_colorForeground, R$attr.uikit_colorGreyTone50, LargeActionButton.ButtonStyle.f58725a, LargeActionButton.ButtonStyle.f58726b, null);
        REGULAR = pdVar;
        int i = R$attr.uikit_colorBlack;
        pd pdVar2 = new pd("BLACK", 1, i, i, R$attr.uikit_colorWhite, R$attr.uikit_colorGrey20, LargeActionButton.ButtonStyle.d, LargeActionButton.ButtonStyle.f58734p, aw0.v1.DARK);
        BLACK = pdVar2;
        pd[] pdVarArr = {pdVar, pdVar2};
        $VALUES = pdVarArr;
        $ENTRIES = vc.s.n(pdVarArr);
    }

    public pd(String str, int i, int i2, int i3, int i5, int i6, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton, LargeActionButton.ButtonStyle buttonStyle, aw0.v1 v1Var) {
        this.defaultBackgroundColorAttr = i2;
        this.dialogBackgroundColorAttr = i3;
        this.titleColorAttr = i5;
        this.descriptionColorAttr = i6;
        this.primaryActionButtonStyle = defaultFilledButton;
        this.secondaryActionButtonStyle = buttonStyle;
        this.navBarColorScheme = v1Var;
    }

    public static pd valueOf(String str) {
        return (pd) Enum.valueOf(pd.class, str);
    }

    public static pd[] values() {
        return (pd[]) $VALUES.clone();
    }

    public final int a() {
        return this.defaultBackgroundColorAttr;
    }

    public final int b() {
        return this.descriptionColorAttr;
    }

    public final int c() {
        return this.dialogBackgroundColorAttr;
    }

    public final aw0.v1 d() {
        return this.navBarColorScheme;
    }

    public final LargeActionButton.ButtonStyle e() {
        return this.primaryActionButtonStyle;
    }

    public final LargeActionButton.ButtonStyle f() {
        return this.secondaryActionButtonStyle;
    }

    public final int h() {
        return this.titleColorAttr;
    }
}
