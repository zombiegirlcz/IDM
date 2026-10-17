package y8d;

import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import f7d.i;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    @NotNull
    public static final C1732a Companion = new C1732a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f311653a;

    /* JADX INFO: renamed from: y8d.a$a, reason: collision with other inner class name */
    public static final class C1732a {
        private C1732a() {
        }
    }

    public a() {
        i[] iVarArrValues = i.values();
        int iB = q0.b(iVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (i iVar : iVarArrValues) {
            linkedHashMap.put(iVar.a(), iVar);
        }
        this.f311653a = linkedHashMap;
    }

    public final Image a(FaqNodeBase node) {
        int i;
        Intrinsics.checkNotNullParameter(node, "node");
        String str = node instanceof PigeonNode ? ((PigeonNode) node).e : node instanceof FaqNode.Category ? ((FaqNode.Category) node).e : null;
        if (str != null) {
            return new UrlImage(a0.D(str, ".svg", "@3x.png", false), null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorAccentNeutral)), gz0.b.CenterInside, null, 24, 24, 17), null, null, false, false, 507902);
        }
        String key = node.getF51434a();
        Intrinsics.checkNotNullParameter(key, "key");
        switch (b.f311654a[((i) this.f311653a.getOrDefault(key, i.UNKNOWN)).ordinal()]) {
            case 1:
                i = R$drawable.uikit_icn_24_plus;
                break;
            case 2:
                i = R$drawable.uikit_icn_24_apps;
                break;
            case 3:
                i = R$drawable.uikit_icn_24_card;
                break;
            case 4:
                i = R$drawable.uikit_icn_24_card;
                break;
            case 5:
                i = R$drawable.uikit_icn_24_cash;
                break;
            case 6:
                i = R$drawable.uikit_icn_24_credit;
                break;
            case 7:
                i = R$drawable.uikit_icn_24_card;
                break;
            case 8:
                i = R$drawable.uikit_icn_24_logo_revolut;
                break;
            case 9:
                i = R$drawable.uikit_icn_24_flag;
                break;
            case 10:
                i = R$drawable.uikit_icn_24_more_ios;
                break;
            case 11:
                i = R$drawable.uikit_icn_24_profile;
                break;
            case 12:
                i = R$drawable.uikit_icn_24_arrow_right_left;
                break;
            case 13:
                i = R$drawable.uikit_icn_24_logo_revolut;
                break;
            case 14:
                i = R$drawable.uikit_icn_24_flag;
                break;
            case 15:
                i = R$drawable.uikit_icn_24_insurance;
                break;
            case 16:
                i = R$drawable.uikit_icn_24_card;
                break;
            case 17:
                i = R$drawable.uikit_icn_24_bank;
                break;
            case 18:
                i = R$drawable.uikit_icn_24_wealth;
                break;
            case 19:
                i = R$drawable.uikit_icn_24_merchant;
                break;
            case 20:
                i = R$drawable.uikit_icn_24_more_ios;
                break;
            case 21:
                i = R$drawable.uikit_icn_24_bank;
                break;
            case 22:
                i = R$drawable.uikit_icn_24_profile;
                break;
            case 23:
                i = R$drawable.uikit_icn_24_profile;
                break;
            case 24:
                i = R$drawable.uikit_icn_24_plus;
                break;
            case 25:
                i = R$drawable.uikit_icn_24_heart;
                break;
            case 26:
                i = R$drawable.uikit_icn_24_lock_closed;
                break;
            case 27:
                i = R$drawable.uikit_icn_24_bank;
                break;
            case 28:
                i = R$drawable.uikit_icn_24_rocket;
                break;
            case 29:
                i = R$drawable.uikit_icn_24_resort;
                break;
            case 30:
                i = R$drawable.uikit_icn_24_arrow_right_left;
                break;
            case 31:
                i = R$drawable.uikit_icn_24_arrow_right_left;
                break;
            case 32:
                i = R$drawable.uikit_icn_24_wealth;
                break;
            case 33:
                i = R$drawable.uikit_icn_24_calendar;
                break;
            case 34:
                i = R$drawable.uikit_icn_24_profile;
                break;
            case 35:
                i = R$drawable.uikit_icn_24_apps;
                break;
            case 36:
                i = R$drawable.uikit_icn_24_services;
                break;
            case 37:
                i = R$drawable.uikit_icn_24_lightning;
                break;
            case 38:
                i = R$drawable.uikit_icn_24_calendar;
                break;
            case 39:
                i = R$drawable.uikit_icn_24_arrow_right_left;
                break;
            case 40:
                i = R$drawable.uikit_icn_24_people;
                break;
            case 41:
                i = R$drawable.uikit_icn_24_document;
                break;
            case 42:
                i = R$drawable.uikit_icn_24_arrow_exchange;
                break;
            case 43:
                i = R$drawable.uikit_icn_24_globe_p2p;
                break;
            case 44:
            case 45:
                i = R$drawable.uikit_icn_24_form;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
    }
}
