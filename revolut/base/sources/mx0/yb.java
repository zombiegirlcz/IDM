package mx0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ yb[] $VALUES;
    public static final yb Danger;
    public static final yb Grey;
    public static final yb LightBlue;
    public static final yb Teal;
    private final int resource;

    static {
        yb ybVar = new yb("Teal", 0, R$attr.uikit_colorTeal);
        Teal = ybVar;
        yb ybVar2 = new yb("LightBlue", 1, R$attr.uikit_colorLightBlue);
        LightBlue = ybVar2;
        yb ybVar3 = new yb("Grey", 2, R$attr.uikit_colorDeepGrey);
        Grey = ybVar3;
        yb ybVar4 = new yb("Danger", 3, R$attr.uikit_colorStatusDanger);
        Danger = ybVar4;
        yb[] ybVarArr = {ybVar, ybVar2, ybVar3, ybVar4};
        $VALUES = ybVarArr;
        $ENTRIES = vc.s.n(ybVarArr);
    }

    public yb(String str, int i, int i2) {
        this.resource = i2;
    }

    public static yb valueOf(String str) {
        return (yb) Enum.valueOf(yb.class, str);
    }

    public static yb[] values() {
        return (yb[]) $VALUES.clone();
    }

    public final int a() {
        return this.resource;
    }
}
