package lvc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qtc.l;
import qtc.m;
import qtc.n;
import qtc.o;
import qtc.p;
import qtc.q;
import qtc.r;
import qtc.t;
import yy0.h;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f200359a = new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_active, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 10);

    public final RowDelegate.Model a(t wealthProtectionState, otc.b securityHubType) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(wealthProtectionState, "wealthProtectionState");
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.security_hub_wealth_protection_title, null, null, 14);
        int i = b.f200358a[securityHubType.ordinal()];
        TextLocalisedClause textLocalisedClause4 = this.f200359a;
        if (i == 1) {
            if (!(wealthProtectionState instanceof l)) {
                if (wealthProtectionState instanceof m) {
                    textLocalisedClause = new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_selfie_check, null, null, 14);
                } else if (wealthProtectionState instanceof n) {
                    textLocalisedClause = new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_street_mode_on, null, null, 14);
                } else if (wealthProtectionState instanceof p) {
                    textLocalisedClause = new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_separator, v.k(textLocalisedClause4, new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_selfie_check, null, null, 14)), null, 12);
                } else {
                    if (!(wealthProtectionState instanceof q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((q) wealthProtectionState).f249089a) {
                        textLocalisedClause = new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_separator, v.k(textLocalisedClause4, new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_street_mode_on, null, null, 14)), null, 12);
                    } else {
                        int i2 = R$string.security_hub_home_wealth_protection_subtitle_separator;
                        textLocalisedClause = new TextLocalisedClause(i2, v.k(textLocalisedClause4, new TextLocalisedClause(i2, v.k(new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_selfie_check, null, null, 14), new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_street_mode_off, null, null, 14)), null, 12)), null, 12);
                    }
                }
                textLocalisedClause2 = textLocalisedClause;
            }
            textLocalisedClause2 = null;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(wealthProtectionState instanceof l)) {
                if (wealthProtectionState instanceof o) {
                    textLocalisedClause = new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_selfie_check, null, null, 14);
                } else {
                    if (!(wealthProtectionState instanceof r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_separator, v.k(textLocalisedClause4, new TextLocalisedClause(R$string.security_hub_home_wealth_protection_subtitle_selfie_check, null, null, 14)), null, 12);
                }
                textLocalisedClause2 = textLocalisedClause;
            }
            textLocalisedClause2 = null;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60);
        tf tfVar = new tf(new h(new TextLocalisedClause(R$string.security_hub_wealth_protection_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246)));
        int i3 = R$attr.uikit_dp8;
        return new RowDelegate.Model("WEALTH_PROTECTION_CELL_ID", image40, textLocalisedClause3, null, 0, textLocalisedClause2, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, null, null, i3, i3, 0, 0, 486538200);
    }
}
