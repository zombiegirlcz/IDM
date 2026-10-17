package bnj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.o1;
import dej.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ActionsView.Item a(t1 subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        EsimProfileEntry esimProfileEntry = subscription.e;
        EsimProfileEntry esimProfileEntry2 = subscription.e;
        if (esimProfileEntry.f == null || !gj7.b.u(subscription) || esimProfileEntry2.f100441b == o1.INSTALLED) {
            return null;
        }
        return new ActionsView.Item("ID_ESIM_SHARE", null, false, null, null, new TextLocalisedClause(R$string.esim_gifting_share_qr_code_screen_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, esimProfileEntry2, null, 24478);
    }
}
