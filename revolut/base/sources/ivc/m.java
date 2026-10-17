package ivc;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.delegates.nf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decorator.models.CircleImageDecorator;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$plurals;
import com.revolut.feature.security_hub.api.R$string;
import gvc.p;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    public static RowDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, TextLocalisedQuantityClause textLocalisedQuantityClause, boolean z, int i, boolean z3, mf mfVar) {
        int i2 = 62;
        Object[] objArr = 0 == true ? 1 : 0;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new CircleImageDecorator((Image) LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorActionBackgroundNeutral), (Float) null, BitmapDescriptorFactory.HUE_RED, 0, 0, i2), null, 0 == true ? 1 : 0, false, null, objArr, i2), textLocalisedClause, null, 0, textLocalisedQuantityClause, null, null, 0, new tf(6, new ResourceImage(!z ? R$drawable.uikit_icn_24_chevron_down : R$drawable.uikit_icn_24_chevron_up, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), z3, null, false, z3 ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, mfVar, null, null, null, new p(str), null, 0, 0, 0, 0, 532591576);
    }

    public final RowDelegate.Model b(k type, boolean z, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i2 = l.f168827a[type.ordinal()];
        if (i2 == 1) {
            return a("EXPANDABLE_LOADING_CELL_ID_CARDS_TITLE", new TextLocalisedClause(R$string.security_hub_secure_account_screen_cell_freeze_cards_title, null, null, 14), new TextLocalisedQuantityClause(new ResourceId.IntResourceId(R$plurals.security_hub_secure_account_screen_cell_freeze_cards_subtitle), Integer.valueOf(i), (List) null, (Custom) null, 28), z, R$drawable.uikit_icn_24_snowflake, i > 0, null);
        }
        if (i2 == 2) {
            return a("EXPANDABLE_LOADING_CELL_ID_DEVICE_TITLE", new TextLocalisedClause(R$string.security_hub_secure_account_screen_cell_logout_devices_title, null, null, 14), new TextLocalisedQuantityClause(new ResourceId.IntResourceId(R$plurals.security_hub_secure_account_screen_cell_logout_devices_subtitle), Integer.valueOf(i), (List) null, (Custom) null, 28), z, R$drawable.uikit_icn_24_logout_door, true, null);
        }
        if (i2 == 3) {
            return a("EXPANDABLE_LOADING_CELL_ID_ESIMS_TITLE", new TextLocalisedClause(R$string.security_hub_secure_account_screen_cell_freeze_sims_title, null, null, 14), new TextLocalisedQuantityClause(new ResourceId.IntResourceId(R$plurals.security_hub_secure_account_screen_cell_freeze_sims_subtitle), Integer.valueOf(i), (List) null, (Custom) null, 28), z, R$drawable.uikit_icn_24_sim_card, true, new mf(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, nf.DP_20));
        }
        throw new NoWhenBranchMatchedException();
    }
}
