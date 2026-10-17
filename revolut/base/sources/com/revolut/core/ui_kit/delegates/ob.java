package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ob {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ob[] $VALUES;
    public static final ob Default;
    public static final ob Warning;
    private final Image startIcon;
    private final int textColorAttr;

    static {
        ob obVar = new ob("Default", 0, R$attr.uikit_colorForeground, null);
        Default = obVar;
        int i = R$attr.uikit_colorStatusWarning;
        ob obVar2 = new ob("Warning", 1, i, new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246));
        Warning = obVar2;
        ob[] obVarArr = {obVar, obVar2};
        $VALUES = obVarArr;
        $ENTRIES = vc.s.n(obVarArr);
    }

    public ob(String str, int i, int i2, ResourceImage resourceImage) {
        this.textColorAttr = i2;
        this.startIcon = resourceImage;
    }

    public static ob valueOf(String str) {
        return (ob) Enum.valueOf(ob.class, str);
    }

    public static ob[] values() {
        return (ob[]) $VALUES.clone();
    }

    public final Image a() {
        return this.startIcon;
    }

    public final int b() {
        return this.textColorAttr;
    }
}
