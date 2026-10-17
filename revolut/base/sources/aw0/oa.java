package aw0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class oa {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ oa[] $VALUES;
    public static final oa DEFAULT;
    public static final oa DONE;

    @yhm.d
    public static final oa LEGACY_CONTENT_COLOR;
    public static final oa PENDING;
    private final int colorAttr;
    private final boolean overridesImageTint;

    static {
        int i = R$attr.uikit_colorForeground;
        oa oaVar = new oa("LEGACY_CONTENT_COLOR", 0, i, false);
        LEGACY_CONTENT_COLOR = oaVar;
        oa oaVar2 = new oa("DEFAULT", 1, i, true);
        DEFAULT = oaVar2;
        oa oaVar3 = new oa("PENDING", 2, R$attr.uikit_colorGreyTone50, true);
        PENDING = oaVar3;
        oa oaVar4 = new oa("DONE", 3, R$attr.uikit_colorStatusSuccess, true);
        DONE = oaVar4;
        oa[] oaVarArr = {oaVar, oaVar2, oaVar3, oaVar4};
        $VALUES = oaVarArr;
        $ENTRIES = vc.s.n(oaVarArr);
    }

    public oa(String str, int i, int i2, boolean z) {
        this.colorAttr = i2;
        this.overridesImageTint = z;
    }

    public static oa valueOf(String str) {
        return (oa) Enum.valueOf(oa.class, str);
    }

    public static oa[] values() {
        return (oa[]) $VALUES.clone();
    }

    public final int a() {
        return this.colorAttr;
    }

    public final boolean b() {
        return this.overridesImageTint;
    }
}
