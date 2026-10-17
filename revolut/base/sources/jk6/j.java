package jk6;

import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f175109a;

    public j(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f175109a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.open_finance_handoff_payment_authorization_success_title;
        d dVar = this.f175109a;
        return new g(u.c(new PromptMarketingContentDelegate.Model("LIST_ID_PROMPT", new TextLocalisedClause(i, u.c(dVar.f175106a), null, 12), new TextLocalisedClause(R$string.open_finance_handoff_payment_authorization_success_subtitle, u.c(dVar.f175106a), null, 12), new PromptMarketingContentDelegate.Model.Content.MediaContent(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorTransparent, 64.0f, Float.valueOf(250.0f), null, 32), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, null, 2096560)));
    }
}
