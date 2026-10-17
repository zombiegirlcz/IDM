package ip0;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public abstract class vd0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ vd0[] $VALUES;
    public static final vd0 CHECKBOX;
    public static final vd0 RADIO;

    static {
        vd0 vd0Var = new vd0() { // from class: ip0.sd0
            @Override // ip0.vd0
            public final int a(qd0 selectedState) {
                Intrinsics.checkNotNullParameter(selectedState, "selectedState");
                int i = rd0.f166160a[selectedState.ordinal()];
                if (i == 1) {
                    return R$drawable.uikit_icn_24_checkbox_multiple;
                }
                if (i == 2) {
                    return R$drawable.uikit_icn_24_checkbox_on;
                }
                if (i == 3) {
                    return R$drawable.uikit_icn_24_checkbox_off;
                }
                throw new NoWhenBranchMatchedException();
            }
        };
        CHECKBOX = vd0Var;
        vd0 vd0Var2 = new vd0() { // from class: ip0.ud0
            @Override // ip0.vd0
            public final int a(qd0 selectedState) {
                Intrinsics.checkNotNullParameter(selectedState, "selectedState");
                int i = td0.f166508a[selectedState.ordinal()];
                if (i == 1 || i == 2) {
                    return R$drawable.uikit_icn_24_radiobutton_off;
                }
                if (i == 3) {
                    return R$drawable.uikit_icn_24_radiobutton_on;
                }
                throw new NoWhenBranchMatchedException();
            }
        };
        RADIO = vd0Var2;
        vd0[] vd0VarArr = {vd0Var, vd0Var2};
        $VALUES = vd0VarArr;
        $ENTRIES = vc.s.n(vd0VarArr);
    }

    public static vd0 valueOf(String str) {
        return (vd0) Enum.valueOf(vd0.class, str);
    }

    public static vd0[] values() {
        return (vd0[]) $VALUES.clone();
    }

    public abstract int a(qd0 qd0Var);
}
