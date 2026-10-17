package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class en0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ en0[] $VALUES;
    public static final en0 Empty;
    public static final en0 Mastercard;
    public static final en0 Visa;
    private final CdnImage cdnImage;
    private final Integer uiTestImageRes;

    static {
        en0 en0Var = new en0("Visa", 0, new CdnImage("visa", "mobile/logos_and_flags/payments_schemes", null, null, null, null, Constants.TAG_FC_SPEED_MODE), Integer.valueOf(R$drawable.uikit_icn_24_logo_visa_colour));
        Visa = en0Var;
        en0 en0Var2 = new en0("Mastercard", 1, new CdnImage("mastercard", "mobile/logos_and_flags/payments_schemes", null, null, null, "mastercard_dark", 188), Integer.valueOf(R$drawable.uikit_icn_24_logo_ma));
        Mastercard = en0Var2;
        en0 en0Var3 = new en0("Empty", 2, null, null);
        Empty = en0Var3;
        en0[] en0VarArr = {en0Var, en0Var2, en0Var3};
        $VALUES = en0VarArr;
        $ENTRIES = vc.s.n(en0VarArr);
    }

    public en0(String str, int i, CdnImage cdnImage, Integer num) {
        this.cdnImage = cdnImage;
        this.uiTestImageRes = num;
    }

    public static en0 valueOf(String str) {
        return (en0) Enum.valueOf(en0.class, str);
    }

    public static en0[] values() {
        return (en0[]) $VALUES.clone();
    }

    public final CdnImage a() {
        return this.cdnImage;
    }
}
