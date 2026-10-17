package c7b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f21890b;

    public a(f01.c uiKitResources, int i) {
        this.f21889a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f21890b = uiKitResources;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f21890b = uiKitResources;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f21890b = uiKitResources;
                break;
            default:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f21890b = uiKitResources;
                break;
        }
    }

    public Integer a(String colorCode) {
        Intrinsics.checkNotNullParameter(colorCode, "colorCode");
        Integer numValueOf = Intrinsics.f(colorCode, "red") ? Integer.valueOf(R$attr.uikit_colorRed) : null;
        if (numValueOf != null) {
            return numValueOf;
        }
        int iD = this.f21890b.d(jli.g.b(colorCode));
        Integer numValueOf2 = Integer.valueOf(iD);
        if (iD != 0) {
            return numValueOf2;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public int b(String iconCode) {
        Integer numValueOf;
        Integer numValueOf2;
        switch (this.f21889a) {
            case 0:
                Intrinsics.checkNotNullParameter(iconCode, "iconCode");
                switch (iconCode.hashCode()) {
                    case -2124243212:
                        numValueOf = !iconCode.equals("icn_24_arrow_upgrade") ? null : Integer.valueOf(R$drawable.uikit_icn_24_arrow_upgrade);
                        break;
                    case 1774245398:
                        numValueOf = !iconCode.equals("icn_24_check") ? null : Integer.valueOf(R$drawable.uikit_icn_24_check);
                        break;
                    case 1779086018:
                        numValueOf = !iconCode.equals("icn_24_hotel") ? null : Integer.valueOf(R$drawable.uikit_icn_24_hotel);
                        break;
                    case 2135563874:
                        numValueOf = !iconCode.equals("icn_24_gift") ? null : Integer.valueOf(R$drawable.uikit_icn_24_gift);
                        break;
                    case 2135931780:
                        numValueOf = !iconCode.equals("icn_24_star") ? null : Integer.valueOf(R$drawable.uikit_icn_24_plan_plus);
                        break;
                    default:
                        numValueOf = null;
                        break;
                }
                if (numValueOf == null) {
                    String lowerCase = iconCode.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    int iA = this.f21890b.a(d0.e0(lowerCase, "icn_"));
                    Integer numValueOf3 = iA != 0 ? Integer.valueOf(iA) : null;
                    if (numValueOf3 == null) {
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(iconCode, "iconCode");
                switch (iconCode.hashCode()) {
                    case -1417080081:
                        numValueOf2 = !iconCode.equals("icn_24_unlimited") ? null : Integer.valueOf(R$drawable.uikit_icn_24_unlimited);
                        break;
                    case -1112951835:
                        numValueOf2 = !iconCode.equals("icn_24_premium") ? null : Integer.valueOf(R$drawable.uikit_icn_24_premium);
                        break;
                    case -439083001:
                        numValueOf2 = !iconCode.equals("icn_24_lounges") ? null : Integer.valueOf(R$drawable.uikit_icn_24_lounges);
                        break;
                    case 2135563874:
                        numValueOf2 = !iconCode.equals("icn_24_gift") ? null : Integer.valueOf(R$drawable.uikit_icn_24_gift);
                        break;
                    default:
                        numValueOf2 = null;
                        break;
                }
                if (numValueOf2 == null) {
                    String lowerCase2 = iconCode.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    int iA2 = this.f21890b.a(d0.e0(lowerCase2, "icn_"));
                    Integer numValueOf4 = iA2 != 0 ? Integer.valueOf(iA2) : null;
                    if (numValueOf4 == null) {
                    }
                }
                break;
        }
        return R$drawable.uikit_icn_24_info_sign;
    }

    public ResourceImage c(String iconCode) {
        Intrinsics.checkNotNullParameter(iconCode, "iconCode");
        return new ResourceImage(b(iconCode), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }
}
