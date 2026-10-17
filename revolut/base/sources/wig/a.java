package wig;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trust_common.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import yp0.b;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C1643a Companion = new C1643a();

    /* JADX INFO: renamed from: wig.a$a, reason: collision with other inner class name */
    public static final class C1643a {
        private C1643a() {
        }
    }

    public static y a() {
        t tVar = new t(new TextLocalisedClause(R$string.topup_shared_header_processing_trust_subtitle_default, null, null, 14), null, null, 30);
        l lVar = l.WINDOW;
        boolean z = false;
        int i = 6;
        List listK = v.k(new RowDelegate.Model("ITEM_DATA_SECURITY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.topup_shared_header_processing_trust_data_security_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_shared_header_processing_trust_data_security_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ITEM_TRUSTED_CARD", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.topup_shared_header_processing_trust_trusted_card_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_shared_header_processing_trust_trusted_card_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        b.k(listK, 0, 0, 0, 0, 31);
        return new y(listK, tVar, lVar, null, null, null, 1016);
    }
}
