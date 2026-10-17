package y47;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import f01.c;
import java.util.List;
import java.util.Map;
import jr6.v;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.k5;
import tof.m5;
import tof.p5;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f310821a;

    public b(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f310821a = uiKitResources;
    }

    public static Image b(String str, Map map) {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_briefcase_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        return str == null ? resourceImage : (Image) map.getOrDefault(str, resourceImage);
    }

    public final Image a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        p5 p5Var = transaction.f272612s0;
        if (p5Var != null) {
            switch (a.f310820b[p5Var.f272990c.ordinal()]) {
                case 1:
                    return LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_revolut, new Color.Solid(R$attr.uikit_colorBlack), new Color.Solid(R$attr.uikit_colorWhite));
                case 2:
                case 3:
                    k5 k5Var = p5Var.e.f272915h;
                    m5 m5Var = k5Var != null ? k5Var.f : null;
                    switch (m5Var == null ? -1 : a.f310819a[m5Var.ordinal()]) {
                        case 1:
                            return new ResourceImage(R$drawable.uikit_icn_24_logo_mc, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                        case 2:
                            return new ResourceImage(R$drawable.uikit_icn_24_logo_visa, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            return new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                        default:
                            return new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    }
                case 4:
                case 5:
                    return new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                case 6:
                    return new ResourceImage(R$drawable.uikit_icn_24_apple_pay, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                case 7:
                    return new ResourceImage(R$drawable.uikit_icn_24_google_pay, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            }
        }
        return null;
    }
}
