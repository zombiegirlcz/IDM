package lg5;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.features.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = null;
        RowDelegate.Model model2 = domainState.f195068a ? new RowDelegate.Model("CRYPTO_SETTINGS_SEND_LIMITS_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.crypto_settings_limitsAndFees_limits_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_settings_limitsAndFees_limits_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null;
        RowDelegate.Model model3 = domainState.f195068a ? new RowDelegate.Model("CRYPTO_MULTICHAIN_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_send_message, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.crypto_multinetwork_transfer_text, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_discover_networks_text, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null;
        if (domainState.f195069b) {
            Intrinsics.checkNotNullParameter("CRYPTO_SETTINGS_EXCHANGE_FEES_ID", "listId");
            model = new RowDelegate.Model("CRYPTO_SETTINGS_EXCHANGE_FEES_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_fees, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.crypto_settings_exchange_fees_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_settings_exchange_fees_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        }
        qv0.i[] elements = {model2, model3, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new f(listL);
    }
}
