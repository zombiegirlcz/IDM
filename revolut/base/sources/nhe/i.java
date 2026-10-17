package nhe;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i JOINT;
    public static final i PERSONAL;
    public static final i PRO;
    private final int iconResId;
    private final int titleResId;

    static {
        i iVar = new i("PERSONAL", 0, R$string.account_switcher_space_personal_title, R$drawable.uikit_icn_24_profile);
        PERSONAL = iVar;
        i iVar2 = new i("JOINT", 1, R$string.account_switcher_space_joint_title, R$drawable.uikit_icn_24_joint);
        JOINT = iVar2;
        i iVar3 = new i("PRO", 2, R$string.account_switcher_section_pro_title, R$drawable.uikit_icn_24_briefcase_coins);
        PRO = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public i(String str, int i, int i2, int i3) {
        this.titleResId = i2;
        this.iconResId = i3;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int a() {
        return this.iconResId;
    }

    public final int b() {
        return this.titleResId;
    }
}
