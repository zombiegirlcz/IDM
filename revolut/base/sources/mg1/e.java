package mg1;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_add_to_xpay_dialog_title, null, null, 14), new TextLocalisedClause(R$string.card_add_to_xpay_dialog_description, null, null, 14), null, null, false, 28);
        List listK = v.k(new RowDelegate.Model("MORE_SECURE_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.card_add_to_xpay_dialog_more_secure_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.card_add_to_xpay_dialog_more_secure_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("FASTER_AND_EASIER_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.card_add_to_xpay_dialog_faster_and_easier_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.card_add_to_xpay_dialog_faster_and_easier_google_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        m6 m6Var = n6.Companion;
        LargeActionButton.ButtonStyle.BlackOrWhiteButton.WithCenterIcon style = LargeActionButton.ButtonStyle.f58728g;
        m6Var.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter("", "tag");
        return new cii.b(new aw0.e(false, null, null, new n6(null, style, null, null, null, "", true, null, null, null, null), null, null, 55), listK, aVar);
    }
}
