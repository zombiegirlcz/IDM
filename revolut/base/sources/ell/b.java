package ell;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AMEX;
    public static final b DINERS_CLUB;
    public static final b DISCOVER;
    public static final b JCB;
    public static final b MAESTRO;
    public static final b MASTERCARD;
    public static final b UNION_PAY;
    public static final b VISA;

    @NotNull
    private final Regex cardNumberRegex;

    @NotNull
    private final List<Integer> cardNumberValidLengths;

    @NotNull
    private final Image image;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b bVar = new b("AMEX", 0, u.c(15), new Regex("3[47][0-9]{4,}"), new ResourceImage(R$drawable.uikit_icn_24_logo_amex, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        AMEX = bVar;
        int i = 254;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        b bVar2 = new b("DINERS_CLUB", 1, v.k(14, 15, 16, 17, 18, 19), new Regex("3(?:0[0-59]{1}|[689])[0-9]{0,}"), new ResourceImage(R$drawable.uikit_icn_24_logo_diners_club_colour, num, num2, num3, list, (ImageTransformations) null, (Clause) null, i));
        DINERS_CLUB = bVar2;
        b bVar3 = new b("DISCOVER", 2, v.k(16, 17, 18, 19), new Regex("(6011|65|64[4-9]|62212[6-9]|6221[3-9]|622[2-8]|6229[01]|62292[0-5])[0-9]{0,}"), new ResourceImage(R$drawable.uikit_icn_24_logo_discover_colour, num, num2, num3, list, (ImageTransformations) (null == true ? 1 : 0), (Clause) (null == true ? 1 : 0), i));
        DISCOVER = bVar3;
        Integer num4 = null;
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        b bVar4 = new b("JCB", 3, v.k(16, 17, 18, 19), new Regex("(?:2131|1800|35)[0-9]{0,}"), new ResourceImage(R$drawable.uikit_icn_24_logo_jcb_colour, (Integer) objArr2, (Integer) objArr, num4, (List) null, (ImageTransformations) null, (Clause) null, 254));
        JCB = bVar4;
        List listK = v.k(12, 13, 14, 15, 16, 17, 18, 19);
        Regex regex = new Regex("(5[06789]|6)[0-9]{0,}");
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        b bVar5 = new b("MAESTRO", 4, listK, regex, new ResourceImage(R$drawable.uikit_icn_24_logo_ma, (Integer) objArr3, num4, (Integer) (null == true ? 1 : 0), (List) (null == true ? 1 : 0), (ImageTransformations) objArr4, (Clause) null, 254));
        MAESTRO = bVar5;
        List listC = u.c(16);
        Regex regex2 = new Regex("(5[1-5]|222[1-9]|22[3-9]|2[3-6]|27[01]|2720)[0-9]{0,}");
        Object[] objArr5 = null == true ? 1 : 0;
        b bVar6 = new b("MASTERCARD", 5, listC, regex2, new ResourceImage(R$drawable.uikit_icn_24_logo_mc, num4, (Integer) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (List) objArr5, (ImageTransformations) (null == true ? 1 : 0), (Clause) null, 254));
        MASTERCARD = bVar6;
        List listK2 = v.k(16, 17, 18, 19);
        Regex regex3 = new Regex("62[0-5]\\d{13,16}");
        Object[] objArr6 = null == true ? 1 : 0;
        b bVar7 = new b("UNION_PAY", 6, listK2, regex3, new ResourceImage(R$drawable.uikit_icn_24_card_number, (Integer) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (Integer) objArr6, (List) (null == true ? 1 : 0), (ImageTransformations) (null == true ? 1 : 0), (Clause) null, 254));
        UNION_PAY = bVar7;
        List listK3 = v.k(13, 16, 19);
        Regex regex4 = new Regex("4[0-9]{5,}");
        Object[] objArr7 = null == true ? 1 : 0;
        b bVar8 = new b("VISA", 7, listK3, regex4, new ResourceImage(R$drawable.uikit_icn_24_logo_visa_colour, (Integer) (null == true ? 1 : 0), (Integer) objArr7, (Integer) (null == true ? 1 : 0), (List) (null == true ? 1 : 0), (ImageTransformations) (null == true ? 1 : 0), (Clause) null, 254));
        VISA = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, List list, Regex regex, ResourceImage resourceImage) {
        this.cardNumberValidLengths = list;
        this.cardNumberRegex = regex;
        this.image = resourceImage;
    }

    public static EnumEntries c() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final Regex a() {
        return this.cardNumberRegex;
    }

    public final List b() {
        return this.cardNumberValidLengths;
    }

    public final Image d() {
        return this.image;
    }
}
